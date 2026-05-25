
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payByPoints complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="payByPoints">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pointsBeforeRedemption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pointsValueBeforeRedemption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pointsValueRedeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pointsAfterRedemption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pointsValueAfterRedemption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payByPoints", propOrder = {
    "indicator",
    "pointsBeforeRedemption",
    "pointsValueBeforeRedemption",
    "pointsRedeemed",
    "pointsValueRedeemed",
    "pointsAfterRedemption",
    "pointsValueAfterRedemption"
})
public class PayByPoints {

    protected String indicator;
    protected String pointsBeforeRedemption;
    protected String pointsValueBeforeRedemption;
    protected String pointsRedeemed;
    protected String pointsValueRedeemed;
    protected String pointsAfterRedemption;
    protected String pointsValueAfterRedemption;

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
     * Gets the value of the pointsBeforeRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsBeforeRedemption() {
        return pointsBeforeRedemption;
    }

    /**
     * Sets the value of the pointsBeforeRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsBeforeRedemption(String value) {
        this.pointsBeforeRedemption = value;
    }

    /**
     * Gets the value of the pointsValueBeforeRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsValueBeforeRedemption() {
        return pointsValueBeforeRedemption;
    }

    /**
     * Sets the value of the pointsValueBeforeRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsValueBeforeRedemption(String value) {
        this.pointsValueBeforeRedemption = value;
    }

    /**
     * Gets the value of the pointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsRedeemed() {
        return pointsRedeemed;
    }

    /**
     * Sets the value of the pointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsRedeemed(String value) {
        this.pointsRedeemed = value;
    }

    /**
     * Gets the value of the pointsValueRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsValueRedeemed() {
        return pointsValueRedeemed;
    }

    /**
     * Sets the value of the pointsValueRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsValueRedeemed(String value) {
        this.pointsValueRedeemed = value;
    }

    /**
     * Gets the value of the pointsAfterRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsAfterRedemption() {
        return pointsAfterRedemption;
    }

    /**
     * Sets the value of the pointsAfterRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsAfterRedemption(String value) {
        this.pointsAfterRedemption = value;
    }

    /**
     * Gets the value of the pointsValueAfterRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsValueAfterRedemption() {
        return pointsValueAfterRedemption;
    }

    /**
     * Sets the value of the pointsValueAfterRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsValueAfterRedemption(String value) {
        this.pointsValueAfterRedemption = value;
    }

}
