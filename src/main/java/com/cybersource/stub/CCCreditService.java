
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCCreditService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CCCreditService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="captureRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="partialPaymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="purchasingLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="industryDatatype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="billPayment" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="authorizationXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="occurrenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="captureRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="checksumKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="aggregatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="aggregatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="dpdeBillingMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="reconciliationIDAlternate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="refundReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="overridePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="overridePaymentDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="networkPartnerId" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedString" minOccurs="0"/>
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
@XmlType(name = "CCCreditService", propOrder = {
    "captureRequestID",
    "reconciliationID",
    "partialPaymentID",
    "purchasingLevel",
    "industryDatatype",
    "commerceIndicator",
    "billPayment",
    "authorizationXID",
    "occurrenceNumber",
    "authCode",
    "captureRequestToken",
    "merchantReceiptNumber",
    "checksumKey",
    "aggregatorID",
    "aggregatorName",
    "duration",
    "dpdeBillingMonth",
    "reconciliationIDAlternate",
    "refundReason",
    "overridePaymentMethod",
    "overridePaymentDetails",
    "networkPartnerId"
})
public class CCCreditService {

    protected String captureRequestID;
    protected String reconciliationID;
    protected String partialPaymentID;
    protected String purchasingLevel;
    protected String industryDatatype;
    protected String commerceIndicator;
    protected String billPayment;
    protected String authorizationXID;
    protected String occurrenceNumber;
    protected String authCode;
    protected String captureRequestToken;
    protected String merchantReceiptNumber;
    protected String checksumKey;
    protected String aggregatorID;
    protected String aggregatorName;
    protected BigInteger duration;
    protected BigInteger dpdeBillingMonth;
    protected String reconciliationIDAlternate;
    protected String refundReason;
    protected String overridePaymentMethod;
    protected String overridePaymentDetails;
    protected String networkPartnerId;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the captureRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureRequestID() {
        return captureRequestID;
    }

    /**
     * Sets the value of the captureRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureRequestID(String value) {
        this.captureRequestID = value;
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
     * Gets the value of the partialPaymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialPaymentID() {
        return partialPaymentID;
    }

    /**
     * Sets the value of the partialPaymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialPaymentID(String value) {
        this.partialPaymentID = value;
    }

    /**
     * Gets the value of the purchasingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingLevel() {
        return purchasingLevel;
    }

    /**
     * Sets the value of the purchasingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingLevel(String value) {
        this.purchasingLevel = value;
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
     * Gets the value of the occurrenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurrenceNumber() {
        return occurrenceNumber;
    }

    /**
     * Sets the value of the occurrenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurrenceNumber(String value) {
        this.occurrenceNumber = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the captureRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureRequestToken() {
        return captureRequestToken;
    }

    /**
     * Sets the value of the captureRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureRequestToken(String value) {
        this.captureRequestToken = value;
    }

    /**
     * Gets the value of the merchantReceiptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReceiptNumber() {
        return merchantReceiptNumber;
    }

    /**
     * Sets the value of the merchantReceiptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReceiptNumber(String value) {
        this.merchantReceiptNumber = value;
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
     * Gets the value of the dpdeBillingMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDpdeBillingMonth() {
        return dpdeBillingMonth;
    }

    /**
     * Sets the value of the dpdeBillingMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDpdeBillingMonth(BigInteger value) {
        this.dpdeBillingMonth = value;
    }

    /**
     * Gets the value of the reconciliationIDAlternate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationIDAlternate() {
        return reconciliationIDAlternate;
    }

    /**
     * Sets the value of the reconciliationIDAlternate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationIDAlternate(String value) {
        this.reconciliationIDAlternate = value;
    }

    /**
     * Gets the value of the refundReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * Sets the value of the refundReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundReason(String value) {
        this.refundReason = value;
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
