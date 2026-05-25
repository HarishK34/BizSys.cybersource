package com.kaplan.ktpa.cybersource.service.impl;

import com.cybersource.stub.*;
import com.kaplan.ktpa.cybersource.common.CyberSourceCardType;
import com.kaplan.ktpa.cybersource.common.CybersourceConstants;
import com.kaplan.ktpa.cybersource.common.HubNameEnum;
import com.kaplan.ktpa.cybersource.common.ReasonCodeEnum;
import com.kaplan.ktpa.cybersource.exception.BaseApplicationException;
import com.kaplan.ktpa.cybersource.security.P12AuthenticationFactory;
import com.kaplan.ktpa.cybersource.security.P12SignatureAxisHandler;
import com.kaplan.ktpa.cybersource.security.P12SignatureHandler;
import com.kaplan.ktpa.cybersource.service.interfaces.ICyberSourceService;
import com.kaplan.ktpa.cybersource.webservice.model.*;
import org.apache.axis.AxisFault;
import org.apache.axis.utils.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.rpc.ServiceException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author sunilkumarm M SUNILKUMAR DATE : 05/12/2011
 */

@Service("cyberSourceServiceImpl")
public class CyberSourceServiceImpl implements ICyberSourceService {

	@org.springframework.beans.factory.annotation.Autowired
	private P12AuthenticationFactory p12AuthFactory;

	private @Value("#{cybersourceProps['cybersource.axis_lib_version']}")
	String LIB_VERSION;
	private @Value("#{cybersourceProps['cybersource.url']}")
	String SERVER_URL;
	private @Value("#{cybersourceProps['cybersource.default_transaction_key']}")
	String CYBERSOURCE_TRANSACTION_KEY;
	private @Value("#{cybersourceProps['cybersource.default_merchant_id']}")
	String CYBERSOURCE_MERCHANT_ID;
	
	private @Value("#{cybersourceProps['cybersource.business_transaction_key']}")
	String CYBERSOURCE_BUSINESS_TRANSACTION_KEY;
	private @Value("#{cybersourceProps['cybersource.business_merchant_id']}")
	String CYBERSOURCE_BUSINESS_MERCHANT_ID;
	private @Value("#{cybersourceProps['cybersource.health_transaction_key']}")
	String CYBERSOURCE_HEALTH_TRANSACTION_KEY;
	private @Value("#{cybersourceProps['cybersource.health_merchant_id']}")
	String CYBERSOURCE_HEALTH_MERCHANT_ID;
	private @Value("#{cybersourceProps['cybersource.law_transaction_key']}")
	String CYBERSOURCE_LAW_TRANSACTION_KEY;
	private @Value("#{cybersourceProps['cybersource.law_merchant_id']}")
	String CYBERSOURCE_LAW_MERCHANT_ID;
	private @Value("#{cybersourceProps['cybersource.pc_transaction_key']}")
	String CYBERSOURCE_PC_TRANSACTION_KEY;
	private @Value("#{cybersourceProps['cybersource.pc_merchant_id']}")
	String CYBERSOURCE_PC_MERCHANT_ID;
	private @Value("#{cybersourceProps['cybersource.med_transaction_key']}")
	String CYBERSOURCE_MED_TRANSACTION_KEY;
	private @Value("#{cybersourceProps['cybersource.med_merchant_id']}")
	String CYBERSOURCE_MED_MERCHANT_ID;
	private @Value("#{cybersourceProps['cybersource.toronto_transaction_key']}")
	String CYBERSOURCE_TORONTO_TRANSACTION_KEY;
	private @Value("#{cybersourceProps['cybersource.toronto_merchant_id']}")
	String CYBERSOURCE_TORONTO_MERCHANT_ID;
	private @Value("#{cybersourceProps['cybersource.sanjuan_transaction_key']}")
	String CYBERSOURCE_SANJUAN_TRANSACTION_KEY;
	private @Value("#{cybersourceProps['cybersource.sanjuan_merchant_id']}")
	String CYBERSOURCE_SANJUAN_MERCHANT_ID;
	

