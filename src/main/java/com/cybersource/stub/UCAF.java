
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UCAF complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UCAF">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="authenticationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="collectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="downgradeReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UCAF", propOrder = {
    "authenticationData",
    "collectionIndicator",
    "downgradeReasonCode"
})
public class UCAF {

    protected String authenticationData;
    protected String collectionIndicator;
    protected String downgradeReasonCode;

    /**
     * Gets the value of the authenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationData() {
        return authenticationData;
    }

    /**
     * Sets the value of the authenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationData(String value) {
        this.authenticationData = value;
    }

    /**
     * Gets the value of the collectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionIndicator() {
        return collectionIndicator;
    }

    /**
     * Sets the value of the collectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionIndicator(String value) {
        this.collectionIndicator = value;
    }

    /**
     * Gets the value of the downgradeReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDowngradeReasonCode() {
        return downgradeReasonCode;
    }

    /**
     * Sets the value of the downgradeReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDowngradeReasonCode(String value) {
        this.downgradeReasonCode = value;
    }

}
