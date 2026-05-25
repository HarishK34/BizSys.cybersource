
package com.cybersource.stub;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionManagerTravelData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DecisionManagerTravelData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="leg" type="{urn:schemas-cybersource-com:transaction-data-1.219}DecisionManagerTravelLeg" maxOccurs="100" minOccurs="0"/>
 *         <element name="departureDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.219}dateTime" minOccurs="0"/>
 *         <element name="completeRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="journeyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="actualFinalDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionManagerTravelData", propOrder = {
    "leg",
    "departureDateTime",
    "completeRoute",
    "journeyType",
    "actualFinalDestination"
})
public class DecisionManagerTravelData {

    protected List<DecisionManagerTravelLeg> leg;
    protected String departureDateTime;
    protected String completeRoute;
    protected String journeyType;
    protected String actualFinalDestination;

    /**
     * Gets the value of the leg property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecisionManagerTravelLeg }
     * </p>
     * 
     * 
     * @return
     *     The value of the leg property.
     */
    public List<DecisionManagerTravelLeg> getLeg() {
        if (leg == null) {
            leg = new ArrayList<>();
        }
        return this.leg;
    }

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateTime(String value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the completeRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleteRoute() {
        return completeRoute;
    }

    /**
     * Sets the value of the completeRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleteRoute(String value) {
        this.completeRoute = value;
    }

    /**
     * Gets the value of the journeyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyType() {
        return journeyType;
    }

    /**
     * Sets the value of the journeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyType(String value) {
        this.journeyType = value;
    }

    /**
     * Gets the value of the actualFinalDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFinalDestination() {
        return actualFinalDestination;
    }

    /**
     * Sets the value of the actualFinalDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFinalDestination(String value) {
        this.actualFinalDestination = value;
    }

}
