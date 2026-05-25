
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APSessionsService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="APSessionsService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cancelURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="successURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="failureURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="overridePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentOptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sessionsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sessionsRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentMethod_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentFlowMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "APSessionsService", propOrder = {
    "cancelURL",
    "successURL",
    "failureURL",
    "reconciliationID",
    "overridePaymentMethod",
    "paymentOptionID",
    "sessionsType",
    "sessionsRequestID",
    "paymentMethodName",
    "paymentFlowMode"
})
public class APSessionsService {

    protected String cancelURL;
    protected String successURL;
    protected String failureURL;
    protected String reconciliationID;
    protected String overridePaymentMethod;
    protected String paymentOptionID;
    protected String sessionsType;
    protected String sessionsRequestID;
    @XmlElement(name = "paymentMethod_name")
    protected String paymentMethodName;
    protected String paymentFlowMode;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the cancelURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelURL() {
        return cancelURL;
    }

    /**
     * Sets the value of the cancelURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelURL(String value) {
        this.cancelURL = value;
    }

    /**
     * Gets the value of the successURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessURL() {
        return successURL;
    }

    /**
     * Sets the value of the successURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessURL(String value) {
        this.successURL = value;
    }

    /**
     * Gets the value of the failureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureURL() {
        return failureURL;
    }

    /**
     * Sets the value of the failureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureURL(String value) {
        this.failureURL = value;
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
     * Gets the value of the paymentOptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOptionID() {
        return paymentOptionID;
    }

    /**
     * Sets the value of the paymentOptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOptionID(String value) {
        this.paymentOptionID = value;
    }

    /**
     * Gets the value of the sessionsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionsType() {
        return sessionsType;
    }

    /**
     * Sets the value of the sessionsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionsType(String value) {
        this.sessionsType = value;
    }

    /**
     * Gets the value of the sessionsRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionsRequestID() {
        return sessionsRequestID;
    }

    /**
     * Sets the value of the sessionsRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionsRequestID(String value) {
        this.sessionsRequestID = value;
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
     * Gets the value of the paymentFlowMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentFlowMode() {
        return paymentFlowMode;
    }

    /**
     * Sets the value of the paymentFlowMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentFlowMode(String value) {
        this.paymentFlowMode = value;
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
