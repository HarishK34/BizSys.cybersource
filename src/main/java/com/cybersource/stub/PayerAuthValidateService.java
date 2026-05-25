
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayerAuthValidateService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PayerAuthValidateService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="signedPARes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="responseAccessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="otpToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="credentialEncrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "PayerAuthValidateService", propOrder = {
    "signedPARes",
    "authenticationTransactionID",
    "responseAccessToken",
    "otpToken",
    "credentialEncrypted"
})
public class PayerAuthValidateService {

    protected String signedPARes;
    protected String authenticationTransactionID;
    protected String responseAccessToken;
    protected String otpToken;
    protected Boolean credentialEncrypted;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the signedPARes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedPARes() {
        return signedPARes;
    }

    /**
     * Sets the value of the signedPARes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedPARes(String value) {
        this.signedPARes = value;
    }

    /**
     * Gets the value of the authenticationTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationTransactionID() {
        return authenticationTransactionID;
    }

    /**
     * Sets the value of the authenticationTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationTransactionID(String value) {
        this.authenticationTransactionID = value;
    }

    /**
     * Gets the value of the responseAccessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseAccessToken() {
        return responseAccessToken;
    }

    /**
     * Sets the value of the responseAccessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseAccessToken(String value) {
        this.responseAccessToken = value;
    }

    /**
     * Gets the value of the otpToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpToken() {
        return otpToken;
    }

    /**
     * Sets the value of the otpToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpToken(String value) {
        this.otpToken = value;
    }

    /**
     * Gets the value of the credentialEncrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCredentialEncrypted() {
        return credentialEncrypted;
    }

    /**
     * Sets the value of the credentialEncrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCredentialEncrypted(Boolean value) {
        this.credentialEncrypted = value;
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
