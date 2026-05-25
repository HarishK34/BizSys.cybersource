
package com.cybersource.stub;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCAuthService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CCAuthService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cavvAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="networkTokenCryptogram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paSpecificationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="directoryServerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="threeDSServerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="acsServerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="eciRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="avsLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fxQuoteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnAuthRecord" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="authType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="verbalAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="billPayment" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="authenticationXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authorizationXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="industryDatatype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="traceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="checksumKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="aggregatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="aggregatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="splitTenderIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="veresEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paresStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="partialAuthIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="captureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="firstRecurringPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="overridePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mobileRemotePaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardholderVerificationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dccRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="overridePaymentDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardholderAuthenticationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="leastCostRouting" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="verificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cryptocurrencyPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lowValueExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="riskAnalysisExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="trustedMerchantExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="secureCorporatePaymentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deferredAuthIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="aggregatedAuthIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="debtRecoveryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="delegatedAuthenticationExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transitTransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transportationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="totaloffersCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="effectiveAuthenticationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paChallengeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paresStatusReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="challengeCancelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paNetworkScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paAuthenticationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationOutageExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="verificationResultsPassportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="verificationResultsPersonalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="verificationResultsDriversLicenseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="verificationResultsBuyerRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="delegatedAuthenticationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentNetworkTransactionInformation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="29" minOccurs="0"/>
 *         <element name="transactionReason" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
 *         <element name="panReturnIndicator" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         <element name="cashAdvanceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="splitPaymentTransaction" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" maxOccurs="0" minOccurs="0"/>
 *         <element name="cardVerificationIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="exemptionDataRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transactionFlowIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="networkPartnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="acquirerMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantVerificationValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="run" use="required" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCAuthService", propOrder = {
    "cavv",
    "cavvAlgorithm",
    "networkTokenCryptogram",
    "paSpecificationVersion",
    "directoryServerTransactionID",
    "threeDSServerTransactionID",
    "acsServerTransactionID",
    "commerceIndicator",
    "eciRaw",
    "xid",
    "reconciliationID",
    "avsLevel",
    "fxQuoteID",
    "returnAuthRecord",
    "authType",
    "verbalAuthCode",
    "billPayment",
    "authenticationXID",
    "authorizationXID",
    "industryDatatype",
    "traceNumber",
    "checksumKey",
    "aggregatorID",
    "aggregatorName",
    "splitTenderIndicator",
    "veresEnrolled",
    "paresStatus",
    "partialAuthIndicator",
    "captureDate",
    "firstRecurringPayment",
    "duration",
    "overridePaymentMethod",
    "mobileRemotePaymentType",
    "cardholderVerificationMethod",
    "dccRequestID",
    "overridePaymentDetails",
    "cardholderAuthenticationMethod",
    "leastCostRouting",
    "verificationType",
    "cryptocurrencyPurchase",
    "lowValueExemptionIndicator",
    "riskAnalysisExemptionIndicator",
    "trustedMerchantExemptionIndicator",
    "secureCorporatePaymentIndicator",
    "deferredAuthIndicator",
    "aggregatedAuthIndicator",
    "debtRecoveryIndicator",
    "delegatedAuthenticationExemptionIndicator",
    "transitTransactionType",
    "transportationMode",
    "totaloffersCount",
    "effectiveAuthenticationType",
    "paChallengeCode",
    "paresStatusReason",
    "challengeCancelCode",
    "paNetworkScore",
    "paAuthenticationDate",
    "authenticationOutageExemptionIndicator",
    "verificationResultsPassportNumber",
    "verificationResultsPersonalId",
    "verificationResultsDriversLicenseNo",
    "verificationResultsBuyerRegistration",
    "delegatedAuthenticationResult",
    "paymentNetworkTransactionInformation",
    "transactionReason",
    "cashAdvanceIndicator",
    "cardVerificationIndicator",
    "exemptionDataRaw",
    "transactionFlowIndicator",
    "networkPartnerId",
    "acquirerMerchantId"
})
public class CCAuthService {

