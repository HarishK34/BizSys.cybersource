
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionEarlyReply complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DecisionEarlyReply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="casePriority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="decision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="applicableOrderModifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="appliedOrderModifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="activeProfileReply" type="{urn:schemas-cybersource-com:transaction-data-1.219}ProfileReplyEarly" minOccurs="0"/>
 *         <element name="velocityCounts" type="{urn:schemas-cybersource-com:transaction-data-1.219}VelocityCountsEarly" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionEarlyReply", propOrder = {
    "casePriority",
    "decision",
    "action",
    "applicableOrderModifications",
    "appliedOrderModifications",
    "activeProfileReply",
    "velocityCounts"
})
public class DecisionEarlyReply {

    protected BigInteger casePriority;
    protected String decision;
    protected String action;
    protected String applicableOrderModifications;
    protected String appliedOrderModifications;
    protected ProfileReplyEarly activeProfileReply;
    protected VelocityCountsEarly velocityCounts;

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
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecision(String value) {
        this.decision = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the applicableOrderModifications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableOrderModifications() {
        return applicableOrderModifications;
    }

    /**
     * Sets the value of the applicableOrderModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableOrderModifications(String value) {
        this.applicableOrderModifications = value;
    }

    /**
     * Gets the value of the appliedOrderModifications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedOrderModifications() {
        return appliedOrderModifications;
    }

    /**
     * Sets the value of the appliedOrderModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedOrderModifications(String value) {
        this.appliedOrderModifications = value;
    }

    /**
     * Gets the value of the activeProfileReply property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileReplyEarly }
     *     
     */
    public ProfileReplyEarly getActiveProfileReply() {
        return activeProfileReply;
    }

    /**
     * Sets the value of the activeProfileReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileReplyEarly }
     *     
     */
    public void setActiveProfileReply(ProfileReplyEarly value) {
        this.activeProfileReply = value;
    }

    /**
     * Gets the value of the velocityCounts property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityCountsEarly }
     *     
     */
    public VelocityCountsEarly getVelocityCounts() {
        return velocityCounts;
    }

    /**
     * Sets the value of the velocityCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityCountsEarly }
     *     
     */
    public void setVelocityCounts(VelocityCountsEarly value) {
        this.velocityCounts = value;
    }

}
