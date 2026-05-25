
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Authentication complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Authentication">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="outOfScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="exemption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authentication", propOrder = {
    "outOfScope",
    "exemption"
})
public class Authentication {

    protected String outOfScope;
    protected String exemption;

    /**
     * Gets the value of the outOfScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfScope() {
        return outOfScope;
    }

    /**
     * Sets the value of the outOfScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfScope(String value) {
        this.outOfScope = value;
    }

    /**
     * Gets the value of the exemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemption() {
        return exemption;
    }

    /**
     * Sets the value of the exemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemption(String value) {
        this.exemption = value;
    }

}
