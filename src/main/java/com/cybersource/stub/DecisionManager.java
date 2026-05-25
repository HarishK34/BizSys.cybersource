
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionManager complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DecisionManager">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="enabled" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pausedRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authentication" type="{urn:schemas-cybersource-com:transaction-data-1.219}Authentication" minOccurs="0"/>
 *         <element name="travelData" type="{urn:schemas-cybersource-com:transaction-data-1.219}DecisionManagerTravelData" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionManager", propOrder = {
    "enabled",
    "profile",
    "pausedRequestID",
    "authentication",
    "travelData"
})
public class DecisionManager {

    protected String enabled;
    protected String profile;
    protected String pausedRequestID;
    protected Authentication authentication;
    protected DecisionManagerTravelData travelData;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Gets the value of the pausedRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPausedRequestID() {
        return pausedRequestID;
    }

    /**
     * Sets the value of the pausedRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPausedRequestID(String value) {
        this.pausedRequestID = value;
    }

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuthentication(Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the travelData property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionManagerTravelData }
     *     
     */
    public DecisionManagerTravelData getTravelData() {
        return travelData;
    }

    /**
     * Sets the value of the travelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionManagerTravelData }
     *     
     */
    public void setTravelData(DecisionManagerTravelData value) {
        this.travelData = value;
    }

}
