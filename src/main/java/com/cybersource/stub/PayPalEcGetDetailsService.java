
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayPalEcGetDetailsService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PayPalEcGetDetailsService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="paypalToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalEcSetRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paypalEcSetRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PayPalEcGetDetailsService", propOrder = {
    "paypalToken",
    "paypalEcSetRequestID",
    "paypalEcSetRequestToken"
})
public class PayPalEcGetDetailsService {

    protected String paypalToken;
    protected String paypalEcSetRequestID;
    protected String paypalEcSetRequestToken;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the paypalToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalToken() {
        return paypalToken;
    }

    /**
     * Sets the value of the paypalToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalToken(String value) {
        this.paypalToken = value;
    }

    /**
     * Gets the value of the paypalEcSetRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcSetRequestID() {
        return paypalEcSetRequestID;
    }

    /**
     * Sets the value of the paypalEcSetRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcSetRequestID(String value) {
        this.paypalEcSetRequestID = value;
    }

    /**
     * Gets the value of the paypalEcSetRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcSetRequestToken() {
        return paypalEcSetRequestToken;
    }

    /**
     * Sets the value of the paypalEcSetRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcSetRequestToken(String value) {
        this.paypalEcSetRequestToken = value;
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
