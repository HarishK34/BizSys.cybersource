
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalToken complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AdditionalToken">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="responseInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalToken", propOrder = {
    "responseInformation"
})
public class AdditionalToken {

    protected String responseInformation;

    /**
     * Gets the value of the responseInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseInformation() {
        return responseInformation;
    }

    /**
     * Sets the value of the responseInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseInformation(String value) {
        this.responseInformation = value;
    }

}
