
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Network complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Network">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="octDomesticIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="octCrossBorderIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="aftDomesticIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="aftCrossBorderIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="networkID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="networkOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *       <attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Network", propOrder = {

})
public class Network {

    protected String octDomesticIndicator;
    protected String octCrossBorderIndicator;
    protected String aftDomesticIndicator;
    protected String aftCrossBorderIndicator;
    protected String networkID;
    protected String networkOrder;
    @XmlAttribute(name = "id")
    protected BigInteger id;

    /**
     * Gets the value of the octDomesticIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctDomesticIndicator() {
        return octDomesticIndicator;
    }

    /**
     * Sets the value of the octDomesticIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctDomesticIndicator(String value) {
        this.octDomesticIndicator = value;
    }

    /**
     * Gets the value of the octCrossBorderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctCrossBorderIndicator() {
        return octCrossBorderIndicator;
    }

    /**
     * Sets the value of the octCrossBorderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctCrossBorderIndicator(String value) {
        this.octCrossBorderIndicator = value;
    }

    /**
     * Gets the value of the aftDomesticIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAftDomesticIndicator() {
        return aftDomesticIndicator;
    }

    /**
     * Sets the value of the aftDomesticIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAftDomesticIndicator(String value) {
        this.aftDomesticIndicator = value;
    }

    /**
     * Gets the value of the aftCrossBorderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAftCrossBorderIndicator() {
        return aftCrossBorderIndicator;
    }

    /**
     * Sets the value of the aftCrossBorderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAftCrossBorderIndicator(String value) {
        this.aftCrossBorderIndicator = value;
    }

    /**
     * Gets the value of the networkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkID() {
        return networkID;
    }

    /**
     * Sets the value of the networkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkID(String value) {
        this.networkID = value;
    }

    /**
     * Gets the value of the networkOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkOrder() {
        return networkOrder;
    }

    /**
     * Sets the value of the networkOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkOrder(String value) {
        this.networkOrder = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}
