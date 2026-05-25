
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFee complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceFee">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="merchantDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantDescriptorContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantDescriptorState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFee", propOrder = {
    "merchantDescriptor",
    "merchantDescriptorContact",
    "merchantDescriptorState"
})
public class ServiceFee {

    protected String merchantDescriptor;
    protected String merchantDescriptorContact;
    protected String merchantDescriptorState;

    /**
     * Gets the value of the merchantDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptor() {
        return merchantDescriptor;
    }

    /**
     * Sets the value of the merchantDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptor(String value) {
        this.merchantDescriptor = value;
    }

    /**
     * Gets the value of the merchantDescriptorContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorContact() {
        return merchantDescriptorContact;
    }

    /**
     * Sets the value of the merchantDescriptorContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorContact(String value) {
        this.merchantDescriptorContact = value;
    }

    /**
     * Gets the value of the merchantDescriptorState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorState() {
        return merchantDescriptorState;
    }

    /**
     * Sets the value of the merchantDescriptorState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorState(String value) {
        this.merchantDescriptorState = value;
    }

}
