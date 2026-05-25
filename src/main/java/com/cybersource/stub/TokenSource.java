
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenSource complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TokenSource">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="transientToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="networkTokenOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenSource", propOrder = {
    "transientToken",
    "networkTokenOption"
})
public class TokenSource {

    protected String transientToken;
    protected String networkTokenOption;

    /**
     * Gets the value of the transientToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransientToken() {
        return transientToken;
    }

    /**
     * Sets the value of the transientToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransientToken(String value) {
        this.transientToken = value;
    }

    /**
     * Gets the value of the networkTokenOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkTokenOption() {
        return networkTokenOption;
    }

    /**
     * Sets the value of the networkTokenOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkTokenOption(String value) {
        this.networkTokenOption = value;
    }

}
