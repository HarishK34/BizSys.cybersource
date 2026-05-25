
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for issuer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="issuer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="additionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="countryNumericCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="riskAnalysisExemptionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="trustedMerchantExemptionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lowValueExemptionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="secureCorporatePaymentResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transactionRiskAnalysisExemptionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="clearingData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issuer", propOrder = {
    "additionalData",
    "name",
    "country",
    "countryNumericCode",
    "phoneNumber",
    "responseCode",
    "riskAnalysisExemptionResult",
    "trustedMerchantExemptionResult",
    "lowValueExemptionResult",
    "secureCorporatePaymentResult",
    "transactionRiskAnalysisExemptionResult",
    "message",
    "clearingData"
})
public class Issuer {

    protected String additionalData;
    protected String name;
    protected String country;
    protected String countryNumericCode;
    protected String phoneNumber;
    protected String responseCode;
    protected String riskAnalysisExemptionResult;
    protected String trustedMerchantExemptionResult;
    protected String lowValueExemptionResult;
    protected String secureCorporatePaymentResult;
    protected String transactionRiskAnalysisExemptionResult;
    protected String message;
    protected String clearingData;

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData(String value) {
        this.additionalData = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryNumericCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryNumericCode() {
        return countryNumericCode;
    }

    /**
     * Sets the value of the countryNumericCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryNumericCode(String value) {
        this.countryNumericCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the riskAnalysisExemptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskAnalysisExemptionResult() {
        return riskAnalysisExemptionResult;
    }

    /**
     * Sets the value of the riskAnalysisExemptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskAnalysisExemptionResult(String value) {
        this.riskAnalysisExemptionResult = value;
    }

    /**
     * Gets the value of the trustedMerchantExemptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustedMerchantExemptionResult() {
        return trustedMerchantExemptionResult;
    }

    /**
     * Sets the value of the trustedMerchantExemptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustedMerchantExemptionResult(String value) {
        this.trustedMerchantExemptionResult = value;
    }

    /**
     * Gets the value of the lowValueExemptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowValueExemptionResult() {
        return lowValueExemptionResult;
    }

    /**
     * Sets the value of the lowValueExemptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowValueExemptionResult(String value) {
        this.lowValueExemptionResult = value;
    }

    /**
     * Gets the value of the secureCorporatePaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureCorporatePaymentResult() {
        return secureCorporatePaymentResult;
    }

    /**
     * Sets the value of the secureCorporatePaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureCorporatePaymentResult(String value) {
        this.secureCorporatePaymentResult = value;
    }

    /**
     * Gets the value of the transactionRiskAnalysisExemptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionRiskAnalysisExemptionResult() {
        return transactionRiskAnalysisExemptionResult;
    }

    /**
     * Sets the value of the transactionRiskAnalysisExemptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionRiskAnalysisExemptionResult(String value) {
        this.transactionRiskAnalysisExemptionResult = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the clearingData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingData() {
        return clearingData;
    }

    /**
     * Sets the value of the clearingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingData(String value) {
        this.clearingData = value;
    }

}
