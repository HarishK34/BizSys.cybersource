
package com.cybersource.stub;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestMessage complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RequestMessage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="merchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="debtIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="clientLibrary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="clientLibraryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="clientEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="clientSecurityLibraryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="clientApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="clientApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="clientApplicationUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="routingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="invoiceHeader" type="{urn:schemas-cybersource-com:transaction-data-1.219}InvoiceHeader" minOccurs="0"/>
 *         <element name="paymentScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mandateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="aggregatorMerchantIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="billTo" type="{urn:schemas-cybersource-com:transaction-data-1.219}BillTo" minOccurs="0"/>
 *         <element name="shipTo" type="{urn:schemas-cybersource-com:transaction-data-1.219}ShipTo" minOccurs="0"/>
 *         <element name="personalID" type="{urn:schemas-cybersource-com:transaction-data-1.219}PersonalID" minOccurs="0"/>
 *         <element name="shipFrom" type="{urn:schemas-cybersource-com:transaction-data-1.219}ShipFrom" minOccurs="0"/>
 *         <element name="item" type="{urn:schemas-cybersource-com:transaction-data-1.219}Item" maxOccurs="1000" minOccurs="0"/>
 *         <element name="purchaseTotals" type="{urn:schemas-cybersource-com:transaction-data-1.219}PurchaseTotals" minOccurs="0"/>
 *         <element name="fundingTotals" type="{urn:schemas-cybersource-com:transaction-data-1.219}FundingTotals" minOccurs="0"/>
 *         <element name="dcc" type="{urn:schemas-cybersource-com:transaction-data-1.219}DCC" minOccurs="0"/>
 *         <element name="pos" type="{urn:schemas-cybersource-com:transaction-data-1.219}Pos" minOccurs="0"/>
 *         <element name="pin" type="{urn:schemas-cybersource-com:transaction-data-1.219}Pin" minOccurs="0"/>
 *         <element name="encryptedPayment" type="{urn:schemas-cybersource-com:transaction-data-1.219}EncryptedPayment" minOccurs="0"/>
 *         <element name="installment" type="{urn:schemas-cybersource-com:transaction-data-1.219}Installment" minOccurs="0"/>
 *         <element name="card" type="{urn:schemas-cybersource-com:transaction-data-1.219}Card" minOccurs="0"/>
 *         <element name="category" type="{urn:schemas-cybersource-com:transaction-data-1.219}Category" minOccurs="0"/>
 *         <element name="check" type="{urn:schemas-cybersource-com:transaction-data-1.219}Check" minOccurs="0"/>
 *         <element name="bml" type="{urn:schemas-cybersource-com:transaction-data-1.219}BML" minOccurs="0"/>
 *         <element name="gecc" type="{urn:schemas-cybersource-com:transaction-data-1.219}GECC" minOccurs="0"/>
 *         <element name="ucaf" type="{urn:schemas-cybersource-com:transaction-data-1.219}UCAF" minOccurs="0"/>
 *         <element name="fundTransfer" type="{urn:schemas-cybersource-com:transaction-data-1.219}FundTransfer" minOccurs="0"/>
 *         <element name="bankInfo" type="{urn:schemas-cybersource-com:transaction-data-1.219}BankInfo" minOccurs="0"/>
 *         <element name="subscription" type="{urn:schemas-cybersource-com:transaction-data-1.219}Subscription" minOccurs="0"/>
 *         <element name="recurringSubscriptionInfo" type="{urn:schemas-cybersource-com:transaction-data-1.219}RecurringSubscriptionInfo" minOccurs="0"/>
 *         <element name="tokenSource" type="{urn:schemas-cybersource-com:transaction-data-1.219}TokenSource" minOccurs="0"/>
 *         <element name="decisionManager" type="{urn:schemas-cybersource-com:transaction-data-1.219}DecisionManager" minOccurs="0"/>
 *         <element name="otherTax" type="{urn:schemas-cybersource-com:transaction-data-1.219}OtherTax" minOccurs="0"/>
 *         <element name="paypal" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPal" minOccurs="0"/>
 *         <element name="merchantDefinedData" type="{urn:schemas-cybersource-com:transaction-data-1.219}MerchantDefinedData" minOccurs="0"/>
 *         <element name="auxiliaryData" type="{urn:schemas-cybersource-com:transaction-data-1.219}AuxiliaryData" minOccurs="0"/>
 *         <element name="merchantSecureData" type="{urn:schemas-cybersource-com:transaction-data-1.219}MerchantSecureData" minOccurs="0"/>
 *         <element name="jpo" type="{urn:schemas-cybersource-com:transaction-data-1.219}JPO" minOccurs="0"/>
 *         <element name="orderRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="linkToRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="serviceFee" type="{urn:schemas-cybersource-com:transaction-data-1.219}ServiceFee" minOccurs="0"/>
 *         <element name="giftCard" type="{urn:schemas-cybersource-com:transaction-data-1.219}GiftCard" minOccurs="0"/>
 *         <element name="ccAuthService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCAuthService" minOccurs="0"/>
 *         <element name="octService" type="{urn:schemas-cybersource-com:transaction-data-1.219}OCTService" minOccurs="0"/>
 *         <element name="ecAVSService" type="{urn:schemas-cybersource-com:transaction-data-1.219}ECAVSService" minOccurs="0"/>
 *         <element name="giftCardActivationService" type="{urn:schemas-cybersource-com:transaction-data-1.219}GiftCardActivationService" minOccurs="0"/>
 *         <element name="giftCardBalanceInquiryService" type="{urn:schemas-cybersource-com:transaction-data-1.219}GiftCardBalanceInquiryService" minOccurs="0"/>
 *         <element name="giftCardRedemptionService" type="{urn:schemas-cybersource-com:transaction-data-1.219}GiftCardRedemptionService" minOccurs="0"/>
 *         <element name="giftCardVoidService" type="{urn:schemas-cybersource-com:transaction-data-1.219}GiftCardVoidService" minOccurs="0"/>
 *         <element name="giftCardReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.219}GiftCardReversalService" minOccurs="0"/>
 *         <element name="giftCardReloadService" type="{urn:schemas-cybersource-com:transaction-data-1.219}GiftCardReloadService" minOccurs="0"/>
 *         <element name="giftCardRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.219}GiftCardRefundService" minOccurs="0"/>
 *         <element name="verificationService" type="{urn:schemas-cybersource-com:transaction-data-1.219}VerificationService" minOccurs="0"/>
 *         <element name="ccSaleService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCSaleService" minOccurs="0"/>
 *         <element name="ccSaleCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCSaleCreditService" minOccurs="0"/>
 *         <element name="ccSaleReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCSaleReversalService" minOccurs="0"/>
 *         <element name="ccIncrementalAuthService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCIncrementalAuthService" minOccurs="0"/>
 *         <element name="ccCaptureService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCCaptureService" minOccurs="0"/>
 *         <element name="ccCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCCreditService" minOccurs="0"/>
 *         <element name="ccAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCAuthReversalService" minOccurs="0"/>
 *         <element name="ccAutoAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCAutoAuthReversalService" minOccurs="0"/>
 *         <element name="ccDCCService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCDCCService" minOccurs="0"/>
 *         <element name="serviceFeeCalculateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}ServiceFeeCalculateService" minOccurs="0"/>
 *         <element name="ecDebitService" type="{urn:schemas-cybersource-com:transaction-data-1.219}ECDebitService" minOccurs="0"/>
 *         <element name="ecCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.219}ECCreditService" minOccurs="0"/>
 *         <element name="ecAuthenticateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}ECAuthenticateService" minOccurs="0"/>
 *         <element name="payerAuthSetupService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayerAuthSetupService" minOccurs="0"/>
 *         <element name="payerAuthEnrollService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayerAuthEnrollService" minOccurs="0"/>
 *         <element name="payerAuthValidateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayerAuthValidateService" minOccurs="0"/>
 *         <element name="taxService" type="{urn:schemas-cybersource-com:transaction-data-1.219}TaxService" minOccurs="0"/>
 *         <element name="dmeService" type="{urn:schemas-cybersource-com:transaction-data-1.219}DMEService" minOccurs="0"/>
 *         <element name="afsService" type="{urn:schemas-cybersource-com:transaction-data-1.219}AFSService" minOccurs="0"/>
 *         <element name="davService" type="{urn:schemas-cybersource-com:transaction-data-1.219}DAVService" minOccurs="0"/>
 *         <element name="exportService" type="{urn:schemas-cybersource-com:transaction-data-1.219}ExportService" minOccurs="0"/>
 *         <element name="fxRatesService" type="{urn:schemas-cybersource-com:transaction-data-1.219}FXRatesService" minOccurs="0"/>
 *         <element name="bankTransferService" type="{urn:schemas-cybersource-com:transaction-data-1.219}BankTransferService" minOccurs="0"/>
 *         <element name="bankTransferRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.219}BankTransferRefundService" minOccurs="0"/>
 *         <element name="bankTransferRealTimeService" type="{urn:schemas-cybersource-com:transaction-data-1.219}BankTransferRealTimeService" minOccurs="0"/>
 *         <element name="directDebitMandateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}DirectDebitMandateService" minOccurs="0"/>
 *         <element name="directDebitService" type="{urn:schemas-cybersource-com:transaction-data-1.219}DirectDebitService" minOccurs="0"/>
 *         <element name="directDebitRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.219}DirectDebitRefundService" minOccurs="0"/>
 *         <element name="directDebitValidateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}DirectDebitValidateService" minOccurs="0"/>
 *         <element name="deviceFingerprintData" type="{urn:schemas-cybersource-com:transaction-data-1.219}DeviceFingerprintData" maxOccurs="10" minOccurs="0"/>
 *         <element name="paySubscriptionCreateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PaySubscriptionCreateService" minOccurs="0"/>
 *         <element name="paySubscriptionUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PaySubscriptionUpdateService" minOccurs="0"/>
 *         <element name="paySubscriptionEventUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PaySubscriptionEventUpdateService" minOccurs="0"/>
 *         <element name="paySubscriptionRetrieveService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PaySubscriptionRetrieveService" minOccurs="0"/>
 *         <element name="paySubscriptionDeleteService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PaySubscriptionDeleteService" minOccurs="0"/>
 *         <element name="payPalPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalPaymentService" minOccurs="0"/>
 *         <element name="payPalCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalCreditService" minOccurs="0"/>
 *         <element name="voidService" type="{urn:schemas-cybersource-com:transaction-data-1.219}VoidService" minOccurs="0"/>
 *         <element name="businessRules" type="{urn:schemas-cybersource-com:transaction-data-1.219}BusinessRules" minOccurs="0"/>
 *         <element name="pinlessDebitService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PinlessDebitService" minOccurs="0"/>
 *         <element name="pinlessDebitValidateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PinlessDebitValidateService" minOccurs="0"/>
 *         <element name="pinlessDebitReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PinlessDebitReversalService" minOccurs="0"/>
 *         <element name="batch" type="{urn:schemas-cybersource-com:transaction-data-1.219}Batch" minOccurs="0"/>
 *         <element name="airlineData" type="{urn:schemas-cybersource-com:transaction-data-1.219}AirlineData" minOccurs="0"/>
 *         <element name="ancillaryData" type="{urn:schemas-cybersource-com:transaction-data-1.219}AncillaryData" minOccurs="0"/>
 *         <element name="lodgingData" type="{urn:schemas-cybersource-com:transaction-data-1.219}LodgingData" minOccurs="0"/>
 *         <element name="payPalButtonCreateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalButtonCreateService" minOccurs="0"/>
 *         <element name="payPalPreapprovedPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalPreapprovedPaymentService" minOccurs="0"/>
 *         <element name="payPalPreapprovedUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalPreapprovedUpdateService" minOccurs="0"/>
 *         <element name="riskUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}RiskUpdateService" minOccurs="0"/>
 *         <element name="fraudUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}FraudUpdateService" minOccurs="0"/>
 *         <element name="caseManagementActionService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CaseManagementActionService" minOccurs="0"/>
 *         <element name="reserved" type="{urn:schemas-cybersource-com:transaction-data-1.219}RequestReserved" maxOccurs="999" minOccurs="0"/>
 *         <element name="deviceFingerprintID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deviceFingerprintRaw" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="deviceFingerprintHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="payPalRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalRefundService" minOccurs="0"/>
 *         <element name="payPalAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalAuthReversalService" minOccurs="0"/>
 *         <element name="payPalDoCaptureService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalDoCaptureService" minOccurs="0"/>
 *         <element name="payPalEcDoPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalEcDoPaymentService" minOccurs="0"/>
 *         <element name="payPalEcGetDetailsService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalEcGetDetailsService" minOccurs="0"/>
 *         <element name="payPalEcSetService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalEcSetService" minOccurs="0"/>
 *         <element name="payPalEcOrderSetupService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalEcOrderSetupService" minOccurs="0"/>
 *         <element name="payPalAuthorizationService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalAuthorizationService" minOccurs="0"/>
 *         <element name="payPalUpdateAgreementService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalUpdateAgreementService" minOccurs="0"/>
 *         <element name="payPalCreateAgreementService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalCreateAgreementService" minOccurs="0"/>
 *         <element name="payPalDoRefTransactionService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalDoRefTransactionService" minOccurs="0"/>
 *         <element name="chinaPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.219}ChinaPaymentService" minOccurs="0"/>
 *         <element name="chinaRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.219}ChinaRefundService" minOccurs="0"/>
 *         <element name="boletoPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.219}BoletoPaymentService" minOccurs="0"/>
 *         <element name="apPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="apInitiateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APInitiateService" minOccurs="0"/>
 *         <element name="apCheckStatusService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APCheckStatusService" minOccurs="0"/>
 *         <element name="ignoreCardExpiration" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="reportGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="processorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="thirdPartyCertificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transactionLocalDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.219}dateTime" minOccurs="0"/>
 *         <element name="solutionProviderTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="surchargeAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="surchargeSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pinDataEncryptedPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pinDataKeySerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pinDataPinBlockEncodingFormat" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="cashbackAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="pinDebitPurchaseService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PinDebitPurchaseService" minOccurs="0"/>
 *         <element name="pinDebitCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PinDebitCreditService" minOccurs="0"/>
 *         <element name="pinDebitReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PinDebitReversalService" minOccurs="0"/>
 *         <element name="ap" type="{urn:schemas-cybersource-com:transaction-data-1.219}AP" minOccurs="0"/>
 *         <element name="apAuthService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APAuthService" minOccurs="0"/>
 *         <element name="apAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APAuthReversalService" minOccurs="0"/>
 *         <element name="apCaptureService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APCaptureService" minOccurs="0"/>
 *         <element name="apOptionsService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APOptionsService" minOccurs="0"/>
 *         <element name="apRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APRefundService" minOccurs="0"/>
 *         <element name="apSaleService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APSaleService" minOccurs="0"/>
 *         <element name="apCheckoutDetailsService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APCheckOutDetailsService" minOccurs="0"/>
 *         <element name="apSessionsService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APSessionsService" minOccurs="0"/>
 *         <element name="apUI" type="{urn:schemas-cybersource-com:transaction-data-1.219}APUI" minOccurs="0"/>
 *         <element name="apTransactionDetailsService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APTransactionDetailsService" minOccurs="0"/>
 *         <element name="apConfirmPurchaseService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APConfirmPurchaseService" minOccurs="0"/>
 *         <element name="payPalGetTxnDetailsService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalGetTxnDetailsService" minOccurs="0"/>
 *         <element name="payPalTransactionSearchService" type="{urn:schemas-cybersource-com:transaction-data-1.219}PayPalTransactionSearchService" minOccurs="0"/>
 *         <element name="ccDCCUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCDCCUpdateService" minOccurs="0"/>
 *         <element name="emvRequest" type="{urn:schemas-cybersource-com:transaction-data-1.219}EmvRequest" minOccurs="0"/>
 *         <element name="merchant" type="{urn:schemas-cybersource-com:transaction-data-1.219}merchant" minOccurs="0"/>
 *         <element name="merchantTransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hostedDataCreateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}HostedDataCreateService" minOccurs="0"/>
 *         <element name="hostedDataRetrieveService" type="{urn:schemas-cybersource-com:transaction-data-1.219}HostedDataRetrieveService" minOccurs="0"/>
 *         <element name="merchantDomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantCategoryCodeDomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="salesSlipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchandiseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchandiseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentInitiationChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentMethod_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="extendedCreditTotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentNetworkToken" type="{urn:schemas-cybersource-com:transaction-data-1.219}PaymentNetworkToken" minOccurs="0"/>
 *         <element name="recipient" type="{urn:schemas-cybersource-com:transaction-data-1.219}Recipient" minOccurs="0"/>
 *         <element name="sender" type="{urn:schemas-cybersource-com:transaction-data-1.219}Sender" minOccurs="0"/>
 *         <element name="autoRentalData" type="{urn:schemas-cybersource-com:transaction-data-1.219}AutoRentalData" minOccurs="0"/>
 *         <element name="paymentSolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vc" type="{urn:schemas-cybersource-com:transaction-data-1.219}VC" minOccurs="0"/>
 *         <element name="decryptVisaCheckoutDataService" type="{urn:schemas-cybersource-com:transaction-data-1.219}DecryptVisaCheckoutDataService" minOccurs="0"/>
 *         <element name="taxManagementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="promotionGroup" type="{urn:schemas-cybersource-com:transaction-data-1.219}PromotionGroup" maxOccurs="100" minOccurs="0"/>
 *         <element name="wallet" type="{urn:schemas-cybersource-com:transaction-data-1.219}Wallet" minOccurs="0"/>
 *         <element name="aft" type="{urn:schemas-cybersource-com:transaction-data-1.219}Aft" minOccurs="0"/>
 *         <element name="balanceInquiry" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="prenoteTransaction" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="encryptPaymentDataService" type="{urn:schemas-cybersource-com:transaction-data-1.219}EncryptPaymentDataService" minOccurs="0"/>
 *         <element name="nationalNetDomesticData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="subsequentAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="subsequentAuthOriginalAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="binLookupService" type="{urn:schemas-cybersource-com:transaction-data-1.219}BinLookupService" minOccurs="0"/>
 *         <element name="verificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="issuer" type="{urn:schemas-cybersource-com:transaction-data-1.219}issuer" minOccurs="0"/>
 *         <element name="partnerSolutionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="developerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="getVisaCheckoutDataService" type="{urn:schemas-cybersource-com:transaction-data-1.219}GETVisaCheckoutDataService" minOccurs="0"/>
 *         <element name="customerSignatureImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transactionMetadataService" type="{urn:schemas-cybersource-com:transaction-data-1.219}TransactionMetadataService" minOccurs="0"/>
 *         <element name="subsequentAuthFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="subsequentAuthReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="subsequentAuthTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="processorTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="subsequentAuthStoredCredential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="subsequentAuthCumulativeAuthAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="subsequentAuthCITAuthenticationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="loan" type="{urn:schemas-cybersource-com:transaction-data-1.219}Loan" minOccurs="0"/>
 *         <element name="eligibilityInquiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="redemptionInquiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="feeProgramIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="apOrderService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APOrderService" minOccurs="0"/>
 *         <element name="apCancelService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APCancelService" minOccurs="0"/>
 *         <element name="apBillingAgreementService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APBillingAgreementService" minOccurs="0"/>
 *         <element name="note_toPayee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="note_toPayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="clientMetadataID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="partnerSDKversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="partnerOriginalTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardTypeSelectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="apCreateMandateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APCreateMandateService" minOccurs="0"/>
 *         <element name="apMandateStatusService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APMandateStatusService" minOccurs="0"/>
 *         <element name="apUpdateMandateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APUpdateMandateService" minOccurs="0"/>
 *         <element name="apImportMandateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APImportMandateService" minOccurs="0"/>
 *         <element name="apRevokeMandateService" type="{urn:schemas-cybersource-com:transaction-data-1.219}APRevokeMandateService" minOccurs="0"/>
 *         <element name="billPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="postdatedTransaction" type="{urn:schemas-cybersource-com:transaction-data-1.219}PostdatedTransaction" minOccurs="0"/>
 *         <element name="getMasterpassDataService" type="{urn:schemas-cybersource-com:transaction-data-1.219}GetMasterpassDataService" minOccurs="0"/>
 *         <element name="ccCheckStatusService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCCheckStatusService" minOccurs="0"/>
 *         <element name="mPOS" type="{urn:schemas-cybersource-com:transaction-data-1.219}mPOS" minOccurs="0"/>
 *         <element name="abortService" type="{urn:schemas-cybersource-com:transaction-data-1.219}AbortService" minOccurs="0"/>
 *         <element name="ignoreRelaxAVS" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="agencyInformation" type="{urn:schemas-cybersource-com:transaction-data-1.219}AgencyInformation" minOccurs="0"/>
 *         <element name="autoRental" type="{urn:schemas-cybersource-com:transaction-data-1.219}AutoRental" minOccurs="0"/>
 *         <element name="healthCare" type="{urn:schemas-cybersource-com:transaction-data-1.219}HealthCare" maxOccurs="10" minOccurs="0"/>
 *         <element name="payByPoints" type="{urn:schemas-cybersource-com:transaction-data-1.219}payByPoints" minOccurs="0"/>
 *         <element name="paymentAccountReference" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedString" minOccurs="0"/>
 *         <element name="networkTokenCryptogram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="promotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="recurring" type="{urn:schemas-cybersource-com:transaction-data-1.219}Recurring" minOccurs="0"/>
 *         <element name="ccCreditAuthService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCCreditAuthService" minOccurs="0"/>
 *         <element name="ccCreditAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.219}CCCreditAuthReversalService" minOccurs="0"/>
 *         <element name="vehicleData" type="{urn:schemas-cybersource-com:transaction-data-1.219}VehicleData" minOccurs="0"/>
 *         <element name="enablerId" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedString" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessage", propOrder = {
    "merchantID",
    "merchantReferenceCode",
    "debtIndicator",
    "clientLibrary",
    "clientLibraryVersion",
    "clientEnvironment",
    "clientSecurityLibraryVersion",
    "clientApplication",
    "clientApplicationVersion",
    "clientApplicationUser",
    "routingCode",
    "comments",
    "returnURL",
    "invoiceHeader",
    "paymentScheme",
    "mandateID",
    "aggregatorMerchantIdentifier",
    "customerID",
    "customerFirstName",
    "customerLastName",
    "billTo",
    "shipTo",
    "personalID",
    "shipFrom",
    "item",
    "purchaseTotals",
    "fundingTotals",
    "dcc",
    "pos",
    "pin",
    "encryptedPayment",
    "installment",
    "card",
    "category",
    "check",
    "bml",
    "gecc",
    "ucaf",
    "fundTransfer",
    "bankInfo",
    "subscription",
    "recurringSubscriptionInfo",
    "tokenSource",
    "decisionManager",
    "otherTax",
    "paypal",
    "merchantDefinedData",
    "auxiliaryData",
    "merchantSecureData",
    "jpo",
    "orderRequestToken",
    "linkToRequest",
    "serviceFee",
    "giftCard",
    "ccAuthService",
    "octService",
    "ecAVSService",
    "giftCardActivationService",
    "giftCardBalanceInquiryService",
    "giftCardRedemptionService",
    "giftCardVoidService",
    "giftCardReversalService",
    "giftCardReloadService",
    "giftCardRefundService",
    "verificationService",
    "ccSaleService",
    "ccSaleCreditService",
    "ccSaleReversalService",
    "ccIncrementalAuthService",
    "ccCaptureService",
    "ccCreditService",
    "ccAuthReversalService",
    "ccAutoAuthReversalService",
    "ccDCCService",
    "serviceFeeCalculateService",
    "ecDebitService",
    "ecCreditService",
    "ecAuthenticateService",
    "payerAuthSetupService",
    "payerAuthEnrollService",
    "payerAuthValidateService",
    "taxService",
    "dmeService",
    "afsService",
    "davService",
    "exportService",
    "fxRatesService",
    "bankTransferService",
    "bankTransferRefundService",
    "bankTransferRealTimeService",
    "directDebitMandateService",
    "directDebitService",
    "directDebitRefundService",
    "directDebitValidateService",
    "deviceFingerprintData",
    "paySubscriptionCreateService",
    "paySubscriptionUpdateService",
    "paySubscriptionEventUpdateService",
    "paySubscriptionRetrieveService",
    "paySubscriptionDeleteService",
    "payPalPaymentService",
    "payPalCreditService",
    "voidService",
    "businessRules",
    "pinlessDebitService",
    "pinlessDebitValidateService",
    "pinlessDebitReversalService",
    "batch",
    "airlineData",
    "ancillaryData",
    "lodgingData",
    "payPalButtonCreateService",
    "payPalPreapprovedPaymentService",
    "payPalPreapprovedUpdateService",
    "riskUpdateService",
    "fraudUpdateService",
    "caseManagementActionService",
    "reserved",
    "deviceFingerprintID",
    "deviceFingerprintRaw",
    "deviceFingerprintHash",
    "payPalRefundService",
    "payPalAuthReversalService",
    "payPalDoCaptureService",
    "payPalEcDoPaymentService",
    "payPalEcGetDetailsService",
    "payPalEcSetService",
    "payPalEcOrderSetupService",
    "payPalAuthorizationService",
    "payPalUpdateAgreementService",
    "payPalCreateAgreementService",
    "payPalDoRefTransactionService",
    "chinaPaymentService",
    "chinaRefundService",
    "boletoPaymentService",
    "apPaymentType",
    "apInitiateService",
    "apCheckStatusService",
    "ignoreCardExpiration",
    "reportGroup",
    "processorID",
    "thirdPartyCertificationNumber",
    "transactionLocalDateTime",
    "solutionProviderTransactionID",
    "surchargeAmount",
    "surchargeSign",
    "pinDataEncryptedPIN",
    "pinDataKeySerialNumber",
    "pinDataPinBlockEncodingFormat",
    "cashbackAmount",
    "pinDebitPurchaseService",
    "pinDebitCreditService",
    "pinDebitReversalService",
    "ap",
    "apAuthService",
    "apAuthReversalService",
    "apCaptureService",
    "apOptionsService",
    "apRefundService",
    "apSaleService",
    "apCheckoutDetailsService",
    "apSessionsService",
    "apUI",
    "apTransactionDetailsService",
    "apConfirmPurchaseService",
    "payPalGetTxnDetailsService",
    "payPalTransactionSearchService",
    "ccDCCUpdateService",
    "emvRequest",
    "merchant",
    "merchantTransactionIdentifier",
    "hostedDataCreateService",
    "hostedDataRetrieveService",
    "merchantDomainName",
    "merchantCategoryCode",
    "merchantCategoryCodeDomestic",
    "salesSlipNumber",
    "merchandiseCode",
    "merchandiseDescription",
    "paymentInitiationChannel",
    "paymentMethodName",
    "extendedCreditTotalCount",
    "authIndicator",
    "paymentNetworkToken",
    "recipient",
    "sender",
    "autoRentalData",
    "paymentSolution",
    "vc",
    "decryptVisaCheckoutDataService",
    "taxManagementIndicator",
    "promotionGroup",
    "wallet",
    "aft",
    "balanceInquiry",
    "prenoteTransaction",
    "encryptPaymentDataService",
    "nationalNetDomesticData",
    "subsequentAuth",
    "subsequentAuthOriginalAmount",
    "binLookupService",
    "verificationCode",
    "mobileNumber",
    "issuer",
    "partnerSolutionID",
    "developerID",
    "getVisaCheckoutDataService",
    "customerSignatureImage",
    "transactionMetadataService",
    "subsequentAuthFirst",
    "subsequentAuthReason",
    "subsequentAuthTransactionID",
    "processorTransId",
    "subsequentAuthStoredCredential",
    "subsequentAuthCumulativeAuthAmount",
    "subsequentAuthCITAuthenticationData",
    "loan",
    "eligibilityInquiry",
    "redemptionInquiry",
    "feeProgramIndicator",
    "apOrderService",
    "apCancelService",
    "apBillingAgreementService",
    "noteToPayee",
    "noteToPayer",
    "clientMetadataID",
    "partnerSDKversion",
    "partnerOriginalTransactionID",
    "cardTypeSelectionIndicator",
    "apCreateMandateService",
    "apMandateStatusService",
    "apUpdateMandateService",
    "apImportMandateService",
    "apRevokeMandateService",
    "billPaymentType",
    "postdatedTransaction",
    "getMasterpassDataService",
    "ccCheckStatusService",
    "mpos",
    "abortService",
    "ignoreRelaxAVS",
    "agencyInformation",
    "autoRental",
    "healthCare",
    "payByPoints",
    "paymentAccountReference",
    "networkTokenCryptogram",
    "promotionCode",
    "recurring",
    "ccCreditAuthService",
    "ccCreditAuthReversalService",
    "vehicleData",
    "enablerId"
})
public class RequestMessage {

