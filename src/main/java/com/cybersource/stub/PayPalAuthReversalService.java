
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayPalAuthReversalService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PayPalAuthReversalService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="paypalAuthorizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalEcDoPaymentRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalEcDoPaymentRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalAuthorizationRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalAuthorizationRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalEcOrderSetupRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalEcOrderSetupRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PayPalAuthReversalService", propOrder = {
    "paypalAuthorizationId",
    "paypalEcDoPaymentRequestID",
    "paypalEcDoPaymentRequestToken",
    "paypalAuthorizationRequestID",
    "paypalAuthorizationRequestToken",
    "paypalEcOrderSetupRequestID",
    "paypalEcOrderSetupRequestToken"
})
public class PayPalAuthReversalService {

    protected String paypalAuthorizationId;
    protected String paypalEcDoPaymentRequestID;
    protected String paypalEcDoPaymentRequestToken;
    protected String paypalAuthorizationRequestID;
    protected String paypalAuthorizationRequestToken;
    protected String paypalEcOrderSetupRequestID;
    protected String paypalEcOrderSetupRequestToken;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the paypalAuthorizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAuthorizationId() {
        return paypalAuthorizationId;
    }

    /**
     * Sets the value of the paypalAuthorizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAuthorizationId(String value) {
        this.paypalAuthorizationId = value;
    }

    /**
     * Gets the value of the paypalEcDoPaymentRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcDoPaymentRequestID() {
        return paypalEcDoPaymentRequestID;
    }

    /**
     * Sets the value of the paypalEcDoPaymentRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcDoPaymentRequestID(String value) {
        this.paypalEcDoPaymentRequestID = value;
    }

    /**
     * Gets the value of the paypalEcDoPaymentRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcDoPaymentRequestToken() {
        return paypalEcDoPaymentRequestToken;
    }

    /**
     * Sets the value of the paypalEcDoPaymentRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcDoPaymentRequestToken(String value) {
        this.paypalEcDoPaymentRequestToken = value;
    }

    /**
     * Gets the value of the paypalAuthorizationRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAuthorizationRequestID() {
        return paypalAuthorizationRequestID;
    }

    /**
     * Sets the value of the paypalAuthorizationRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAuthorizationRequestID(String value) {
        this.paypalAuthorizationRequestID = value;
    }

    /**
     * Gets the value of the paypalAuthorizationRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAuthorizationRequestToken() {
        return paypalAuthorizationRequestToken;
    }

    /**
     * Sets the value of the paypalAuthorizationRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAuthorizationRequestToken(String value) {
        this.paypalAuthorizationRequestToken = value;
    }

    /**
     * Gets the value of the paypalEcOrderSetupRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcOrderSetupRequestID() {
        return paypalEcOrderSetupRequestID;
    }

    /**
     * Sets the value of the paypalEcOrderSetupRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcOrderSetupRequestID(String value) {
        this.paypalEcOrderSetupRequestID = value;
    }

    /**
     * Gets the value of the paypalEcOrderSetupRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcOrderSetupRequestToken() {
        return paypalEcOrderSetupRequestToken;
    }

    /**
     * Sets the value of the paypalEcOrderSetupRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcOrderSetupRequestToken(String value) {
        this.paypalEcOrderSetupRequestToken = value;
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
