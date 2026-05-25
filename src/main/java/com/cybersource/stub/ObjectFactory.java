
package com.cybersource.stub;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cybersource.stub package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _RequestMessage_QNAME = new QName("urn:schemas-cybersource-com:transaction-data-1.219", "requestMessage");
    private static final QName _ReplyMessage_QNAME = new QName("urn:schemas-cybersource-com:transaction-data-1.219", "replyMessage");
    private static final QName _NvpRequest_QNAME = new QName("urn:schemas-cybersource-com:transaction-data-1.219", "nvpRequest");
    private static final QName _NvpReply_QNAME = new QName("urn:schemas-cybersource-com:transaction-data-1.219", "nvpReply");
    private static final QName _FaultDetails_QNAME = new QName("urn:schemas-cybersource-com:transaction-data-1.219", "faultDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cybersource.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestMessage }
     * 
     * @return
     *     the new instance of {@link RequestMessage }
     */
    public RequestMessage createRequestMessage() {
        return new RequestMessage();
    }

    /**
     * Create an instance of {@link ReplyMessage }
     * 
     * @return
     *     the new instance of {@link ReplyMessage }
     */
    public ReplyMessage createReplyMessage() {
        return new ReplyMessage();
    }

    /**
     * Create an instance of {@link FaultDetails }
     * 
     * @return
     *     the new instance of {@link FaultDetails }
     */
    public FaultDetails createFaultDetails() {
        return new FaultDetails();
    }

    /**
     * Create an instance of {@link Item }
     * 
     * @return
     *     the new instance of {@link Item }
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link CCAuthService }
     * 
     * @return
     *     the new instance of {@link CCAuthService }
     */
    public CCAuthService createCCAuthService() {
        return new CCAuthService();
    }

    /**
     * Create an instance of {@link OCTService }
     * 
     * @return
     *     the new instance of {@link OCTService }
     */
    public OCTService createOCTService() {
        return new OCTService();
    }

    /**
     * Create an instance of {@link VerificationService }
     * 
     * @return
     *     the new instance of {@link VerificationService }
     */
    public VerificationService createVerificationService() {
        return new VerificationService();
    }

    /**
     * Create an instance of {@link CCSaleService }
     * 
     * @return
     *     the new instance of {@link CCSaleService }
     */
    public CCSaleService createCCSaleService() {
        return new CCSaleService();
    }

    /**
     * Create an instance of {@link CCSaleCreditService }
     * 
     * @return
     *     the new instance of {@link CCSaleCreditService }
     */
    public CCSaleCreditService createCCSaleCreditService() {
        return new CCSaleCreditService();
    }

    /**
     * Create an instance of {@link CCSaleReversalService }
     * 
     * @return
     *     the new instance of {@link CCSaleReversalService }
     */
    public CCSaleReversalService createCCSaleReversalService() {
        return new CCSaleReversalService();
    }

    /**
     * Create an instance of {@link CCIncrementalAuthService }
     * 
     * @return
     *     the new instance of {@link CCIncrementalAuthService }
     */
    public CCIncrementalAuthService createCCIncrementalAuthService() {
        return new CCIncrementalAuthService();
    }

    /**
     * Create an instance of {@link CCCaptureService }
     * 
     * @return
     *     the new instance of {@link CCCaptureService }
     */
    public CCCaptureService createCCCaptureService() {
        return new CCCaptureService();
    }

    /**
     * Create an instance of {@link CCCreditService }
     * 
     * @return
     *     the new instance of {@link CCCreditService }
     */
    public CCCreditService createCCCreditService() {
        return new CCCreditService();
    }

    /**
     * Create an instance of {@link CCCreditAuthService }
     * 
     * @return
     *     the new instance of {@link CCCreditAuthService }
     */
    public CCCreditAuthService createCCCreditAuthService() {
        return new CCCreditAuthService();
    }

    /**
     * Create an instance of {@link CCAuthReversalService }
     * 
     * @return
     *     the new instance of {@link CCAuthReversalService }
     */
    public CCAuthReversalService createCCAuthReversalService() {
        return new CCAuthReversalService();
    }

    /**
     * Create an instance of {@link CCAutoAuthReversalService }
     * 
     * @return
     *     the new instance of {@link CCAutoAuthReversalService }
     */
    public CCAutoAuthReversalService createCCAutoAuthReversalService() {
        return new CCAutoAuthReversalService();
    }

    /**
     * Create an instance of {@link CCCreditAuthReversalService }
     * 
     * @return
     *     the new instance of {@link CCCreditAuthReversalService }
     */
    public CCCreditAuthReversalService createCCCreditAuthReversalService() {
        return new CCCreditAuthReversalService();
    }

    /**
     * Create an instance of {@link CCDCCService }
     * 
     * @return
     *     the new instance of {@link CCDCCService }
     */
    public CCDCCService createCCDCCService() {
        return new CCDCCService();
    }

    /**
     * Create an instance of {@link ServiceFeeCalculateService }
     * 
     * @return
     *     the new instance of {@link ServiceFeeCalculateService }
     */
    public ServiceFeeCalculateService createServiceFeeCalculateService() {
        return new ServiceFeeCalculateService();
    }

    /**
     * Create an instance of {@link ECDebitService }
     * 
     * @return
     *     the new instance of {@link ECDebitService }
     */
    public ECDebitService createECDebitService() {
        return new ECDebitService();
    }

    /**
     * Create an instance of {@link ECCreditService }
     * 
     * @return
     *     the new instance of {@link ECCreditService }
     */
    public ECCreditService createECCreditService() {
        return new ECCreditService();
    }

    /**
     * Create an instance of {@link ECAuthenticateService }
     * 
     * @return
     *     the new instance of {@link ECAuthenticateService }
     */
    public ECAuthenticateService createECAuthenticateService() {
        return new ECAuthenticateService();
    }

    /**
     * Create an instance of {@link PayerAuthEnrollService }
     * 
     * @return
     *     the new instance of {@link PayerAuthEnrollService }
     */
    public PayerAuthEnrollService createPayerAuthEnrollService() {
        return new PayerAuthEnrollService();
    }

    /**
     * Create an instance of {@link PayerAuthValidateService }
     * 
     * @return
     *     the new instance of {@link PayerAuthValidateService }
     */
    public PayerAuthValidateService createPayerAuthValidateService() {
        return new PayerAuthValidateService();
    }

    /**
     * Create an instance of {@link PayerAuthSetupService }
     * 
     * @return
     *     the new instance of {@link PayerAuthSetupService }
     */
    public PayerAuthSetupService createPayerAuthSetupService() {
        return new PayerAuthSetupService();
    }

    /**
     * Create an instance of {@link TaxService }
     * 
     * @return
     *     the new instance of {@link TaxService }
     */
    public TaxService createTaxService() {
        return new TaxService();
    }

    /**
     * Create an instance of {@link DMEService }
     * 
     * @return
     *     the new instance of {@link DMEService }
     */
    public DMEService createDMEService() {
        return new DMEService();
    }

    /**
     * Create an instance of {@link AFSService }
     * 
     * @return
     *     the new instance of {@link AFSService }
     */
    public AFSService createAFSService() {
        return new AFSService();
    }

    /**
     * Create an instance of {@link DAVService }
     * 
     * @return
     *     the new instance of {@link DAVService }
     */
    public DAVService createDAVService() {
        return new DAVService();
    }

    /**
     * Create an instance of {@link ExportService }
     * 
     * @return
     *     the new instance of {@link ExportService }
     */
    public ExportService createExportService() {
        return new ExportService();
    }

    /**
     * Create an instance of {@link FXRatesService }
     * 
     * @return
     *     the new instance of {@link FXRatesService }
     */
    public FXRatesService createFXRatesService() {
        return new FXRatesService();
    }

    /**
     * Create an instance of {@link BankTransferService }
     * 
     * @return
     *     the new instance of {@link BankTransferService }
     */
    public BankTransferService createBankTransferService() {
        return new BankTransferService();
    }

    /**
     * Create an instance of {@link BankTransferRefundService }
     * 
     * @return
     *     the new instance of {@link BankTransferRefundService }
     */
    public BankTransferRefundService createBankTransferRefundService() {
        return new BankTransferRefundService();
    }

    /**
     * Create an instance of {@link BankTransferRealTimeService }
     * 
     * @return
     *     the new instance of {@link BankTransferRealTimeService }
     */
    public BankTransferRealTimeService createBankTransferRealTimeService() {
        return new BankTransferRealTimeService();
    }

    /**
     * Create an instance of {@link DirectDebitMandateService }
     * 
     * @return
     *     the new instance of {@link DirectDebitMandateService }
     */
    public DirectDebitMandateService createDirectDebitMandateService() {
        return new DirectDebitMandateService();
    }

    /**
     * Create an instance of {@link DirectDebitService }
     * 
     * @return
     *     the new instance of {@link DirectDebitService }
     */
    public DirectDebitService createDirectDebitService() {
        return new DirectDebitService();
    }

    /**
     * Create an instance of {@link DirectDebitRefundService }
     * 
     * @return
     *     the new instance of {@link DirectDebitRefundService }
     */
    public DirectDebitRefundService createDirectDebitRefundService() {
        return new DirectDebitRefundService();
    }

    /**
     * Create an instance of {@link DirectDebitValidateService }
     * 
     * @return
     *     the new instance of {@link DirectDebitValidateService }
     */
    public DirectDebitValidateService createDirectDebitValidateService() {
        return new DirectDebitValidateService();
    }

    /**
     * Create an instance of {@link DeviceFingerprintData }
     * 
     * @return
     *     the new instance of {@link DeviceFingerprintData }
     */
    public DeviceFingerprintData createDeviceFingerprintData() {
        return new DeviceFingerprintData();
    }

    /**
     * Create an instance of {@link PaySubscriptionCreateService }
     * 
     * @return
     *     the new instance of {@link PaySubscriptionCreateService }
     */
    public PaySubscriptionCreateService createPaySubscriptionCreateService() {
        return new PaySubscriptionCreateService();
    }

    /**
     * Create an instance of {@link PaySubscriptionUpdateService }
     * 
     * @return
     *     the new instance of {@link PaySubscriptionUpdateService }
     */
    public PaySubscriptionUpdateService createPaySubscriptionUpdateService() {
        return new PaySubscriptionUpdateService();
    }

    /**
     * Create an instance of {@link PaySubscriptionEventUpdateService }
     * 
     * @return
     *     the new instance of {@link PaySubscriptionEventUpdateService }
     */
    public PaySubscriptionEventUpdateService createPaySubscriptionEventUpdateService() {
        return new PaySubscriptionEventUpdateService();
    }

    /**
     * Create an instance of {@link PaySubscriptionRetrieveService }
     * 
     * @return
     *     the new instance of {@link PaySubscriptionRetrieveService }
     */
    public PaySubscriptionRetrieveService createPaySubscriptionRetrieveService() {
        return new PaySubscriptionRetrieveService();
    }

    /**
     * Create an instance of {@link PaySubscriptionDeleteService }
     * 
     * @return
     *     the new instance of {@link PaySubscriptionDeleteService }
     */
    public PaySubscriptionDeleteService createPaySubscriptionDeleteService() {
        return new PaySubscriptionDeleteService();
    }

    /**
     * Create an instance of {@link PayPalPaymentService }
     * 
     * @return
     *     the new instance of {@link PayPalPaymentService }
     */
    public PayPalPaymentService createPayPalPaymentService() {
        return new PayPalPaymentService();
    }

    /**
     * Create an instance of {@link PayPalCreditService }
     * 
     * @return
     *     the new instance of {@link PayPalCreditService }
     */
    public PayPalCreditService createPayPalCreditService() {
        return new PayPalCreditService();
    }

    /**
     * Create an instance of {@link PayPalEcSetService }
     * 
     * @return
     *     the new instance of {@link PayPalEcSetService }
     */
    public PayPalEcSetService createPayPalEcSetService() {
        return new PayPalEcSetService();
    }

    /**
     * Create an instance of {@link PayPalEcGetDetailsService }
     * 
     * @return
     *     the new instance of {@link PayPalEcGetDetailsService }
     */
    public PayPalEcGetDetailsService createPayPalEcGetDetailsService() {
        return new PayPalEcGetDetailsService();
    }

    /**
     * Create an instance of {@link PayPalEcDoPaymentService }
     * 
     * @return
     *     the new instance of {@link PayPalEcDoPaymentService }
     */
    public PayPalEcDoPaymentService createPayPalEcDoPaymentService() {
        return new PayPalEcDoPaymentService();
    }

    /**
     * Create an instance of {@link PayPalDoCaptureService }
     * 
     * @return
     *     the new instance of {@link PayPalDoCaptureService }
     */
    public PayPalDoCaptureService createPayPalDoCaptureService() {
        return new PayPalDoCaptureService();
    }

    /**
     * Create an instance of {@link PayPalAuthReversalService }
     * 
     * @return
     *     the new instance of {@link PayPalAuthReversalService }
     */
    public PayPalAuthReversalService createPayPalAuthReversalService() {
        return new PayPalAuthReversalService();
    }

    /**
     * Create an instance of {@link PayPalRefundService }
     * 
     * @return
     *     the new instance of {@link PayPalRefundService }
     */
    public PayPalRefundService createPayPalRefundService() {
        return new PayPalRefundService();
    }

    /**
     * Create an instance of {@link PayPalEcOrderSetupService }
     * 
     * @return
     *     the new instance of {@link PayPalEcOrderSetupService }
     */
    public PayPalEcOrderSetupService createPayPalEcOrderSetupService() {
        return new PayPalEcOrderSetupService();
    }

    /**
     * Create an instance of {@link PayPalAuthorizationService }
     * 
     * @return
     *     the new instance of {@link PayPalAuthorizationService }
     */
    public PayPalAuthorizationService createPayPalAuthorizationService() {
        return new PayPalAuthorizationService();
    }

    /**
     * Create an instance of {@link PayPalUpdateAgreementService }
     * 
     * @return
     *     the new instance of {@link PayPalUpdateAgreementService }
     */
    public PayPalUpdateAgreementService createPayPalUpdateAgreementService() {
        return new PayPalUpdateAgreementService();
    }

    /**
     * Create an instance of {@link PayPalCreateAgreementService }
     * 
     * @return
     *     the new instance of {@link PayPalCreateAgreementService }
     */
    public PayPalCreateAgreementService createPayPalCreateAgreementService() {
        return new PayPalCreateAgreementService();
    }

    /**
     * Create an instance of {@link PayPalDoRefTransactionService }
     * 
     * @return
     *     the new instance of {@link PayPalDoRefTransactionService }
     */
    public PayPalDoRefTransactionService createPayPalDoRefTransactionService() {
        return new PayPalDoRefTransactionService();
    }

    /**
     * Create an instance of {@link VoidService }
     * 
     * @return
     *     the new instance of {@link VoidService }
     */
    public VoidService createVoidService() {
        return new VoidService();
    }

    /**
     * Create an instance of {@link PinlessDebitService }
     * 
     * @return
     *     the new instance of {@link PinlessDebitService }
     */
    public PinlessDebitService createPinlessDebitService() {
        return new PinlessDebitService();
    }

    /**
     * Create an instance of {@link PinlessDebitValidateService }
     * 
     * @return
     *     the new instance of {@link PinlessDebitValidateService }
     */
    public PinlessDebitValidateService createPinlessDebitValidateService() {
        return new PinlessDebitValidateService();
    }

    /**
     * Create an instance of {@link PinlessDebitReversalService }
     * 
     * @return
     *     the new instance of {@link PinlessDebitReversalService }
     */
    public PinlessDebitReversalService createPinlessDebitReversalService() {
        return new PinlessDebitReversalService();
    }

    /**
     * Create an instance of {@link PinDebitPurchaseService }
     * 
     * @return
     *     the new instance of {@link PinDebitPurchaseService }
     */
    public PinDebitPurchaseService createPinDebitPurchaseService() {
        return new PinDebitPurchaseService();
    }

    /**
     * Create an instance of {@link PinDebitCreditService }
     * 
     * @return
     *     the new instance of {@link PinDebitCreditService }
     */
    public PinDebitCreditService createPinDebitCreditService() {
        return new PinDebitCreditService();
    }

    /**
     * Create an instance of {@link PinDebitReversalService }
     * 
     * @return
     *     the new instance of {@link PinDebitReversalService }
     */
    public PinDebitReversalService createPinDebitReversalService() {
        return new PinDebitReversalService();
    }

    /**
     * Create an instance of {@link PayPalButtonCreateService }
     * 
     * @return
     *     the new instance of {@link PayPalButtonCreateService }
     */
    public PayPalButtonCreateService createPayPalButtonCreateService() {
        return new PayPalButtonCreateService();
    }

    /**
     * Create an instance of {@link PayPalPreapprovedPaymentService }
     * 
     * @return
     *     the new instance of {@link PayPalPreapprovedPaymentService }
     */
    public PayPalPreapprovedPaymentService createPayPalPreapprovedPaymentService() {
        return new PayPalPreapprovedPaymentService();
    }

    /**
     * Create an instance of {@link PayPalPreapprovedUpdateService }
     * 
     * @return
     *     the new instance of {@link PayPalPreapprovedUpdateService }
     */
    public PayPalPreapprovedUpdateService createPayPalPreapprovedUpdateService() {
        return new PayPalPreapprovedUpdateService();
    }

    /**
     * Create an instance of {@link ChinaPaymentService }
     * 
     * @return
     *     the new instance of {@link ChinaPaymentService }
     */
    public ChinaPaymentService createChinaPaymentService() {
        return new ChinaPaymentService();
    }

    /**
     * Create an instance of {@link ChinaRefundService }
     * 
     * @return
     *     the new instance of {@link ChinaRefundService }
     */
    public ChinaRefundService createChinaRefundService() {
        return new ChinaRefundService();
    }

    /**
     * Create an instance of {@link BoletoPaymentService }
     * 
     * @return
     *     the new instance of {@link BoletoPaymentService }
     */
    public BoletoPaymentService createBoletoPaymentService() {
        return new BoletoPaymentService();
    }

    /**
     * Create an instance of {@link PersonalID }
     * 
     * @return
     *     the new instance of {@link PersonalID }
     */
    public PersonalID createPersonalID() {
        return new PersonalID();
    }

    /**
     * Create an instance of {@link Routing }
     * 
     * @return
     *     the new instance of {@link Routing }
     */
    public Routing createRouting() {
        return new Routing();
    }

    /**
     * Create an instance of {@link Address }
     * 
     * @return
     *     the new instance of {@link Address }
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link APInitiateService }
     * 
     * @return
     *     the new instance of {@link APInitiateService }
     */
    public APInitiateService createAPInitiateService() {
        return new APInitiateService();
    }

    /**
     * Create an instance of {@link APCheckStatusService }
     * 
     * @return
     *     the new instance of {@link APCheckStatusService }
     */
    public APCheckStatusService createAPCheckStatusService() {
        return new APCheckStatusService();
    }

    /**
     * Create an instance of {@link RiskUpdateService }
     * 
     * @return
     *     the new instance of {@link RiskUpdateService }
     */
    public RiskUpdateService createRiskUpdateService() {
        return new RiskUpdateService();
    }

    /**
     * Create an instance of {@link FraudUpdateService }
     * 
     * @return
     *     the new instance of {@link FraudUpdateService }
     */
    public FraudUpdateService createFraudUpdateService() {
        return new FraudUpdateService();
    }

    /**
     * Create an instance of {@link CaseManagementActionService }
     * 
     * @return
     *     the new instance of {@link CaseManagementActionService }
     */
    public CaseManagementActionService createCaseManagementActionService() {
        return new CaseManagementActionService();
    }

    /**
     * Create an instance of {@link EncryptPaymentDataService }
     * 
     * @return
     *     the new instance of {@link EncryptPaymentDataService }
     */
    public EncryptPaymentDataService createEncryptPaymentDataService() {
        return new EncryptPaymentDataService();
    }

    /**
     * Create an instance of {@link InvoiceHeader }
     * 
     * @return
     *     the new instance of {@link InvoiceHeader }
     */
    public InvoiceHeader createInvoiceHeader() {
        return new InvoiceHeader();
    }

    /**
     * Create an instance of {@link BusinessRules }
     * 
     * @return
     *     the new instance of {@link BusinessRules }
     */
    public BusinessRules createBusinessRules() {
        return new BusinessRules();
    }

    /**
     * Create an instance of {@link BillTo }
     * 
     * @return
     *     the new instance of {@link BillTo }
     */
    public BillTo createBillTo() {
        return new BillTo();
    }

    /**
     * Create an instance of {@link ShipTo }
     * 
     * @return
     *     the new instance of {@link ShipTo }
     */
    public ShipTo createShipTo() {
        return new ShipTo();
    }

    /**
     * Create an instance of {@link ShipFrom }
     * 
     * @return
     *     the new instance of {@link ShipFrom }
     */
    public ShipFrom createShipFrom() {
        return new ShipFrom();
    }

    /**
     * Create an instance of {@link Card }
     * 
     * @return
     *     the new instance of {@link Card }
     */
    public Card createCard() {
        return new Card();
    }

    /**
     * Create an instance of {@link Check }
     * 
     * @return
     *     the new instance of {@link Check }
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link BML }
     * 
     * @return
     *     the new instance of {@link BML }
     */
    public BML createBML() {
        return new BML();
    }

    /**
     * Create an instance of {@link OtherTax }
     * 
     * @return
     *     the new instance of {@link OtherTax }
     */
    public OtherTax createOtherTax() {
        return new OtherTax();
    }

    /**
     * Create an instance of {@link Aft }
     * 
     * @return
     *     the new instance of {@link Aft }
     */
    public Aft createAft() {
        return new Aft();
    }

    /**
     * Create an instance of {@link Wallet }
     * 
     * @return
     *     the new instance of {@link Wallet }
     */
    public Wallet createWallet() {
        return new Wallet();
    }

    /**
     * Create an instance of {@link PurchaseTotals }
     * 
     * @return
     *     the new instance of {@link PurchaseTotals }
     */
    public PurchaseTotals createPurchaseTotals() {
        return new PurchaseTotals();
    }

    /**
     * Create an instance of {@link FundingTotals }
     * 
     * @return
     *     the new instance of {@link FundingTotals }
     */
    public FundingTotals createFundingTotals() {
        return new FundingTotals();
    }

    /**
     * Create an instance of {@link GECC }
     * 
     * @return
     *     the new instance of {@link GECC }
     */
    public GECC createGECC() {
        return new GECC();
    }

    /**
     * Create an instance of {@link UCAF }
     * 
     * @return
     *     the new instance of {@link UCAF }
     */
    public UCAF createUCAF() {
        return new UCAF();
    }

    /**
     * Create an instance of {@link Network }
     * 
     * @return
     *     the new instance of {@link Network }
     */
    public Network createNetwork() {
        return new Network();
    }

    /**
     * Create an instance of {@link Brands }
     * 
     * @return
     *     the new instance of {@link Brands }
     */
    public Brands createBrands() {
        return new Brands();
    }

    /**
     * Create an instance of {@link FundTransfer }
     * 
     * @return
     *     the new instance of {@link FundTransfer }
     */
    public FundTransfer createFundTransfer() {
        return new FundTransfer();
    }

    /**
     * Create an instance of {@link BankInfo }
     * 
     * @return
     *     the new instance of {@link BankInfo }
     */
    public BankInfo createBankInfo() {
        return new BankInfo();
    }

    /**
     * Create an instance of {@link RecurringSubscriptionInfo }
     * 
     * @return
     *     the new instance of {@link RecurringSubscriptionInfo }
     */
    public RecurringSubscriptionInfo createRecurringSubscriptionInfo() {
        return new RecurringSubscriptionInfo();
    }

    /**
     * Create an instance of {@link PaySubscriptionEvent }
     * 
     * @return
     *     the new instance of {@link PaySubscriptionEvent }
     */
    public PaySubscriptionEvent createPaySubscriptionEvent() {
        return new PaySubscriptionEvent();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     * @return
     *     the new instance of {@link Subscription }
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link TokenSource }
     * 
     * @return
     *     the new instance of {@link TokenSource }
     */
    public TokenSource createTokenSource() {
        return new TokenSource();
    }

    /**
     * Create an instance of {@link PaymentNetworkToken }
     * 
     * @return
     *     the new instance of {@link PaymentNetworkToken }
     */
    public PaymentNetworkToken createPaymentNetworkToken() {
        return new PaymentNetworkToken();
    }

    /**
     * Create an instance of {@link DecisionManager }
     * 
     * @return
     *     the new instance of {@link DecisionManager }
     */
    public DecisionManager createDecisionManager() {
        return new DecisionManager();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     * @return
     *     the new instance of {@link Authentication }
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link DecisionManagerTravelData }
     * 
     * @return
     *     the new instance of {@link DecisionManagerTravelData }
     */
    public DecisionManagerTravelData createDecisionManagerTravelData() {
        return new DecisionManagerTravelData();
    }

    /**
     * Create an instance of {@link DecisionManagerTravelLeg }
     * 
     * @return
     *     the new instance of {@link DecisionManagerTravelLeg }
     */
    public DecisionManagerTravelLeg createDecisionManagerTravelLeg() {
        return new DecisionManagerTravelLeg();
    }

    /**
     * Create an instance of {@link Batch }
     * 
     * @return
     *     the new instance of {@link Batch }
     */
    public Batch createBatch() {
        return new Batch();
    }

    /**
     * Create an instance of {@link PayPal }
     * 
     * @return
     *     the new instance of {@link PayPal }
     */
    public PayPal createPayPal() {
        return new PayPal();
    }

    /**
     * Create an instance of {@link JPO }
     * 
     * @return
     *     the new instance of {@link JPO }
     */
    public JPO createJPO() {
        return new JPO();
    }

    /**
     * Create an instance of {@link Token }
     * 
     * @return
     *     the new instance of {@link Token }
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link AP }
     * 
     * @return
     *     the new instance of {@link AP }
     */
    public AP createAP() {
        return new AP();
    }

    /**
     * Create an instance of {@link APDevice }
     * 
     * @return
     *     the new instance of {@link APDevice }
     */
    public APDevice createAPDevice() {
        return new APDevice();
    }

    /**
     * Create an instance of {@link APAuthService }
     * 
     * @return
     *     the new instance of {@link APAuthService }
     */
    public APAuthService createAPAuthService() {
        return new APAuthService();
    }

    /**
     * Create an instance of {@link APImportMandateService }
     * 
     * @return
     *     the new instance of {@link APImportMandateService }
     */
    public APImportMandateService createAPImportMandateService() {
        return new APImportMandateService();
    }

    /**
     * Create an instance of {@link APAuthReversalService }
     * 
     * @return
     *     the new instance of {@link APAuthReversalService }
     */
    public APAuthReversalService createAPAuthReversalService() {
        return new APAuthReversalService();
    }

    /**
     * Create an instance of {@link APCaptureService }
     * 
     * @return
     *     the new instance of {@link APCaptureService }
     */
    public APCaptureService createAPCaptureService() {
        return new APCaptureService();
    }

    /**
     * Create an instance of {@link APOptionsService }
     * 
     * @return
     *     the new instance of {@link APOptionsService }
     */
    public APOptionsService createAPOptionsService() {
        return new APOptionsService();
    }

    /**
     * Create an instance of {@link APRefundService }
     * 
     * @return
     *     the new instance of {@link APRefundService }
     */
    public APRefundService createAPRefundService() {
        return new APRefundService();
    }

    /**
     * Create an instance of {@link APSaleService }
     * 
     * @return
     *     the new instance of {@link APSaleService }
     */
    public APSaleService createAPSaleService() {
        return new APSaleService();
    }

    /**
     * Create an instance of {@link APCheckOutDetailsService }
     * 
     * @return
     *     the new instance of {@link APCheckOutDetailsService }
     */
    public APCheckOutDetailsService createAPCheckOutDetailsService() {
        return new APCheckOutDetailsService();
    }

    /**
     * Create an instance of {@link APTransactionDetailsService }
     * 
     * @return
     *     the new instance of {@link APTransactionDetailsService }
     */
    public APTransactionDetailsService createAPTransactionDetailsService() {
        return new APTransactionDetailsService();
    }

    /**
     * Create an instance of {@link APConfirmPurchaseService }
     * 
     * @return
     *     the new instance of {@link APConfirmPurchaseService }
     */
    public APConfirmPurchaseService createAPConfirmPurchaseService() {
        return new APConfirmPurchaseService();
    }

    /**
     * Create an instance of {@link APSessionsService }
     * 
     * @return
     *     the new instance of {@link APSessionsService }
     */
    public APSessionsService createAPSessionsService() {
        return new APSessionsService();
    }

    /**
     * Create an instance of {@link APUI }
     * 
     * @return
     *     the new instance of {@link APUI }
     */
    public APUI createAPUI() {
        return new APUI();
    }

    /**
     * Create an instance of {@link PayPalGetTxnDetailsService }
     * 
     * @return
     *     the new instance of {@link PayPalGetTxnDetailsService }
     */
    public PayPalGetTxnDetailsService createPayPalGetTxnDetailsService() {
        return new PayPalGetTxnDetailsService();
    }

    /**
     * Create an instance of {@link PayPalTransactionSearchService }
     * 
     * @return
     *     the new instance of {@link PayPalTransactionSearchService }
     */
    public PayPalTransactionSearchService createPayPalTransactionSearchService() {
        return new PayPalTransactionSearchService();
    }

    /**
     * Create an instance of {@link Recipient }
     * 
     * @return
     *     the new instance of {@link Recipient }
     */
    public Recipient createRecipient() {
        return new Recipient();
    }

    /**
     * Create an instance of {@link Sender }
     * 
     * @return
     *     the new instance of {@link Sender }
     */
    public Sender createSender() {
        return new Sender();
    }

    /**
     * Create an instance of {@link CCCheckStatusService }
     * 
     * @return
     *     the new instance of {@link CCCheckStatusService }
     */
    public CCCheckStatusService createCCCheckStatusService() {
        return new CCCheckStatusService();
    }

    /**
     * Create an instance of {@link VC }
     * 
     * @return
     *     the new instance of {@link VC }
     */
    public VC createVC() {
        return new VC();
    }

    /**
     * Create an instance of {@link DecryptVisaCheckoutDataService }
     * 
     * @return
     *     the new instance of {@link DecryptVisaCheckoutDataService }
     */
    public DecryptVisaCheckoutDataService createDecryptVisaCheckoutDataService() {
        return new DecryptVisaCheckoutDataService();
    }

    /**
     * Create an instance of {@link DCC }
     * 
     * @return
     *     the new instance of {@link DCC }
     */
    public DCC createDCC() {
        return new DCC();
    }

    /**
     * Create an instance of {@link Promotion }
     * 
     * @return
     *     the new instance of {@link Promotion }
     */
    public Promotion createPromotion() {
        return new Promotion();
    }

    /**
     * Create an instance of {@link PromotionGroup }
     * 
     * @return
     *     the new instance of {@link PromotionGroup }
     */
    public PromotionGroup createPromotionGroup() {
        return new PromotionGroup();
    }

    /**
     * Create an instance of {@link PromotionGroupReply }
     * 
     * @return
     *     the new instance of {@link PromotionGroupReply }
     */
    public PromotionGroupReply createPromotionGroupReply() {
        return new PromotionGroupReply();
    }

    /**
     * Create an instance of {@link BalanceInfo }
     * 
     * @return
     *     the new instance of {@link BalanceInfo }
     */
    public BalanceInfo createBalanceInfo() {
        return new BalanceInfo();
    }

    /**
     * Create an instance of {@link PaymentInsightsInformation }
     * 
     * @return
     *     the new instance of {@link PaymentInsightsInformation }
     */
    public PaymentInsightsInformation createPaymentInsightsInformation() {
        return new PaymentInsightsInformation();
    }

    /**
     * Create an instance of {@link AdditionalToken }
     * 
     * @return
     *     the new instance of {@link AdditionalToken }
     */
    public AdditionalToken createAdditionalToken() {
        return new AdditionalToken();
    }

    /**
     * Create an instance of {@link CCAuthReply }
     * 
     * @return
     *     the new instance of {@link CCAuthReply }
     */
    public CCAuthReply createCCAuthReply() {
        return new CCAuthReply();
    }

    /**
     * Create an instance of {@link OCTReply }
     * 
     * @return
     *     the new instance of {@link OCTReply }
     */
    public OCTReply createOCTReply() {
        return new OCTReply();
    }

    /**
     * Create an instance of {@link VerificationReply }
     * 
     * @return
     *     the new instance of {@link VerificationReply }
     */
    public VerificationReply createVerificationReply() {
        return new VerificationReply();
    }

    /**
     * Create an instance of {@link CCSaleReply }
     * 
     * @return
     *     the new instance of {@link CCSaleReply }
     */
    public CCSaleReply createCCSaleReply() {
        return new CCSaleReply();
    }

    /**
     * Create an instance of {@link CCSaleCreditReply }
     * 
     * @return
     *     the new instance of {@link CCSaleCreditReply }
     */
    public CCSaleCreditReply createCCSaleCreditReply() {
        return new CCSaleCreditReply();
    }

    /**
     * Create an instance of {@link CCSaleReversalReply }
     * 
     * @return
     *     the new instance of {@link CCSaleReversalReply }
     */
    public CCSaleReversalReply createCCSaleReversalReply() {
        return new CCSaleReversalReply();
    }

    /**
     * Create an instance of {@link CCIncrementalAuthReply }
     * 
     * @return
     *     the new instance of {@link CCIncrementalAuthReply }
     */
    public CCIncrementalAuthReply createCCIncrementalAuthReply() {
        return new CCIncrementalAuthReply();
    }

    /**
     * Create an instance of {@link CCCaptureReply }
     * 
     * @return
     *     the new instance of {@link CCCaptureReply }
     */
    public CCCaptureReply createCCCaptureReply() {
        return new CCCaptureReply();
    }

    /**
     * Create an instance of {@link ServiceFeeCalculateReply }
     * 
     * @return
     *     the new instance of {@link ServiceFeeCalculateReply }
     */
    public ServiceFeeCalculateReply createServiceFeeCalculateReply() {
        return new ServiceFeeCalculateReply();
    }

    /**
     * Create an instance of {@link CCCreditReply }
     * 
     * @return
     *     the new instance of {@link CCCreditReply }
     */
    public CCCreditReply createCCCreditReply() {
        return new CCCreditReply();
    }

    /**
     * Create an instance of {@link CCCreditAuthReply }
     * 
     * @return
     *     the new instance of {@link CCCreditAuthReply }
     */
    public CCCreditAuthReply createCCCreditAuthReply() {
        return new CCCreditAuthReply();
    }

    /**
     * Create an instance of {@link PinDebitPurchaseReply }
     * 
     * @return
     *     the new instance of {@link PinDebitPurchaseReply }
     */
    public PinDebitPurchaseReply createPinDebitPurchaseReply() {
        return new PinDebitPurchaseReply();
    }

    /**
     * Create an instance of {@link PinDebitCreditReply }
     * 
     * @return
     *     the new instance of {@link PinDebitCreditReply }
     */
    public PinDebitCreditReply createPinDebitCreditReply() {
        return new PinDebitCreditReply();
    }

    /**
     * Create an instance of {@link PinDebitReversalReply }
     * 
     * @return
     *     the new instance of {@link PinDebitReversalReply }
     */
    public PinDebitReversalReply createPinDebitReversalReply() {
        return new PinDebitReversalReply();
    }

    /**
     * Create an instance of {@link CCAuthReversalReply }
     * 
     * @return
     *     the new instance of {@link CCAuthReversalReply }
     */
    public CCAuthReversalReply createCCAuthReversalReply() {
        return new CCAuthReversalReply();
    }

    /**
     * Create an instance of {@link CCAutoAuthReversalReply }
     * 
     * @return
     *     the new instance of {@link CCAutoAuthReversalReply }
     */
    public CCAutoAuthReversalReply createCCAutoAuthReversalReply() {
        return new CCAutoAuthReversalReply();
    }

    /**
     * Create an instance of {@link CCCreditAuthReversalReply }
     * 
     * @return
     *     the new instance of {@link CCCreditAuthReversalReply }
     */
    public CCCreditAuthReversalReply createCCCreditAuthReversalReply() {
        return new CCCreditAuthReversalReply();
    }

    /**
     * Create an instance of {@link ECAVSReply }
     * 
     * @return
     *     the new instance of {@link ECAVSReply }
     */
    public ECAVSReply createECAVSReply() {
        return new ECAVSReply();
    }

    /**
     * Create an instance of {@link ECDebitReply }
     * 
     * @return
     *     the new instance of {@link ECDebitReply }
     */
    public ECDebitReply createECDebitReply() {
        return new ECDebitReply();
    }

    /**
     * Create an instance of {@link ECCreditReply }
     * 
     * @return
     *     the new instance of {@link ECCreditReply }
     */
    public ECCreditReply createECCreditReply() {
        return new ECCreditReply();
    }

    /**
     * Create an instance of {@link ECAuthenticateReply }
     * 
     * @return
     *     the new instance of {@link ECAuthenticateReply }
     */
    public ECAuthenticateReply createECAuthenticateReply() {
        return new ECAuthenticateReply();
    }

    /**
     * Create an instance of {@link PayerAuthSetupReply }
     * 
     * @return
     *     the new instance of {@link PayerAuthSetupReply }
     */
    public PayerAuthSetupReply createPayerAuthSetupReply() {
        return new PayerAuthSetupReply();
    }

    /**
     * Create an instance of {@link PayerAuthEnrollReply }
     * 
     * @return
     *     the new instance of {@link PayerAuthEnrollReply }
     */
    public PayerAuthEnrollReply createPayerAuthEnrollReply() {
        return new PayerAuthEnrollReply();
    }

    /**
     * Create an instance of {@link PayerAuthValidateReply }
     * 
     * @return
     *     the new instance of {@link PayerAuthValidateReply }
     */
    public PayerAuthValidateReply createPayerAuthValidateReply() {
        return new PayerAuthValidateReply();
    }

    /**
     * Create an instance of {@link TaxReplyItem }
     * 
     * @return
     *     the new instance of {@link TaxReplyItem }
     */
    public TaxReplyItem createTaxReplyItem() {
        return new TaxReplyItem();
    }

    /**
     * Create an instance of {@link TaxReplyItemJurisdiction }
     * 
     * @return
     *     the new instance of {@link TaxReplyItemJurisdiction }
     */
    public TaxReplyItemJurisdiction createTaxReplyItemJurisdiction() {
        return new TaxReplyItemJurisdiction();
    }

    /**
     * Create an instance of {@link TaxReply }
     * 
     * @return
     *     the new instance of {@link TaxReply }
     */
    public TaxReply createTaxReply() {
        return new TaxReply();
    }

    /**
     * Create an instance of {@link DeviceFingerprint }
     * 
     * @return
     *     the new instance of {@link DeviceFingerprint }
     */
    public DeviceFingerprint createDeviceFingerprint() {
        return new DeviceFingerprint();
    }

    /**
     * Create an instance of {@link AFSReply }
     * 
     * @return
     *     the new instance of {@link AFSReply }
     */
    public AFSReply createAFSReply() {
        return new AFSReply();
    }

    /**
     * Create an instance of {@link DAVReply }
     * 
     * @return
     *     the new instance of {@link DAVReply }
     */
    public DAVReply createDAVReply() {
        return new DAVReply();
    }

    /**
     * Create an instance of {@link DeniedPartiesMatch }
     * 
     * @return
     *     the new instance of {@link DeniedPartiesMatch }
     */
    public DeniedPartiesMatch createDeniedPartiesMatch() {
        return new DeniedPartiesMatch();
    }

    /**
     * Create an instance of {@link ExportReply }
     * 
     * @return
     *     the new instance of {@link ExportReply }
     */
    public ExportReply createExportReply() {
        return new ExportReply();
    }

    /**
     * Create an instance of {@link FXQuote }
     * 
     * @return
     *     the new instance of {@link FXQuote }
     */
    public FXQuote createFXQuote() {
        return new FXQuote();
    }

    /**
     * Create an instance of {@link FXRatesReply }
     * 
     * @return
     *     the new instance of {@link FXRatesReply }
     */
    public FXRatesReply createFXRatesReply() {
        return new FXRatesReply();
    }

    /**
     * Create an instance of {@link BankTransferReply }
     * 
     * @return
     *     the new instance of {@link BankTransferReply }
     */
    public BankTransferReply createBankTransferReply() {
        return new BankTransferReply();
    }

    /**
     * Create an instance of {@link BankTransferRealTimeReply }
     * 
     * @return
     *     the new instance of {@link BankTransferRealTimeReply }
     */
    public BankTransferRealTimeReply createBankTransferRealTimeReply() {
        return new BankTransferRealTimeReply();
    }

    /**
     * Create an instance of {@link DirectDebitMandateReply }
     * 
     * @return
     *     the new instance of {@link DirectDebitMandateReply }
     */
    public DirectDebitMandateReply createDirectDebitMandateReply() {
        return new DirectDebitMandateReply();
    }

    /**
     * Create an instance of {@link BankTransferRefundReply }
     * 
     * @return
     *     the new instance of {@link BankTransferRefundReply }
     */
    public BankTransferRefundReply createBankTransferRefundReply() {
        return new BankTransferRefundReply();
    }

    /**
     * Create an instance of {@link DirectDebitReply }
     * 
     * @return
     *     the new instance of {@link DirectDebitReply }
     */
    public DirectDebitReply createDirectDebitReply() {
        return new DirectDebitReply();
    }

    /**
     * Create an instance of {@link DirectDebitValidateReply }
     * 
     * @return
     *     the new instance of {@link DirectDebitValidateReply }
     */
    public DirectDebitValidateReply createDirectDebitValidateReply() {
        return new DirectDebitValidateReply();
    }

    /**
     * Create an instance of {@link DirectDebitRefundReply }
     * 
     * @return
     *     the new instance of {@link DirectDebitRefundReply }
     */
    public DirectDebitRefundReply createDirectDebitRefundReply() {
        return new DirectDebitRefundReply();
    }

    /**
     * Create an instance of {@link PaySubscriptionCreateReply }
     * 
     * @return
     *     the new instance of {@link PaySubscriptionCreateReply }
     */
    public PaySubscriptionCreateReply createPaySubscriptionCreateReply() {
        return new PaySubscriptionCreateReply();
    }

    /**
     * Create an instance of {@link PaySubscriptionUpdateReply }
     * 
     * @return
     *     the new instance of {@link PaySubscriptionUpdateReply }
     */
    public PaySubscriptionUpdateReply createPaySubscriptionUpdateReply() {
        return new PaySubscriptionUpdateReply();
    }

    /**
     * Create an instance of {@link PaySubscriptionEventUpdateReply }
     * 
     * @return
     *     the new instance of {@link PaySubscriptionEventUpdateReply }
     */
    public PaySubscriptionEventUpdateReply createPaySubscriptionEventUpdateReply() {
        return new PaySubscriptionEventUpdateReply();
    }

    /**
     * Create an instance of {@link PaySubscriptionRetrieveReply }
     * 
     * @return
     *     the new instance of {@link PaySubscriptionRetrieveReply }
     */
    public PaySubscriptionRetrieveReply createPaySubscriptionRetrieveReply() {
        return new PaySubscriptionRetrieveReply();
    }

    /**
     * Create an instance of {@link PaySubscriptionDeleteReply }
     * 
     * @return
     *     the new instance of {@link PaySubscriptionDeleteReply }
     */
    public PaySubscriptionDeleteReply createPaySubscriptionDeleteReply() {
        return new PaySubscriptionDeleteReply();
    }

    /**
     * Create an instance of {@link PayPalPaymentReply }
     * 
     * @return
     *     the new instance of {@link PayPalPaymentReply }
     */
    public PayPalPaymentReply createPayPalPaymentReply() {
        return new PayPalPaymentReply();
    }

    /**
     * Create an instance of {@link PayPalCreditReply }
     * 
     * @return
     *     the new instance of {@link PayPalCreditReply }
     */
    public PayPalCreditReply createPayPalCreditReply() {
        return new PayPalCreditReply();
    }

    /**
     * Create an instance of {@link VoidReply }
     * 
     * @return
     *     the new instance of {@link VoidReply }
     */
    public VoidReply createVoidReply() {
        return new VoidReply();
    }

    /**
     * Create an instance of {@link PinlessDebitReply }
     * 
     * @return
     *     the new instance of {@link PinlessDebitReply }
     */
    public PinlessDebitReply createPinlessDebitReply() {
        return new PinlessDebitReply();
    }

    /**
     * Create an instance of {@link PinlessDebitValidateReply }
     * 
     * @return
     *     the new instance of {@link PinlessDebitValidateReply }
     */
    public PinlessDebitValidateReply createPinlessDebitValidateReply() {
        return new PinlessDebitValidateReply();
    }

    /**
     * Create an instance of {@link PinlessDebitReversalReply }
     * 
     * @return
     *     the new instance of {@link PinlessDebitReversalReply }
     */
    public PinlessDebitReversalReply createPinlessDebitReversalReply() {
        return new PinlessDebitReversalReply();
    }

    /**
     * Create an instance of {@link PayPalButtonCreateReply }
     * 
     * @return
     *     the new instance of {@link PayPalButtonCreateReply }
     */
    public PayPalButtonCreateReply createPayPalButtonCreateReply() {
        return new PayPalButtonCreateReply();
    }

    /**
     * Create an instance of {@link PayPalPreapprovedPaymentReply }
     * 
     * @return
     *     the new instance of {@link PayPalPreapprovedPaymentReply }
     */
    public PayPalPreapprovedPaymentReply createPayPalPreapprovedPaymentReply() {
        return new PayPalPreapprovedPaymentReply();
    }

    /**
     * Create an instance of {@link PayPalPreapprovedUpdateReply }
     * 
     * @return
     *     the new instance of {@link PayPalPreapprovedUpdateReply }
     */
    public PayPalPreapprovedUpdateReply createPayPalPreapprovedUpdateReply() {
        return new PayPalPreapprovedUpdateReply();
    }

    /**
     * Create an instance of {@link PayPalEcSetReply }
     * 
     * @return
     *     the new instance of {@link PayPalEcSetReply }
     */
    public PayPalEcSetReply createPayPalEcSetReply() {
        return new PayPalEcSetReply();
    }

    /**
     * Create an instance of {@link PayPalEcGetDetailsReply }
     * 
     * @return
     *     the new instance of {@link PayPalEcGetDetailsReply }
     */
    public PayPalEcGetDetailsReply createPayPalEcGetDetailsReply() {
        return new PayPalEcGetDetailsReply();
    }

    /**
     * Create an instance of {@link PayPalEcDoPaymentReply }
     * 
     * @return
     *     the new instance of {@link PayPalEcDoPaymentReply }
     */
    public PayPalEcDoPaymentReply createPayPalEcDoPaymentReply() {
        return new PayPalEcDoPaymentReply();
    }

    /**
     * Create an instance of {@link PayPalDoCaptureReply }
     * 
     * @return
     *     the new instance of {@link PayPalDoCaptureReply }
     */
    public PayPalDoCaptureReply createPayPalDoCaptureReply() {
        return new PayPalDoCaptureReply();
    }

    /**
     * Create an instance of {@link PayPalAuthReversalReply }
     * 
     * @return
     *     the new instance of {@link PayPalAuthReversalReply }
     */
    public PayPalAuthReversalReply createPayPalAuthReversalReply() {
        return new PayPalAuthReversalReply();
    }

    /**
     * Create an instance of {@link PayPalRefundReply }
     * 
     * @return
     *     the new instance of {@link PayPalRefundReply }
     */
    public PayPalRefundReply createPayPalRefundReply() {
        return new PayPalRefundReply();
    }

    /**
     * Create an instance of {@link PayPalEcOrderSetupReply }
     * 
     * @return
     *     the new instance of {@link PayPalEcOrderSetupReply }
     */
    public PayPalEcOrderSetupReply createPayPalEcOrderSetupReply() {
        return new PayPalEcOrderSetupReply();
    }

    /**
     * Create an instance of {@link PayPalAuthorizationReply }
     * 
     * @return
     *     the new instance of {@link PayPalAuthorizationReply }
     */
    public PayPalAuthorizationReply createPayPalAuthorizationReply() {
        return new PayPalAuthorizationReply();
    }

    /**
     * Create an instance of {@link PayPalUpdateAgreementReply }
     * 
     * @return
     *     the new instance of {@link PayPalUpdateAgreementReply }
     */
    public PayPalUpdateAgreementReply createPayPalUpdateAgreementReply() {
        return new PayPalUpdateAgreementReply();
    }

    /**
     * Create an instance of {@link PayPalCreateAgreementReply }
     * 
     * @return
     *     the new instance of {@link PayPalCreateAgreementReply }
     */
    public PayPalCreateAgreementReply createPayPalCreateAgreementReply() {
        return new PayPalCreateAgreementReply();
    }

    /**
     * Create an instance of {@link PayPalDoRefTransactionReply }
     * 
     * @return
     *     the new instance of {@link PayPalDoRefTransactionReply }
     */
    public PayPalDoRefTransactionReply createPayPalDoRefTransactionReply() {
        return new PayPalDoRefTransactionReply();
    }

    /**
     * Create an instance of {@link RiskUpdateReply }
     * 
     * @return
     *     the new instance of {@link RiskUpdateReply }
     */
    public RiskUpdateReply createRiskUpdateReply() {
        return new RiskUpdateReply();
    }

    /**
     * Create an instance of {@link FraudUpdateReply }
     * 
     * @return
     *     the new instance of {@link FraudUpdateReply }
     */
    public FraudUpdateReply createFraudUpdateReply() {
        return new FraudUpdateReply();
    }

    /**
     * Create an instance of {@link CaseManagementActionReply }
     * 
     * @return
     *     the new instance of {@link CaseManagementActionReply }
     */
    public CaseManagementActionReply createCaseManagementActionReply() {
        return new CaseManagementActionReply();
    }

    /**
     * Create an instance of {@link RuleResultItem }
     * 
     * @return
     *     the new instance of {@link RuleResultItem }
     */
    public RuleResultItem createRuleResultItem() {
        return new RuleResultItem();
    }

    /**
     * Create an instance of {@link RuleResultItems }
     * 
     * @return
     *     the new instance of {@link RuleResultItems }
     */
    public RuleResultItems createRuleResultItems() {
        return new RuleResultItems();
    }

    /**
     * Create an instance of {@link DecisionReply }
     * 
     * @return
     *     the new instance of {@link DecisionReply }
     */
    public DecisionReply createDecisionReply() {
        return new DecisionReply();
    }

    /**
     * Create an instance of {@link ProviderFields }
     * 
     * @return
     *     the new instance of {@link ProviderFields }
     */
    public ProviderFields createProviderFields() {
        return new ProviderFields();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     * @return
     *     the new instance of {@link Provider }
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link ProviderField }
     * 
     * @return
     *     the new instance of {@link ProviderField }
     */
    public ProviderField createProviderField() {
        return new ProviderField();
    }

    /**
     * Create an instance of {@link AdditionalFields }
     * 
     * @return
     *     the new instance of {@link AdditionalFields }
     */
    public AdditionalFields createAdditionalFields() {
        return new AdditionalFields();
    }

    /**
     * Create an instance of {@link Field }
     * 
     * @return
     *     the new instance of {@link Field }
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link MorphingElement }
     * 
     * @return
     *     the new instance of {@link MorphingElement }
     */
    public MorphingElement createMorphingElement() {
        return new MorphingElement();
    }

    /**
     * Create an instance of {@link Element }
     * 
     * @return
     *     the new instance of {@link Element }
     */
    public Element createElement() {
        return new Element();
    }

    /**
     * Create an instance of {@link VelocityCounts }
     * 
     * @return
     *     the new instance of {@link VelocityCounts }
     */
    public VelocityCounts createVelocityCounts() {
        return new VelocityCounts();
    }

    /**
     * Create an instance of {@link Travel }
     * 
     * @return
     *     the new instance of {@link Travel }
     */
    public Travel createTravel() {
        return new Travel();
    }

    /**
     * Create an instance of {@link DMEReply }
     * 
     * @return
     *     the new instance of {@link DMEReply }
     */
    public DMEReply createDMEReply() {
        return new DMEReply();
    }

    /**
     * Create an instance of {@link ProfileReply }
     * 
     * @return
     *     the new instance of {@link ProfileReply }
     */
    public ProfileReply createProfileReply() {
        return new ProfileReply();
    }

    /**
     * Create an instance of {@link CCDCCReply }
     * 
     * @return
     *     the new instance of {@link CCDCCReply }
     */
    public CCDCCReply createCCDCCReply() {
        return new CCDCCReply();
    }

    /**
     * Create an instance of {@link PaymentCurrencyOffer }
     * 
     * @return
     *     the new instance of {@link PaymentCurrencyOffer }
     */
    public PaymentCurrencyOffer createPaymentCurrencyOffer() {
        return new PaymentCurrencyOffer();
    }

    /**
     * Create an instance of {@link CCDCCUpdateReply }
     * 
     * @return
     *     the new instance of {@link CCDCCUpdateReply }
     */
    public CCDCCUpdateReply createCCDCCUpdateReply() {
        return new CCDCCUpdateReply();
    }

    /**
     * Create an instance of {@link ChinaPaymentReply }
     * 
     * @return
     *     the new instance of {@link ChinaPaymentReply }
     */
    public ChinaPaymentReply createChinaPaymentReply() {
        return new ChinaPaymentReply();
    }

    /**
     * Create an instance of {@link ChinaRefundReply }
     * 
     * @return
     *     the new instance of {@link ChinaRefundReply }
     */
    public ChinaRefundReply createChinaRefundReply() {
        return new ChinaRefundReply();
    }

    /**
     * Create an instance of {@link BoletoPaymentReply }
     * 
     * @return
     *     the new instance of {@link BoletoPaymentReply }
     */
    public BoletoPaymentReply createBoletoPaymentReply() {
        return new BoletoPaymentReply();
    }

    /**
     * Create an instance of {@link APInitiateReply }
     * 
     * @return
     *     the new instance of {@link APInitiateReply }
     */
    public APInitiateReply createAPInitiateReply() {
        return new APInitiateReply();
    }

    /**
     * Create an instance of {@link APCheckStatusReply }
     * 
     * @return
     *     the new instance of {@link APCheckStatusReply }
     */
    public APCheckStatusReply createAPCheckStatusReply() {
        return new APCheckStatusReply();
    }

    /**
     * Create an instance of {@link SellerProtection }
     * 
     * @return
     *     the new instance of {@link SellerProtection }
     */
    public SellerProtection createSellerProtection() {
        return new SellerProtection();
    }

    /**
     * Create an instance of {@link APReply }
     * 
     * @return
     *     the new instance of {@link APReply }
     */
    public APReply createAPReply() {
        return new APReply();
    }

    /**
     * Create an instance of {@link APAuthReply }
     * 
     * @return
     *     the new instance of {@link APAuthReply }
     */
    public APAuthReply createAPAuthReply() {
        return new APAuthReply();
    }

    /**
     * Create an instance of {@link APAuthReversalReply }
     * 
     * @return
     *     the new instance of {@link APAuthReversalReply }
     */
    public APAuthReversalReply createAPAuthReversalReply() {
        return new APAuthReversalReply();
    }

    /**
     * Create an instance of {@link APCaptureReply }
     * 
     * @return
     *     the new instance of {@link APCaptureReply }
     */
    public APCaptureReply createAPCaptureReply() {
        return new APCaptureReply();
    }

    /**
     * Create an instance of {@link APOptionsReply }
     * 
     * @return
     *     the new instance of {@link APOptionsReply }
     */
    public APOptionsReply createAPOptionsReply() {
        return new APOptionsReply();
    }

    /**
     * Create an instance of {@link APOptionsOption }
     * 
     * @return
     *     the new instance of {@link APOptionsOption }
     */
    public APOptionsOption createAPOptionsOption() {
        return new APOptionsOption();
    }

    /**
     * Create an instance of {@link APRefundReply }
     * 
     * @return
     *     the new instance of {@link APRefundReply }
     */
    public APRefundReply createAPRefundReply() {
        return new APRefundReply();
    }

    /**
     * Create an instance of {@link APSaleReply }
     * 
     * @return
     *     the new instance of {@link APSaleReply }
     */
    public APSaleReply createAPSaleReply() {
        return new APSaleReply();
    }

    /**
     * Create an instance of {@link APCheckOutDetailsReply }
     * 
     * @return
     *     the new instance of {@link APCheckOutDetailsReply }
     */
    public APCheckOutDetailsReply createAPCheckOutDetailsReply() {
        return new APCheckOutDetailsReply();
    }

    /**
     * Create an instance of {@link APTransactionDetailsReply }
     * 
     * @return
     *     the new instance of {@link APTransactionDetailsReply }
     */
    public APTransactionDetailsReply createAPTransactionDetailsReply() {
        return new APTransactionDetailsReply();
    }

    /**
     * Create an instance of {@link APConfirmPurchaseReply }
     * 
     * @return
     *     the new instance of {@link APConfirmPurchaseReply }
     */
    public APConfirmPurchaseReply createAPConfirmPurchaseReply() {
        return new APConfirmPurchaseReply();
    }

    /**
     * Create an instance of {@link APSessionsReply }
     * 
     * @return
     *     the new instance of {@link APSessionsReply }
     */
    public APSessionsReply createAPSessionsReply() {
        return new APSessionsReply();
    }

    /**
     * Create an instance of {@link CCCheckStatusReply }
     * 
     * @return
     *     the new instance of {@link CCCheckStatusReply }
     */
    public CCCheckStatusReply createCCCheckStatusReply() {
        return new CCCheckStatusReply();
    }

    /**
     * Create an instance of {@link AirlineData }
     * 
     * @return
     *     the new instance of {@link AirlineData }
     */
    public AirlineData createAirlineData() {
        return new AirlineData();
    }

    /**
     * Create an instance of {@link Leg }
     * 
     * @return
     *     the new instance of {@link Leg }
     */
    public Leg createLeg() {
        return new Leg();
    }

    /**
     * Create an instance of {@link AncillaryData }
     * 
     * @return
     *     the new instance of {@link AncillaryData }
     */
    public AncillaryData createAncillaryData() {
        return new AncillaryData();
    }

    /**
     * Create an instance of {@link Service }
     * 
     * @return
     *     the new instance of {@link Service }
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link LodgingData }
     * 
     * @return
     *     the new instance of {@link LodgingData }
     */
    public LodgingData createLodgingData() {
        return new LodgingData();
    }

    /**
     * Create an instance of {@link Pos }
     * 
     * @return
     *     the new instance of {@link Pos }
     */
    public Pos createPos() {
        return new Pos();
    }

    /**
     * Create an instance of {@link Pin }
     * 
     * @return
     *     the new instance of {@link Pin }
     */
    public Pin createPin() {
        return new Pin();
    }

    /**
     * Create an instance of {@link EncryptedPayment }
     * 
     * @return
     *     the new instance of {@link EncryptedPayment }
     */
    public EncryptedPayment createEncryptedPayment() {
        return new EncryptedPayment();
    }

    /**
     * Create an instance of {@link Installment }
     * 
     * @return
     *     the new instance of {@link Installment }
     */
    public Installment createInstallment() {
        return new Installment();
    }

    /**
     * Create an instance of {@link MDDField }
     * 
     * @return
     *     the new instance of {@link MDDField }
     */
    public MDDField createMDDField() {
        return new MDDField();
    }

    /**
     * Create an instance of {@link MerchantDefinedData }
     * 
     * @return
     *     the new instance of {@link MerchantDefinedData }
     */
    public MerchantDefinedData createMerchantDefinedData() {
        return new MerchantDefinedData();
    }

    /**
     * Create an instance of {@link AuxiliaryField }
     * 
     * @return
     *     the new instance of {@link AuxiliaryField }
     */
    public AuxiliaryField createAuxiliaryField() {
        return new AuxiliaryField();
    }

    /**
     * Create an instance of {@link AuxiliaryData }
     * 
     * @return
     *     the new instance of {@link AuxiliaryData }
     */
    public AuxiliaryData createAuxiliaryData() {
        return new AuxiliaryData();
    }

    /**
     * Create an instance of {@link MerchantSecureData }
     * 
     * @return
     *     the new instance of {@link MerchantSecureData }
     */
    public MerchantSecureData createMerchantSecureData() {
        return new MerchantSecureData();
    }

    /**
     * Create an instance of {@link ReplyReserved }
     * 
     * @return
     *     the new instance of {@link ReplyReserved }
     */
    public ReplyReserved createReplyReserved() {
        return new ReplyReserved();
    }

    /**
     * Create an instance of {@link RequestReserved }
     * 
     * @return
     *     the new instance of {@link RequestReserved }
     */
    public RequestReserved createRequestReserved() {
        return new RequestReserved();
    }

    /**
     * Create an instance of {@link PayPalGetTxnDetailsReply }
     * 
     * @return
     *     the new instance of {@link PayPalGetTxnDetailsReply }
     */
    public PayPalGetTxnDetailsReply createPayPalGetTxnDetailsReply() {
        return new PayPalGetTxnDetailsReply();
    }

    /**
     * Create an instance of {@link PayPalTransactionSearchReply }
     * 
     * @return
     *     the new instance of {@link PayPalTransactionSearchReply }
     */
    public PayPalTransactionSearchReply createPayPalTransactionSearchReply() {
        return new PayPalTransactionSearchReply();
    }

    /**
     * Create an instance of {@link PaypalTransaction }
     * 
     * @return
     *     the new instance of {@link PaypalTransaction }
     */
    public PaypalTransaction createPaypalTransaction() {
        return new PaypalTransaction();
    }

    /**
     * Create an instance of {@link CCDCCUpdateService }
     * 
     * @return
     *     the new instance of {@link CCDCCUpdateService }
     */
    public CCDCCUpdateService createCCDCCUpdateService() {
        return new CCDCCUpdateService();
    }

    /**
     * Create an instance of {@link ServiceFee }
     * 
     * @return
     *     the new instance of {@link ServiceFee }
     */
    public ServiceFee createServiceFee() {
        return new ServiceFee();
    }

    /**
     * Create an instance of {@link EmvRequest }
     * 
     * @return
     *     the new instance of {@link EmvRequest }
     */
    public EmvRequest createEmvRequest() {
        return new EmvRequest();
    }

    /**
     * Create an instance of {@link EmvReply }
     * 
     * @return
     *     the new instance of {@link EmvReply }
     */
    public EmvReply createEmvReply() {
        return new EmvReply();
    }

    /**
     * Create an instance of {@link OriginalTransaction }
     * 
     * @return
     *     the new instance of {@link OriginalTransaction }
     */
    public OriginalTransaction createOriginalTransaction() {
        return new OriginalTransaction();
    }

    /**
     * Create an instance of {@link HostedDataCreateService }
     * 
     * @return
     *     the new instance of {@link HostedDataCreateService }
     */
    public HostedDataCreateService createHostedDataCreateService() {
        return new HostedDataCreateService();
    }

    /**
     * Create an instance of {@link HostedDataRetrieveService }
     * 
     * @return
     *     the new instance of {@link HostedDataRetrieveService }
     */
    public HostedDataRetrieveService createHostedDataRetrieveService() {
        return new HostedDataRetrieveService();
    }

    /**
     * Create an instance of {@link HostedDataCreateReply }
     * 
     * @return
     *     the new instance of {@link HostedDataCreateReply }
     */
    public HostedDataCreateReply createHostedDataCreateReply() {
        return new HostedDataCreateReply();
    }

    /**
     * Create an instance of {@link HostedDataRetrieveReply }
     * 
     * @return
     *     the new instance of {@link HostedDataRetrieveReply }
     */
    public HostedDataRetrieveReply createHostedDataRetrieveReply() {
        return new HostedDataRetrieveReply();
    }

    /**
     * Create an instance of {@link AutoRentalData }
     * 
     * @return
     *     the new instance of {@link AutoRentalData }
     */
    public AutoRentalData createAutoRentalData() {
        return new AutoRentalData();
    }

    /**
     * Create an instance of {@link AutoRental }
     * 
     * @return
     *     the new instance of {@link AutoRental }
     */
    public AutoRental createAutoRental() {
        return new AutoRental();
    }

    /**
     * Create an instance of {@link AgencyInformation }
     * 
     * @return
     *     the new instance of {@link AgencyInformation }
     */
    public AgencyInformation createAgencyInformation() {
        return new AgencyInformation();
    }

    /**
     * Create an instance of {@link HealthCare }
     * 
     * @return
     *     the new instance of {@link HealthCare }
     */
    public HealthCare createHealthCare() {
        return new HealthCare();
    }

    /**
     * Create an instance of {@link VCReply }
     * 
     * @return
     *     the new instance of {@link VCReply }
     */
    public VCReply createVCReply() {
        return new VCReply();
    }

    /**
     * Create an instance of {@link VCCardArt }
     * 
     * @return
     *     the new instance of {@link VCCardArt }
     */
    public VCCardArt createVCCardArt() {
        return new VCCardArt();
    }

    /**
     * Create an instance of {@link VCCustomData }
     * 
     * @return
     *     the new instance of {@link VCCustomData }
     */
    public VCCustomData createVCCustomData() {
        return new VCCustomData();
    }

    /**
     * Create an instance of {@link DecryptVisaCheckoutDataReply }
     * 
     * @return
     *     the new instance of {@link DecryptVisaCheckoutDataReply }
     */
    public DecryptVisaCheckoutDataReply createDecryptVisaCheckoutDataReply() {
        return new DecryptVisaCheckoutDataReply();
    }

    /**
     * Create an instance of {@link GetVisaCheckoutDataReply }
     * 
     * @return
     *     the new instance of {@link GetVisaCheckoutDataReply }
     */
    public GetVisaCheckoutDataReply createGetVisaCheckoutDataReply() {
        return new GetVisaCheckoutDataReply();
    }

    /**
     * Create an instance of {@link EncryptPaymentDataReply }
     * 
     * @return
     *     the new instance of {@link EncryptPaymentDataReply }
     */
    public EncryptPaymentDataReply createEncryptPaymentDataReply() {
        return new EncryptPaymentDataReply();
    }

    /**
     * Create an instance of {@link BinLookupService }
     * 
     * @return
     *     the new instance of {@link BinLookupService }
     */
    public BinLookupService createBinLookupService() {
        return new BinLookupService();
    }

    /**
     * Create an instance of {@link BinLookupReply }
     * 
     * @return
     *     the new instance of {@link BinLookupReply }
     */
    public BinLookupReply createBinLookupReply() {
        return new BinLookupReply();
    }

    /**
     * Create an instance of {@link Issuer }
     * 
     * @return
     *     the new instance of {@link Issuer }
     */
    public Issuer createIssuer() {
        return new Issuer();
    }

    /**
     * Create an instance of {@link GETVisaCheckoutDataService }
     * 
     * @return
     *     the new instance of {@link GETVisaCheckoutDataService }
     */
    public GETVisaCheckoutDataService createGETVisaCheckoutDataService() {
        return new GETVisaCheckoutDataService();
    }

    /**
     * Create an instance of {@link TransactionMetadataService }
     * 
     * @return
     *     the new instance of {@link TransactionMetadataService }
     */
    public TransactionMetadataService createTransactionMetadataService() {
        return new TransactionMetadataService();
    }

    /**
     * Create an instance of {@link Loan }
     * 
     * @return
     *     the new instance of {@link Loan }
     */
    public Loan createLoan() {
        return new Loan();
    }

    /**
     * Create an instance of {@link APOrderService }
     * 
     * @return
     *     the new instance of {@link APOrderService }
     */
    public APOrderService createAPOrderService() {
        return new APOrderService();
    }

    /**
     * Create an instance of {@link APOrderReply }
     * 
     * @return
     *     the new instance of {@link APOrderReply }
     */
    public APOrderReply createAPOrderReply() {
        return new APOrderReply();
    }

    /**
     * Create an instance of {@link APCancelService }
     * 
     * @return
     *     the new instance of {@link APCancelService }
     */
    public APCancelService createAPCancelService() {
        return new APCancelService();
    }

    /**
     * Create an instance of {@link APCancelReply }
     * 
     * @return
     *     the new instance of {@link APCancelReply }
     */
    public APCancelReply createAPCancelReply() {
        return new APCancelReply();
    }

    /**
     * Create an instance of {@link APBillingAgreementService }
     * 
     * @return
     *     the new instance of {@link APBillingAgreementService }
     */
    public APBillingAgreementService createAPBillingAgreementService() {
        return new APBillingAgreementService();
    }

    /**
     * Create an instance of {@link APBillingAgreementReply }
     * 
     * @return
     *     the new instance of {@link APBillingAgreementReply }
     */
    public APBillingAgreementReply createAPBillingAgreementReply() {
        return new APBillingAgreementReply();
    }

    /**
     * Create an instance of {@link Passenger }
     * 
     * @return
     *     the new instance of {@link Passenger }
     */
    public Passenger createPassenger() {
        return new Passenger();
    }

    /**
     * Create an instance of {@link PostdatedTransaction }
     * 
     * @return
     *     the new instance of {@link PostdatedTransaction }
     */
    public PostdatedTransaction createPostdatedTransaction() {
        return new PostdatedTransaction();
    }

    /**
     * Create an instance of {@link APCreateMandateService }
     * 
     * @return
     *     the new instance of {@link APCreateMandateService }
     */
    public APCreateMandateService createAPCreateMandateService() {
        return new APCreateMandateService();
    }

    /**
     * Create an instance of {@link APCreateMandateReply }
     * 
     * @return
     *     the new instance of {@link APCreateMandateReply }
     */
    public APCreateMandateReply createAPCreateMandateReply() {
        return new APCreateMandateReply();
    }

    /**
     * Create an instance of {@link APMandateStatusService }
     * 
     * @return
     *     the new instance of {@link APMandateStatusService }
     */
    public APMandateStatusService createAPMandateStatusService() {
        return new APMandateStatusService();
    }

    /**
     * Create an instance of {@link APMandateStatusReply }
     * 
     * @return
     *     the new instance of {@link APMandateStatusReply }
     */
    public APMandateStatusReply createAPMandateStatusReply() {
        return new APMandateStatusReply();
    }

    /**
     * Create an instance of {@link APUpdateMandateService }
     * 
     * @return
     *     the new instance of {@link APUpdateMandateService }
     */
    public APUpdateMandateService createAPUpdateMandateService() {
        return new APUpdateMandateService();
    }

    /**
     * Create an instance of {@link GetMasterpassDataService }
     * 
     * @return
     *     the new instance of {@link GetMasterpassDataService }
     */
    public GetMasterpassDataService createGetMasterpassDataService() {
        return new GetMasterpassDataService();
    }

    /**
     * Create an instance of {@link GetMasterpassDataReply }
     * 
     * @return
     *     the new instance of {@link GetMasterpassDataReply }
     */
    public GetMasterpassDataReply createGetMasterpassDataReply() {
        return new GetMasterpassDataReply();
    }

    /**
     * Create an instance of {@link APUpdateMandateReply }
     * 
     * @return
     *     the new instance of {@link APUpdateMandateReply }
     */
    public APUpdateMandateReply createAPUpdateMandateReply() {
        return new APUpdateMandateReply();
    }

    /**
     * Create an instance of {@link APImportMandateReply }
     * 
     * @return
     *     the new instance of {@link APImportMandateReply }
     */
    public APImportMandateReply createAPImportMandateReply() {
        return new APImportMandateReply();
    }

    /**
     * Create an instance of {@link APRevokeMandateService }
     * 
     * @return
     *     the new instance of {@link APRevokeMandateService }
     */
    public APRevokeMandateService createAPRevokeMandateService() {
        return new APRevokeMandateService();
    }

    /**
     * Create an instance of {@link APRevokeMandateReply }
     * 
     * @return
     *     the new instance of {@link APRevokeMandateReply }
     */
    public APRevokeMandateReply createAPRevokeMandateReply() {
        return new APRevokeMandateReply();
    }

    /**
     * Create an instance of {@link Category }
     * 
     * @return
     *     the new instance of {@link Category }
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link ECAVSService }
     * 
     * @return
     *     the new instance of {@link ECAVSService }
     */
    public ECAVSService createECAVSService() {
        return new ECAVSService();
    }

    /**
     * Create an instance of {@link GiftCardActivationService }
     * 
     * @return
     *     the new instance of {@link GiftCardActivationService }
     */
    public GiftCardActivationService createGiftCardActivationService() {
        return new GiftCardActivationService();
    }

    /**
     * Create an instance of {@link GiftCardBalanceInquiryService }
     * 
     * @return
     *     the new instance of {@link GiftCardBalanceInquiryService }
     */
    public GiftCardBalanceInquiryService createGiftCardBalanceInquiryService() {
        return new GiftCardBalanceInquiryService();
    }

    /**
     * Create an instance of {@link GiftCardVoidService }
     * 
     * @return
     *     the new instance of {@link GiftCardVoidService }
     */
    public GiftCardVoidService createGiftCardVoidService() {
        return new GiftCardVoidService();
    }

    /**
     * Create an instance of {@link GiftCardReversalService }
     * 
     * @return
     *     the new instance of {@link GiftCardReversalService }
     */
    public GiftCardReversalService createGiftCardReversalService() {
        return new GiftCardReversalService();
    }

    /**
     * Create an instance of {@link GiftCardRedemptionService }
     * 
     * @return
     *     the new instance of {@link GiftCardRedemptionService }
     */
    public GiftCardRedemptionService createGiftCardRedemptionService() {
        return new GiftCardRedemptionService();
    }

    /**
     * Create an instance of {@link GiftCardReloadService }
     * 
     * @return
     *     the new instance of {@link GiftCardReloadService }
     */
    public GiftCardReloadService createGiftCardReloadService() {
        return new GiftCardReloadService();
    }

    /**
     * Create an instance of {@link GiftCardRefundService }
     * 
     * @return
     *     the new instance of {@link GiftCardRefundService }
     */
    public GiftCardRefundService createGiftCardRefundService() {
        return new GiftCardRefundService();
    }

    /**
     * Create an instance of {@link GiftCard }
     * 
     * @return
     *     the new instance of {@link GiftCard }
     */
    public GiftCard createGiftCard() {
        return new GiftCard();
    }

    /**
     * Create an instance of {@link GiftCardActivationReply }
     * 
     * @return
     *     the new instance of {@link GiftCardActivationReply }
     */
    public GiftCardActivationReply createGiftCardActivationReply() {
        return new GiftCardActivationReply();
    }

    /**
     * Create an instance of {@link GiftCardBalanceInquiryReply }
     * 
     * @return
     *     the new instance of {@link GiftCardBalanceInquiryReply }
     */
    public GiftCardBalanceInquiryReply createGiftCardBalanceInquiryReply() {
        return new GiftCardBalanceInquiryReply();
    }

    /**
     * Create an instance of {@link GiftCardRedemptionReply }
     * 
     * @return
     *     the new instance of {@link GiftCardRedemptionReply }
     */
    public GiftCardRedemptionReply createGiftCardRedemptionReply() {
        return new GiftCardRedemptionReply();
    }

    /**
     * Create an instance of {@link GiftCardReversalReply }
     * 
     * @return
     *     the new instance of {@link GiftCardReversalReply }
     */
    public GiftCardReversalReply createGiftCardReversalReply() {
        return new GiftCardReversalReply();
    }

    /**
     * Create an instance of {@link GiftCardVoidReply }
     * 
     * @return
     *     the new instance of {@link GiftCardVoidReply }
     */
    public GiftCardVoidReply createGiftCardVoidReply() {
        return new GiftCardVoidReply();
    }

    /**
     * Create an instance of {@link GiftCardReloadReply }
     * 
     * @return
     *     the new instance of {@link GiftCardReloadReply }
     */
    public GiftCardReloadReply createGiftCardReloadReply() {
        return new GiftCardReloadReply();
    }

    /**
     * Create an instance of {@link GiftCardRefundReply }
     * 
     * @return
     *     the new instance of {@link GiftCardRefundReply }
     */
    public GiftCardRefundReply createGiftCardRefundReply() {
        return new GiftCardRefundReply();
    }

    /**
     * Create an instance of {@link MPOS }
     * 
     * @return
     *     the new instance of {@link MPOS }
     */
    public MPOS createMPOS() {
        return new MPOS();
    }

    /**
     * Create an instance of {@link AbortService }
     * 
     * @return
     *     the new instance of {@link AbortService }
     */
    public AbortService createAbortService() {
        return new AbortService();
    }

    /**
     * Create an instance of {@link AbortReply }
     * 
     * @return
     *     the new instance of {@link AbortReply }
     */
    public AbortReply createAbortReply() {
        return new AbortReply();
    }

    /**
     * Create an instance of {@link Merchant }
     * 
     * @return
     *     the new instance of {@link Merchant }
     */
    public Merchant createMerchant() {
        return new Merchant();
    }

    /**
     * Create an instance of {@link DecisionEarlyReply }
     * 
     * @return
     *     the new instance of {@link DecisionEarlyReply }
     */
    public DecisionEarlyReply createDecisionEarlyReply() {
        return new DecisionEarlyReply();
    }

    /**
     * Create an instance of {@link ProfileReplyEarly }
     * 
     * @return
     *     the new instance of {@link ProfileReplyEarly }
     */
    public ProfileReplyEarly createProfileReplyEarly() {
        return new ProfileReplyEarly();
    }

    /**
     * Create an instance of {@link VelocityCountsEarly }
     * 
     * @return
     *     the new instance of {@link VelocityCountsEarly }
     */
    public VelocityCountsEarly createVelocityCountsEarly() {
        return new VelocityCountsEarly();
    }

    /**
     * Create an instance of {@link VelocityElement }
     * 
     * @return
     *     the new instance of {@link VelocityElement }
     */
    public VelocityElement createVelocityElement() {
        return new VelocityElement();
    }

    /**
     * Create an instance of {@link PauseRuleResultItems }
     * 
     * @return
     *     the new instance of {@link PauseRuleResultItems }
     */
    public PauseRuleResultItems createPauseRuleResultItems() {
        return new PauseRuleResultItems();
    }

    /**
     * Create an instance of {@link PauseRuleResultItem }
     * 
     * @return
     *     the new instance of {@link PauseRuleResultItem }
     */
    public PauseRuleResultItem createPauseRuleResultItem() {
        return new PauseRuleResultItem();
    }

    /**
     * Create an instance of {@link PayByPoints }
     * 
     * @return
     *     the new instance of {@link PayByPoints }
     */
    public PayByPoints createPayByPoints() {
        return new PayByPoints();
    }

    /**
     * Create an instance of {@link Recurring }
     * 
     * @return
     *     the new instance of {@link Recurring }
     */
    public Recurring createRecurring() {
        return new Recurring();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     * @return
     *     the new instance of {@link Customer }
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link VehicleData }
     * 
     * @return
     *     the new instance of {@link VehicleData }
     */
    public VehicleData createVehicleData() {
        return new VehicleData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "urn:schemas-cybersource-com:transaction-data-1.219", name = "requestMessage")
    public JAXBElement<RequestMessage> createRequestMessage(RequestMessage value) {
        return new JAXBElement<>(_RequestMessage_QNAME, RequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyMessage }{@code >}
     */
    @XmlElementDecl(namespace = "urn:schemas-cybersource-com:transaction-data-1.219", name = "replyMessage")
    public JAXBElement<ReplyMessage> createReplyMessage(ReplyMessage value) {
        return new JAXBElement<>(_ReplyMessage_QNAME, ReplyMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:schemas-cybersource-com:transaction-data-1.219", name = "nvpRequest")
    public JAXBElement<String> createNvpRequest(String value) {
        return new JAXBElement<>(_NvpRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:schemas-cybersource-com:transaction-data-1.219", name = "nvpReply")
    public JAXBElement<String> createNvpReply(String value) {
        return new JAXBElement<>(_NvpReply_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultDetails }{@code >}
     */
    @XmlElementDecl(namespace = "urn:schemas-cybersource-com:transaction-data-1.219", name = "faultDetails")
    public JAXBElement<FaultDetails> createFaultDetails(FaultDetails value) {
        return new JAXBElement<>(_FaultDetails_QNAME, FaultDetails.class, null, value);
    }

}
