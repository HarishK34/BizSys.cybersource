
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmvRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EmvRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="combinedTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="repeat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="aidAndDFname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fallback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fallbackCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmvRequest", propOrder = {
    "combinedTags",
    "repeat",
    "cardSequenceNumber",
    "aidAndDFname",
    "fallback",
    "fallbackCondition"
})
public class EmvRequest {

    protected String combinedTags;
    protected String repeat;
    protected String cardSequenceNumber;
    protected String aidAndDFname;
    protected String fallback;
    protected String fallbackCondition;

    /**
     * Gets the value of the combinedTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombinedTags() {
        return combinedTags;
    }

    /**
     * Sets the value of the combinedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombinedTags(String value) {
        this.combinedTags = value;
    }

    /**
     * Gets the value of the repeat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeat() {
        return repeat;
    }

    /**
     * Sets the value of the repeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeat(String value) {
        this.repeat = value;
    }

    /**
     * Gets the value of the cardSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSequenceNumber() {
        return cardSequenceNumber;
    }

    /**
     * Sets the value of the cardSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSequenceNumber(String value) {
        this.cardSequenceNumber = value;
    }

    /**
     * Gets the value of the aidAndDFname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAidAndDFname() {
        return aidAndDFname;
    }

    /**
     * Sets the value of the aidAndDFname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAidAndDFname(String value) {
        this.aidAndDFname = value;
    }

    /**
     * Gets the value of the fallback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallback() {
        return fallback;
    }

    /**
     * Sets the value of the fallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallback(String value) {
        this.fallback = value;
    }

    /**
     * Gets the value of the fallbackCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackCondition() {
        return fallbackCondition;
    }

    /**
     * Sets the value of the fallbackCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackCondition(String value) {
        this.fallbackCondition = value;
    }

}
