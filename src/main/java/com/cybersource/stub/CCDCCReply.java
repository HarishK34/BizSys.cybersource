
package com.cybersource.stub;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCDCCReply complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CCDCCReply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="dccSupported" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="validHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marginRatePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentCurrencyOffer" type="{urn:schemas-cybersource-com:transaction-data-1.219}paymentCurrencyOffer" maxOccurs="150" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCDCCReply", propOrder = {
    "reasonCode",
    "dccSupported",
    "validHours",
    "marginRatePercentage",
    "reconciliationID",
    "paymentCurrencyOffer"
})
public class CCDCCReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String dccSupported;
    protected String validHours;
    protected String marginRatePercentage;
    protected String reconciliationID;
    protected List<PaymentCurrencyOffer> paymentCurrencyOffer;

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
     * Gets the value of the dccSupported property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccSupported() {
        return dccSupported;
    }

    /**
     * Sets the value of the dccSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccSupported(String value) {
        this.dccSupported = value;
    }

    /**
     * Gets the value of the validHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidHours() {
        return validHours;
    }

    /**
     * Sets the value of the validHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidHours(String value) {
        this.validHours = value;
    }

    /**
     * Gets the value of the marginRatePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginRatePercentage() {
        return marginRatePercentage;
    }

    /**
     * Sets the value of the marginRatePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginRatePercentage(String value) {
        this.marginRatePercentage = value;
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
     * Gets the value of the paymentCurrencyOffer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentCurrencyOffer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentCurrencyOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCurrencyOffer }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentCurrencyOffer property.
     */
    public List<PaymentCurrencyOffer> getPaymentCurrencyOffer() {
        if (paymentCurrencyOffer == null) {
            paymentCurrencyOffer = new ArrayList<>();
        }
        return this.paymentCurrencyOffer;
    }

}
