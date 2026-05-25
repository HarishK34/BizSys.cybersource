
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Check complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Check">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="bankTransitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="secCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="accountEncoderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="imageReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="terminalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="terminalState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="checkTransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="disableAccountValidation" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="transactionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="validationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Check", propOrder = {
    "fullName",
    "accountNumber",
    "accountType",
    "bankTransitNumber",
    "checkNumber",
    "secCode",
    "accountEncoderID",
    "authenticateID",
    "paymentInfo",
    "imageReferenceNumber",
    "terminalCity",
    "terminalState",
    "checkTransactionCode",
    "disableAccountValidation",
    "transactionReason",
    "validationType"
})
public class Check {

    protected String fullName;
    protected String accountNumber;
    protected String accountType;
    protected String bankTransitNumber;
    protected String checkNumber;
    protected String secCode;
    protected String accountEncoderID;
    protected String authenticateID;
    protected String paymentInfo;
    protected String imageReferenceNumber;
    protected String terminalCity;
    protected String terminalState;
    protected String checkTransactionCode;
    protected String disableAccountValidation;
    protected String transactionReason;
    protected String validationType;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the bankTransitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransitNumber() {
        return bankTransitNumber;
    }

    /**
     * Sets the value of the bankTransitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransitNumber(String value) {
        this.bankTransitNumber = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the secCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecCode() {
        return secCode;
    }

    /**
     * Sets the value of the secCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecCode(String value) {
        this.secCode = value;
    }

    /**
     * Gets the value of the accountEncoderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountEncoderID() {
        return accountEncoderID;
    }

    /**
     * Sets the value of the accountEncoderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountEncoderID(String value) {
        this.accountEncoderID = value;
    }

    /**
     * Gets the value of the authenticateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticateID() {
        return authenticateID;
    }

    /**
     * Sets the value of the authenticateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticateID(String value) {
        this.authenticateID = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInfo(String value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the imageReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageReferenceNumber() {
        return imageReferenceNumber;
    }

    /**
     * Sets the value of the imageReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageReferenceNumber(String value) {
        this.imageReferenceNumber = value;
    }

    /**
     * Gets the value of the terminalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCity() {
        return terminalCity;
    }

    /**
     * Sets the value of the terminalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCity(String value) {
        this.terminalCity = value;
    }

    /**
     * Gets the value of the terminalState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalState() {
        return terminalState;
    }

    /**
     * Sets the value of the terminalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalState(String value) {
        this.terminalState = value;
    }

    /**
     * Gets the value of the checkTransactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckTransactionCode() {
        return checkTransactionCode;
    }

    /**
     * Sets the value of the checkTransactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckTransactionCode(String value) {
        this.checkTransactionCode = value;
    }

    /**
     * Gets the value of the disableAccountValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableAccountValidation() {
        return disableAccountValidation;
    }

    /**
     * Sets the value of the disableAccountValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableAccountValidation(String value) {
        this.disableAccountValidation = value;
    }

    /**
     * Gets the value of the transactionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionReason() {
        return transactionReason;
    }

    /**
     * Sets the value of the transactionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionReason(String value) {
        this.transactionReason = value;
    }

    /**
     * Gets the value of the validationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationType() {
        return validationType;
    }

    /**
     * Sets the value of the validationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationType(String value) {
        this.validationType = value;
    }

}
