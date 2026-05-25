
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileReplyEarly complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProfileReplyEarly">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="selectedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pauseRulesTriggered" type="{urn:schemas-cybersource-com:transaction-data-1.219}PauseRuleResultItems" minOccurs="0"/>
 *         <element name="rulesTriggered" type="{urn:schemas-cybersource-com:transaction-data-1.219}RuleResultItems" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileReplyEarly", propOrder = {
    "name",
    "selectedBy",
    "pauseRulesTriggered",
    "rulesTriggered"
})
public class ProfileReplyEarly {

    protected String name;
    protected String selectedBy;
    protected PauseRuleResultItems pauseRulesTriggered;
    protected RuleResultItems rulesTriggered;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the selectedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedBy() {
        return selectedBy;
    }

    /**
     * Sets the value of the selectedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedBy(String value) {
        this.selectedBy = value;
    }

    /**
     * Gets the value of the pauseRulesTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link PauseRuleResultItems }
     *     
     */
    public PauseRuleResultItems getPauseRulesTriggered() {
        return pauseRulesTriggered;
    }

    /**
     * Sets the value of the pauseRulesTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link PauseRuleResultItems }
     *     
     */
    public void setPauseRulesTriggered(PauseRuleResultItems value) {
        this.pauseRulesTriggered = value;
    }

    /**
     * Gets the value of the rulesTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link RuleResultItems }
     *     
     */
    public RuleResultItems getRulesTriggered() {
        return rulesTriggered;
    }

    /**
     * Sets the value of the rulesTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleResultItems }
     *     
     */
    public void setRulesTriggered(RuleResultItems value) {
        this.rulesTriggered = value;
    }

}
