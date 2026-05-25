
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayPalPreapprovedUpdateReply complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PayPalPreapprovedUpdateReply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="requestDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.219}dateTime" minOccurs="0"/>
 *         <element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="payerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="payerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="payerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mpStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="payer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="payerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="payerBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mpMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentSourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalPreapprovedUpdateReply", propOrder = {
    "reasonCode",
    "requestDateTime",
    "reconciliationID",
    "payerStatus",
    "payerName",
    "payerCountry",
    "mpStatus",
    "payer",
    "payerID",
    "payerBusiness",
    "desc",
    "mpMax",
    "paymentSourceID"
})
public class PayPalPreapprovedUpdateReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String requestDateTime;
    protected String reconciliationID;
    protected String payerStatus;
    protected String payerName;
    protected String payerCountry;
    protected String mpStatus;
    protected String payer;
    protected String payerID;
    protected String payerBusiness;
    protected String desc;
    protected String mpMax;
    protected String paymentSourceID;

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
     * Gets the value of the payerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerStatus() {
        return payerStatus;
    }

    /**
     * Sets the value of the payerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerStatus(String value) {
        this.payerStatus = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerName(String value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the payerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerCountry() {
        return payerCountry;
    }

    /**
     * Sets the value of the payerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerCountry(String value) {
        this.payerCountry = value;
    }

    /**
     * Gets the value of the mpStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpStatus() {
        return mpStatus;
    }

    /**
     * Sets the value of the mpStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpStatus(String value) {
        this.mpStatus = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayer(String value) {
        this.payer = value;
    }

    /**
     * Gets the value of the payerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerID() {
        return payerID;
    }

    /**
     * Sets the value of the payerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerID(String value) {
        this.payerID = value;
    }

    /**
     * Gets the value of the payerBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerBusiness() {
        return payerBusiness;
    }

    /**
     * Sets the value of the payerBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerBusiness(String value) {
        this.payerBusiness = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the mpMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpMax() {
        return mpMax;
    }

    /**
     * Sets the value of the mpMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpMax(String value) {
        this.mpMax = value;
    }

    /**
     * Gets the value of the paymentSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSourceID() {
        return paymentSourceID;
    }

    /**
     * Sets the value of the paymentSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSourceID(String value) {
        this.paymentSourceID = value;
    }

}
