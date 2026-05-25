
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoRentalData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AutoRentalData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="adjustmentCost" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="adjustmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="agreementNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerServicePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dailyRate" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="mileageCost" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="gasCost" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="insuranceCost" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="lateReturnCost" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="maximumFreeMiles" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="milesTraveled" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="oneWayCost" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="parkingViolationCost" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="pickUpCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pickUpCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pickUpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pickUpState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pickUpTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="ratePerMile" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="renterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="specialProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="noShowIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="timePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="weeklyRentalRate" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="distanceUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rentalLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vehicleInsuranceIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="programCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="otherCharges" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="taxRate" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="taxIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="taxStatusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="taxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="taxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="taxSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="odometerReading" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="vehicleIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="commodityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="companyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regularMileageCost" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="towingCharge" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="extraCharge" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="additionalDrivers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="rentalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="driverAge" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="vehicleMake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vehicleModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="corporateClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="phoneCharge" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="gpsCharge" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="pickupLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="taxAmountSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoRentalData", propOrder = {
    "adjustmentCost",
    "adjustmentCode",
    "agreementNumber",
    "classCode",
    "customerServicePhoneNumber",
    "dailyRate",
    "mileageCost",
    "gasCost",
    "insuranceCost",
    "lateReturnCost",
    "maximumFreeMiles",
    "milesTraveled",
    "oneWayCost",
    "parkingViolationCost",
    "pickUpCity",
    "pickUpCountry",
    "pickUpDate",
    "pickUpState",
    "pickUpTime",
    "ratePerMile",
    "renterName",
    "returnCity",
    "returnCountry",
    "returnDate",
    "returnLocationID",
    "returnState",
    "returnTime",
    "specialProgramCode",
    "noShowIndicator",
    "timePeriod",
    "weeklyRentalRate",
    "distanceUnit",
    "rentalLocationID",
    "vehicleInsuranceIndicator",
    "programCode",
    "otherCharges",
    "taxRate",
    "taxIndicator",
    "taxStatusIndicator",
    "taxAmount",
    "taxType",
    "taxSummary",
    "returnLocation",
    "odometerReading",
    "vehicleIdentificationNumber",
    "commodityCode",
    "companyId",
    "regularMileageCost",
    "towingCharge",
    "extraCharge",
    "additionalDrivers",
    "rentalAddress",
    "driverAge",
    "vehicleMake",
    "vehicleModel",
    "corporateClientCode",
    "phoneCharge",
    "gpsCharge",
    "pickupLocation",
    "taxAmountSign"
})
public class AutoRentalData {

    protected String adjustmentCost;
    protected String adjustmentCode;
    protected String agreementNumber;
    protected String classCode;
    protected String customerServicePhoneNumber;
    protected String dailyRate;
    protected String mileageCost;
    protected String gasCost;
    protected String insuranceCost;
    protected String lateReturnCost;
    protected BigInteger maximumFreeMiles;
    protected BigInteger milesTraveled;
    protected String oneWayCost;
    protected String parkingViolationCost;
    protected String pickUpCity;
    protected String pickUpCountry;
    protected String pickUpDate;
    protected String pickUpState;
    protected BigInteger pickUpTime;
    protected String ratePerMile;
    protected String renterName;
    protected String returnCity;
    protected String returnCountry;
    protected String returnDate;
    protected String returnLocationID;
    protected String returnState;
    protected BigInteger returnTime;
    protected String specialProgramCode;
    protected String noShowIndicator;
    protected String timePeriod;
    protected String weeklyRentalRate;
    protected String distanceUnit;
    protected String rentalLocationID;
    protected String vehicleInsuranceIndicator;
    protected String programCode;
    protected String otherCharges;
    protected String taxRate;
    protected String taxIndicator;
    protected String taxStatusIndicator;
    protected String taxAmount;
    protected String taxType;
    protected String taxSummary;
    protected String returnLocation;
    protected BigInteger odometerReading;
    protected String vehicleIdentificationNumber;
    protected String commodityCode;
    protected String companyId;
    protected String regularMileageCost;
    protected String towingCharge;
    protected String extraCharge;
    protected BigInteger additionalDrivers;
    protected String rentalAddress;
    protected BigInteger driverAge;
    protected String vehicleMake;
    protected String vehicleModel;
    protected String corporateClientCode;
    protected String phoneCharge;
    protected String gpsCharge;
    protected String pickupLocation;
    protected String taxAmountSign;