    protected String merchantID;
    protected String merchantReferenceCode;
    protected String debtIndicator;
    protected String clientLibrary;
    protected String clientLibraryVersion;
    protected String clientEnvironment;
    protected String clientSecurityLibraryVersion;
    protected String clientApplication;
    protected String clientApplicationVersion;
    protected String clientApplicationUser;
    protected String routingCode;
    protected String comments;
    protected String returnURL;
    protected InvoiceHeader invoiceHeader;
    protected String paymentScheme;
    protected String mandateID;
    protected String aggregatorMerchantIdentifier;
    protected String customerID;
    protected String customerFirstName;
    protected String customerLastName;
    protected BillTo billTo;
    protected ShipTo shipTo;
    protected PersonalID personalID;
    protected ShipFrom shipFrom;
    protected List<Item> item;
    protected PurchaseTotals purchaseTotals;
    protected FundingTotals fundingTotals;
    protected DCC dcc;
    protected Pos pos;
    protected Pin pin;
    protected EncryptedPayment encryptedPayment;
    protected Installment installment;
    protected Card card;
    protected Category category;
    protected Check check;
    protected BML bml;
    protected GECC gecc;
    protected UCAF ucaf;
    protected FundTransfer fundTransfer;
    protected BankInfo bankInfo;
    protected Subscription subscription;
    protected RecurringSubscriptionInfo recurringSubscriptionInfo;
    protected TokenSource tokenSource;
    protected DecisionManager decisionManager;
    protected OtherTax otherTax;
    protected PayPal paypal;
    protected MerchantDefinedData merchantDefinedData;
    protected AuxiliaryData auxiliaryData;
    protected MerchantSecureData merchantSecureData;
    protected JPO jpo;
    protected String orderRequestToken;
    protected String linkToRequest;
    protected ServiceFee serviceFee;
    protected GiftCard giftCard;
    protected CCAuthService ccAuthService;
    protected OCTService octService;
    protected ECAVSService ecAVSService;
    protected GiftCardActivationService giftCardActivationService;
    protected GiftCardBalanceInquiryService giftCardBalanceInquiryService;
    protected GiftCardRedemptionService giftCardRedemptionService;
    protected GiftCardVoidService giftCardVoidService;
    protected GiftCardReversalService giftCardReversalService;
    protected GiftCardReloadService giftCardReloadService;
    protected GiftCardRefundService giftCardRefundService;
    protected VerificationService verificationService;
    protected CCSaleService ccSaleService;
    protected CCSaleCreditService ccSaleCreditService;
    protected CCSaleReversalService ccSaleReversalService;
    protected CCIncrementalAuthService ccIncrementalAuthService;
    protected CCCaptureService ccCaptureService;
    protected CCCreditService ccCreditService;
    protected CCAuthReversalService ccAuthReversalService;
    protected CCAutoAuthReversalService ccAutoAuthReversalService;
    protected CCDCCService ccDCCService;
    protected ServiceFeeCalculateService serviceFeeCalculateService;
    protected ECDebitService ecDebitService;
    protected ECCreditService ecCreditService;
    protected ECAuthenticateService ecAuthenticateService;
    protected PayerAuthSetupService payerAuthSetupService;
    protected PayerAuthEnrollService payerAuthEnrollService;
    protected PayerAuthValidateService payerAuthValidateService;
    protected TaxService taxService;
    protected DMEService dmeService;
    protected AFSService afsService;
    protected DAVService davService;
    protected ExportService exportService;
    protected FXRatesService fxRatesService;
    protected BankTransferService bankTransferService;
    protected BankTransferRefundService bankTransferRefundService;
    protected BankTransferRealTimeService bankTransferRealTimeService;
    protected DirectDebitMandateService directDebitMandateService;
    protected DirectDebitService directDebitService;
    protected DirectDebitRefundService directDebitRefundService;
    protected DirectDebitValidateService directDebitValidateService;
    protected List<DeviceFingerprintData> deviceFingerprintData;
    protected PaySubscriptionCreateService paySubscriptionCreateService;
    protected PaySubscriptionUpdateService paySubscriptionUpdateService;
    protected PaySubscriptionEventUpdateService paySubscriptionEventUpdateService;
    protected PaySubscriptionRetrieveService paySubscriptionRetrieveService;
    protected PaySubscriptionDeleteService paySubscriptionDeleteService;
    protected PayPalPaymentService payPalPaymentService;
    protected PayPalCreditService payPalCreditService;
    protected VoidService voidService;
    protected BusinessRules businessRules;
    protected PinlessDebitService pinlessDebitService;
    protected PinlessDebitValidateService pinlessDebitValidateService;
    protected PinlessDebitReversalService pinlessDebitReversalService;
    protected Batch batch;
    protected AirlineData airlineData;
    protected AncillaryData ancillaryData;
    protected LodgingData lodgingData;
    protected PayPalButtonCreateService payPalButtonCreateService;
    protected PayPalPreapprovedPaymentService payPalPreapprovedPaymentService;
    protected PayPalPreapprovedUpdateService payPalPreapprovedUpdateService;
    protected RiskUpdateService riskUpdateService;
    protected FraudUpdateService fraudUpdateService;
    protected CaseManagementActionService caseManagementActionService;
    protected List<RequestReserved> reserved;
    protected String deviceFingerprintID;
    protected String deviceFingerprintRaw;
    protected String deviceFingerprintHash;
    protected PayPalRefundService payPalRefundService;
    protected PayPalAuthReversalService payPalAuthReversalService;
    protected PayPalDoCaptureService payPalDoCaptureService;
    protected PayPalEcDoPaymentService payPalEcDoPaymentService;
    protected PayPalEcGetDetailsService payPalEcGetDetailsService;
    protected PayPalEcSetService payPalEcSetService;
    protected PayPalEcOrderSetupService payPalEcOrderSetupService;
    protected PayPalAuthorizationService payPalAuthorizationService;
    protected PayPalUpdateAgreementService payPalUpdateAgreementService;
    protected PayPalCreateAgreementService payPalCreateAgreementService;
    protected PayPalDoRefTransactionService payPalDoRefTransactionService;
    protected ChinaPaymentService chinaPaymentService;
    protected ChinaRefundService chinaRefundService;
    protected BoletoPaymentService boletoPaymentService;
    protected String apPaymentType;
    protected APInitiateService apInitiateService;
    protected APCheckStatusService apCheckStatusService;
    protected String ignoreCardExpiration;
    protected String reportGroup;
    protected String processorID;
    protected String thirdPartyCertificationNumber;
    protected String transactionLocalDateTime;
    protected String solutionProviderTransactionID;
    protected String surchargeAmount;
    protected String surchargeSign;
    protected String pinDataEncryptedPIN;
    protected String pinDataKeySerialNumber;
    protected BigInteger pinDataPinBlockEncodingFormat;
    protected String cashbackAmount;
    protected PinDebitPurchaseService pinDebitPurchaseService;
    protected PinDebitCreditService pinDebitCreditService;
    protected PinDebitReversalService pinDebitReversalService;
    protected AP ap;
    protected APAuthService apAuthService;
    protected APAuthReversalService apAuthReversalService;
    protected APCaptureService apCaptureService;
    protected APOptionsService apOptionsService;
    protected APRefundService apRefundService;
    protected APSaleService apSaleService;
    protected APCheckOutDetailsService apCheckoutDetailsService;
    protected APSessionsService apSessionsService;
    protected APUI apUI;
    protected APTransactionDetailsService apTransactionDetailsService;
    protected APConfirmPurchaseService apConfirmPurchaseService;
    protected PayPalGetTxnDetailsService payPalGetTxnDetailsService;
    protected PayPalTransactionSearchService payPalTransactionSearchService;
    protected CCDCCUpdateService ccDCCUpdateService;
    protected EmvRequest emvRequest;
    protected Merchant merchant;
    protected String merchantTransactionIdentifier;
    protected HostedDataCreateService hostedDataCreateService;
    protected HostedDataRetrieveService hostedDataRetrieveService;
    protected String merchantDomainName;
    protected String merchantCategoryCode;
    protected String merchantCategoryCodeDomestic;
    protected String salesSlipNumber;
    protected String merchandiseCode;
    protected String merchandiseDescription;
    protected String paymentInitiationChannel;
    @XmlElement(name = "paymentMethod_name")
    protected String paymentMethodName;
    protected String extendedCreditTotalCount;
    protected String authIndicator;
    protected PaymentNetworkToken paymentNetworkToken;
    protected Recipient recipient;
    protected Sender sender;
    protected AutoRentalData autoRentalData;
    protected String paymentSolution;
    protected VC vc;
    protected DecryptVisaCheckoutDataService decryptVisaCheckoutDataService;
    protected String taxManagementIndicator;
    protected List<PromotionGroup> promotionGroup;
    protected Wallet wallet;
    protected Aft aft;
    protected String balanceInquiry;
    protected String prenoteTransaction;
    protected EncryptPaymentDataService encryptPaymentDataService;
    protected String nationalNetDomesticData;
    protected String subsequentAuth;
    protected String subsequentAuthOriginalAmount;
    protected BinLookupService binLookupService;
    protected String verificationCode;
    protected String mobileNumber;
    protected Issuer issuer;
    protected String partnerSolutionID;
    protected String developerID;
    protected GETVisaCheckoutDataService getVisaCheckoutDataService;
    protected String customerSignatureImage;
    protected TransactionMetadataService transactionMetadataService;
    protected String subsequentAuthFirst;
    protected String subsequentAuthReason;
    protected String subsequentAuthTransactionID;
    protected String processorTransId;
    protected String subsequentAuthStoredCredential;
    protected String subsequentAuthCumulativeAuthAmount;
    protected String subsequentAuthCITAuthenticationData;
    protected Loan loan;
    protected String eligibilityInquiry;
    protected String redemptionInquiry;
    protected String feeProgramIndicator;
    protected APOrderService apOrderService;
    protected APCancelService apCancelService;
    protected APBillingAgreementService apBillingAgreementService;
    @XmlElement(name = "note_toPayee")
    protected String noteToPayee;
    @XmlElement(name = "note_toPayer")
    protected String noteToPayer;
    protected String clientMetadataID;
    protected String partnerSDKversion;
    protected String partnerOriginalTransactionID;
    protected String cardTypeSelectionIndicator;
    protected APCreateMandateService apCreateMandateService;
    protected APMandateStatusService apMandateStatusService;
    protected APUpdateMandateService apUpdateMandateService;
    protected APImportMandateService apImportMandateService;
    protected APRevokeMandateService apRevokeMandateService;
    protected String billPaymentType;
    protected PostdatedTransaction postdatedTransaction;
    protected GetMasterpassDataService getMasterpassDataService;
    protected CCCheckStatusService ccCheckStatusService;
    @XmlElement(name = "mPOS")
    protected MPOS mpos;
    protected AbortService abortService;
    protected String ignoreRelaxAVS;
    protected AgencyInformation agencyInformation;
    protected AutoRental autoRental;
    protected List<HealthCare> healthCare;
    protected PayByPoints payByPoints;
    protected String paymentAccountReference;
    protected String networkTokenCryptogram;
    protected String promotionCode;
    protected Recurring recurring;
    protected CCCreditAuthService ccCreditAuthService;
    protected CCCreditAuthReversalService ccCreditAuthReversalService;
    protected VehicleData vehicleData;
    protected String enablerId;

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the merchantReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReferenceCode() {
        return merchantReferenceCode;
    }