    protected String cavv;
    protected String cavvAlgorithm;
    protected String networkTokenCryptogram;
    protected String paSpecificationVersion;
    protected String directoryServerTransactionID;
    protected String threeDSServerTransactionID;
    protected String acsServerTransactionID;
    protected String commerceIndicator;
    protected String eciRaw;
    protected String xid;
    protected String reconciliationID;
    protected String avsLevel;
    protected String fxQuoteID;
    protected String returnAuthRecord;
    protected String authType;
    protected String verbalAuthCode;
    protected String billPayment;
    protected String authenticationXID;
    protected String authorizationXID;
    protected String industryDatatype;
    protected String traceNumber;
    protected String checksumKey;
    protected String aggregatorID;
    protected String aggregatorName;
    protected String splitTenderIndicator;
    protected String veresEnrolled;
    protected String paresStatus;
    protected String partialAuthIndicator;
    protected String captureDate;
    protected String firstRecurringPayment;
    protected BigInteger duration;
    protected String overridePaymentMethod;
    protected String mobileRemotePaymentType;
    protected String cardholderVerificationMethod;
    protected String dccRequestID;
    protected String overridePaymentDetails;
    protected String cardholderAuthenticationMethod;
    protected String leastCostRouting;
    protected String verificationType;
    protected String cryptocurrencyPurchase;
    protected String lowValueExemptionIndicator;
    protected String riskAnalysisExemptionIndicator;
    protected String trustedMerchantExemptionIndicator;
    protected String secureCorporatePaymentIndicator;
    protected String deferredAuthIndicator;
    protected String aggregatedAuthIndicator;
    protected String debtRecoveryIndicator;
    protected String delegatedAuthenticationExemptionIndicator;
    protected String transitTransactionType;
    protected String transportationMode;
    protected String totaloffersCount;
    protected String effectiveAuthenticationType;
    protected String paChallengeCode;
    protected String paresStatusReason;
    protected String challengeCancelCode;
    protected String paNetworkScore;
    protected String paAuthenticationDate;
    protected String authenticationOutageExemptionIndicator;
    protected String verificationResultsPassportNumber;
    protected String verificationResultsPersonalId;
    protected String verificationResultsDriversLicenseNo;
    protected String verificationResultsBuyerRegistration;
    protected String delegatedAuthenticationResult;
    protected List<String> paymentNetworkTransactionInformation;
    protected List<String> transactionReason;
    protected String cashAdvanceIndicator;
    protected String cardVerificationIndicator;
    protected String exemptionDataRaw;
    protected String transactionFlowIndicator;
    protected String networkPartnerId;
    protected String acquirerMerchantId;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the cavv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * Sets the value of the cavv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavv(String value) {
        this.cavv = value;
    }

