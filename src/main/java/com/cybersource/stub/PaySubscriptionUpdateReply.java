
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaySubscriptionUpdateReply complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaySubscriptionUpdateReply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="subscriptionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="subscriptionIDNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ownerMerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="instrumentIdentifierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="instrumentIdentifierStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="instrumentIdentifierNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="instrumentIdentifierSuccessorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaySubscriptionUpdateReply", propOrder = {
    "reasonCode",
    "subscriptionID",
    "subscriptionIDNew",
    "ownerMerchantID",
    "instrumentIdentifierID",
    "instrumentIdentifierStatus",
    "instrumentIdentifierNew",
    "instrumentIdentifierSuccessorID"
})
public class PaySubscriptionUpdateReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    @XmlElement(required = true)
    protected String subscriptionID;
    protected String subscriptionIDNew;
    protected String ownerMerchantID;
    protected String instrumentIdentifierID;
    protected String instrumentIdentifierStatus;
    protected String instrumentIdentifierNew;
    protected String instrumentIdentifierSuccessorID;

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
     * Gets the value of the subscriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Sets the value of the subscriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionID(String value) {
        this.subscriptionID = value;
    }

    /**
     * Gets the value of the subscriptionIDNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionIDNew() {
        return subscriptionIDNew;
    }

    /**
     * Sets the value of the subscriptionIDNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionIDNew(String value) {
        this.subscriptionIDNew = value;
    }

    /**
     * Gets the value of the ownerMerchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerMerchantID() {
        return ownerMerchantID;
    }

    /**
     * Sets the value of the ownerMerchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerMerchantID(String value) {
        this.ownerMerchantID = value;
    }

    /**
     * Gets the value of the instrumentIdentifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentIdentifierID() {
        return instrumentIdentifierID;
    }

    /**
     * Sets the value of the instrumentIdentifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentIdentifierID(String value) {
        this.instrumentIdentifierID = value;
    }

    /**
     * Gets the value of the instrumentIdentifierStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentIdentifierStatus() {
        return instrumentIdentifierStatus;
    }

    /**
     * Sets the value of the instrumentIdentifierStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentIdentifierStatus(String value) {
        this.instrumentIdentifierStatus = value;
    }

    /**
     * Gets the value of the instrumentIdentifierNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentIdentifierNew() {
        return instrumentIdentifierNew;
    }

    /**
     * Sets the value of the instrumentIdentifierNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentIdentifierNew(String value) {
        this.instrumentIdentifierNew = value;
    }

    /**
     * Gets the value of the instrumentIdentifierSuccessorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentIdentifierSuccessorID() {
        return instrumentIdentifierSuccessorID;
    }

    /**
     * Sets the value of the instrumentIdentifierSuccessorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentIdentifierSuccessorID(String value) {
        this.instrumentIdentifierSuccessorID = value;
    }

}
