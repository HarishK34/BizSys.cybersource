
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for merchant complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="merchant">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="acquirerBIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardAcceptorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="visaMerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="acquirerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "merchant", propOrder = {
    "acquirerBIN",
    "cardAcceptorID",
    "visaMerchantID",
    "acquirerCountry"
})
public class Merchant {

    protected String acquirerBIN;
    protected String cardAcceptorID;
    protected String visaMerchantID;
    protected String acquirerCountry;

    /**
     * Gets the value of the acquirerBIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerBIN() {
        return acquirerBIN;
    }

    /**
     * Sets the value of the acquirerBIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerBIN(String value) {
        this.acquirerBIN = value;
    }

    /**
     * Gets the value of the cardAcceptorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorID() {
        return cardAcceptorID;
    }

    /**
     * Sets the value of the cardAcceptorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorID(String value) {
        this.cardAcceptorID = value;
    }

    /**
     * Gets the value of the visaMerchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaMerchantID() {
        return visaMerchantID;
    }

    /**
     * Sets the value of the visaMerchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaMerchantID(String value) {
        this.visaMerchantID = value;
    }

    /**
     * Gets the value of the acquirerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerCountry() {
        return acquirerCountry;
    }

    /**
     * Sets the value of the acquirerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerCountry(String value) {
        this.acquirerCountry = value;
    }

}
