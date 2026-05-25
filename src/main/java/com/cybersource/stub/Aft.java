
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Aft complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Aft">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="serviceFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="foreignExchangeFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aft", propOrder = {
    "indicator",
    "serviceFee",
    "foreignExchangeFee"
})
public class Aft {

    protected String indicator;
    protected String serviceFee;
    protected String foreignExchangeFee;

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the serviceFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFee() {
        return serviceFee;
    }

    /**
     * Sets the value of the serviceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFee(String value) {
        this.serviceFee = value;
    }

    /**
     * Gets the value of the foreignExchangeFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignExchangeFee() {
        return foreignExchangeFee;
    }

    /**
     * Sets the value of the foreignExchangeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignExchangeFee(String value) {
        this.foreignExchangeFee = value;
    }

}
