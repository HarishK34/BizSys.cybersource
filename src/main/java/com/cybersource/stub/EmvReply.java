
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmvReply complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EmvReply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="combinedTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="decryptedRequestTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="chipValidationResults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="chipValidationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmvReply", propOrder = {
    "combinedTags",
    "decryptedRequestTags",
    "chipValidationResults",
    "chipValidationType"
})
public class EmvReply {

    protected String combinedTags;
    protected String decryptedRequestTags;
    protected String chipValidationResults;
    protected String chipValidationType;

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
     * Gets the value of the decryptedRequestTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecryptedRequestTags() {
        return decryptedRequestTags;
    }

    /**
     * Sets the value of the decryptedRequestTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecryptedRequestTags(String value) {
        this.decryptedRequestTags = value;
    }

    /**
     * Gets the value of the chipValidationResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipValidationResults() {
        return chipValidationResults;
    }

    /**
     * Sets the value of the chipValidationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipValidationResults(String value) {
        this.chipValidationResults = value;
    }

    /**
     * Gets the value of the chipValidationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipValidationType() {
        return chipValidationType;
    }

    /**
     * Sets the value of the chipValidationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipValidationType(String value) {
        this.chipValidationType = value;
    }

}