	public List<SubscriptionDetails> getSubscriptionListDetails(
			List<TransactionRequest> transactionRequestList)
			throws BaseApplicationException {
		// TODO Auto-generated method stub
		RequestMessage request = getRequestEnvironment();
		ReplyMessage reply = null;
		PaySubscriptionRetrieveReply paySubscriptionRetrieveReply = null;
		List<SubscriptionDetails> subscriptionDtlList = new ArrayList<SubscriptionDetails>();

		for (TransactionRequest transactionRequest : transactionRequestList) {
			// Creating the Request Object
			request = getMerchantCodeAndMerchantReferenceId(request,
					HubNameEnum.Default);
			request.setPaySubscriptionRetrieveService(new PaySubscriptionRetrieveService());
			request.getPaySubscriptionRetrieveService().setRun("true");
			RecurringSubscriptionInfo recurringSubscriptionInfo = new RecurringSubscriptionInfo();
			recurringSubscriptionInfo.setSubscriptionID(transactionRequest
					.getSubscriptionId());
			request.setRecurringSubscriptionInfo(recurringSubscriptionInfo);
			SubscriptionDetails subscriptionDtlObj = new SubscriptionDetails();

			DecisionManager decisionManager = new DecisionManager();
			decisionManager.setEnabled("false");
			request.setDecisionManager(decisionManager);
			request.setSubsequentAuth("true");

			try {
				TransactionProcessorLocator service = new TransactionProcessorLocator();
				URL endpoint = new URL(SERVER_URL);
				ITransactionProcessorStub stub = (ITransactionProcessorStub) service
						.getportXML(endpoint);
				stub = getMerchantDetails(stub,HubNameEnum.Default);
				reply = stub.runTransaction(request);
				paySubscriptionRetrieveReply = reply
						.getPaySubscriptionRetrieveReply();
				if (paySubscriptionRetrieveReply.getInstrumentIdentifierID() != null && !"".equals(paySubscriptionRetrieveReply
						.getInstrumentIdentifierID())) {
					BillingDetails billingDtls = new BillingDetails();
					billingDtls.setFirstName(paySubscriptionRetrieveReply
							.getFirstName());
					billingDtls.setLastName(paySubscriptionRetrieveReply
							.getLastName());

					if (paySubscriptionRetrieveReply.getStreet1() != null
							&& !"".equals(paySubscriptionRetrieveReply
							.getStreet1())) {
						billingDtls.setAddress1(paySubscriptionRetrieveReply
								.getStreet1());
					}
					if (paySubscriptionRetrieveReply.getStreet2() != null
							&& !"".equals(paySubscriptionRetrieveReply
							.getStreet2())) {
						billingDtls.setAddress2(paySubscriptionRetrieveReply
								.getStreet2());
					} else {
						billingDtls.setAddress2(" ");
					}

					billingDtls.setCity(paySubscriptionRetrieveReply.getCity());
					billingDtls.setState(paySubscriptionRetrieveReply
							.getState());
					billingDtls.setCountry(paySubscriptionRetrieveReply
							.getCountry());
					billingDtls.setPostalCode(paySubscriptionRetrieveReply
							.getPostalCode());
					billingDtls.setEmailAddress(paySubscriptionRetrieveReply
							.getEmail());
					subscriptionDtlObj
							.setSubscriptionId(paySubscriptionRetrieveReply
									.getInstrumentIdentifierID());
					subscriptionDtlObj.setBillingDetails(billingDtls);
					subscriptionDtlObj
							.setCardExpDate(paySubscriptionRetrieveReply
									.getCardExpirationMonth()
									+ "/"
									+ paySubscriptionRetrieveReply
									.getCardExpirationYear());
					subscriptionDtlObj.setCardNumber(CyberSourceCardType
							.getMaskedCCNumber(paySubscriptionRetrieveReply
									.getCardAccountNumber()));
					subscriptionDtlObj.setCardType(paySubscriptionRetrieveReply
							.getCardType());
					subscriptionDtlObj.setStatus(paySubscriptionRetrieveReply
							.getStatus());
				} else if (paySubscriptionRetrieveReply.getSubscriptionID() != null
						&& !"".equals(paySubscriptionRetrieveReply
								.getSubscriptionID())) {
					BillingDetails billingDtls = new BillingDetails();
					billingDtls.setFirstName(paySubscriptionRetrieveReply
							.getFirstName());
					billingDtls.setLastName(paySubscriptionRetrieveReply
							.getLastName());

					if (paySubscriptionRetrieveReply.getStreet1() != null
							&& !"".equals(paySubscriptionRetrieveReply
									.getStreet1())) {
						billingDtls.setAddress1(paySubscriptionRetrieveReply
								.getStreet1());
					}
					if (paySubscriptionRetrieveReply.getStreet2() != null
							&& !"".equals(paySubscriptionRetrieveReply
									.getStreet2())) {
						billingDtls.setAddress2(paySubscriptionRetrieveReply
								.getStreet2());
					} else {
						billingDtls.setAddress2(" ");
					}

					billingDtls.setCity(paySubscriptionRetrieveReply.getCity());
					billingDtls.setState(paySubscriptionRetrieveReply
							.getState());
					billingDtls.setCountry(paySubscriptionRetrieveReply
							.getCountry());
					billingDtls.setPostalCode(paySubscriptionRetrieveReply
							.getPostalCode());
					billingDtls.setEmailAddress(paySubscriptionRetrieveReply
							.getEmail());
					subscriptionDtlObj
							.setSubscriptionId(paySubscriptionRetrieveReply
									.getSubscriptionID());
					subscriptionDtlObj.setBillingDetails(billingDtls);
					subscriptionDtlObj
							.setCardExpDate(paySubscriptionRetrieveReply
									.getCardExpirationMonth()
									+ "/"
									+ paySubscriptionRetrieveReply
											.getCardExpirationYear());
					subscriptionDtlObj.setCardNumber(CyberSourceCardType
							.getMaskedCCNumber(paySubscriptionRetrieveReply
									.getCardAccountNumber()));
					subscriptionDtlObj.setCardType(paySubscriptionRetrieveReply
							.getCardType());
					subscriptionDtlObj.setStatus(paySubscriptionRetrieveReply
							.getStatus());
				} else {
					throw new BaseApplicationException(
							"Subscription Is Not Present:");
				}

			} catch (MalformedURLException me) {
				// TODO Auto-generated catch block
				throw new BaseApplicationException("AxisFault: " + me);
			} catch (ServiceException se) {
				// TODO Auto-generated catch block
				throw new BaseApplicationException("ServiceException: " + se);
			} catch (RemoteException re) {
				// TODO Auto-generated catch block
				throw new BaseApplicationException("RemoteException: " + re);
			}
			subscriptionDtlList.add(subscriptionDtlObj);
		}

		return subscriptionDtlList;
	}

