
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCCreditReply complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CCCreditReply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="requestDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.219}dateTime" minOccurs="0"/>
 *         <element name="amount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="purchasingLevel3Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="enhancedDataEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authorizationXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="forwardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ownerMerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reconciliationReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="processorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentNetworkTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="settlementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCreditReply", propOrder = {
    "reasonCode",
    "requestDateTime",
    "amount",
    "reconciliationID",
    "purchasingLevel3Enabled",
    "enhancedDataEnabled",
    "authorizationXID",
    "forwardCode",
    "ownerMerchantID",
    "reconciliationReferenceNumber",
    "authorizationCode",
    "processorResponse",
    "paymentNetworkTransactionID",
    "settlementDate"
})
public class CCCreditReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String requestDateTime;
    protected String amount;
    protected String reconciliationID;
    protected String purchasingLevel3Enabled;
    protected String enhancedDataEnabled;
    protected String authorizationXID;
    protected String forwardCode;
    protected String ownerMerchantID;
    protected String reconciliationReferenceNumber;
    protected String authorizationCode;
    protected String processorResponse;
    protected String paymentNetworkTransactionID;
    protected String settlementDate;

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonCode(BigInteger value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the requestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDateTime() {
        return requestDateTime;
    }

    /**
     * Sets the value of the requestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDateTime(String value) {
        this.requestDateTime = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
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
     * Gets the value of the purchasingLevel3Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingLevel3Enabled() {
        return purchasingLevel3Enabled;
    }

    /**
     * Sets the value of the purchasingLevel3Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingLevel3Enabled(String value) {
        this.purchasingLevel3Enabled = value;
    }

    /**
     * Gets the value of the enhancedDataEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhancedDataEnabled() {
        return enhancedDataEnabled;
    }

    /**
     * Sets the value of the enhancedDataEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhancedDataEnabled(String value) {
        this.enhancedDataEnabled = value;
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
     * Gets the value of the forwardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardCode() {
        return forwardCode;
    }

    /**
     * Sets the value of the forwardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardCode(String value) {
        this.forwardCode = value;
    }

    /**
     * Gets the value of the ownerMerchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerMerchantID() {
        return ownerMerchantID;
    }

    /**
     * Sets the value of the ownerMerchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerMerchantID(String value) {
        this.ownerMerchantID = value;
    }

    /**
     * Gets the value of the reconciliationReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationReferenceNumber() {
        return reconciliationReferenceNumber;
    }

    /**
     * Sets the value of the reconciliationReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationReferenceNumber(String value) {
        this.reconciliationReferenceNumber = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the processorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorResponse() {
        return processorResponse;
    }

    /**
     * Sets the value of the processorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorResponse(String value) {
        this.processorResponse = value;
    }

    /**
     * Gets the value of the paymentNetworkTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNetworkTransactionID() {
        return paymentNetworkTransactionID;
    }

    /**
     * Sets the value of the paymentNetworkTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentNetworkTransactionID(String value) {
        this.paymentNetworkTransactionID = value;
    }

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementDate(String value) {
        this.settlementDate = value;
    }

}