    /**
     * Sets the value of the merchantReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReferenceCode(String value) {
        this.merchantReferenceCode = value;
    }

    /**
     * Gets the value of the debtIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtIndicator() {
        return debtIndicator;
    }

    /**
     * Sets the value of the debtIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtIndicator(String value) {
        this.debtIndicator = value;
    }

    /**
     * Gets the value of the clientLibrary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLibrary() {
        return clientLibrary;
    }

    /**
     * Sets the value of the clientLibrary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLibrary(String value) {
        this.clientLibrary = value;
    }

    /**
     * Gets the value of the clientLibraryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLibraryVersion() {
        return clientLibraryVersion;
    }

    /**
     * Sets the value of the clientLibraryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLibraryVersion(String value) {
        this.clientLibraryVersion = value;
    }

    /**
     * Gets the value of the clientEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientEnvironment() {
        return clientEnvironment;
    }

    /**
     * Sets the value of the clientEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientEnvironment(String value) {
        this.clientEnvironment = value;
    }

    /**
     * Gets the value of the clientSecurityLibraryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSecurityLibraryVersion() {
        return clientSecurityLibraryVersion;
    }

    /**
     * Sets the value of the clientSecurityLibraryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSecurityLibraryVersion(String value) {
        this.clientSecurityLibraryVersion = value;
    }

    /**
     * Gets the value of the clientApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientApplication() {
        return clientApplication;
    }

    /**
     * Sets the value of the clientApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientApplication(String value) {
        this.clientApplication = value;
    }

    /**
     * Gets the value of the clientApplicationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientApplicationVersion() {
        return clientApplicationVersion;
    }

    /**
     * Sets the value of the clientApplicationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientApplicationVersion(String value) {
        this.clientApplicationVersion = value;
    }

    /**
     * Gets the value of the clientApplicationUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientApplicationUser() {
        return clientApplicationUser;
    }

    /**
     * Sets the value of the clientApplicationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientApplicationUser(String value) {
        this.clientApplicationUser = value;
    }

    /**
     * Gets the value of the routingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * Sets the value of the routingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCode(String value) {
        this.routingCode = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the returnURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * Sets the value of the returnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURL(String value) {
        this.returnURL = value;
    }

    /**
     * Gets the value of the invoiceHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeader }
     *     
     */
    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    /**
     * Sets the value of the invoiceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeader }
     *     
     */
    public void setInvoiceHeader(InvoiceHeader value) {
        this.invoiceHeader = value;
    }