    /**
     * Gets the value of the adjustmentCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentCost() {
        return adjustmentCost;
    }

    /**
     * Sets the value of the adjustmentCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentCost(String value) {
        this.adjustmentCost = value;
    }

    /**
     * Gets the value of the adjustmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentCode() {
        return adjustmentCode;
    }

    /**
     * Sets the value of the adjustmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentCode(String value) {
        this.adjustmentCode = value;
    }

    /**
     * Gets the value of the agreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementNumber(String value) {
        this.agreementNumber = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the customerServicePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServicePhoneNumber() {
        return customerServicePhoneNumber;
    }

    /**
     * Sets the value of the customerServicePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServicePhoneNumber(String value) {
        this.customerServicePhoneNumber = value;
    }

    /**
     * Gets the value of the dailyRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyRate() {
        return dailyRate;
    }

    /**
     * Sets the value of the dailyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyRate(String value) {
        this.dailyRate = value;
    }

    /**
     * Gets the value of the mileageCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileageCost() {
        return mileageCost;
    }

    /**
     * Sets the value of the mileageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileageCost(String value) {
        this.mileageCost = value;
    }

    /**
     * Gets the value of the gasCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGasCost() {
        return gasCost;
    }

    /**
     * Sets the value of the gasCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGasCost(String value) {
        this.gasCost = value;
    }

    /**
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCost(String value) {
        this.insuranceCost = value;
    }

    /**
     * Gets the value of the lateReturnCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLateReturnCost() {
        return lateReturnCost;
    }

    /**
     * Sets the value of the lateReturnCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateReturnCost(String value) {
        this.lateReturnCost = value;
    }

    /**
     * Gets the value of the maximumFreeMiles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumFreeMiles() {
        return maximumFreeMiles;
    }

    /**
     * Sets the value of the maximumFreeMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumFreeMiles(BigInteger value) {
        this.maximumFreeMiles = value;
    }

    /**
     * Gets the value of the milesTraveled property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMilesTraveled() {
        return milesTraveled;
    }

    /**
     * Sets the value of the milesTraveled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMilesTraveled(BigInteger value) {
        this.milesTraveled = value;
    }

    /**
     * Gets the value of the oneWayCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneWayCost() {
        return oneWayCost;
    }

    /**
     * Sets the value of the oneWayCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneWayCost(String value) {
        this.oneWayCost = value;
    }

    /**
     * Gets the value of the parkingViolationCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingViolationCost() {
        return parkingViolationCost;
    }

    /**
     * Sets the value of the parkingViolationCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingViolationCost(String value) {
        this.parkingViolationCost = value;
    }

    /**
     * Gets the value of the pickUpCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpCity() {
        return pickUpCity;
    }

    /**
     * Sets the value of the pickUpCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpCity(String value) {
        this.pickUpCity = value;
    }

    /**
     * Gets the value of the pickUpCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpCountry() {
        return pickUpCountry;
    }

    /**
     * Sets the value of the pickUpCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpCountry(String value) {
        this.pickUpCountry = value;
    }

    /**
     * Gets the value of the pickUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDate() {
        return pickUpDate;
    }

    /**
     * Sets the value of the pickUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDate(String value) {
        this.pickUpDate = value;
    }

    /**
     * Gets the value of the pickUpState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpState() {
        return pickUpState;
    }

    /**
     * Sets the value of the pickUpState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpState(String value) {
        this.pickUpState = value;
    }

    /**
     * Gets the value of the pickUpTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPickUpTime() {
        return pickUpTime;
    }

    /**
     * Sets the value of the pickUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPickUpTime(BigInteger value) {
        this.pickUpTime = value;
    }

    /**
     * Gets the value of the ratePerMile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePerMile() {
        return ratePerMile;
    }

    /**
     * Sets the value of the ratePerMile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePerMile(String value) {
        this.ratePerMile = value;
    }

    /**
     * Gets the value of the renterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenterName() {
        return renterName;
    }

    /**
     * Sets the value of the renterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenterName(String value) {
        this.renterName = value;
    }

    /**
     * Gets the value of the returnCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCity() {
        return returnCity;
    }

    /**
     * Sets the value of the returnCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCity(String value) {
        this.returnCity = value;
    }

    /**
     * Gets the value of the returnCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCountry() {
        return returnCountry;
    }

    /**
     * Sets the value of the returnCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCountry(String value) {
        this.returnCountry = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(String value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the returnLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnLocationID() {
        return returnLocationID;
    }

    /**
     * Sets the value of the returnLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnLocationID(String value) {
        this.returnLocationID = value;
    }

    /**
     * Gets the value of the returnState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnState() {
        return returnState;
    }

    /**
     * Sets the value of the returnState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnState(String value) {
        this.returnState = value;
    }

    /**
     * Gets the value of the returnTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReturnTime() {
        return returnTime;
    }

    /**
     * Sets the value of the returnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReturnTime(BigInteger value) {
        this.returnTime = value;
    }

    /**
     * Gets the value of the specialProgramCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialProgramCode() {
        return specialProgramCode;
    }

    /**
     * Sets the value of the specialProgramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialProgramCode(String value) {
        this.specialProgramCode = value;
    }

    /**
     * Gets the value of the noShowIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoShowIndicator() {
        return noShowIndicator;
    }

    /**
     * Sets the value of the noShowIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoShowIndicator(String value) {
        this.noShowIndicator = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimePeriod(String value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the weeklyRentalRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeeklyRentalRate() {
        return weeklyRentalRate;
    }

    /**
     * Sets the value of the weeklyRentalRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeeklyRentalRate(String value) {
        this.weeklyRentalRate = value;
    }

    /**
     * Gets the value of the distanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * Sets the value of the distanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnit(String value) {
        this.distanceUnit = value;
    }

    /**
     * Gets the value of the rentalLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalLocationID() {
        return rentalLocationID;
    }

    /**
     * Sets the value of the rentalLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalLocationID(String value) {
        this.rentalLocationID = value;
    }

    /**
     * Gets the value of the vehicleInsuranceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleInsuranceIndicator() {
        return vehicleInsuranceIndicator;
    }

    /**
     * Sets the value of the vehicleInsuranceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleInsuranceIndicator(String value) {
        this.vehicleInsuranceIndicator = value;
    }

    /**
     * Gets the value of the programCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCode() {
        return programCode;
    }

    /**
     * Sets the value of the programCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCode(String value) {
        this.programCode = value;
    }

    /**
     * Gets the value of the otherCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCharges() {
        return otherCharges;
    }

    /**
     * Sets the value of the otherCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCharges(String value) {
        this.otherCharges = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRate(String value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIndicator() {
        return taxIndicator;
    }

    /**
     * Sets the value of the taxIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIndicator(String value) {
        this.taxIndicator = value;
    }

    /**
     * Gets the value of the taxStatusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxStatusIndicator() {
        return taxStatusIndicator;
    }

    /**
     * Sets the value of the taxStatusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxStatusIndicator(String value) {
        this.taxStatusIndicator = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the taxSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxSummary() {
        return taxSummary;
    }

    /**
     * Sets the value of the taxSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxSummary(String value) {
        this.taxSummary = value;
    }

    /**
     * Gets the value of the returnLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnLocation() {
        return returnLocation;
    }

    /**
     * Sets the value of the returnLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnLocation(String value) {
        this.returnLocation = value;
    }

    /**
     * Gets the value of the odometerReading property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOdometerReading() {
        return odometerReading;
    }

    /**
     * Sets the value of the odometerReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOdometerReading(BigInteger value) {
        this.odometerReading = value;
    }

    /**
     * Gets the value of the vehicleIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    /**
     * Sets the value of the vehicleIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleIdentificationNumber(String value) {
        this.vehicleIdentificationNumber = value;
    }

    /**
     * Gets the value of the commodityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the regularMileageCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularMileageCost() {
        return regularMileageCost;
    }

    /**
     * Sets the value of the regularMileageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularMileageCost(String value) {
        this.regularMileageCost = value;
    }

    /**
     * Gets the value of the towingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTowingCharge() {
        return towingCharge;
    }

    /**
     * Sets the value of the towingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTowingCharge(String value) {
        this.towingCharge = value;
    }

    /**
     * Gets the value of the extraCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraCharge() {
        return extraCharge;
    }

    /**
     * Sets the value of the extraCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraCharge(String value) {
        this.extraCharge = value;
    }

    /**
     * Gets the value of the additionalDrivers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdditionalDrivers() {
        return additionalDrivers;
    }

    /**
     * Sets the value of the additionalDrivers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdditionalDrivers(BigInteger value) {
        this.additionalDrivers = value;
    }

    /**
     * Gets the value of the rentalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalAddress() {
        return rentalAddress;
    }

    /**
     * Sets the value of the rentalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalAddress(String value) {
        this.rentalAddress = value;
    }

    /**
     * Gets the value of the driverAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDriverAge() {
        return driverAge;
    }

    /**
     * Sets the value of the driverAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDriverAge(BigInteger value) {
        this.driverAge = value;
    }

    /**
     * Gets the value of the vehicleMake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleMake() {
        return vehicleMake;
    }

    /**
     * Sets the value of the vehicleMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleMake(String value) {
        this.vehicleMake = value;
    }

    /**
     * Gets the value of the vehicleModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * Sets the value of the vehicleModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModel(String value) {
        this.vehicleModel = value;
    }

    /**
     * Gets the value of the corporateClientCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateClientCode() {
        return corporateClientCode;
    }

    /**
     * Sets the value of the corporateClientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateClientCode(String value) {
        this.corporateClientCode = value;
    }

    /**
     * Gets the value of the phoneCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCharge() {
        return phoneCharge;
    }

    /**
     * Sets the value of the phoneCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCharge(String value) {
        this.phoneCharge = value;
    }

    /**
     * Gets the value of the gpsCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsCharge() {
        return gpsCharge;
    }

    /**
     * Sets the value of the gpsCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsCharge(String value) {
        this.gpsCharge = value;
    }

    /**
     * Gets the value of the pickupLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Sets the value of the pickupLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupLocation(String value) {
        this.pickupLocation = value;
    }

    /**
     * Gets the value of the taxAmountSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmountSign() {
        return taxAmountSign;
    }

    /**
     * Sets the value of the taxAmountSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmountSign(String value) {
        this.taxAmountSign = value;
    }

}