	public TransactionResponse modifySubscriptionDetail(
			SubscriptionDetails subscriptionDetails)
			throws BaseApplicationException {
		// TODO Auto-generated method stub
		RequestMessage request = getRequestEnvironment();
		ReplyMessage reply = new ReplyMessage();
		TransactionResponse response = new TransactionResponse();

		// Creating Request Object
		// Setting the Merchant Id and Merchant Reference Code
		request = getMerchantCodeAndMerchantReferenceId(request,
				HubNameEnum.Default);
		request.setPaySubscriptionUpdateService(new PaySubscriptionUpdateService());
		request.getPaySubscriptionUpdateService().setRun("true");

		// Setting the Recurring Subscription Object
		RecurringSubscriptionInfo recurringSubscriptionInfo = new RecurringSubscriptionInfo();
		recurringSubscriptionInfo.setSubscriptionID(subscriptionDetails
				.getSubscriptionId());
		request.setRecurringSubscriptionInfo(recurringSubscriptionInfo);

		// Setting Billing Information
		/*
		 * BillTo billingDtls = new BillTo();
		 * billingDtls.setFirstName(subscriptionDetails
		 * .getBillingDetails().getFirstName());
		 * billingDtls.setLastName(subscriptionDetails
		 * .getBillingDetails().getLastName());
		 * 
		 * if (subscriptionDetails.getBillingDetails().getAddress1() != null &&
		 * !"".equals(subscriptionDetails.getBillingDetails().getAddress1())) {
		 * billingDtls
		 * .setStreet1(subscriptionDetails.getBillingDetails().getAddress1()); }
		 * else { billingDtls.setStreet1("UNKNOWN"); }
		 * 
		 * if (subscriptionDetails.getBillingDetails().getAddress2() != null &&
		 * !"".equals(subscriptionDetails.getBillingDetails().getAddress2())) {
		 * billingDtls
		 * .setStreet2(subscriptionDetails.getBillingDetails().getAddress2()); }
		 * else { billingDtls.setStreet2(" "); }
		 * 
		 * billingDtls.setCity(subscriptionDetails.getBillingDetails().getCity())
		 * ;
		 * billingDtls.setState(subscriptionDetails.getBillingDetails().getState
		 * ());
		 * 
		 * if (subscriptionDetails.getBillingDetails().getCountry() != null &&
		 * !"".equals(subscriptionDetails.getBillingDetails().getCountry())) {
		 * billingDtls
		 * .setCountry(subscriptionDetails.getBillingDetails().getCountry());
		 * }else{ billingDtls.setCountry("USA"); }
		 * 
		 * billingDtls.setPostalCode(subscriptionDetails.getBillingDetails().
		 * getPostalCode());
		 * billingDtls.setEmail(subscriptionDetails.getBillingDetails
		 * ().getEmailAddress());
		 */
		request = configBillingDetails(request, subscriptionDetails);

		// Setting the Card details
		/*
		 * Card card = new Card(); if (subscriptionDetails.getCardExpDate() !=
		 * null && !"".equals(subscriptionDetails.getCardExpDate())) {
		 * card.setExpirationMonth(new
		 * BigInteger(subscriptionDetails.getCardExpDate().substring(0,
		 * 2).trim()));// 12 card.setExpirationYear(new
		 * BigInteger(subscriptionDetails
		 * .getCardExpDate().substring(2).trim()));// 2020 }
		 * request.setCard(card);
		 */
		try {
			TransactionProcessorLocator service = new TransactionProcessorLocator();
			URL endpoint = new URL(SERVER_URL);
			ITransactionProcessorStub stub = (ITransactionProcessorStub) service
					.getportXML(endpoint);
			stub = getMerchantDetails(stub,HubNameEnum.Default);
			reply = stub.runTransaction(request);

			response.setTrxnStatus(reply.getDecision());
			response.setTrxnRemarks(getStatusRemarks(reply));
			response.setRequestId(reply.getRequestID());
			response.setRequestToken(reply.getRequestToken());

		} catch (AxisFault e) {
			throw new BaseApplicationException("AxisFault: " + e);
		} catch (MalformedURLException e) {
			throw new BaseApplicationException("MalformedURLException: " + e);
		} catch (RemoteException e) {
			throw new BaseApplicationException("RemoteException: " + e);
		} catch (ServiceException e) {
			throw new BaseApplicationException("ServiceException: " + e);
		}
		return response;
	}