    /**
     * Gets the value of the paymentScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentScheme() {
        return paymentScheme;
    }

    /**
     * Sets the value of the paymentScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentScheme(String value) {
        this.paymentScheme = value;
    }

    /**
     * Gets the value of the mandateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateID() {
        return mandateID;
    }

    /**
     * Sets the value of the mandateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateID(String value) {
        this.mandateID = value;
    }

    /**
     * Gets the value of the aggregatorMerchantIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorMerchantIdentifier() {
        return aggregatorMerchantIdentifier;
    }

    /**
     * Sets the value of the aggregatorMerchantIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorMerchantIdentifier(String value) {
        this.aggregatorMerchantIdentifier = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the customerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Sets the value of the customerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirstName(String value) {
        this.customerFirstName = value;
    }

    /**
     * Gets the value of the customerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Sets the value of the customerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLastName(String value) {
        this.customerLastName = value;
    }

    /**
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link BillTo }
     *     
     */
    public BillTo getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillTo }
     *     
     */
    public void setBillTo(BillTo value) {
        this.billTo = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link ShipTo }
     *     
     */
    public ShipTo getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipTo }
     *     
     */
    public void setShipTo(ShipTo value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the personalID property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalID }
     *     
     */
    public PersonalID getPersonalID() {
        return personalID;
    }

    /**
     * Sets the value of the personalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalID }
     *     
     */
    public void setPersonalID(PersonalID value) {
        this.personalID = value;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ShipFrom }
     *     
     */
    public ShipFrom getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipFrom }
     *     
     */
    public void setShipFrom(ShipFrom value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * </p>
     * 
     * 
     * @return
     *     The value of the item property.
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<>();
        }
        return this.item;
    }

    /**
     * Gets the value of the purchaseTotals property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseTotals }
     *     
     */
    public PurchaseTotals getPurchaseTotals() {
        return purchaseTotals;
    }

    /**
     * Sets the value of the purchaseTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseTotals }
     *     
     */
    public void setPurchaseTotals(PurchaseTotals value) {
        this.purchaseTotals = value;
    }

    /**
     * Gets the value of the fundingTotals property.
     * 
     * @return
     *     possible object is
     *     {@link FundingTotals }
     *     
     */
    public FundingTotals getFundingTotals() {
        return fundingTotals;
    }

    /**
     * Sets the value of the fundingTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingTotals }
     *     
     */
    public void setFundingTotals(FundingTotals value) {
        this.fundingTotals = value;
    }

    /**
     * Gets the value of the dcc property.
     * 
     * @return
     *     possible object is
     *     {@link DCC }
     *     
     */
    public DCC getDcc() {
        return dcc;
    }

    /**
     * Sets the value of the dcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCC }
     *     
     */
    public void setDcc(DCC value) {
        this.dcc = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link Pos }
     *     
     */
    public Pos getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pos }
     *     
     */
    public void setPos(Pos value) {
        this.pos = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link Pin }
     *     
     */
    public Pin getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pin }
     *     
     */
    public void setPin(Pin value) {
        this.pin = value;
    }

    /**
     * Gets the value of the encryptedPayment property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedPayment }
     *     
     */
    public EncryptedPayment getEncryptedPayment() {
        return encryptedPayment;
    }

    /**
     * Sets the value of the encryptedPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedPayment }
     *     
     */
    public void setEncryptedPayment(EncryptedPayment value) {
        this.encryptedPayment = value;
    }

    /**
     * Gets the value of the installment property.
     * 
     * @return
     *     possible object is
     *     {@link Installment }
     *     
     */
    public Installment getInstallment() {
        return installment;
    }

    /**
     * Sets the value of the installment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Installment }
     *     
     */
    public void setInstallment(Installment value) {
        this.installment = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link Card }
     *     
     */
    public Card getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link Card }
     *     
     */
    public void setCard(Card value) {
        this.card = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link Check }
     *     
     */
    public Check getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link Check }
     *     
     */
    public void setCheck(Check value) {
        this.check = value;
    }

    /**
     * Gets the value of the bml property.
     * 
     * @return
     *     possible object is
     *     {@link BML }
     *     
     */
    public BML getBml() {
        return bml;
    }

    /**
     * Sets the value of the bml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BML }
     *     
     */
    public void setBml(BML value) {
        this.bml = value;
    }

    /**
     * Gets the value of the gecc property.
     * 
     * @return
     *     possible object is
     *     {@link GECC }
     *     
     */
    public GECC getGecc() {
        return gecc;
    }

    /**
     * Sets the value of the gecc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GECC }
     *     
     */
    public void setGecc(GECC value) {
        this.gecc = value;
    }

    /**
     * Gets the value of the ucaf property.
     * 
     * @return
     *     possible object is
     *     {@link UCAF }
     *     
     */
    public UCAF getUcaf() {
        return ucaf;
    }

    /**
     * Sets the value of the ucaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCAF }
     *     
     */
    public void setUcaf(UCAF value) {
        this.ucaf = value;
    }

    /**
     * Gets the value of the fundTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link FundTransfer }
     *     
     */
    public FundTransfer getFundTransfer() {
        return fundTransfer;
    }

    /**
     * Sets the value of the fundTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundTransfer }
     *     
     */
    public void setFundTransfer(FundTransfer value) {
        this.fundTransfer = value;
    }

    /**
     * Gets the value of the bankInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankInfo }
     *     
     */
    public BankInfo getBankInfo() {
        return bankInfo;
    }

    /**
     * Sets the value of the bankInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInfo }
     *     
     */
    public void setBankInfo(BankInfo value) {
        this.bankInfo = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the recurringSubscriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringSubscriptionInfo }
     *     
     */
    public RecurringSubscriptionInfo getRecurringSubscriptionInfo() {
        return recurringSubscriptionInfo;
    }

    /**
     * Sets the value of the recurringSubscriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringSubscriptionInfo }
     *     
     */
    public void setRecurringSubscriptionInfo(RecurringSubscriptionInfo value) {
        this.recurringSubscriptionInfo = value;
    }

    /**
     * Gets the value of the tokenSource property.
     * 
     * @return
     *     possible object is
     *     {@link TokenSource }
     *     
     */
    public TokenSource getTokenSource() {
        return tokenSource;
    }

    /**
     * Sets the value of the tokenSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenSource }
     *     
     */
    public void setTokenSource(TokenSource value) {
        this.tokenSource = value;
    }

    /**
     * Gets the value of the decisionManager property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionManager }
     *     
     */
    public DecisionManager getDecisionManager() {
        return decisionManager;
    }

    /**
     * Sets the value of the decisionManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionManager }
     *     
     */
    public void setDecisionManager(DecisionManager value) {
        this.decisionManager = value;
    }

    /**
     * Gets the value of the otherTax property.
     * 
     * @return
     *     possible object is
     *     {@link OtherTax }
     *     
     */
    public OtherTax getOtherTax() {
        return otherTax;
    }

    /**
     * Sets the value of the otherTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherTax }
     *     
     */
    public void setOtherTax(OtherTax value) {
        this.otherTax = value;
    }

    /**
     * Gets the value of the paypal property.
     * 
     * @return
     *     possible object is
     *     {@link PayPal }
     *     
     */
    public PayPal getPaypal() {
        return paypal;
    }

    /**
     * Sets the value of the paypal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPal }
     *     
     */
    public void setPaypal(PayPal value) {
        this.paypal = value;
    }

    /**
     * Gets the value of the merchantDefinedData property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantDefinedData }
     *     
     */
    public MerchantDefinedData getMerchantDefinedData() {
        return merchantDefinedData;
    }

    /**
     * Sets the value of the merchantDefinedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantDefinedData }
     *     
     */
    public void setMerchantDefinedData(MerchantDefinedData value) {
        this.merchantDefinedData = value;
    }

    /**
     * Gets the value of the auxiliaryData property.
     * 
     * @return
     *     possible object is
     *     {@link AuxiliaryData }
     *     
     */
    public AuxiliaryData getAuxiliaryData() {
        return auxiliaryData;
    }

    /**
     * Sets the value of the auxiliaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuxiliaryData }
     *     
     */
    public void setAuxiliaryData(AuxiliaryData value) {
        this.auxiliaryData = value;
    }

    /**
     * Gets the value of the merchantSecureData property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantSecureData }
     *     
     */
    public MerchantSecureData getMerchantSecureData() {
        return merchantSecureData;
    }

    /**
     * Sets the value of the merchantSecureData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantSecureData }
     *     
     */
    public void setMerchantSecureData(MerchantSecureData value) {
        this.merchantSecureData = value;
    }

    /**
     * Gets the value of the jpo property.
     * 
     * @return
     *     possible object is
     *     {@link JPO }
     *     
     */
    public JPO getJpo() {
        return jpo;
    }

    /**
     * Sets the value of the jpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPO }
     *     
     */
    public void setJpo(JPO value) {
        this.jpo = value;
    }

    /**
     * Gets the value of the orderRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderRequestToken() {
        return orderRequestToken;
    }

    /**
     * Sets the value of the orderRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderRequestToken(String value) {
        this.orderRequestToken = value;
    }

    /**
     * Gets the value of the linkToRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkToRequest() {
        return linkToRequest;
    }

    /**
     * Sets the value of the linkToRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkToRequest(String value) {
        this.linkToRequest = value;
    }

    /**
     * Gets the value of the serviceFee property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFee }
     *     
     */
    public ServiceFee getServiceFee() {
        return serviceFee;
    }

    /**
     * Sets the value of the serviceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFee }
     *     
     */
    public void setServiceFee(ServiceFee value) {
        this.serviceFee = value;
    }

    /**
     * Gets the value of the giftCard property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCard }
     *     
     */
    public GiftCard getGiftCard() {
        return giftCard;
    }

    /**
     * Sets the value of the giftCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCard }
     *     
     */
    public void setGiftCard(GiftCard value) {
        this.giftCard = value;
    }

    /**
     * Gets the value of the ccAuthService property.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthService }
     *     
     */
    public CCAuthService getCcAuthService() {
        return ccAuthService;
    }

    /**
     * Sets the value of the ccAuthService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthService }
     *     
     */
    public void setCcAuthService(CCAuthService value) {
        this.ccAuthService = value;
    }

    /**
     * Gets the value of the octService property.
     * 
     * @return
     *     possible object is
     *     {@link OCTService }
     *     
     */
    public OCTService getOctService() {
        return octService;
    }

    /**
     * Sets the value of the octService property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCTService }
     *     
     */
    public void setOctService(OCTService value) {
        this.octService = value;
    }

    /**
     * Gets the value of the ecAVSService property.
     * 
     * @return
     *     possible object is
     *     {@link ECAVSService }
     *     
     */
    public ECAVSService getEcAVSService() {
        return ecAVSService;
    }

    /**
     * Sets the value of the ecAVSService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECAVSService }
     *     
     */
    public void setEcAVSService(ECAVSService value) {
        this.ecAVSService = value;
    }

    /**
     * Gets the value of the giftCardActivationService property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardActivationService }
     *     
     */
    public GiftCardActivationService getGiftCardActivationService() {
        return giftCardActivationService;
    }

    /**
     * Sets the value of the giftCardActivationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardActivationService }
     *     
     */
    public void setGiftCardActivationService(GiftCardActivationService value) {
        this.giftCardActivationService = value;
    }

    /**
     * Gets the value of the giftCardBalanceInquiryService property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardBalanceInquiryService }
     *     
     */
    public GiftCardBalanceInquiryService getGiftCardBalanceInquiryService() {
        return giftCardBalanceInquiryService;
    }

    /**
     * Sets the value of the giftCardBalanceInquiryService property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardBalanceInquiryService }
     *     
     */
    public void setGiftCardBalanceInquiryService(GiftCardBalanceInquiryService value) {
        this.giftCardBalanceInquiryService = value;
    }

    /**
     * Gets the value of the giftCardRedemptionService property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardRedemptionService }
     *     
     */
    public GiftCardRedemptionService getGiftCardRedemptionService() {
        return giftCardRedemptionService;
    }

    /**
     * Sets the value of the giftCardRedemptionService property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardRedemptionService }
     *     
     */
    public void setGiftCardRedemptionService(GiftCardRedemptionService value) {
        this.giftCardRedemptionService = value;
    }

    /**
     * Gets the value of the giftCardVoidService property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardVoidService }
     *     
     */
    public GiftCardVoidService getGiftCardVoidService() {
        return giftCardVoidService;
    }

    /**
     * Sets the value of the giftCardVoidService property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardVoidService }
     *     
     */
    public void setGiftCardVoidService(GiftCardVoidService value) {
        this.giftCardVoidService = value;
    }

    /**
     * Gets the value of the giftCardReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardReversalService }
     *     
     */
    public GiftCardReversalService getGiftCardReversalService() {
        return giftCardReversalService;
    }

    /**
     * Sets the value of the giftCardReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardReversalService }
     *     
     */
    public void setGiftCardReversalService(GiftCardReversalService value) {
        this.giftCardReversalService = value;
    }

    /**
     * Gets the value of the giftCardReloadService property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardReloadService }
     *     
     */
    public GiftCardReloadService getGiftCardReloadService() {
        return giftCardReloadService;
    }

    /**
     * Sets the value of the giftCardReloadService property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardReloadService }
     *     
     */
    public void setGiftCardReloadService(GiftCardReloadService value) {
        this.giftCardReloadService = value;
    }

    /**
     * Gets the value of the giftCardRefundService property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardRefundService }
     *     
     */
    public GiftCardRefundService getGiftCardRefundService() {
        return giftCardRefundService;
    }

    /**
     * Sets the value of the giftCardRefundService property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardRefundService }
     *     
     */
    public void setGiftCardRefundService(GiftCardRefundService value) {
        this.giftCardRefundService = value;
    }

    /**
     * Gets the value of the verificationService property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationService }
     *     
     */
    public VerificationService getVerificationService() {
        return verificationService;
    }

    /**
     * Sets the value of the verificationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationService }
     *     
     */
    public void setVerificationService(VerificationService value) {
        this.verificationService = value;
    }

    /**
     * Gets the value of the ccSaleService property.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleService }
     *     
     */
    public CCSaleService getCcSaleService() {
        return ccSaleService;
    }

    /**
     * Sets the value of the ccSaleService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleService }
     *     
     */
    public void setCcSaleService(CCSaleService value) {
        this.ccSaleService = value;
    }

    /**
     * Gets the value of the ccSaleCreditService property.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleCreditService }
     *     
     */
    public CCSaleCreditService getCcSaleCreditService() {
        return ccSaleCreditService;
    }

    /**
     * Sets the value of the ccSaleCreditService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleCreditService }
     *     
     */
    public void setCcSaleCreditService(CCSaleCreditService value) {
        this.ccSaleCreditService = value;
    }

    /**
     * Gets the value of the ccSaleReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleReversalService }
     *     
     */
    public CCSaleReversalService getCcSaleReversalService() {
        return ccSaleReversalService;
    }

    /**
     * Sets the value of the ccSaleReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleReversalService }
     *     
     */
    public void setCcSaleReversalService(CCSaleReversalService value) {
        this.ccSaleReversalService = value;
    }

    /**
     * Gets the value of the ccIncrementalAuthService property.
     * 
     * @return
     *     possible object is
     *     {@link CCIncrementalAuthService }
     *     
     */
    public CCIncrementalAuthService getCcIncrementalAuthService() {
        return ccIncrementalAuthService;
    }

    /**
     * Sets the value of the ccIncrementalAuthService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCIncrementalAuthService }
     *     
     */
    public void setCcIncrementalAuthService(CCIncrementalAuthService value) {
        this.ccIncrementalAuthService = value;
    }

    /**
     * Gets the value of the ccCaptureService property.
     * 
     * @return
     *     possible object is
     *     {@link CCCaptureService }
     *     
     */
    public CCCaptureService getCcCaptureService() {
        return ccCaptureService;
    }

    /**
     * Sets the value of the ccCaptureService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCaptureService }
     *     
     */
    public void setCcCaptureService(CCCaptureService value) {
        this.ccCaptureService = value;
    }

    /**
     * Gets the value of the ccCreditService property.
     * 
     * @return
     *     possible object is
     *     {@link CCCreditService }
     *     
     */
    public CCCreditService getCcCreditService() {
        return ccCreditService;
    }

    /**
     * Sets the value of the ccCreditService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCreditService }
     *     
     */
    public void setCcCreditService(CCCreditService value) {
        this.ccCreditService = value;
    }

    /**
     * Gets the value of the ccAuthReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthReversalService }
     *     
     */
    public CCAuthReversalService getCcAuthReversalService() {
        return ccAuthReversalService;
    }

    /**
     * Sets the value of the ccAuthReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthReversalService }
     *     
     */
    public void setCcAuthReversalService(CCAuthReversalService value) {
        this.ccAuthReversalService = value;
    }

    /**
     * Gets the value of the ccAutoAuthReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link CCAutoAuthReversalService }
     *     
     */
    public CCAutoAuthReversalService getCcAutoAuthReversalService() {
        return ccAutoAuthReversalService;
    }

    /**
     * Sets the value of the ccAutoAuthReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAutoAuthReversalService }
     *     
     */
    public void setCcAutoAuthReversalService(CCAutoAuthReversalService value) {
        this.ccAutoAuthReversalService = value;
    }

    /**
     * Gets the value of the ccDCCService property.
     * 
     * @return
     *     possible object is
     *     {@link CCDCCService }
     *     
     */
    public CCDCCService getCcDCCService() {
        return ccDCCService;
    }

    /**
     * Sets the value of the ccDCCService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDCCService }
     *     
     */
    public void setCcDCCService(CCDCCService value) {
        this.ccDCCService = value;
    }

    /**
     * Gets the value of the serviceFeeCalculateService property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeCalculateService }
     *     
     */
    public ServiceFeeCalculateService getServiceFeeCalculateService() {
        return serviceFeeCalculateService;
    }

    /**
     * Sets the value of the serviceFeeCalculateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeCalculateService }
     *     
     */
    public void setServiceFeeCalculateService(ServiceFeeCalculateService value) {
        this.serviceFeeCalculateService = value;
    }

    /**
     * Gets the value of the ecDebitService property.
     * 
     * @return
     *     possible object is
     *     {@link ECDebitService }
     *     
     */
    public ECDebitService getEcDebitService() {
        return ecDebitService;
    }

    /**
     * Sets the value of the ecDebitService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECDebitService }
     *     
     */
    public void setEcDebitService(ECDebitService value) {
        this.ecDebitService = value;
    }

    /**
     * Gets the value of the ecCreditService property.
     * 
     * @return
     *     possible object is
     *     {@link ECCreditService }
     *     
     */
    public ECCreditService getEcCreditService() {
        return ecCreditService;
    }

    /**
     * Sets the value of the ecCreditService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECCreditService }
     *     
     */
    public void setEcCreditService(ECCreditService value) {
        this.ecCreditService = value;
    }

    /**
     * Gets the value of the ecAuthenticateService property.
     * 
     * @return
     *     possible object is
     *     {@link ECAuthenticateService }
     *     
     */
    public ECAuthenticateService getEcAuthenticateService() {
        return ecAuthenticateService;
    }

    /**
     * Sets the value of the ecAuthenticateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECAuthenticateService }
     *     
     */
    public void setEcAuthenticateService(ECAuthenticateService value) {
        this.ecAuthenticateService = value;
    }

    /**
     * Gets the value of the payerAuthSetupService property.
     * 
     * @return
     *     possible object is
     *     {@link PayerAuthSetupService }
     *     
     */
    public PayerAuthSetupService getPayerAuthSetupService() {
        return payerAuthSetupService;
    }

    /**
     * Sets the value of the payerAuthSetupService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerAuthSetupService }
     *     
     */
    public void setPayerAuthSetupService(PayerAuthSetupService value) {
        this.payerAuthSetupService = value;
    }

    /**
     * Gets the value of the payerAuthEnrollService property.
     * 
     * @return
     *     possible object is
     *     {@link PayerAuthEnrollService }
     *     
     */
    public PayerAuthEnrollService getPayerAuthEnrollService() {
        return payerAuthEnrollService;
    }

    /**
     * Sets the value of the payerAuthEnrollService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerAuthEnrollService }
     *     
     */
    public void setPayerAuthEnrollService(PayerAuthEnrollService value) {
        this.payerAuthEnrollService = value;
    }

    /**
     * Gets the value of the payerAuthValidateService property.
     * 
     * @return
     *     possible object is
     *     {@link PayerAuthValidateService }
     *     
     */
    public PayerAuthValidateService getPayerAuthValidateService() {
        return payerAuthValidateService;
    }

    /**
     * Sets the value of the payerAuthValidateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerAuthValidateService }
     *     
     */
    public void setPayerAuthValidateService(PayerAuthValidateService value) {
        this.payerAuthValidateService = value;
    }

    /**
     * Gets the value of the taxService property.
     * 
     * @return
     *     possible object is
     *     {@link TaxService }
     *     
     */
    public TaxService getTaxService() {
        return taxService;
    }

    /**
     * Sets the value of the taxService property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxService }
     *     
     */
    public void setTaxService(TaxService value) {
        this.taxService = value;
    }

    /**
     * Gets the value of the dmeService property.
     * 
     * @return
     *     possible object is
     *     {@link DMEService }
     *     
     */
    public DMEService getDmeService() {
        return dmeService;
    }

    /**
     * Sets the value of the dmeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DMEService }
     *     
     */
    public void setDmeService(DMEService value) {
        this.dmeService = value;
    }

    /**
     * Gets the value of the afsService property.
     * 
     * @return
     *     possible object is
     *     {@link AFSService }
     *     
     */
    public AFSService getAfsService() {
        return afsService;
    }

    /**
     * Sets the value of the afsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFSService }
     *     
     */
    public void setAfsService(AFSService value) {
        this.afsService = value;
    }

    /**
     * Gets the value of the davService property.
     * 
     * @return
     *     possible object is
     *     {@link DAVService }
     *     
     */
    public DAVService getDavService() {
        return davService;
    }

    /**
     * Sets the value of the davService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DAVService }
     *     
     */
    public void setDavService(DAVService value) {
        this.davService = value;
    }

    /**
     * Gets the value of the exportService property.
     * 
     * @return
     *     possible object is
     *     {@link ExportService }
     *     
     */
    public ExportService getExportService() {
        return exportService;
    }

    /**
     * Sets the value of the exportService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportService }
     *     
     */
    public void setExportService(ExportService value) {
        this.exportService = value;
    }

    /**
     * Gets the value of the fxRatesService property.
     * 
     * @return
     *     possible object is
     *     {@link FXRatesService }
     *     
     */
    public FXRatesService getFxRatesService() {
        return fxRatesService;
    }

    /**
     * Sets the value of the fxRatesService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FXRatesService }
     *     
     */
    public void setFxRatesService(FXRatesService value) {
        this.fxRatesService = value;
    }

    /**
     * Gets the value of the bankTransferService property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferService }
     *     
     */
    public BankTransferService getBankTransferService() {
        return bankTransferService;
    }

    /**
     * Sets the value of the bankTransferService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferService }
     *     
     */
    public void setBankTransferService(BankTransferService value) {
        this.bankTransferService = value;
    }

    /**
     * Gets the value of the bankTransferRefundService property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferRefundService }
     *     
     */
    public BankTransferRefundService getBankTransferRefundService() {
        return bankTransferRefundService;
    }

    /**
     * Sets the value of the bankTransferRefundService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferRefundService }
     *     
     */
    public void setBankTransferRefundService(BankTransferRefundService value) {
        this.bankTransferRefundService = value;
    }

    /**
     * Gets the value of the bankTransferRealTimeService property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferRealTimeService }
     *     
     */
    public BankTransferRealTimeService getBankTransferRealTimeService() {
        return bankTransferRealTimeService;
    }

    /**
     * Sets the value of the bankTransferRealTimeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferRealTimeService }
     *     
     */
    public void setBankTransferRealTimeService(BankTransferRealTimeService value) {
        this.bankTransferRealTimeService = value;
    }

    /**
     * Gets the value of the directDebitMandateService property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandateService }
     *     
     */
    public DirectDebitMandateService getDirectDebitMandateService() {
        return directDebitMandateService;
    }

    /**
     * Sets the value of the directDebitMandateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandateService }
     *     
     */
    public void setDirectDebitMandateService(DirectDebitMandateService value) {
        this.directDebitMandateService = value;
    }

    /**
     * Gets the value of the directDebitService property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitService }
     *     
     */
    public DirectDebitService getDirectDebitService() {
        return directDebitService;
    }

    /**
     * Sets the value of the directDebitService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitService }
     *     
     */
    public void setDirectDebitService(DirectDebitService value) {
        this.directDebitService = value;
    }

    /**
     * Gets the value of the directDebitRefundService property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitRefundService }
     *     
     */
    public DirectDebitRefundService getDirectDebitRefundService() {
        return directDebitRefundService;
    }

    /**
     * Sets the value of the directDebitRefundService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitRefundService }
     *     
     */
    public void setDirectDebitRefundService(DirectDebitRefundService value) {
        this.directDebitRefundService = value;
    }

    /**
     * Gets the value of the directDebitValidateService property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitValidateService }
     *     
     */
    public DirectDebitValidateService getDirectDebitValidateService() {
        return directDebitValidateService;
    }

    /**
     * Sets the value of the directDebitValidateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitValidateService }
     *     
     */
    public void setDirectDebitValidateService(DirectDebitValidateService value) {
        this.directDebitValidateService = value;
    }

    /**
     * Gets the value of the deviceFingerprintData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceFingerprintData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeviceFingerprintData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceFingerprintData }
     * </p>
     * 
     * 
     * @return
     *     The value of the deviceFingerprintData property.
     */
    public List<DeviceFingerprintData> getDeviceFingerprintData() {
        if (deviceFingerprintData == null) {
            deviceFingerprintData = new ArrayList<>();
        }
        return this.deviceFingerprintData;
    }

    /**
     * Gets the value of the paySubscriptionCreateService property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionCreateService }
     *     
     */
    public PaySubscriptionCreateService getPaySubscriptionCreateService() {
        return paySubscriptionCreateService;
    }

    /**
     * Sets the value of the paySubscriptionCreateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionCreateService }
     *     
     */
    public void setPaySubscriptionCreateService(PaySubscriptionCreateService value) {
        this.paySubscriptionCreateService = value;
    }

    /**
     * Gets the value of the paySubscriptionUpdateService property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionUpdateService }
     *     
     */
    public PaySubscriptionUpdateService getPaySubscriptionUpdateService() {
        return paySubscriptionUpdateService;
    }

    /**
     * Sets the value of the paySubscriptionUpdateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionUpdateService }
     *     
     */
    public void setPaySubscriptionUpdateService(PaySubscriptionUpdateService value) {
        this.paySubscriptionUpdateService = value;
    }

    /**
     * Gets the value of the paySubscriptionEventUpdateService property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionEventUpdateService }
     *     
     */
    public PaySubscriptionEventUpdateService getPaySubscriptionEventUpdateService() {
        return paySubscriptionEventUpdateService;
    }

    /**
     * Sets the value of the paySubscriptionEventUpdateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionEventUpdateService }
     *     
     */
    public void setPaySubscriptionEventUpdateService(PaySubscriptionEventUpdateService value) {
        this.paySubscriptionEventUpdateService = value;
    }

    /**
     * Gets the value of the paySubscriptionRetrieveService property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionRetrieveService }
     *     
     */
    public PaySubscriptionRetrieveService getPaySubscriptionRetrieveService() {
        return paySubscriptionRetrieveService;
    }

    /**
     * Sets the value of the paySubscriptionRetrieveService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionRetrieveService }
     *     
     */
    public void setPaySubscriptionRetrieveService(PaySubscriptionRetrieveService value) {
        this.paySubscriptionRetrieveService = value;
    }

    /**
     * Gets the value of the paySubscriptionDeleteService property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionDeleteService }
     *     
     */
    public PaySubscriptionDeleteService getPaySubscriptionDeleteService() {
        return paySubscriptionDeleteService;
    }

    /**
     * Sets the value of the paySubscriptionDeleteService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionDeleteService }
     *     
     */
    public void setPaySubscriptionDeleteService(PaySubscriptionDeleteService value) {
        this.paySubscriptionDeleteService = value;
    }

    /**
     * Gets the value of the payPalPaymentService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPaymentService }
     *     
     */
    public PayPalPaymentService getPayPalPaymentService() {
        return payPalPaymentService;
    }

    /**
     * Sets the value of the payPalPaymentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPaymentService }
     *     
     */
    public void setPayPalPaymentService(PayPalPaymentService value) {
        this.payPalPaymentService = value;
    }

    /**
     * Gets the value of the payPalCreditService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalCreditService }
     *     
     */
    public PayPalCreditService getPayPalCreditService() {
        return payPalCreditService;
    }

    /**
     * Sets the value of the payPalCreditService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalCreditService }
     *     
     */
    public void setPayPalCreditService(PayPalCreditService value) {
        this.payPalCreditService = value;
    }

    /**
     * Gets the value of the voidService property.
     * 
     * @return
     *     possible object is
     *     {@link VoidService }
     *     
     */
    public VoidService getVoidService() {
        return voidService;
    }

    /**
     * Sets the value of the voidService property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidService }
     *     
     */
    public void setVoidService(VoidService value) {
        this.voidService = value;
    }

    /**
     * Gets the value of the businessRules property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessRules }
     *     
     */
    public BusinessRules getBusinessRules() {
        return businessRules;
    }

    /**
     * Sets the value of the businessRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessRules }
     *     
     */
    public void setBusinessRules(BusinessRules value) {
        this.businessRules = value;
    }

    /**
     * Gets the value of the pinlessDebitService property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitService }
     *     
     */
    public PinlessDebitService getPinlessDebitService() {
        return pinlessDebitService;
    }

    /**
     * Sets the value of the pinlessDebitService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitService }
     *     
     */
    public void setPinlessDebitService(PinlessDebitService value) {
        this.pinlessDebitService = value;
    }

    /**
     * Gets the value of the pinlessDebitValidateService property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitValidateService }
     *     
     */
    public PinlessDebitValidateService getPinlessDebitValidateService() {
        return pinlessDebitValidateService;
    }

    /**
     * Sets the value of the pinlessDebitValidateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitValidateService }
     *     
     */
    public void setPinlessDebitValidateService(PinlessDebitValidateService value) {
        this.pinlessDebitValidateService = value;
    }

    /**
     * Gets the value of the pinlessDebitReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitReversalService }
     *     
     */
    public PinlessDebitReversalService getPinlessDebitReversalService() {
        return pinlessDebitReversalService;
    }

    /**
     * Sets the value of the pinlessDebitReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitReversalService }
     *     
     */
    public void setPinlessDebitReversalService(PinlessDebitReversalService value) {
        this.pinlessDebitReversalService = value;
    }

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link Batch }
     *     
     */
    public Batch getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Batch }
     *     
     */
    public void setBatch(Batch value) {
        this.batch = value;
    }

    /**
     * Gets the value of the airlineData property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineData }
     *     
     */
    public AirlineData getAirlineData() {
        return airlineData;
    }

    /**
     * Sets the value of the airlineData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineData }
     *     
     */
    public void setAirlineData(AirlineData value) {
        this.airlineData = value;
    }

    /**
     * Gets the value of the ancillaryData property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryData }
     *     
     */
    public AncillaryData getAncillaryData() {
        return ancillaryData;
    }

    /**
     * Sets the value of the ancillaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryData }
     *     
     */
    public void setAncillaryData(AncillaryData value) {
        this.ancillaryData = value;
    }

    /**
     * Gets the value of the lodgingData property.
     * 
     * @return
     *     possible object is
     *     {@link LodgingData }
     *     
     */
    public LodgingData getLodgingData() {
        return lodgingData;
    }

    /**
     * Sets the value of the lodgingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgingData }
     *     
     */
    public void setLodgingData(LodgingData value) {
        this.lodgingData = value;
    }

    /**
     * Gets the value of the payPalButtonCreateService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalButtonCreateService }
     *     
     */
    public PayPalButtonCreateService getPayPalButtonCreateService() {
        return payPalButtonCreateService;
    }

    /**
     * Sets the value of the payPalButtonCreateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalButtonCreateService }
     *     
     */
    public void setPayPalButtonCreateService(PayPalButtonCreateService value) {
        this.payPalButtonCreateService = value;
    }

    /**
     * Gets the value of the payPalPreapprovedPaymentService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPreapprovedPaymentService }
     *     
     */
    public PayPalPreapprovedPaymentService getPayPalPreapprovedPaymentService() {
        return payPalPreapprovedPaymentService;
    }

    /**
     * Sets the value of the payPalPreapprovedPaymentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPreapprovedPaymentService }
     *     
     */
    public void setPayPalPreapprovedPaymentService(PayPalPreapprovedPaymentService value) {
        this.payPalPreapprovedPaymentService = value;
    }

    /**
     * Gets the value of the payPalPreapprovedUpdateService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPreapprovedUpdateService }
     *     
     */
    public PayPalPreapprovedUpdateService getPayPalPreapprovedUpdateService() {
        return payPalPreapprovedUpdateService;
    }

    /**
     * Sets the value of the payPalPreapprovedUpdateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPreapprovedUpdateService }
     *     
     */
    public void setPayPalPreapprovedUpdateService(PayPalPreapprovedUpdateService value) {
        this.payPalPreapprovedUpdateService = value;
    }

    /**
     * Gets the value of the riskUpdateService property.
     * 
     * @return
     *     possible object is
     *     {@link RiskUpdateService }
     *     
     */
    public RiskUpdateService getRiskUpdateService() {
        return riskUpdateService;
    }

    /**
     * Sets the value of the riskUpdateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskUpdateService }
     *     
     */
    public void setRiskUpdateService(RiskUpdateService value) {
        this.riskUpdateService = value;
    }

    /**
     * Gets the value of the fraudUpdateService property.
     * 
     * @return
     *     possible object is
     *     {@link FraudUpdateService }
     *     
     */
    public FraudUpdateService getFraudUpdateService() {
        return fraudUpdateService;
    }

    /**
     * Sets the value of the fraudUpdateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudUpdateService }
     *     
     */
    public void setFraudUpdateService(FraudUpdateService value) {
        this.fraudUpdateService = value;
    }

    /**
     * Gets the value of the caseManagementActionService property.
     * 
     * @return
     *     possible object is
     *     {@link CaseManagementActionService }
     *     
     */
    public CaseManagementActionService getCaseManagementActionService() {
        return caseManagementActionService;
    }

    /**
     * Sets the value of the caseManagementActionService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseManagementActionService }
     *     
     */
    public void setCaseManagementActionService(CaseManagementActionService value) {
        this.caseManagementActionService = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reserved property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReserved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestReserved }
     * </p>
     * 
     * 
     * @return
     *     The value of the reserved property.
     */
    public List<RequestReserved> getReserved() {
        if (reserved == null) {
            reserved = new ArrayList<>();
        }
        return this.reserved;
    }

    /**
     * Gets the value of the deviceFingerprintID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintID() {
        return deviceFingerprintID;
    }

    /**
     * Sets the value of the deviceFingerprintID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintID(String value) {
        this.deviceFingerprintID = value;
    }

    /**
     * Gets the value of the deviceFingerprintRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintRaw() {
        return deviceFingerprintRaw;
    }

    /**
     * Sets the value of the deviceFingerprintRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintRaw(String value) {
        this.deviceFingerprintRaw = value;
    }

    /**
     * Gets the value of the deviceFingerprintHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintHash() {
        return deviceFingerprintHash;
    }

    /**
     * Sets the value of the deviceFingerprintHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintHash(String value) {
        this.deviceFingerprintHash = value;
    }

    /**
     * Gets the value of the payPalRefundService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalRefundService }
     *     
     */
    public PayPalRefundService getPayPalRefundService() {
        return payPalRefundService;
    }

    /**
     * Sets the value of the payPalRefundService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalRefundService }
     *     
     */
    public void setPayPalRefundService(PayPalRefundService value) {
        this.payPalRefundService = value;
    }

    /**
     * Gets the value of the payPalAuthReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAuthReversalService }
     *     
     */
    public PayPalAuthReversalService getPayPalAuthReversalService() {
        return payPalAuthReversalService;
    }

    /**
     * Sets the value of the payPalAuthReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAuthReversalService }
     *     
     */
    public void setPayPalAuthReversalService(PayPalAuthReversalService value) {
        this.payPalAuthReversalService = value;
    }

    /**
     * Gets the value of the payPalDoCaptureService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalDoCaptureService }
     *     
     */
    public PayPalDoCaptureService getPayPalDoCaptureService() {
        return payPalDoCaptureService;
    }

    /**
     * Sets the value of the payPalDoCaptureService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalDoCaptureService }
     *     
     */
    public void setPayPalDoCaptureService(PayPalDoCaptureService value) {
        this.payPalDoCaptureService = value;
    }

    /**
     * Gets the value of the payPalEcDoPaymentService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcDoPaymentService }
     *     
     */
    public PayPalEcDoPaymentService getPayPalEcDoPaymentService() {
        return payPalEcDoPaymentService;
    }

    /**
     * Sets the value of the payPalEcDoPaymentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcDoPaymentService }
     *     
     */
    public void setPayPalEcDoPaymentService(PayPalEcDoPaymentService value) {
        this.payPalEcDoPaymentService = value;
    }

    /**
     * Gets the value of the payPalEcGetDetailsService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcGetDetailsService }
     *     
     */
    public PayPalEcGetDetailsService getPayPalEcGetDetailsService() {
        return payPalEcGetDetailsService;
    }

    /**
     * Sets the value of the payPalEcGetDetailsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcGetDetailsService }
     *     
     */
    public void setPayPalEcGetDetailsService(PayPalEcGetDetailsService value) {
        this.payPalEcGetDetailsService = value;
    }

    /**
     * Gets the value of the payPalEcSetService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcSetService }
     *     
     */
    public PayPalEcSetService getPayPalEcSetService() {
        return payPalEcSetService;
    }

    /**
     * Sets the value of the payPalEcSetService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcSetService }
     *     
     */
    public void setPayPalEcSetService(PayPalEcSetService value) {
        this.payPalEcSetService = value;
    }

    /**
     * Gets the value of the payPalEcOrderSetupService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcOrderSetupService }
     *     
     */
    public PayPalEcOrderSetupService getPayPalEcOrderSetupService() {
        return payPalEcOrderSetupService;
    }

    /**
     * Sets the value of the payPalEcOrderSetupService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcOrderSetupService }
     *     
     */
    public void setPayPalEcOrderSetupService(PayPalEcOrderSetupService value) {
        this.payPalEcOrderSetupService = value;
    }

    /**
     * Gets the value of the payPalAuthorizationService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAuthorizationService }
     *     
     */
    public PayPalAuthorizationService getPayPalAuthorizationService() {
        return payPalAuthorizationService;
    }

    /**
     * Sets the value of the payPalAuthorizationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAuthorizationService }
     *     
     */
    public void setPayPalAuthorizationService(PayPalAuthorizationService value) {
        this.payPalAuthorizationService = value;
    }

    /**
     * Gets the value of the payPalUpdateAgreementService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalUpdateAgreementService }
     *     
     */
    public PayPalUpdateAgreementService getPayPalUpdateAgreementService() {
        return payPalUpdateAgreementService;
    }

    /**
     * Sets the value of the payPalUpdateAgreementService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalUpdateAgreementService }
     *     
     */
    public void setPayPalUpdateAgreementService(PayPalUpdateAgreementService value) {
        this.payPalUpdateAgreementService = value;
    }

    /**
     * Gets the value of the payPalCreateAgreementService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalCreateAgreementService }
     *     
     */
    public PayPalCreateAgreementService getPayPalCreateAgreementService() {
        return payPalCreateAgreementService;
    }

    /**
     * Sets the value of the payPalCreateAgreementService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalCreateAgreementService }
     *     
     */
    public void setPayPalCreateAgreementService(PayPalCreateAgreementService value) {
        this.payPalCreateAgreementService = value;
    }

    /**
     * Gets the value of the payPalDoRefTransactionService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalDoRefTransactionService }
     *     
     */
    public PayPalDoRefTransactionService getPayPalDoRefTransactionService() {
        return payPalDoRefTransactionService;
    }

    /**
     * Sets the value of the payPalDoRefTransactionService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalDoRefTransactionService }
     *     
     */
    public void setPayPalDoRefTransactionService(PayPalDoRefTransactionService value) {
        this.payPalDoRefTransactionService = value;
    }

    /**
     * Gets the value of the chinaPaymentService property.
     * 
     * @return
     *     possible object is
     *     {@link ChinaPaymentService }
     *     
     */
    public ChinaPaymentService getChinaPaymentService() {
        return chinaPaymentService;
    }

    /**
     * Sets the value of the chinaPaymentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChinaPaymentService }
     *     
     */
    public void setChinaPaymentService(ChinaPaymentService value) {
        this.chinaPaymentService = value;
    }

    /**
     * Gets the value of the chinaRefundService property.
     * 
     * @return
     *     possible object is
     *     {@link ChinaRefundService }
     *     
     */
    public ChinaRefundService getChinaRefundService() {
        return chinaRefundService;
    }

    /**
     * Sets the value of the chinaRefundService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChinaRefundService }
     *     
     */
    public void setChinaRefundService(ChinaRefundService value) {
        this.chinaRefundService = value;
    }

    /**
     * Gets the value of the boletoPaymentService property.
     * 
     * @return
     *     possible object is
     *     {@link BoletoPaymentService }
     *     
     */
    public BoletoPaymentService getBoletoPaymentService() {
        return boletoPaymentService;
    }

    /**
     * Sets the value of the boletoPaymentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletoPaymentService }
     *     
     */
    public void setBoletoPaymentService(BoletoPaymentService value) {
        this.boletoPaymentService = value;
    }

    /**
     * Gets the value of the apPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApPaymentType() {
        return apPaymentType;
    }

    /**
     * Sets the value of the apPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApPaymentType(String value) {
        this.apPaymentType = value;
    }

    /**
     * Gets the value of the apInitiateService property.
     * 
     * @return
     *     possible object is
     *     {@link APInitiateService }
     *     
     */
    public APInitiateService getApInitiateService() {
        return apInitiateService;
    }

    /**
     * Sets the value of the apInitiateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APInitiateService }
     *     
     */
    public void setApInitiateService(APInitiateService value) {
        this.apInitiateService = value;
    }

    /**
     * Gets the value of the apCheckStatusService property.
     * 
     * @return
     *     possible object is
     *     {@link APCheckStatusService }
     *     
     */
    public APCheckStatusService getApCheckStatusService() {
        return apCheckStatusService;
    }

    /**
     * Sets the value of the apCheckStatusService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCheckStatusService }
     *     
     */
    public void setApCheckStatusService(APCheckStatusService value) {
        this.apCheckStatusService = value;
    }

    /**
     * Gets the value of the ignoreCardExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreCardExpiration() {
        return ignoreCardExpiration;
    }

    /**
     * Sets the value of the ignoreCardExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreCardExpiration(String value) {
        this.ignoreCardExpiration = value;
    }

    /**
     * Gets the value of the reportGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportGroup() {
        return reportGroup;
    }

    /**
     * Sets the value of the reportGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportGroup(String value) {
        this.reportGroup = value;
    }

    /**
     * Gets the value of the processorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorID() {
        return processorID;
    }

    /**
     * Sets the value of the processorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorID(String value) {
        this.processorID = value;
    }

    /**
     * Gets the value of the thirdPartyCertificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyCertificationNumber() {
        return thirdPartyCertificationNumber;
    }

    /**
     * Sets the value of the thirdPartyCertificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyCertificationNumber(String value) {
        this.thirdPartyCertificationNumber = value;
    }

    /**
     * Gets the value of the transactionLocalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionLocalDateTime() {
        return transactionLocalDateTime;
    }

    /**
     * Sets the value of the transactionLocalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionLocalDateTime(String value) {
        this.transactionLocalDateTime = value;
    }

    /**
     * Gets the value of the solutionProviderTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionProviderTransactionID() {
        return solutionProviderTransactionID;
    }

    /**
     * Sets the value of the solutionProviderTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionProviderTransactionID(String value) {
        this.solutionProviderTransactionID = value;
    }

    /**
     * Gets the value of the surchargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Sets the value of the surchargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeAmount(String value) {
        this.surchargeAmount = value;
    }

    /**
     * Gets the value of the surchargeSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeSign() {
        return surchargeSign;
    }

    /**
     * Sets the value of the surchargeSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeSign(String value) {
        this.surchargeSign = value;
    }

    /**
     * Gets the value of the pinDataEncryptedPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinDataEncryptedPIN() {
        return pinDataEncryptedPIN;
    }

    /**
     * Sets the value of the pinDataEncryptedPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinDataEncryptedPIN(String value) {
        this.pinDataEncryptedPIN = value;
    }

    /**
     * Gets the value of the pinDataKeySerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinDataKeySerialNumber() {
        return pinDataKeySerialNumber;
    }

    /**
     * Sets the value of the pinDataKeySerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinDataKeySerialNumber(String value) {
        this.pinDataKeySerialNumber = value;
    }

    /**
     * Gets the value of the pinDataPinBlockEncodingFormat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPinDataPinBlockEncodingFormat() {
        return pinDataPinBlockEncodingFormat;
    }

    /**
     * Sets the value of the pinDataPinBlockEncodingFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPinDataPinBlockEncodingFormat(BigInteger value) {
        this.pinDataPinBlockEncodingFormat = value;
    }

    /**
     * Gets the value of the cashbackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashbackAmount() {
        return cashbackAmount;
    }

    /**
     * Sets the value of the cashbackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashbackAmount(String value) {
        this.cashbackAmount = value;
    }

    /**
     * Gets the value of the pinDebitPurchaseService property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitPurchaseService }
     *     
     */
    public PinDebitPurchaseService getPinDebitPurchaseService() {
        return pinDebitPurchaseService;
    }

    /**
     * Sets the value of the pinDebitPurchaseService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitPurchaseService }
     *     
     */
    public void setPinDebitPurchaseService(PinDebitPurchaseService value) {
        this.pinDebitPurchaseService = value;
    }

    /**
     * Gets the value of the pinDebitCreditService property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitCreditService }
     *     
     */
    public PinDebitCreditService getPinDebitCreditService() {
        return pinDebitCreditService;
    }

    /**
     * Sets the value of the pinDebitCreditService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitCreditService }
     *     
     */
    public void setPinDebitCreditService(PinDebitCreditService value) {
        this.pinDebitCreditService = value;
    }

    /**
     * Gets the value of the pinDebitReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitReversalService }
     *     
     */
    public PinDebitReversalService getPinDebitReversalService() {
        return pinDebitReversalService;
    }

    /**
     * Sets the value of the pinDebitReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitReversalService }
     *     
     */
    public void setPinDebitReversalService(PinDebitReversalService value) {
        this.pinDebitReversalService = value;
    }

    /**
     * Gets the value of the ap property.
     * 
     * @return
     *     possible object is
     *     {@link AP }
     *     
     */
    public AP getAp() {
        return ap;
    }

    /**
     * Sets the value of the ap property.
     * 
     * @param value
     *     allowed object is
     *     {@link AP }
     *     
     */
    public void setAp(AP value) {
        this.ap = value;
    }

    /**
     * Gets the value of the apAuthService property.
     * 
     * @return
     *     possible object is
     *     {@link APAuthService }
     *     
     */
    public APAuthService getApAuthService() {
        return apAuthService;
    }

    /**
     * Sets the value of the apAuthService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APAuthService }
     *     
     */
    public void setApAuthService(APAuthService value) {
        this.apAuthService = value;
    }

    /**
     * Gets the value of the apAuthReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link APAuthReversalService }
     *     
     */
    public APAuthReversalService getApAuthReversalService() {
        return apAuthReversalService;
    }

    /**
     * Sets the value of the apAuthReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APAuthReversalService }
     *     
     */
    public void setApAuthReversalService(APAuthReversalService value) {
        this.apAuthReversalService = value;
    }

    /**
     * Gets the value of the apCaptureService property.
     * 
     * @return
     *     possible object is
     *     {@link APCaptureService }
     *     
     */
    public APCaptureService getApCaptureService() {
        return apCaptureService;
    }

    /**
     * Sets the value of the apCaptureService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCaptureService }
     *     
     */
    public void setApCaptureService(APCaptureService value) {
        this.apCaptureService = value;
    }

    /**
     * Gets the value of the apOptionsService property.
     * 
     * @return
     *     possible object is
     *     {@link APOptionsService }
     *     
     */
    public APOptionsService getApOptionsService() {
        return apOptionsService;
    }

    /**
     * Sets the value of the apOptionsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APOptionsService }
     *     
     */
    public void setApOptionsService(APOptionsService value) {
        this.apOptionsService = value;
    }

    /**
     * Gets the value of the apRefundService property.
     * 
     * @return
     *     possible object is
     *     {@link APRefundService }
     *     
     */
    public APRefundService getApRefundService() {
        return apRefundService;
    }

    /**
     * Sets the value of the apRefundService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APRefundService }
     *     
     */
    public void setApRefundService(APRefundService value) {
        this.apRefundService = value;
    }

    /**
     * Gets the value of the apSaleService property.
     * 
     * @return
     *     possible object is
     *     {@link APSaleService }
     *     
     */
    public APSaleService getApSaleService() {
        return apSaleService;
    }

    /**
     * Sets the value of the apSaleService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APSaleService }
     *     
     */
    public void setApSaleService(APSaleService value) {
        this.apSaleService = value;
    }

    /**
     * Gets the value of the apCheckoutDetailsService property.
     * 
     * @return
     *     possible object is
     *     {@link APCheckOutDetailsService }
     *     
     */
    public APCheckOutDetailsService getApCheckoutDetailsService() {
        return apCheckoutDetailsService;
    }

    /**
     * Sets the value of the apCheckoutDetailsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCheckOutDetailsService }
     *     
     */
    public void setApCheckoutDetailsService(APCheckOutDetailsService value) {
        this.apCheckoutDetailsService = value;
    }

    /**
     * Gets the value of the apSessionsService property.
     * 
     * @return
     *     possible object is
     *     {@link APSessionsService }
     *     
     */
    public APSessionsService getApSessionsService() {
        return apSessionsService;
    }

    /**
     * Sets the value of the apSessionsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APSessionsService }
     *     
     */
    public void setApSessionsService(APSessionsService value) {
        this.apSessionsService = value;
    }

    /**
     * Gets the value of the apUI property.
     * 
     * @return
     *     possible object is
     *     {@link APUI }
     *     
     */
    public APUI getApUI() {
        return apUI;
    }

    /**
     * Sets the value of the apUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link APUI }
     *     
     */
    public void setApUI(APUI value) {
        this.apUI = value;
    }

    /**
     * Gets the value of the apTransactionDetailsService property.
     * 
     * @return
     *     possible object is
     *     {@link APTransactionDetailsService }
     *     
     */
    public APTransactionDetailsService getApTransactionDetailsService() {
        return apTransactionDetailsService;
    }

    /**
     * Sets the value of the apTransactionDetailsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APTransactionDetailsService }
     *     
     */
    public void setApTransactionDetailsService(APTransactionDetailsService value) {
        this.apTransactionDetailsService = value;
    }

    /**
     * Gets the value of the apConfirmPurchaseService property.
     * 
     * @return
     *     possible object is
     *     {@link APConfirmPurchaseService }
     *     
     */
    public APConfirmPurchaseService getApConfirmPurchaseService() {
        return apConfirmPurchaseService;
    }

    /**
     * Sets the value of the apConfirmPurchaseService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APConfirmPurchaseService }
     *     
     */
    public void setApConfirmPurchaseService(APConfirmPurchaseService value) {
        this.apConfirmPurchaseService = value;
    }

    /**
     * Gets the value of the payPalGetTxnDetailsService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalGetTxnDetailsService }
     *     
     */
    public PayPalGetTxnDetailsService getPayPalGetTxnDetailsService() {
        return payPalGetTxnDetailsService;
    }

    /**
     * Sets the value of the payPalGetTxnDetailsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalGetTxnDetailsService }
     *     
     */
    public void setPayPalGetTxnDetailsService(PayPalGetTxnDetailsService value) {
        this.payPalGetTxnDetailsService = value;
    }

    /**
     * Gets the value of the payPalTransactionSearchService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalTransactionSearchService }
     *     
     */
    public PayPalTransactionSearchService getPayPalTransactionSearchService() {
        return payPalTransactionSearchService;
    }

    /**
     * Sets the value of the payPalTransactionSearchService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalTransactionSearchService }
     *     
     */
    public void setPayPalTransactionSearchService(PayPalTransactionSearchService value) {
        this.payPalTransactionSearchService = value;
    }

    /**
     * Gets the value of the ccDCCUpdateService property.
     * 
     * @return
     *     possible object is
     *     {@link CCDCCUpdateService }
     *     
     */
    public CCDCCUpdateService getCcDCCUpdateService() {
        return ccDCCUpdateService;
    }

    /**
     * Sets the value of the ccDCCUpdateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDCCUpdateService }
     *     
     */
    public void setCcDCCUpdateService(CCDCCUpdateService value) {
        this.ccDCCUpdateService = value;
    }

    /**
     * Gets the value of the emvRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EmvRequest }
     *     
     */
    public EmvRequest getEmvRequest() {
        return emvRequest;
    }

    /**
     * Sets the value of the emvRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmvRequest }
     *     
     */
    public void setEmvRequest(EmvRequest value) {
        this.emvRequest = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link Merchant }
     *     
     */
    public Merchant getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Merchant }
     *     
     */
    public void setMerchant(Merchant value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the merchantTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTransactionIdentifier() {
        return merchantTransactionIdentifier;
    }

    /**
     * Sets the value of the merchantTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTransactionIdentifier(String value) {
        this.merchantTransactionIdentifier = value;
    }

    /**
     * Gets the value of the hostedDataCreateService property.
     * 
     * @return
     *     possible object is
     *     {@link HostedDataCreateService }
     *     
     */
    public HostedDataCreateService getHostedDataCreateService() {
        return hostedDataCreateService;
    }

    /**
     * Sets the value of the hostedDataCreateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostedDataCreateService }
     *     
     */
    public void setHostedDataCreateService(HostedDataCreateService value) {
        this.hostedDataCreateService = value;
    }

    /**
     * Gets the value of the hostedDataRetrieveService property.
     * 
     * @return
     *     possible object is
     *     {@link HostedDataRetrieveService }
     *     
     */
    public HostedDataRetrieveService getHostedDataRetrieveService() {
        return hostedDataRetrieveService;
    }

    /**
     * Sets the value of the hostedDataRetrieveService property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostedDataRetrieveService }
     *     
     */
    public void setHostedDataRetrieveService(HostedDataRetrieveService value) {
        this.hostedDataRetrieveService = value;
    }

    /**
     * Gets the value of the merchantDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDomainName() {
        return merchantDomainName;
    }

    /**
     * Sets the value of the merchantDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDomainName(String value) {
        this.merchantDomainName = value;
    }

    /**
     * Gets the value of the merchantCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    /**
     * Sets the value of the merchantCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryCode(String value) {
        this.merchantCategoryCode = value;
    }

    /**
     * Gets the value of the merchantCategoryCodeDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryCodeDomestic() {
        return merchantCategoryCodeDomestic;
    }

    /**
     * Sets the value of the merchantCategoryCodeDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryCodeDomestic(String value) {
        this.merchantCategoryCodeDomestic = value;
    }

    /**
     * Gets the value of the salesSlipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesSlipNumber() {
        return salesSlipNumber;
    }

    /**
     * Sets the value of the salesSlipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesSlipNumber(String value) {
        this.salesSlipNumber = value;
    }

    /**
     * Gets the value of the merchandiseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchandiseCode() {
        return merchandiseCode;
    }

    /**
     * Sets the value of the merchandiseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchandiseCode(String value) {
        this.merchandiseCode = value;
    }

    /**
     * Gets the value of the merchandiseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchandiseDescription() {
        return merchandiseDescription;
    }

    /**
     * Sets the value of the merchandiseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchandiseDescription(String value) {
        this.merchandiseDescription = value;
    }

    /**
     * Gets the value of the paymentInitiationChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInitiationChannel() {
        return paymentInitiationChannel;
    }

    /**
     * Sets the value of the paymentInitiationChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInitiationChannel(String value) {
        this.paymentInitiationChannel = value;
    }

    /**
     * Gets the value of the paymentMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    /**
     * Sets the value of the paymentMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodName(String value) {
        this.paymentMethodName = value;
    }

    /**
     * Gets the value of the extendedCreditTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedCreditTotalCount() {
        return extendedCreditTotalCount;
    }

    /**
     * Sets the value of the extendedCreditTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedCreditTotalCount(String value) {
        this.extendedCreditTotalCount = value;
    }

    /**
     * Gets the value of the authIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthIndicator() {
        return authIndicator;
    }

    /**
     * Sets the value of the authIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthIndicator(String value) {
        this.authIndicator = value;
    }

    /**
     * Gets the value of the paymentNetworkToken property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentNetworkToken }
     *     
     */
    public PaymentNetworkToken getPaymentNetworkToken() {
        return paymentNetworkToken;
    }

    /**
     * Sets the value of the paymentNetworkToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentNetworkToken }
     *     
     */
    public void setPaymentNetworkToken(PaymentNetworkToken value) {
        this.paymentNetworkToken = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link Recipient }
     *     
     */
    public Recipient getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipient }
     *     
     */
    public void setRecipient(Recipient value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the autoRentalData property.
     * 
     * @return
     *     possible object is
     *     {@link AutoRentalData }
     *     
     */
    public AutoRentalData getAutoRentalData() {
        return autoRentalData;
    }

    /**
     * Sets the value of the autoRentalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoRentalData }
     *     
     */
    public void setAutoRentalData(AutoRentalData value) {
        this.autoRentalData = value;
    }

    /**
     * Gets the value of the paymentSolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSolution() {
        return paymentSolution;
    }

    /**
     * Sets the value of the paymentSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSolution(String value) {
        this.paymentSolution = value;
    }

    /**
     * Gets the value of the vc property.
     * 
     * @return
     *     possible object is
     *     {@link VC }
     *     
     */
    public VC getVc() {
        return vc;
    }

    /**
     * Sets the value of the vc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VC }
     *     
     */
    public void setVc(VC value) {
        this.vc = value;
    }

    /**
     * Gets the value of the decryptVisaCheckoutDataService property.
     * 
     * @return
     *     possible object is
     *     {@link DecryptVisaCheckoutDataService }
     *     
     */
    public DecryptVisaCheckoutDataService getDecryptVisaCheckoutDataService() {
        return decryptVisaCheckoutDataService;
    }

    /**
     * Sets the value of the decryptVisaCheckoutDataService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecryptVisaCheckoutDataService }
     *     
     */
    public void setDecryptVisaCheckoutDataService(DecryptVisaCheckoutDataService value) {
        this.decryptVisaCheckoutDataService = value;
    }

    /**
     * Gets the value of the taxManagementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxManagementIndicator() {
        return taxManagementIndicator;
    }

    /**
     * Sets the value of the taxManagementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxManagementIndicator(String value) {
        this.taxManagementIndicator = value;
    }

    /**
     * Gets the value of the promotionGroup property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionGroup property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPromotionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionGroup }
     * </p>
     * 
     * 
     * @return
     *     The value of the promotionGroup property.
     */
    public List<PromotionGroup> getPromotionGroup() {
        if (promotionGroup == null) {
            promotionGroup = new ArrayList<>();
        }
        return this.promotionGroup;
    }

    /**
     * Gets the value of the wallet property.
     * 
     * @return
     *     possible object is
     *     {@link Wallet }
     *     
     */
    public Wallet getWallet() {
        return wallet;
    }

    /**
     * Sets the value of the wallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wallet }
     *     
     */
    public void setWallet(Wallet value) {
        this.wallet = value;
    }

    /**
     * Gets the value of the aft property.
     * 
     * @return
     *     possible object is
     *     {@link Aft }
     *     
     */
    public Aft getAft() {
        return aft;
    }

    /**
     * Sets the value of the aft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aft }
     *     
     */
    public void setAft(Aft value) {
        this.aft = value;
    }

    /**
     * Gets the value of the balanceInquiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceInquiry() {
        return balanceInquiry;
    }

    /**
     * Sets the value of the balanceInquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceInquiry(String value) {
        this.balanceInquiry = value;
    }

    /**
     * Gets the value of the prenoteTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenoteTransaction() {
        return prenoteTransaction;
    }

    /**
     * Sets the value of the prenoteTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenoteTransaction(String value) {
        this.prenoteTransaction = value;
    }

    /**
     * Gets the value of the encryptPaymentDataService property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptPaymentDataService }
     *     
     */
    public EncryptPaymentDataService getEncryptPaymentDataService() {
        return encryptPaymentDataService;
    }

    /**
     * Sets the value of the encryptPaymentDataService property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptPaymentDataService }
     *     
     */
    public void setEncryptPaymentDataService(EncryptPaymentDataService value) {
        this.encryptPaymentDataService = value;
    }

    /**
     * Gets the value of the nationalNetDomesticData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalNetDomesticData() {
        return nationalNetDomesticData;
    }

    /**
     * Sets the value of the nationalNetDomesticData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalNetDomesticData(String value) {
        this.nationalNetDomesticData = value;
    }

    /**
     * Gets the value of the subsequentAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuth() {
        return subsequentAuth;
    }

    /**
     * Sets the value of the subsequentAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuth(String value) {
        this.subsequentAuth = value;
    }

    /**
     * Gets the value of the subsequentAuthOriginalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthOriginalAmount() {
        return subsequentAuthOriginalAmount;
    }

    /**
     * Sets the value of the subsequentAuthOriginalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthOriginalAmount(String value) {
        this.subsequentAuthOriginalAmount = value;
    }

    /**
     * Gets the value of the binLookupService property.
     * 
     * @return
     *     possible object is
     *     {@link BinLookupService }
     *     
     */
    public BinLookupService getBinLookupService() {
        return binLookupService;
    }

    /**
     * Sets the value of the binLookupService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinLookupService }
     *     
     */
    public void setBinLookupService(BinLookupService value) {
        this.binLookupService = value;
    }

    /**
     * Gets the value of the verificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * Sets the value of the verificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationCode(String value) {
        this.verificationCode = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link Issuer }
     *     
     */
    public Issuer getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issuer }
     *     
     */
    public void setIssuer(Issuer value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the partnerSolutionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerSolutionID() {
        return partnerSolutionID;
    }

    /**
     * Sets the value of the partnerSolutionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerSolutionID(String value) {
        this.partnerSolutionID = value;
    }

    /**
     * Gets the value of the developerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperID() {
        return developerID;
    }

    /**
     * Sets the value of the developerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperID(String value) {
        this.developerID = value;
    }

    /**
     * Gets the value of the getVisaCheckoutDataService property.
     * 
     * @return
     *     possible object is
     *     {@link GETVisaCheckoutDataService }
     *     
     */
    public GETVisaCheckoutDataService getGetVisaCheckoutDataService() {
        return getVisaCheckoutDataService;
    }

    /**
     * Sets the value of the getVisaCheckoutDataService property.
     * 
     * @param value
     *     allowed object is
     *     {@link GETVisaCheckoutDataService }
     *     
     */
    public void setGetVisaCheckoutDataService(GETVisaCheckoutDataService value) {
        this.getVisaCheckoutDataService = value;
    }

    /**
     * Gets the value of the customerSignatureImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSignatureImage() {
        return customerSignatureImage;
    }

    /**
     * Sets the value of the customerSignatureImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSignatureImage(String value) {
        this.customerSignatureImage = value;
    }

    /**
     * Gets the value of the transactionMetadataService property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionMetadataService }
     *     
     */
    public TransactionMetadataService getTransactionMetadataService() {
        return transactionMetadataService;
    }

    /**
     * Sets the value of the transactionMetadataService property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionMetadataService }
     *     
     */
    public void setTransactionMetadataService(TransactionMetadataService value) {
        this.transactionMetadataService = value;
    }

    /**
     * Gets the value of the subsequentAuthFirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthFirst() {
        return subsequentAuthFirst;
    }

    /**
     * Sets the value of the subsequentAuthFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthFirst(String value) {
        this.subsequentAuthFirst = value;
    }

    /**
     * Gets the value of the subsequentAuthReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthReason() {
        return subsequentAuthReason;
    }

    /**
     * Sets the value of the subsequentAuthReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthReason(String value) {
        this.subsequentAuthReason = value;
    }

    /**
     * Gets the value of the subsequentAuthTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthTransactionID() {
        return subsequentAuthTransactionID;
    }

    /**
     * Sets the value of the subsequentAuthTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthTransactionID(String value) {
        this.subsequentAuthTransactionID = value;
    }

    /**
     * Gets the value of the processorTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorTransId() {
        return processorTransId;
    }

    /**
     * Sets the value of the processorTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorTransId(String value) {
        this.processorTransId = value;
    }

    /**
     * Gets the value of the subsequentAuthStoredCredential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthStoredCredential() {
        return subsequentAuthStoredCredential;
    }

    /**
     * Sets the value of the subsequentAuthStoredCredential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthStoredCredential(String value) {
        this.subsequentAuthStoredCredential = value;
    }

    /**
     * Gets the value of the subsequentAuthCumulativeAuthAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthCumulativeAuthAmount() {
        return subsequentAuthCumulativeAuthAmount;
    }

    /**
     * Sets the value of the subsequentAuthCumulativeAuthAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthCumulativeAuthAmount(String value) {
        this.subsequentAuthCumulativeAuthAmount = value;
    }

    /**
     * Gets the value of the subsequentAuthCITAuthenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthCITAuthenticationData() {
        return subsequentAuthCITAuthenticationData;
    }

    /**
     * Sets the value of the subsequentAuthCITAuthenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthCITAuthenticationData(String value) {
        this.subsequentAuthCITAuthenticationData = value;
    }

    /**
     * Gets the value of the loan property.
     * 
     * @return
     *     possible object is
     *     {@link Loan }
     *     
     */
    public Loan getLoan() {
        return loan;
    }

    /**
     * Sets the value of the loan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loan }
     *     
     */
    public void setLoan(Loan value) {
        this.loan = value;
    }

    /**
     * Gets the value of the eligibilityInquiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityInquiry() {
        return eligibilityInquiry;
    }

    /**
     * Sets the value of the eligibilityInquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityInquiry(String value) {
        this.eligibilityInquiry = value;
    }

    /**
     * Gets the value of the redemptionInquiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionInquiry() {
        return redemptionInquiry;
    }

    /**
     * Sets the value of the redemptionInquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionInquiry(String value) {
        this.redemptionInquiry = value;
    }

    /**
     * Gets the value of the feeProgramIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeProgramIndicator() {
        return feeProgramIndicator;
    }

    /**
     * Sets the value of the feeProgramIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeProgramIndicator(String value) {
        this.feeProgramIndicator = value;
    }

    /**
     * Gets the value of the apOrderService property.
     * 
     * @return
     *     possible object is
     *     {@link APOrderService }
     *     
     */
    public APOrderService getApOrderService() {
        return apOrderService;
    }

    /**
     * Sets the value of the apOrderService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APOrderService }
     *     
     */
    public void setApOrderService(APOrderService value) {
        this.apOrderService = value;
    }

    /**
     * Gets the value of the apCancelService property.
     * 
     * @return
     *     possible object is
     *     {@link APCancelService }
     *     
     */
    public APCancelService getApCancelService() {
        return apCancelService;
    }

    /**
     * Sets the value of the apCancelService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCancelService }
     *     
     */
    public void setApCancelService(APCancelService value) {
        this.apCancelService = value;
    }

    /**
     * Gets the value of the apBillingAgreementService property.
     * 
     * @return
     *     possible object is
     *     {@link APBillingAgreementService }
     *     
     */
    public APBillingAgreementService getApBillingAgreementService() {
        return apBillingAgreementService;
    }

    /**
     * Sets the value of the apBillingAgreementService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APBillingAgreementService }
     *     
     */
    public void setApBillingAgreementService(APBillingAgreementService value) {
        this.apBillingAgreementService = value;
    }

    /**
     * Gets the value of the noteToPayee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteToPayee() {
        return noteToPayee;
    }

    /**
     * Sets the value of the noteToPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteToPayee(String value) {
        this.noteToPayee = value;
    }

    /**
     * Gets the value of the noteToPayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteToPayer() {
        return noteToPayer;
    }

    /**
     * Sets the value of the noteToPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteToPayer(String value) {
        this.noteToPayer = value;
    }

    /**
     * Gets the value of the clientMetadataID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientMetadataID() {
        return clientMetadataID;
    }

    /**
     * Sets the value of the clientMetadataID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientMetadataID(String value) {
        this.clientMetadataID = value;
    }

    /**
     * Gets the value of the partnerSDKversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerSDKversion() {
        return partnerSDKversion;
    }

    /**
     * Sets the value of the partnerSDKversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerSDKversion(String value) {
        this.partnerSDKversion = value;
    }

    /**
     * Gets the value of the partnerOriginalTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerOriginalTransactionID() {
        return partnerOriginalTransactionID;
    }

    /**
     * Sets the value of the partnerOriginalTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerOriginalTransactionID(String value) {
        this.partnerOriginalTransactionID = value;
    }

    /**
     * Gets the value of the cardTypeSelectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeSelectionIndicator() {
        return cardTypeSelectionIndicator;
    }

    /**
     * Sets the value of the cardTypeSelectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeSelectionIndicator(String value) {
        this.cardTypeSelectionIndicator = value;
    }

    /**
     * Gets the value of the apCreateMandateService property.
     * 
     * @return
     *     possible object is
     *     {@link APCreateMandateService }
     *     
     */
    public APCreateMandateService getApCreateMandateService() {
        return apCreateMandateService;
    }

    /**
     * Sets the value of the apCreateMandateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCreateMandateService }
     *     
     */
    public void setApCreateMandateService(APCreateMandateService value) {
        this.apCreateMandateService = value;
    }

    /**
     * Gets the value of the apMandateStatusService property.
     * 
     * @return
     *     possible object is
     *     {@link APMandateStatusService }
     *     
     */
    public APMandateStatusService getApMandateStatusService() {
        return apMandateStatusService;
    }

    /**
     * Sets the value of the apMandateStatusService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APMandateStatusService }
     *     
     */
    public void setApMandateStatusService(APMandateStatusService value) {
        this.apMandateStatusService = value;
    }

    /**
     * Gets the value of the apUpdateMandateService property.
     * 
     * @return
     *     possible object is
     *     {@link APUpdateMandateService }
     *     
     */
    public APUpdateMandateService getApUpdateMandateService() {
        return apUpdateMandateService;
    }

    /**
     * Sets the value of the apUpdateMandateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APUpdateMandateService }
     *     
     */
    public void setApUpdateMandateService(APUpdateMandateService value) {
        this.apUpdateMandateService = value;
    }

    /**
     * Gets the value of the apImportMandateService property.
     * 
     * @return
     *     possible object is
     *     {@link APImportMandateService }
     *     
     */
    public APImportMandateService getApImportMandateService() {
        return apImportMandateService;
    }

    /**
     * Sets the value of the apImportMandateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APImportMandateService }
     *     
     */
    public void setApImportMandateService(APImportMandateService value) {
        this.apImportMandateService = value;
    }

    /**
     * Gets the value of the apRevokeMandateService property.
     * 
     * @return
     *     possible object is
     *     {@link APRevokeMandateService }
     *     
     */
    public APRevokeMandateService getApRevokeMandateService() {
        return apRevokeMandateService;
    }

    /**
     * Sets the value of the apRevokeMandateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APRevokeMandateService }
     *     
     */
    public void setApRevokeMandateService(APRevokeMandateService value) {
        this.apRevokeMandateService = value;
    }

    /**
     * Gets the value of the billPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPaymentType() {
        return billPaymentType;
    }

    /**
     * Sets the value of the billPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPaymentType(String value) {
        this.billPaymentType = value;
    }

    /**
     * Gets the value of the postdatedTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link PostdatedTransaction }
     *     
     */
    public PostdatedTransaction getPostdatedTransaction() {
        return postdatedTransaction;
    }

    /**
     * Sets the value of the postdatedTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostdatedTransaction }
     *     
     */
    public void setPostdatedTransaction(PostdatedTransaction value) {
        this.postdatedTransaction = value;
    }

    /**
     * Gets the value of the getMasterpassDataService property.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterpassDataService }
     *     
     */
    public GetMasterpassDataService getGetMasterpassDataService() {
        return getMasterpassDataService;
    }

    /**
     * Sets the value of the getMasterpassDataService property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterpassDataService }
     *     
     */
    public void setGetMasterpassDataService(GetMasterpassDataService value) {
        this.getMasterpassDataService = value;
    }

    /**
     * Gets the value of the ccCheckStatusService property.
     * 
     * @return
     *     possible object is
     *     {@link CCCheckStatusService }
     *     
     */
    public CCCheckStatusService getCcCheckStatusService() {
        return ccCheckStatusService;
    }

    /**
     * Sets the value of the ccCheckStatusService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCheckStatusService }
     *     
     */
    public void setCcCheckStatusService(CCCheckStatusService value) {
        this.ccCheckStatusService = value;
    }

    /**
     * Gets the value of the mpos property.
     * 
     * @return
     *     possible object is
     *     {@link MPOS }
     *     
     */
    public MPOS getMPOS() {
        return mpos;
    }

    /**
     * Sets the value of the mpos property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPOS }
     *     
     */
    public void setMPOS(MPOS value) {
        this.mpos = value;
    }

    /**
     * Gets the value of the abortService property.
     * 
     * @return
     *     possible object is
     *     {@link AbortService }
     *     
     */
    public AbortService getAbortService() {
        return abortService;
    }

    /**
     * Sets the value of the abortService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbortService }
     *     
     */
    public void setAbortService(AbortService value) {
        this.abortService = value;
    }

    /**
     * Gets the value of the ignoreRelaxAVS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreRelaxAVS() {
        return ignoreRelaxAVS;
    }

    /**
     * Sets the value of the ignoreRelaxAVS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreRelaxAVS(String value) {
        this.ignoreRelaxAVS = value;
    }

    /**
     * Gets the value of the agencyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyInformation }
     *     
     */
    public AgencyInformation getAgencyInformation() {
        return agencyInformation;
    }

    /**
     * Sets the value of the agencyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyInformation }
     *     
     */
    public void setAgencyInformation(AgencyInformation value) {
        this.agencyInformation = value;
    }

    /**
     * Gets the value of the autoRental property.
     * 
     * @return
     *     possible object is
     *     {@link AutoRental }
     *     
     */
    public AutoRental getAutoRental() {
        return autoRental;
    }

    /**
     * Sets the value of the autoRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoRental }
     *     
     */
    public void setAutoRental(AutoRental value) {
        this.autoRental = value;
    }

    /**
     * Gets the value of the healthCare property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthCare property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHealthCare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthCare }
     * </p>
     * 
     * 
     * @return
     *     The value of the healthCare property.
     */
    public List<HealthCare> getHealthCare() {
        if (healthCare == null) {
            healthCare = new ArrayList<>();
        }
        return this.healthCare;
    }

    /**
     * Gets the value of the payByPoints property.
     * 
     * @return
     *     possible object is
     *     {@link PayByPoints }
     *     
     */
    public PayByPoints getPayByPoints() {
        return payByPoints;
    }

    /**
     * Sets the value of the payByPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayByPoints }
     *     
     */
    public void setPayByPoints(PayByPoints value) {
        this.payByPoints = value;
    }

    /**
     * Gets the value of the paymentAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountReference() {
        return paymentAccountReference;
    }

    /**
     * Sets the value of the paymentAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountReference(String value) {
        this.paymentAccountReference = value;
    }

    /**
     * Gets the value of the networkTokenCryptogram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkTokenCryptogram() {
        return networkTokenCryptogram;
    }

    /**
     * Sets the value of the networkTokenCryptogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkTokenCryptogram(String value) {
        this.networkTokenCryptogram = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the recurring property.
     * 
     * @return
     *     possible object is
     *     {@link Recurring }
     *     
     */
    public Recurring getRecurring() {
        return recurring;
    }

    /**
     * Sets the value of the recurring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recurring }
     *     
     */
    public void setRecurring(Recurring value) {
        this.recurring = value;
    }

    /**
     * Gets the value of the ccCreditAuthService property.
     * 
     * @return
     *     possible object is
     *     {@link CCCreditAuthService }
     *     
     */
    public CCCreditAuthService getCcCreditAuthService() {
        return ccCreditAuthService;
    }

    /**
     * Sets the value of the ccCreditAuthService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCreditAuthService }
     *     
     */
    public void setCcCreditAuthService(CCCreditAuthService value) {
        this.ccCreditAuthService = value;
    }

    /**
     * Gets the value of the ccCreditAuthReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link CCCreditAuthReversalService }
     *     
     */
    public CCCreditAuthReversalService getCcCreditAuthReversalService() {
        return ccCreditAuthReversalService;
    }

    /**
     * Sets the value of the ccCreditAuthReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCreditAuthReversalService }
     *     
     */
    public void setCcCreditAuthReversalService(CCCreditAuthReversalService value) {
        this.ccCreditAuthReversalService = value;
    }

    /**
     * Gets the value of the vehicleData property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleData }
     *     
     */
    public VehicleData getVehicleData() {
        return vehicleData;
    }

    /**
     * Sets the value of the vehicleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleData }
     *     
     */
    public void setVehicleData(VehicleData value) {
        this.vehicleData = value;
    }

    /**
     * Gets the value of the enablerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnablerId() {
        return enablerId;
    }

    /**
     * Sets the value of the enablerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnablerId(String value) {
        this.enablerId = value;
    }

}
