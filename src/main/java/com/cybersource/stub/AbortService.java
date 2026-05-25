
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbortService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbortService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="authRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="creditRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardholderVerificationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AbortService", propOrder = {
    "authRequestID",
    "creditRequestID",
    "cardholderVerificationMethod",
    "commerceIndicator"
})
public class AbortService {

    protected String authRequestID;
    protected String creditRequestID;
    protected String cardholderVerificationMethod;
    protected String commerceIndicator;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the authRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRequestID() {
        return authRequestID;
    }

    /**
     * Sets the value of the authRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRequestID(String value) {
        this.authRequestID = value;
    }

    /**
     * Gets the value of the creditRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRequestID() {
        return creditRequestID;
    }

    /**
     * Sets the value of the creditRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRequestID(String value) {
        this.creditRequestID = value;
    }

    /**
     * Gets the value of the cardholderVerificationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderVerificationMethod() {
        return cardholderVerificationMethod;
    }

    /**
     * Sets the value of the cardholderVerificationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderVerificationMethod(String value) {
        this.cardholderVerificationMethod = value;
    }

    /**
     * Gets the value of the commerceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceIndicator() {
        return commerceIndicator;
    }

    /**
     * Sets the value of the commerceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceIndicator(String value) {
        this.commerceIndicator = value;
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