	@Override
	public List<SubscriptionModel> createSubscription(
			List<SubscriptionModel> subscriptionModelList)
			throws BaseApplicationException {

		RequestMessage request = getRequestEnvironment();
		ReplyMessage reply = new ReplyMessage();
		TransactionResponse response = new TransactionResponse();

		// Creating Request Object
		// Setting the Merchant Id and Merchant Reference Code
		request = getMerchantCodeAndMerchantReferenceId(request,
				HubNameEnum.Default);
		request.setPaySubscriptionCreateService(new PaySubscriptionCreateService());
		request.getPaySubscriptionCreateService().setRun("true");

		SubscriptionDetails subscriptionDetails = null;
		if (subscriptionModelList != null && subscriptionModelList.size() > 0) {
			for (SubscriptionModel subscriptionModel : subscriptionModelList) {
				request = configBillingDetails(request,
						subscriptionModel.getSubscriptionInfo());
				PurchaseTotals purchaseTotal = new PurchaseTotals();
				purchaseTotal.setCurrency("USD");
				request.setPurchaseTotals(purchaseTotal);
				RecurringSubscriptionInfo RecurringSubscriptionInfo = new RecurringSubscriptionInfo();
				RecurringSubscriptionInfo.setFrequency("on-demand");
				request.setRecurringSubscriptionInfo(RecurringSubscriptionInfo);

				try {
					TransactionProcessorLocator service = new TransactionProcessorLocator();
					URL endpoint = new URL(SERVER_URL);
					ITransactionProcessorStub stub = (ITransactionProcessorStub) service
							.getportXML(endpoint);
					stub = getMerchantDetails(stub,HubNameEnum.Default);
					reply = stub.runTransaction(request);

					if (reply.getPaySubscriptionCreateReply() != null) {
						if (reply.getPaySubscriptionCreateReply()
								.getInstrumentIdentifierID() != null && !"".equals(reply.getPaySubscriptionCreateReply()
								.getInstrumentIdentifierID())) {
							subscriptionModel.getSubscriptionInfo()
									.setSubscriptionId(
											reply.getPaySubscriptionCreateReply()
													.getInstrumentIdentifierID());
						} else {
							subscriptionModel.getSubscriptionInfo()
									.setSubscriptionId(
											reply.getPaySubscriptionCreateReply()
													.getSubscriptionID());
						}
					}
					subscriptionModel
							.setSubscriptionCreationResponse(new TransactionResponse());
					subscriptionModel.getSubscriptionCreationResponse()
							.setTrxnStatus(reply.getDecision());
					subscriptionModel.getSubscriptionCreationResponse()
							.setTrxnRemarks(getStatusRemarks(reply));
					subscriptionModel.getSubscriptionCreationResponse()
							.setRequestId(reply.getRequestID());
					subscriptionModel.getSubscriptionCreationResponse()
							.setRequestToken(reply.getRequestToken());

				} catch (AxisFault e) {
					throw new BaseApplicationException("AxisFault: " + e);
				} catch (MalformedURLException e) {
					throw new BaseApplicationException(
							"MalformedURLException: " + e);
				} catch (RemoteException e) {
					throw new BaseApplicationException("RemoteException: " + e);
				} catch (ServiceException e) {
					throw new BaseApplicationException("ServiceException: " + e);
				}
			}
		}
		return subscriptionModelList;
	}

	private RequestMessage configBillingDetails(RequestMessage request,
			SubscriptionDetails subscriptionDetails) {
		// Setting Billing Information
		BillTo billingDtls = new BillTo();
		billingDtls.setFirstName(subscriptionDetails.getBillingDetails()
				.getFirstName());
		billingDtls.setLastName(subscriptionDetails.getBillingDetails()
				.getLastName());

		if (subscriptionDetails.getBillingDetails().getAddress1() != null
				&& !"".equals(subscriptionDetails.getBillingDetails()
						.getAddress1())) {
			billingDtls.setStreet1(subscriptionDetails.getBillingDetails()
					.getAddress1());
		} else {
			billingDtls.setStreet1("UNKNOWN");
		}

		if (subscriptionDetails.getBillingDetails().getAddress2() != null
				&& !"".equals(subscriptionDetails.getBillingDetails()
						.getAddress2())) {
			billingDtls.setStreet2(subscriptionDetails.getBillingDetails()
					.getAddress2());
		} else {
			billingDtls.setStreet2(" ");
		}

		billingDtls.setCity(subscriptionDetails.getBillingDetails().getCity());
		billingDtls
				.setState(subscriptionDetails.getBillingDetails().getState());

		if (subscriptionDetails.getBillingDetails().getCountry() != null
				&& !"".equals(subscriptionDetails.getBillingDetails()
						.getCountry())) {
			billingDtls.setCountry(subscriptionDetails.getBillingDetails()
					.getCountry());
		} else {
			billingDtls.setCountry("USA");
		}

		billingDtls.setPostalCode(subscriptionDetails.getBillingDetails()
				.getPostalCode());
		billingDtls.setEmail(subscriptionDetails.getBillingDetails()
				.getEmailAddress());
		request.setBillTo(billingDtls);

		// Setting the Card details
		Card card = new Card();
		if (subscriptionDetails.getCardExpDate() != null
				&& !"".equals(subscriptionDetails.getCardExpDate())) {
			card.setExpirationMonth(new BigInteger(subscriptionDetails
					.getCardExpDate().substring(0, 2).trim()));// 12
			card.setExpirationYear(new BigInteger(subscriptionDetails
					.getCardExpDate().substring(2).trim()));// 2020
		}
		if (subscriptionDetails.getCardNumber() != null) {
			card.setAccountNumber(subscriptionDetails.getCardNumber());
			card.setCardType(subscriptionDetails.getCardType());
		}
		request.setCard(card);

		return request;
	}

