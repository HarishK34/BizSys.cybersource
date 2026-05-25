
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionReply complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DecisionReply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="casePriority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="activeProfileReply" type="{urn:schemas-cybersource-com:transaction-data-1.219}ProfileReply" minOccurs="0"/>
 *         <element name="velocityInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="additionalFields" type="{urn:schemas-cybersource-com:transaction-data-1.219}AdditionalFields" minOccurs="0"/>
 *         <element name="morphingElement" type="{urn:schemas-cybersource-com:transaction-data-1.219}MorphingElement" minOccurs="0"/>
 *         <element name="velocityCounts" type="{urn:schemas-cybersource-com:transaction-data-1.219}VelocityCounts" minOccurs="0"/>
 *         <element name="providerFields" type="{urn:schemas-cybersource-com:transaction-data-1.219}ProviderFields" minOccurs="0"/>
 *         <element name="travel" type="{urn:schemas-cybersource-com:transaction-data-1.219}Travel" minOccurs="0"/>
 *         <element name="unavailableInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionReply", propOrder = {
    "casePriority",
    "activeProfileReply",
    "velocityInfoCode",
    "additionalFields",
    "morphingElement",
    "velocityCounts",
    "providerFields",
    "travel",
    "unavailableInfoCode"
})
public class DecisionReply {

    protected BigInteger casePriority;
    protected ProfileReply activeProfileReply;
    protected String velocityInfoCode;
    protected AdditionalFields additionalFields;
    protected MorphingElement morphingElement;
    protected VelocityCounts velocityCounts;
    protected ProviderFields providerFields;
    protected Travel travel;
    protected String unavailableInfoCode;

    /**
     * Gets the value of the casePriority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCasePriority() {
        return casePriority;
    }

    /**
     * Sets the value of the casePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCasePriority(BigInteger value) {
        this.casePriority = value;
    }

    /**
     * Gets the value of the activeProfileReply property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileReply }
     *     
     */
    public ProfileReply getActiveProfileReply() {
        return activeProfileReply;
    }

    /**
     * Sets the value of the activeProfileReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileReply }
     *     
     */
    public void setActiveProfileReply(ProfileReply value) {
        this.activeProfileReply = value;
    }

    /**
     * Gets the value of the velocityInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocityInfoCode() {
        return velocityInfoCode;
    }

    /**
     * Sets the value of the velocityInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocityInfoCode(String value) {
        this.velocityInfoCode = value;
    }

    /**
     * Gets the value of the additionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFields }
     *     
     */
    public AdditionalFields getAdditionalFields() {
        return additionalFields;
    }

    /**
     * Sets the value of the additionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFields }
     *     
     */
    public void setAdditionalFields(AdditionalFields value) {
        this.additionalFields = value;
    }

    /**
     * Gets the value of the morphingElement property.
     * 
     * @return
     *     possible object is
     *     {@link MorphingElement }
     *     
     */
    public MorphingElement getMorphingElement() {
        return morphingElement;
    }

    /**
     * Sets the value of the morphingElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MorphingElement }
     *     
     */
    public void setMorphingElement(MorphingElement value) {
        this.morphingElement = value;
    }

    /**
     * Gets the value of the velocityCounts property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityCounts }
     *     
     */
    public VelocityCounts getVelocityCounts() {
        return velocityCounts;
    }

    /**
     * Sets the value of the velocityCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityCounts }
     *     
     */
    public void setVelocityCounts(VelocityCounts value) {
        this.velocityCounts = value;
    }

    /**
     * Gets the value of the providerFields property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderFields }
     *     
     */
    public ProviderFields getProviderFields() {
        return providerFields;
    }

    /**
     * Sets the value of the providerFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderFields }
     *     
     */
    public void setProviderFields(ProviderFields value) {
        this.providerFields = value;
    }

    /**
     * Gets the value of the travel property.
     * 
     * @return
     *     possible object is
     *     {@link Travel }
     *     
     */
    public Travel getTravel() {
        return travel;
    }

    /**
     * Sets the value of the travel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Travel }
     *     
     */
    public void setTravel(Travel value) {
        this.travel = value;
    }

    /**
     * Gets the value of the unavailableInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnavailableInfoCode() {
        return unavailableInfoCode;
    }

    /**
     * Sets the value of the unavailableInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnavailableInfoCode(String value) {
        this.unavailableInfoCode = value;
    }

}
