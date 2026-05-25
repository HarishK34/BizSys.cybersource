
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaySubscriptionCreateService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaySubscriptionCreateService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="paymentRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="disableAutoAuth" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
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
@XmlType(name = "PaySubscriptionCreateService", propOrder = {
    "paymentRequestID",
    "paymentRequestToken",
    "disableAutoAuth"
})
public class PaySubscriptionCreateService {

    protected String paymentRequestID;
    protected String paymentRequestToken;
    protected String disableAutoAuth;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the paymentRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRequestID() {
        return paymentRequestID;
    }

    /**
     * Sets the value of the paymentRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRequestID(String value) {
        this.paymentRequestID = value;
    }

    /**
     * Gets the value of the paymentRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRequestToken() {
        return paymentRequestToken;
    }

    /**
     * Sets the value of the paymentRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRequestToken(String value) {
        this.paymentRequestToken = value;
    }

    /**
     * Gets the value of the disableAutoAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableAutoAuth() {
        return disableAutoAuth;
    }

    /**
     * Sets the value of the disableAutoAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableAutoAuth(String value) {
        this.disableAutoAuth = value;
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