	private RequestMessage getRequestEnvironment() {
		RequestMessage request = new RequestMessage();
		System.setProperty("axis.ClientConfigFile", "TransactionDeploy.wsdd");
		request.setClientLibrary("Java Axis WSS4J");
		request.setClientLibraryVersion(LIB_VERSION);
		request.setClientEnvironment(System.getProperty("os.name") + "/"
				+ System.getProperty("os.version") + "/"
				+ System.getProperty("java.vendor") + "/"
				+ System.getProperty("java.version"));
		return request;
	}

	private RequestMessage getMerchantCodeAndMerchantReferenceId(
			RequestMessage request, HubNameEnum groupNameEnum)
			throws BaseApplicationException {
		if (groupNameEnum == HubNameEnum.Business) {
			request.setMerchantID(CYBERSOURCE_BUSINESS_MERCHANT_ID);
		} else if (groupNameEnum == HubNameEnum.Health) {
			request.setMerchantID(CYBERSOURCE_HEALTH_MERCHANT_ID);
		} else if (groupNameEnum == HubNameEnum.Law) {
			request.setMerchantID(CYBERSOURCE_LAW_MERCHANT_ID);
		} else if (groupNameEnum == HubNameEnum.PC) {
			request.setMerchantID(CYBERSOURCE_PC_MERCHANT_ID);
		} else if (groupNameEnum == HubNameEnum.Med) {
			request.setMerchantID(CYBERSOURCE_MED_MERCHANT_ID);
		} else if (groupNameEnum == HubNameEnum.Toronto) {
			request.setMerchantID(CYBERSOURCE_TORONTO_MERCHANT_ID);
		} else if (groupNameEnum == HubNameEnum.SanJuan) {
			request.setMerchantID(CYBERSOURCE_SANJUAN_MERCHANT_ID);
		}else {
			request.setMerchantID(CYBERSOURCE_MERCHANT_ID);
			request.setMerchantReferenceCode(CYBERSOURCE_MERCHANT_ID);
		}
		return request;
	}

	public String getStatusRemarks(ReplyMessage reply) {
		StringBuffer remarks = new StringBuffer();

		if (reply.getReasonCode().toString().equals("100")
				|| reply.getReasonCode().toString().equals("200")
				|| reply.getReasonCode().toString().equals("230")) {
			remarks.append("SUCCESS TRANSACTION :: " + reply.getReasonCode());
		} else if (reply.getReasonCode().toString().equals("101")) {
			remarks.append("ERROR:" + reply.getReasonCode());
			if (reply.getMissingField() != null)
				for (String field : reply.getMissingField())
					remarks.append("Missing Fields:" + field);
		} else if (reply.getReasonCode().toString().equals("102")) {
			remarks.append("ERROR:" + reply.getReasonCode());
			if (reply.getInvalidField() != null) {
				for (String field : reply.getInvalidField())
					remarks.append(":" + field);
			}
		} else {
			remarks.append("ERROR TRANSACTION :: " + reply.getReasonCode());
		}
		return remarks.toString();
	}

	private ITransactionProcessorStub getMerchantDetails(
			ITransactionProcessorStub stub, HubNameEnum groupNameEnum)
			throws BaseApplicationException {

		// P12 certificate authentication
		if (p12AuthFactory != null && p12AuthFactory.isP12Enabled()) {
			P12SignatureHandler handler = p12AuthFactory.getHandler(groupNameEnum);
			stub.setUsername(handler.getMerchantId());
			// No password needed with P12 - the signing handler provides authentication
			// The P12 signature is applied via the Axis client-side handler
			stub._setProperty("p12Handler", new P12SignatureAxisHandler(handler));
			return stub;
		}

		// Legacy transaction key authentication
		if (groupNameEnum == HubNameEnum.Business) {
			stub.setUsername(CYBERSOURCE_BUSINESS_MERCHANT_ID);
			stub.setPassword(CYBERSOURCE_BUSINESS_TRANSACTION_KEY);
		} else if (groupNameEnum == HubNameEnum.Health) {
			stub.setUsername(CYBERSOURCE_HEALTH_MERCHANT_ID);
			stub.setPassword(CYBERSOURCE_HEALTH_TRANSACTION_KEY);
		} else if (groupNameEnum == HubNameEnum.Law) {
			stub.setUsername(CYBERSOURCE_LAW_MERCHANT_ID);
			stub.setPassword(CYBERSOURCE_LAW_TRANSACTION_KEY);
		} else if (groupNameEnum == HubNameEnum.PC) {
			stub.setUsername(CYBERSOURCE_PC_MERCHANT_ID);
			stub.setPassword(CYBERSOURCE_PC_TRANSACTION_KEY);
		} else if (groupNameEnum == HubNameEnum.Med) {
			stub.setUsername(CYBERSOURCE_MED_MERCHANT_ID);
			stub.setPassword(CYBERSOURCE_MED_TRANSACTION_KEY);
		} else if (groupNameEnum == HubNameEnum.Toronto) {
			stub.setUsername(CYBERSOURCE_TORONTO_MERCHANT_ID);
			stub.setPassword(CYBERSOURCE_TORONTO_TRANSACTION_KEY);
		} else if (groupNameEnum == HubNameEnum.SanJuan) {
			stub.setUsername(CYBERSOURCE_SANJUAN_MERCHANT_ID);
			stub.setPassword(CYBERSOURCE_SANJUAN_TRANSACTION_KEY);
		} else  {
			stub.setUsername(CYBERSOURCE_MERCHANT_ID);
			stub.setPassword(CYBERSOURCE_TRANSACTION_KEY);
		}
		return stub;
	}

/*	private RequestMessage getMerchantSecureData(RequestMessage request,
			TransactionRequest transactionRequest) {
		MerchantSecureData merchantSecureData = new MerchantSecureData();
		merchantSecureData
				.setField1(transactionRequest.getBatchId() != null ? transactionRequest
						.getBatchId() : "");
		merchantSecureData.setField2(""
				+ HubNameEnum.valueOf(transactionRequest.getGroupName())
						.getHubId());
		request.setMerchantSecureData(merchantSecureData);
		return request;
	}*/