    /**
     * Gets the value of the cavvAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavvAlgorithm() {
        return cavvAlgorithm;
    }

    /**
     * Sets the value of the cavvAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavvAlgorithm(String value) {
        this.cavvAlgorithm = value;
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
     * Gets the value of the paSpecificationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaSpecificationVersion() {
        return paSpecificationVersion;
    }

    /**
     * Sets the value of the paSpecificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaSpecificationVersion(String value) {
        this.paSpecificationVersion = value;
    }

    /**
     * Gets the value of the directoryServerTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryServerTransactionID() {
        return directoryServerTransactionID;
    }

    /**
     * Sets the value of the directoryServerTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryServerTransactionID(String value) {
        this.directoryServerTransactionID = value;
    }

    /**
     * Gets the value of the threeDSServerTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSServerTransactionID() {
        return threeDSServerTransactionID;
    }

    /**
     * Sets the value of the threeDSServerTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSServerTransactionID(String value) {
        this.threeDSServerTransactionID = value;
    }

    /**
     * Gets the value of the acsServerTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsServerTransactionID() {
        return acsServerTransactionID;
    }

    /**
     * Sets the value of the acsServerTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsServerTransactionID(String value) {
        this.acsServerTransactionID = value;
    }

    /**
     * Gets the value of the commerceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceIndicator() {
        return commerceIndicator;
    }

    /**
     * Sets the value of the commerceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceIndicator(String value) {
        this.commerceIndicator = value;
    }

    /**
     * Gets the value of the eciRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEciRaw() {
        return eciRaw;
    }

    /**
     * Sets the value of the eciRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEciRaw(String value) {
        this.eciRaw = value;
    }

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXid() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXid(String value) {
        this.xid = value;
    }

    /**
     * Gets the value of the reconciliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Sets the value of the reconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
    }

    /**
     * Gets the value of the avsLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsLevel() {
        return avsLevel;
    }

    /**
     * Sets the value of the avsLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsLevel(String value) {
        this.avsLevel = value;
    }

    /**
     * Gets the value of the fxQuoteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteID() {
        return fxQuoteID;
    }

    /**
     * Sets the value of the fxQuoteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteID(String value) {
        this.fxQuoteID = value;
    }

    /**
     * Gets the value of the returnAuthRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAuthRecord() {
        return returnAuthRecord;
    }

    /**
     * Sets the value of the returnAuthRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAuthRecord(String value) {
        this.returnAuthRecord = value;
    }

    /**
     * Gets the value of the authType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * Sets the value of the authType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthType(String value) {
        this.authType = value;
    }

    /**
     * Gets the value of the verbalAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbalAuthCode() {
        return verbalAuthCode;
    }

    /**
     * Sets the value of the verbalAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbalAuthCode(String value) {
        this.verbalAuthCode = value;
    }

    /**
     * Gets the value of the billPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPayment() {
        return billPayment;
    }

    /**
     * Sets the value of the billPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPayment(String value) {
        this.billPayment = value;
    }

    /**
     * Gets the value of the authenticationXID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationXID() {
        return authenticationXID;
    }

    /**
     * Sets the value of the authenticationXID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationXID(String value) {
        this.authenticationXID = value;
    }

    /**
     * Gets the value of the authorizationXID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationXID() {
        return authorizationXID;
    }

    /**
     * Sets the value of the authorizationXID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationXID(String value) {
        this.authorizationXID = value;
    }

    /**
     * Gets the value of the industryDatatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryDatatype() {
        return industryDatatype;
    }

    /**
     * Sets the value of the industryDatatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryDatatype(String value) {
        this.industryDatatype = value;
    }

    /**
     * Gets the value of the traceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceNumber() {
        return traceNumber;
    }

    /**
     * Sets the value of the traceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceNumber(String value) {
        this.traceNumber = value;
    }

    /**
     * Gets the value of the checksumKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksumKey() {
        return checksumKey;
    }

    /**
     * Sets the value of the checksumKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksumKey(String value) {
        this.checksumKey = value;
    }

    /**
     * Gets the value of the aggregatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorID() {
        return aggregatorID;
    }

    /**
     * Sets the value of the aggregatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorID(String value) {
        this.aggregatorID = value;
    }

    /**
     * Gets the value of the aggregatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorName() {
        return aggregatorName;
    }

    /**
     * Sets the value of the aggregatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorName(String value) {
        this.aggregatorName = value;
    }

    /**
     * Gets the value of the splitTenderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitTenderIndicator() {
        return splitTenderIndicator;
    }

    /**
     * Sets the value of the splitTenderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitTenderIndicator(String value) {
        this.splitTenderIndicator = value;
    }

    /**
     * Gets the value of the veresEnrolled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeresEnrolled() {
        return veresEnrolled;
    }

    /**
     * Sets the value of the veresEnrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeresEnrolled(String value) {
        this.veresEnrolled = value;
    }

    /**
     * Gets the value of the paresStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParesStatus() {
        return paresStatus;
    }

    /**
     * Sets the value of the paresStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParesStatus(String value) {
        this.paresStatus = value;
    }

    /**
     * Gets the value of the partialAuthIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialAuthIndicator() {
        return partialAuthIndicator;
    }

    /**
     * Sets the value of the partialAuthIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialAuthIndicator(String value) {
        this.partialAuthIndicator = value;
    }

    /**
     * Gets the value of the captureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureDate() {
        return captureDate;
    }

    /**
     * Sets the value of the captureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureDate(String value) {
        this.captureDate = value;
    }

    /**
     * Gets the value of the firstRecurringPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstRecurringPayment() {
        return firstRecurringPayment;
    }

    /**
     * Sets the value of the firstRecurringPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstRecurringPayment(String value) {
        this.firstRecurringPayment = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
    }

    /**
     * Gets the value of the overridePaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridePaymentMethod() {
        return overridePaymentMethod;
    }

    /**
     * Sets the value of the overridePaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridePaymentMethod(String value) {
        this.overridePaymentMethod = value;
    }

    /**
     * Gets the value of the mobileRemotePaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileRemotePaymentType() {
        return mobileRemotePaymentType;
    }

    /**
     * Sets the value of the mobileRemotePaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileRemotePaymentType(String value) {
        this.mobileRemotePaymentType = value;
    }

    /**
     * Gets the value of the cardholderVerificationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderVerificationMethod() {
        return cardholderVerificationMethod;
    }

    /**
     * Sets the value of the cardholderVerificationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderVerificationMethod(String value) {
        this.cardholderVerificationMethod = value;
    }

    /**
     * Gets the value of the dccRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccRequestID() {
        return dccRequestID;
    }

    /**
     * Sets the value of the dccRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccRequestID(String value) {
        this.dccRequestID = value;
    }

    /**
     * Gets the value of the overridePaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridePaymentDetails() {
        return overridePaymentDetails;
    }

    /**
     * Sets the value of the overridePaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridePaymentDetails(String value) {
        this.overridePaymentDetails = value;
    }

    /**
     * Gets the value of the cardholderAuthenticationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderAuthenticationMethod() {
        return cardholderAuthenticationMethod;
    }

    /**
     * Sets the value of the cardholderAuthenticationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderAuthenticationMethod(String value) {
        this.cardholderAuthenticationMethod = value;
    }

    /**
     * Gets the value of the leastCostRouting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeastCostRouting() {
        return leastCostRouting;
    }

    /**
     * Sets the value of the leastCostRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeastCostRouting(String value) {
        this.leastCostRouting = value;
    }

    /**
     * Gets the value of the verificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationType() {
        return verificationType;
    }

    /**
     * Sets the value of the verificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationType(String value) {
        this.verificationType = value;
    }

    /**
     * Gets the value of the cryptocurrencyPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptocurrencyPurchase() {
        return cryptocurrencyPurchase;
    }

    /**
     * Sets the value of the cryptocurrencyPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptocurrencyPurchase(String value) {
        this.cryptocurrencyPurchase = value;
    }

    /**
     * Gets the value of the lowValueExemptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowValueExemptionIndicator() {
        return lowValueExemptionIndicator;
    }

    /**
     * Sets the value of the lowValueExemptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowValueExemptionIndicator(String value) {
        this.lowValueExemptionIndicator = value;
    }

    /**
     * Gets the value of the riskAnalysisExemptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskAnalysisExemptionIndicator() {
        return riskAnalysisExemptionIndicator;
    }

    /**
     * Sets the value of the riskAnalysisExemptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskAnalysisExemptionIndicator(String value) {
        this.riskAnalysisExemptionIndicator = value;
    }

    /**
     * Gets the value of the trustedMerchantExemptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustedMerchantExemptionIndicator() {
        return trustedMerchantExemptionIndicator;
    }

    /**
     * Sets the value of the trustedMerchantExemptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustedMerchantExemptionIndicator(String value) {
        this.trustedMerchantExemptionIndicator = value;
    }

    /**
     * Gets the value of the secureCorporatePaymentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureCorporatePaymentIndicator() {
        return secureCorporatePaymentIndicator;
    }

    /**
     * Sets the value of the secureCorporatePaymentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureCorporatePaymentIndicator(String value) {
        this.secureCorporatePaymentIndicator = value;
    }

    /**
     * Gets the value of the deferredAuthIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeferredAuthIndicator() {
        return deferredAuthIndicator;
    }

    /**
     * Sets the value of the deferredAuthIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeferredAuthIndicator(String value) {
        this.deferredAuthIndicator = value;
    }

    /**
     * Gets the value of the aggregatedAuthIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatedAuthIndicator() {
        return aggregatedAuthIndicator;
    }

    /**
     * Sets the value of the aggregatedAuthIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatedAuthIndicator(String value) {
        this.aggregatedAuthIndicator = value;
    }

    /**
     * Gets the value of the debtRecoveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtRecoveryIndicator() {
        return debtRecoveryIndicator;
    }

    /**
     * Sets the value of the debtRecoveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtRecoveryIndicator(String value) {
        this.debtRecoveryIndicator = value;
    }

    /**
     * Gets the value of the delegatedAuthenticationExemptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatedAuthenticationExemptionIndicator() {
        return delegatedAuthenticationExemptionIndicator;
    }

    /**
     * Sets the value of the delegatedAuthenticationExemptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatedAuthenticationExemptionIndicator(String value) {
        this.delegatedAuthenticationExemptionIndicator = value;
    }

    /**
     * Gets the value of the transitTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitTransactionType() {
        return transitTransactionType;
    }

    /**
     * Sets the value of the transitTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitTransactionType(String value) {
        this.transitTransactionType = value;
    }

    /**
     * Gets the value of the transportationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationMode() {
        return transportationMode;
    }

    /**
     * Sets the value of the transportationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationMode(String value) {
        this.transportationMode = value;
    }

    /**
     * Gets the value of the totaloffersCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotaloffersCount() {
        return totaloffersCount;
    }

    /**
     * Sets the value of the totaloffersCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotaloffersCount(String value) {
        this.totaloffersCount = value;
    }

    /**
     * Gets the value of the effectiveAuthenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveAuthenticationType() {
        return effectiveAuthenticationType;
    }

    /**
     * Sets the value of the effectiveAuthenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveAuthenticationType(String value) {
        this.effectiveAuthenticationType = value;
    }

    /**
     * Gets the value of the paChallengeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaChallengeCode() {
        return paChallengeCode;
    }

    /**
     * Sets the value of the paChallengeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaChallengeCode(String value) {
        this.paChallengeCode = value;
    }

    /**
     * Gets the value of the paresStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParesStatusReason() {
        return paresStatusReason;
    }

    /**
     * Sets the value of the paresStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParesStatusReason(String value) {
        this.paresStatusReason = value;
    }

    /**
     * Gets the value of the challengeCancelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeCancelCode() {
        return challengeCancelCode;
    }

    /**
     * Sets the value of the challengeCancelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeCancelCode(String value) {
        this.challengeCancelCode = value;
    }

    /**
     * Gets the value of the paNetworkScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaNetworkScore() {
        return paNetworkScore;
    }

    /**
     * Sets the value of the paNetworkScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaNetworkScore(String value) {
        this.paNetworkScore = value;
    }

    /**
     * Gets the value of the paAuthenticationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaAuthenticationDate() {
        return paAuthenticationDate;
    }

    /**
     * Sets the value of the paAuthenticationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaAuthenticationDate(String value) {
        this.paAuthenticationDate = value;
    }

    /**
     * Gets the value of the authenticationOutageExemptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationOutageExemptionIndicator() {
        return authenticationOutageExemptionIndicator;
    }

    /**
     * Sets the value of the authenticationOutageExemptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationOutageExemptionIndicator(String value) {
        this.authenticationOutageExemptionIndicator = value;
    }

    /**
     * Gets the value of the verificationResultsPassportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationResultsPassportNumber() {
        return verificationResultsPassportNumber;
    }

    /**
     * Sets the value of the verificationResultsPassportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationResultsPassportNumber(String value) {
        this.verificationResultsPassportNumber = value;
    }

    /**
     * Gets the value of the verificationResultsPersonalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationResultsPersonalId() {
        return verificationResultsPersonalId;
    }

    /**
     * Sets the value of the verificationResultsPersonalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationResultsPersonalId(String value) {
        this.verificationResultsPersonalId = value;
    }

    /**
     * Gets the value of the verificationResultsDriversLicenseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationResultsDriversLicenseNo() {
        return verificationResultsDriversLicenseNo;
    }

    /**
     * Sets the value of the verificationResultsDriversLicenseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationResultsDriversLicenseNo(String value) {
        this.verificationResultsDriversLicenseNo = value;
    }

    /**
     * Gets the value of the verificationResultsBuyerRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationResultsBuyerRegistration() {
        return verificationResultsBuyerRegistration;
    }

    /**
     * Sets the value of the verificationResultsBuyerRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationResultsBuyerRegistration(String value) {
        this.verificationResultsBuyerRegistration = value;
    }

    /**
     * Gets the value of the delegatedAuthenticationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatedAuthenticationResult() {
        return delegatedAuthenticationResult;
    }

    /**
     * Sets the value of the delegatedAuthenticationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatedAuthenticationResult(String value) {
        this.delegatedAuthenticationResult = value;
    }

    /**
     * Gets the value of the paymentNetworkTransactionInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentNetworkTransactionInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentNetworkTransactionInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentNetworkTransactionInformation property.
     */
    public List<String> getPaymentNetworkTransactionInformation() {
        if (paymentNetworkTransactionInformation == null) {
            paymentNetworkTransactionInformation = new ArrayList<>();
        }
        return this.paymentNetworkTransactionInformation;
    }

