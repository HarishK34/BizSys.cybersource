
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayPalEcOrderSetupService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PayPalEcOrderSetupService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="paypalToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalPayerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalCustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalEcSetRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalEcSetRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="promoCode0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PayPalEcOrderSetupService", propOrder = {
    "paypalToken",
    "paypalPayerId",
    "paypalCustomerEmail",
    "paypalDesc",
    "paypalEcSetRequestID",
    "paypalEcSetRequestToken",
    "promoCode0",
    "invoiceNumber"
})
public class PayPalEcOrderSetupService {

    protected String paypalToken;
    protected String paypalPayerId;
    protected String paypalCustomerEmail;
    protected String paypalDesc;
    protected String paypalEcSetRequestID;
    protected String paypalEcSetRequestToken;
    protected String promoCode0;
    protected String invoiceNumber;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the paypalToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalToken() {
        return paypalToken;
    }

    /**
     * Sets the value of the paypalToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalToken(String value) {
        this.paypalToken = value;
    }

    /**
     * Gets the value of the paypalPayerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPayerId() {
        return paypalPayerId;
    }

    /**
     * Sets the value of the paypalPayerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPayerId(String value) {
        this.paypalPayerId = value;
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
     * Gets the value of the paypalDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalDesc() {
        return paypalDesc;
    }

    /**
     * Sets the value of the paypalDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalDesc(String value) {
        this.paypalDesc = value;
    }

    /**
     * Gets the value of the paypalEcSetRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcSetRequestID() {
        return paypalEcSetRequestID;
    }

    /**
     * Sets the value of the paypalEcSetRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcSetRequestID(String value) {
        this.paypalEcSetRequestID = value;
    }

    /**
     * Gets the value of the paypalEcSetRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcSetRequestToken() {
        return paypalEcSetRequestToken;
    }

    /**
     * Sets the value of the paypalEcSetRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcSetRequestToken(String value) {
        this.paypalEcSetRequestToken = value;
    }

    /**
     * Gets the value of the promoCode0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode0() {
        return promoCode0;
    }

    /**
     * Sets the value of the promoCode0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode0(String value) {
        this.promoCode0 = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
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