	@Override
	public List<TransactionResponse> processTransaction(
			List<TransactionRequest> transactionRequestList)
			throws BaseApplicationException {

		List<TransactionResponse> transactionResponseList = new ArrayList<TransactionResponse>();
		for (TransactionRequest transactionRequest : transactionRequestList) {
			transactionResponseList.add(processTransaction(transactionRequest));
		}

		return transactionResponseList;
	}
	/**
	 * Populate request with required Pay Pal field
	 * @param request
	 * @param transactionRequest
	 * @param serviceType
	 * @return RequestMessage object
	 * 
	 */
	
	private RequestMessage createRequestMessageWithPayPalCaptureRequestId(
			RequestMessage request, TransactionRequest transactionRequest,
			String serviceType) {

		if (CybersourceConstants.TRANSACTION_REFUND.equals(serviceType)) {
			PayPalRefundService palRefundService = new PayPalRefundService();
			palRefundService.setPaypalCaptureId(transactionRequest.getCaptureId());
			palRefundService.setPaypalDoCaptureRequestID(transactionRequest.getCaptureRequestId());
			palRefundService.setPaypalDoCaptureRequestToken(transactionRequest.getCaptureRquestToken());
			palRefundService.setRun("true");
			
			request.setPayPalRefundService(palRefundService);

			PurchaseTotals purchaseTotals = new PurchaseTotals();
			purchaseTotals.setCurrency(transactionRequest.getCurrency());
			purchaseTotals.setGrandTotalAmount(new Double(Math
					.abs(transactionRequest.getGrandTotalAmount())).toString());
			request.setPurchaseTotals(purchaseTotals);
		}
		return request;
	}
	/**
	 * Populate request with required Affirm field
	 * @param request
	 * @param transactionRequest
	 * @param serviceType
	 * @return RequestMessage object
	 * 
	 */
	
	private RequestMessage createRequestMessageAffirm(
			RequestMessage request, TransactionRequest transactionRequest,
			String serviceType) {
			
		if (CybersourceConstants.TRANSACTION_REFUND.equals(serviceType)) {
			APRefundService apRefundService = new APRefundService();
			apRefundService.setRefundRequestID(transactionRequest.getCaptureRequestId());

			request.setApPaymentType("AFM");
			request.setApRefundService(apRefundService);
			request.getApRefundService().setRun("true");

			PurchaseTotals purchaseTotals = new PurchaseTotals();
			purchaseTotals.setCurrency(transactionRequest.getCurrency());
			purchaseTotals.setGrandTotalAmount(new Double(Math
					.abs(transactionRequest.getGrandTotalAmount())).toString());
			request.setPurchaseTotals(purchaseTotals);
		}
		return request;
	}
	private RequestMessage createRequestMessageWithSubscriptionId(
			RequestMessage request, TransactionRequest transactionRequest,
			String serviceType) {
		/*
		 * if (CodeSetConstants.TRANSACTION_AUTHORIZATION
		 * .equalsIgnoreCase(serviceType)) { request.setCcAuthService(new
		 * CCAuthService()); request.getCcAuthService().setRun("true");
		 * RecurringSubscriptionInfo recurringSubscriptionInfo = new
		 * RecurringSubscriptionInfo();
		 * recurringSubscriptionInfo.setSubscriptionID
		 * (transactionInfo.getCcNumberAES());
		 * request.setRecurringSubscriptionInfo(recurringSubscriptionInfo);
		 * PurchaseTotals purchaseTotals = new PurchaseTotals();
		 * purchaseTotals.setCurrency(getCurrency(groupId));
		 * purchaseTotals.setGrandTotalAmount(new
		 * Double(Math.abs(transactionInfo.getProcessedAmount())).toString());
		 * request.setPurchaseTotals(purchaseTotals); }
		 */
		if (CybersourceConstants.TRANSACTION_SETTLEMENT.equals(serviceType)) {
			request.setCcCaptureService(new CCCaptureService());
			request.setCcAuthService(new CCAuthService());
			request.getCcAuthService().setRun("true");
			request.getCcCaptureService().setRun("true");
			RecurringSubscriptionInfo recurringSubscriptionInfo = new RecurringSubscriptionInfo();
			recurringSubscriptionInfo.setSubscriptionID(transactionRequest
					.getSubscriptionId());
			request.setRecurringSubscriptionInfo(recurringSubscriptionInfo);

			PurchaseTotals purchaseTotals = new PurchaseTotals();
			purchaseTotals.setCurrency(transactionRequest.getCurrency());
			purchaseTotals.setGrandTotalAmount(new Double(Math
					.abs(transactionRequest.getGrandTotalAmount())).toString());
			request.setPurchaseTotals(purchaseTotals);

		}
		if (CybersourceConstants.TRANSACTION_REFUND.equals(serviceType)) {
			request.setCcCreditService(new CCCreditService());
			request.getCcCreditService().setRun("true");
			RecurringSubscriptionInfo recurringSubscriptionInfo = new RecurringSubscriptionInfo();
			recurringSubscriptionInfo.setSubscriptionID(transactionRequest
					.getSubscriptionId());
			request.setRecurringSubscriptionInfo(recurringSubscriptionInfo);
			PurchaseTotals purchaseTotals = new PurchaseTotals();
			purchaseTotals.setCurrency(transactionRequest.getCurrency());
			purchaseTotals.setGrandTotalAmount(new Double(Math
					.abs(transactionRequest.getGrandTotalAmount())).toString());
			request.setPurchaseTotals(purchaseTotals);
		}
		return request;
	}
	
