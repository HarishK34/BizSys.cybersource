
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayPalAuthorizationService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PayPalAuthorizationService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="paypalOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalEcOrderSetupRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalEcOrderSetupRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalDoRefTransactionRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalDoRefTransactionRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalCustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PayPalAuthorizationService", propOrder = {
    "paypalOrderId",
    "paypalEcOrderSetupRequestID",
    "paypalEcOrderSetupRequestToken",
    "paypalDoRefTransactionRequestID",
    "paypalDoRefTransactionRequestToken",
    "paypalCustomerEmail"
})
public class PayPalAuthorizationService {

    protected String paypalOrderId;
    protected String paypalEcOrderSetupRequestID;
    protected String paypalEcOrderSetupRequestToken;
    protected String paypalDoRefTransactionRequestID;
    protected String paypalDoRefTransactionRequestToken;
    protected String paypalCustomerEmail;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the paypalOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalOrderId() {
        return paypalOrderId;
    }

    /**
     * Sets the value of the paypalOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalOrderId(String value) {
        this.paypalOrderId = value;
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
     * Gets the value of the paypalDoRefTransactionRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalDoRefTransactionRequestID() {
        return paypalDoRefTransactionRequestID;
    }

    /**
     * Sets the value of the paypalDoRefTransactionRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalDoRefTransactionRequestID(String value) {
        this.paypalDoRefTransactionRequestID = value;
    }

    /**
     * Gets the value of the paypalDoRefTransactionRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalDoRefTransactionRequestToken() {
        return paypalDoRefTransactionRequestToken;
    }

    /**
     * Sets the value of the paypalDoRefTransactionRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalDoRefTransactionRequestToken(String value) {
        this.paypalDoRefTransactionRequestToken = value;
    }

    /**
     * Gets the value of the paypalCustomerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalCustomerEmail() {
        return paypalCustomerEmail;
    }

    /**
     * Sets the value of the paypalCustomerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalCustomerEmail(String value) {
        this.paypalCustomerEmail = value;
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