    /**
     * Gets the value of the transactionReason property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionReason property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTransactionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the transactionReason property.
     */
    public List<String> getTransactionReason() {
        if (transactionReason == null) {
            transactionReason = new ArrayList<>();
        }
        return this.transactionReason;
    }

    /**
     * Gets the value of the cashAdvanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashAdvanceIndicator() {
        return cashAdvanceIndicator;
    }

    /**
     * Sets the value of the cashAdvanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashAdvanceIndicator(String value) {
        this.cashAdvanceIndicator = value;
    }

    /**
     * Gets the value of the cardVerificationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardVerificationIndicator() {
        return cardVerificationIndicator;
    }

    /**
     * Sets the value of the cardVerificationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardVerificationIndicator(String value) {
        this.cardVerificationIndicator = value;
    }

    /**
     * Gets the value of the exemptionDataRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionDataRaw() {
        return exemptionDataRaw;
    }

    /**
     * Sets the value of the exemptionDataRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionDataRaw(String value) {
        this.exemptionDataRaw = value;
    }

    /**
     * Gets the value of the transactionFlowIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionFlowIndicator() {
        return transactionFlowIndicator;
    }

    /**
     * Sets the value of the transactionFlowIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionFlowIndicator(String value) {
        this.transactionFlowIndicator = value;
    }

    /**
     * Gets the value of the networkPartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkPartnerId() {
        return networkPartnerId;
    }

    /**
     * Sets the value of the networkPartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkPartnerId(String value) {
        this.networkPartnerId = value;
    }

    /**
     * Gets the value of the acquirerMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerMerchantId() {
        return acquirerMerchantId;
    }

    /**
     * Sets the value of the acquirerMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerMerchantId(String value) {
        this.acquirerMerchantId = value;
    }

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRun(String value) {
        this.run = value;
    }

}