	private String getRemarks(ReplyMessage reply) {
		StringBuffer remarks = new StringBuffer();
		//CodeVal reasonCode = getReasonCodeVal(reply.getReasonCode().toString());	
		if(ReasonCodeEnum.valueOf(new Integer(reply.getReasonCode().intValue())).getResonStatus().toString().equals(CybersourceConstants.TRANSACTION_SUCCESS_STATUS_ID.toString())){
			remarks.append("SUCCESS:Reason Code:"+ reply.getReasonCode());
		} else if (ReasonCodeEnum.valueOf(new Integer(reply.getReasonCode().intValue())).getResonStatus().toString().equals(CybersourceConstants.TRANSACTION_DECLINE_STATUS_ID.toString())) {
			remarks.append("DECLINE:Reason Code:"+ reply.getReasonCode());
		}else if(ReasonCodeEnum.valueOf(new Integer(reply.getReasonCode().intValue())).getResonStatus().toString().equals(CybersourceConstants.TRANSACTION_ERROR_STATUS_ID.toString())){
			remarks.append("ERROR:Reason Code:"	+ reply.getReasonCode());
		}else{
			remarks.append("ERROR:Reason Code:"+ reply.getReasonCode());
		}
		
		if (reply.getReasonCode().toString().equals("101")) {
			remarks.append(":" + ReasonCodeEnum.valueOf(reply.getReasonCode().intValue()).getReasonDescription());
			for (String field : reply.getMissingField())
				remarks.append(":" + field);
		}
		else if (reply.getReasonCode().toString().equals("102")) {
			remarks.append(":" +  ReasonCodeEnum.valueOf(reply.getReasonCode().intValue()).getReasonDescription());
			if (reply.getInvalidField() != null) {
				for (String field : reply.getInvalidField())
					remarks.append(":" + field);
			}
		} else {
			remarks.append(":" +  ReasonCodeEnum.valueOf(reply.getReasonCode().intValue()).getReasonDescription());	}
		return remarks.toString();
	}

