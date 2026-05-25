
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Customer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Customer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="alternatePhoneNumberVerificationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="alternateEmailVerificationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "alternatePhoneNumberVerificationStatus",
    "alternateEmailVerificationStatus"
})
public class Customer {

    protected String alternatePhoneNumberVerificationStatus;
    protected String alternateEmailVerificationStatus;

    /**
     * Gets the value of the alternatePhoneNumberVerificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePhoneNumberVerificationStatus() {
        return alternatePhoneNumberVerificationStatus;
    }

    /**
     * Sets the value of the alternatePhoneNumberVerificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePhoneNumberVerificationStatus(String value) {
        this.alternatePhoneNumberVerificationStatus = value;
    }

    /**
     * Gets the value of the alternateEmailVerificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateEmailVerificationStatus() {
        return alternateEmailVerificationStatus;
    }

    /**
     * Sets the value of the alternateEmailVerificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateEmailVerificationStatus(String value) {
        this.alternateEmailVerificationStatus = value;
    }

}
