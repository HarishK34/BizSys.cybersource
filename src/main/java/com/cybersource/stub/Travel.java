
package com.cybersource.stub;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Travel complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Travel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="actualFinalDestinationCountry" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedString" minOccurs="0"/>
 *         <element name="actualFinalDestinationCity" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedString" minOccurs="0"/>
 *         <element name="actualFinalDestinationLatitude" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedDecimal" minOccurs="0"/>
 *         <element name="actualFinalDestinationLongitude" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedDecimal" minOccurs="0"/>
 *         <element name="firstDepartureCountry" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedString" minOccurs="0"/>
 *         <element name="firstDepartureCity" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedString" minOccurs="0"/>
 *         <element name="firstDepartureLatitude" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedDecimal" minOccurs="0"/>
 *         <element name="firstDepartureLongitude" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedDecimal" minOccurs="0"/>
 *         <element name="firstDestinationCountry" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedString" minOccurs="0"/>
 *         <element name="firstDestinationCity" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedString" minOccurs="0"/>
 *         <element name="firstDestinationLatitude" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedDecimal" minOccurs="0"/>
 *         <element name="firstDestinationLongitude" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedDecimal" minOccurs="0"/>
 *         <element name="lastDestinationCountry" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedString" minOccurs="0"/>
 *         <element name="lastDestinationCity" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedString" minOccurs="0"/>
 *         <element name="lastDestinationLatitude" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedDecimal" minOccurs="0"/>
 *         <element name="lastDestinationLongitude" type="{urn:schemas-cybersource-com:transaction-data-1.219}RestrictedDecimal" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Travel", propOrder = {
    "actualFinalDestinationCountry",
    "actualFinalDestinationCity",
    "actualFinalDestinationLatitude",
    "actualFinalDestinationLongitude",
    "firstDepartureCountry",
    "firstDepartureCity",
    "firstDepartureLatitude",
    "firstDepartureLongitude",
    "firstDestinationCountry",
    "firstDestinationCity",
    "firstDestinationLatitude",
    "firstDestinationLongitude",
    "lastDestinationCountry",
    "lastDestinationCity",
    "lastDestinationLatitude",
    "lastDestinationLongitude"
})
public class Travel {

    protected String actualFinalDestinationCountry;
    protected String actualFinalDestinationCity;
    protected BigDecimal actualFinalDestinationLatitude;
    protected BigDecimal actualFinalDestinationLongitude;
    protected String firstDepartureCountry;
    protected String firstDepartureCity;
    protected BigDecimal firstDepartureLatitude;
    protected BigDecimal firstDepartureLongitude;
    protected String firstDestinationCountry;
    protected String firstDestinationCity;
    protected BigDecimal firstDestinationLatitude;
    protected BigDecimal firstDestinationLongitude;
    protected String lastDestinationCountry;
    protected String lastDestinationCity;
    protected BigDecimal lastDestinationLatitude;
    protected BigDecimal lastDestinationLongitude;

    /**
     * Gets the value of the actualFinalDestinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFinalDestinationCountry() {
        return actualFinalDestinationCountry;
    }

    /**
     * Sets the value of the actualFinalDestinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFinalDestinationCountry(String value) {
        this.actualFinalDestinationCountry = value;
    }

    /**
     * Gets the value of the actualFinalDestinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFinalDestinationCity() {
        return actualFinalDestinationCity;
    }

    /**
     * Sets the value of the actualFinalDestinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFinalDestinationCity(String value) {
        this.actualFinalDestinationCity = value;
    }

    /**
     * Gets the value of the actualFinalDestinationLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualFinalDestinationLatitude() {
        return actualFinalDestinationLatitude;
    }

    /**
     * Sets the value of the actualFinalDestinationLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualFinalDestinationLatitude(BigDecimal value) {
        this.actualFinalDestinationLatitude = value;
    }

    /**
     * Gets the value of the actualFinalDestinationLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualFinalDestinationLongitude() {
        return actualFinalDestinationLongitude;
    }

    /**
     * Sets the value of the actualFinalDestinationLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualFinalDestinationLongitude(BigDecimal value) {
        this.actualFinalDestinationLongitude = value;
    }

    /**
     * Gets the value of the firstDepartureCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDepartureCountry() {
        return firstDepartureCountry;
    }

    /**
     * Sets the value of the firstDepartureCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDepartureCountry(String value) {
        this.firstDepartureCountry = value;
    }

    /**
     * Gets the value of the firstDepartureCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDepartureCity() {
        return firstDepartureCity;
    }

    /**
     * Sets the value of the firstDepartureCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDepartureCity(String value) {
        this.firstDepartureCity = value;
    }

    /**
     * Gets the value of the firstDepartureLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstDepartureLatitude() {
        return firstDepartureLatitude;
    }

    /**
     * Sets the value of the firstDepartureLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstDepartureLatitude(BigDecimal value) {
        this.firstDepartureLatitude = value;
    }

    /**
     * Gets the value of the firstDepartureLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstDepartureLongitude() {
        return firstDepartureLongitude;
    }

    /**
     * Sets the value of the firstDepartureLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstDepartureLongitude(BigDecimal value) {
        this.firstDepartureLongitude = value;
    }

    /**
     * Gets the value of the firstDestinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDestinationCountry() {
        return firstDestinationCountry;
    }

    /**
     * Sets the value of the firstDestinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDestinationCountry(String value) {
        this.firstDestinationCountry = value;
    }

    /**
     * Gets the value of the firstDestinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDestinationCity() {
        return firstDestinationCity;
    }

    /**
     * Sets the value of the firstDestinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDestinationCity(String value) {
        this.firstDestinationCity = value;
    }

    /**
     * Gets the value of the firstDestinationLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstDestinationLatitude() {
        return firstDestinationLatitude;
    }

    /**
     * Sets the value of the firstDestinationLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstDestinationLatitude(BigDecimal value) {
        this.firstDestinationLatitude = value;
    }

    /**
     * Gets the value of the firstDestinationLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstDestinationLongitude() {
        return firstDestinationLongitude;
    }

    /**
     * Sets the value of the firstDestinationLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstDestinationLongitude(BigDecimal value) {
        this.firstDestinationLongitude = value;
    }

    /**
     * Gets the value of the lastDestinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDestinationCountry() {
        return lastDestinationCountry;
    }

    /**
     * Sets the value of the lastDestinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDestinationCountry(String value) {
        this.lastDestinationCountry = value;
    }

    /**
     * Gets the value of the lastDestinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDestinationCity() {
        return lastDestinationCity;
    }

    /**
     * Sets the value of the lastDestinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDestinationCity(String value) {
        this.lastDestinationCity = value;
    }

    /**
     * Gets the value of the lastDestinationLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastDestinationLatitude() {
        return lastDestinationLatitude;
    }

    /**
     * Sets the value of the lastDestinationLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastDestinationLatitude(BigDecimal value) {
        this.lastDestinationLatitude = value;
    }

    /**
     * Gets the value of the lastDestinationLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastDestinationLongitude() {
        return lastDestinationLongitude;
    }

    /**
     * Sets the value of the lastDestinationLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastDestinationLongitude(BigDecimal value) {
        this.lastDestinationLongitude = value;
    }

}