	@Override
	public TransactionResponse processTransaction(
			TransactionRequest transactionRequest)
			throws BaseApplicationException {
		RequestMessage request = getRequestEnvironment();
		ReplyMessage reply = new ReplyMessage();
		TransactionResponse transactionResponse = new TransactionResponse();
		request = getMerchantCodeAndMerchantReferenceId(request,
				HubNameEnum.valueOf((transactionRequest.getHubId())));
		request.setMerchantReferenceCode(transactionRequest.getMerchantRefernceCode());
		
		if("AFM".equals(transactionRequest.getApPaymentType()) ||"Affirm".equals(transactionRequest.getApPaymentType())) {
			request =createRequestMessageAffirm(request,
					transactionRequest,
					CybersourceConstants.TRANSACTION_REFUND);
		}	
		else if (transactionRequest.getGrandTotalAmount() > 0) {
								
				request = createRequestMessageWithSubscriptionId(request,
						transactionRequest,
						CybersourceConstants.TRANSACTION_SETTLEMENT);
			
		} else {
			if(StringUtils.isEmpty(transactionRequest.getSubscriptionId()) && "PayPal".equals(transactionRequest.getApPaymentType())){
				request = createRequestMessageWithPayPalCaptureRequestId(request,
						transactionRequest,
						CybersourceConstants.TRANSACTION_REFUND);
			}else {

				request = createRequestMessageWithSubscriptionId(request,
						transactionRequest,
						CybersourceConstants.TRANSACTION_REFUND);
			}
		}

		try {
			TransactionProcessorLocator service = new TransactionProcessorLocator();
			URL endpoint = new URL(SERVER_URL);

			ITransactionProcessorStub stub = (ITransactionProcessorStub) service
					.getportXML(endpoint);
			stub = getMerchantDetails(stub,HubNameEnum.valueOf(transactionRequest.getHubId()));
			//Added to avoind AVS validation
			BusinessRules br = new BusinessRules();
			br.setIgnoreAVSResult("true");
			request.setBusinessRules(br);
			
			reply = stub.runTransaction(request);
			if (reply.getApRefundReply() != null) {
				transactionResponse.setProcessorTransactionId(reply.getApRefundReply().getReturnRef());
			}
			transactionResponse.setTrxnRemarks(getRemarks(reply));
			if (reply.getCcAuthReply() !=null) {
				transactionResponse.setAuthNumber(reply.getCcAuthReply().getAuthorizationCode());
				transactionResponse.setReconciliationID(reply.getCcAuthReply().getReconciliationID());
			}
			if (reply.getCcCaptureReply() != null) {
				transactionResponse.setReconciliationID(reply.getCcCaptureReply().getReconciliationID());
			}
			if (reply.getCcCreditReply() != null) {
				transactionResponse.setReconciliationID(reply.getCcCreditReply().getReconciliationID());
			}
					
			if (null != reply.getPayPalRefundReply()) { 
				transactionResponse.setReconciliationID(reply.getPayPalRefundReply().getTransactionId());
			}
			
			if (null != reply.getApRefundReply()) { 
				transactionResponse.setReconciliationID(reply.getApRefundReply().getReturnRef());
			}
			
			transactionResponse.setRequestId(reply.getRequestID());
			transactionResponse.setRequestToken(reply.getRequestToken());
			transactionResponse.setTrxnStatus(reply.getDecision());
			transactionResponse.setTrxnCode(reply.getReasonCode().toString());
		} catch (AxisFault e) {
			throw new BaseApplicationException("AxisFault: " + e);
		} catch (MalformedURLException e) {
			throw new BaseApplicationException("MalformedURLException: "
					+ e);
		} catch (RemoteException e) {
			throw new BaseApplicationException("RemoteException: " + e);
		} catch (ServiceException e) {
			throw new BaseApplicationException("ServiceException: " + e);
		}
		
		return transactionResponse;
	
	}

	@Override
	public TransactionResponse processTransactionKBS(
			TransactionRequest transactionRequest)
			throws BaseApplicationException {
		RequestMessage request = getRequestEnvironment();
		ReplyMessage reply = new ReplyMessage();
		TransactionResponse transactionResponse = new TransactionResponse();
//		request = getMerchantCodeAndMerchantReferenceId(request,
//				HubNameEnum.valueOf((transactionRequest.getHubId())));
		request.setMerchantID(transactionRequest.getMerchantID());
		request.setMerchantReferenceCode(transactionRequest.getMerchantRefernceCode());
		if (transactionRequest.getGrandTotalAmount() > 0) {
			request = createRequestMessageWithSubscriptionId(request,
					transactionRequest,
					CybersourceConstants.TRANSACTION_SETTLEMENT);
		} else {
			request = createRequestMessageWithSubscriptionId(request,
					transactionRequest,
					CybersourceConstants.TRANSACTION_REFUND);
		}
	//	request = getMerchantSecureData(request, transactionRequest);

		try {
			TransactionProcessorLocator service = new TransactionProcessorLocator();
			URL endpoint = new URL(transactionRequest.getServerURL());
			ITransactionProcessorStub stub = (ITransactionProcessorStub) service
					.getportXML(endpoint);
//			stub = getMerchantDetails(stub,HubNameEnum.valueOf(transactionRequest.getHubId()));
			stub.setUsername(transactionRequest.getMerchantID());
			stub.setPassword(transactionRequest.getTransactionKey());
			//Added to avoind AVS validation
			BusinessRules br = new BusinessRules();
			br.setIgnoreAVSResult("true");
			request.setBusinessRules(br);
			
			reply = stub.runTransaction(request);

			
			transactionResponse.setTrxnRemarks(getRemarks(reply));
			if (reply.getCcAuthReply() !=null) {
				transactionResponse.setAuthNumber(reply.getCcAuthReply().getAuthorizationCode());
				transactionResponse.setReconciliationID(reply.getCcAuthReply().getReconciliationID());
			}
			if (reply.getCcCaptureReply() != null) {
				transactionResponse.setReconciliationID(reply.getCcCaptureReply().getReconciliationID());
			}
			if (reply.getCcCreditReply() != null) {
				transactionResponse.setReconciliationID(reply.getCcCreditReply().getReconciliationID());
			}
			transactionResponse.setRequestId(reply.getRequestID());
			transactionResponse.setRequestToken(reply.getRequestToken());
			transactionResponse.setTrxnStatus(reply.getDecision());
			transactionResponse.setTrxnCode(reply.getReasonCode().toString());
		} catch (AxisFault e) {
			throw new BaseApplicationException("AxisFault: " + e);
		} catch (MalformedURLException e) {
			throw new BaseApplicationException("MalformedURLException: "
					+ e);
		} catch (RemoteException e) {
			throw new BaseApplicationException("RemoteException: " + e);
		} catch (ServiceException e) {
			throw new BaseApplicationException("ServiceException: " + e);
		}
		
		return transactionResponse;

	}
}
