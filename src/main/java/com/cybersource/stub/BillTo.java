
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillTo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BillTo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="buildingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="street2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="street3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="street4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="street5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="companyTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipNetworkAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="driversLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="driversLicenseState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="httpBrowserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="httpBrowserEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="httpBrowserCookiesAccepted" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="nif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="personalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="passportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="passportCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerAccountCreateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerAccountChangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerAccountPasswordChangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pointOfReference" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="defaultIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="companyStreet1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="companyStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="companyCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="companyCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="companyState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="companyPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="companyPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="httpBrowserColorDepth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="httpBrowserJavaEnabled" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="httpBrowserJavaScriptEnabled" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="httpBrowserLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="httpBrowserScreenHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="httpBrowserScreenWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="httpBrowserTimeDifference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="alternatePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="alternateEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillTo", propOrder = {
    "title",
    "firstName",
    "middleName",
    "lastName",
    "suffix",
    "buildingNumber",
    "street1",
    "street2",
    "street3",
    "street4",
    "street5",
    "city",
    "district",
    "county",
    "state",
    "postalCode",
    "country",
    "company",
    "companyTaxID",
    "phoneNumber",
    "email",
    "ipAddress",
    "customerUserName",
    "customerPassword",
    "ipNetworkAddress",
    "hostname",
    "domainName",
    "dateOfBirth",
    "driversLicenseNumber",
    "driversLicenseState",
    "ssn",
    "customerID",
    "httpBrowserType",
    "httpBrowserEmail",
    "httpBrowserCookiesAccepted",
    "nif",
    "personalID",
    "language",
    "name",
    "gender",
    "merchantTaxID",
    "passportNumber",
    "passportCountry",
    "customerAccountCreateDate",
    "customerAccountChangeDate",
    "customerAccountPasswordChangeDate",
    "pointOfReference",
    "defaultIndicator",
    "companyStreet1",
    "companyStreet2",
    "companyCity",
    "companyCountry",
    "companyState",
    "companyPostalCode",
    "prefix",
    "companyPhoneNumber",
    "httpBrowserColorDepth",
    "httpBrowserJavaEnabled",
    "httpBrowserJavaScriptEnabled",
    "httpBrowserLanguage",
    "httpBrowserScreenHeight",
    "httpBrowserScreenWidth",
    "httpBrowserTimeDifference",
    "alternatePhoneNumber",
    "alternateEmail"
})
public class BillTo {

    protected String title;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String suffix;
    protected String buildingNumber;
    protected String street1;
    protected String street2;
    protected String street3;
    protected String street4;
    protected String street5;
    protected String city;
    protected String district;
    protected String county;
    protected String state;
    protected String postalCode;
    protected String country;
    protected String company;
    protected String companyTaxID;
    protected String phoneNumber;
    protected String email;
    protected String ipAddress;
    protected String customerUserName;
    protected String customerPassword;
    protected String ipNetworkAddress;
    protected String hostname;
    protected String domainName;
    protected String dateOfBirth;
    protected String driversLicenseNumber;
    protected String driversLicenseState;
    protected String ssn;
    protected String customerID;
    protected String httpBrowserType;
    protected String httpBrowserEmail;
    protected String httpBrowserCookiesAccepted;
    protected String nif;
    protected String personalID;
    protected String language;
    protected String name;
    protected String gender;
    protected String merchantTaxID;
    protected String passportNumber;
    protected String passportCountry;
    protected String customerAccountCreateDate;
    protected String customerAccountChangeDate;
    protected String customerAccountPasswordChangeDate;
    protected String pointOfReference;
    protected String defaultIndicator;
    protected String companyStreet1;
    protected String companyStreet2;
    protected String companyCity;
    protected String companyCountry;
    protected String companyState;
    protected String companyPostalCode;
    protected String prefix;
    protected String companyPhoneNumber;
    protected String httpBrowserColorDepth;
    protected String httpBrowserJavaEnabled;
    protected String httpBrowserJavaScriptEnabled;
    protected String httpBrowserLanguage;
    protected String httpBrowserScreenHeight;
    protected String httpBrowserScreenWidth;
    protected String httpBrowserTimeDifference;
    protected String alternatePhoneNumber;
    protected String alternateEmail;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNumber(String value) {
        this.buildingNumber = value;
    }

    /**
     * Gets the value of the street1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Sets the value of the street1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Gets the value of the street2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Sets the value of the street2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Gets the value of the street3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet3() {
        return street3;
    }

    /**
     * Sets the value of the street3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet3(String value) {
        this.street3 = value;
    }

    /**
     * Gets the value of the street4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet4() {
        return street4;
    }

    /**
     * Sets the value of the street4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet4(String value) {
        this.street4 = value;
    }

    /**
     * Gets the value of the street5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet5() {
        return street5;
    }

    /**
     * Sets the value of the street5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet5(String value) {
        this.street5 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the companyTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyTaxID() {
        return companyTaxID;
    }

    /**
     * Sets the value of the companyTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyTaxID(String value) {
        this.companyTaxID = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the customerUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUserName() {
        return customerUserName;
    }

    /**
     * Sets the value of the customerUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUserName(String value) {
        this.customerUserName = value;
    }

    /**
     * Gets the value of the customerPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPassword() {
        return customerPassword;
    }

    /**
     * Sets the value of the customerPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPassword(String value) {
        this.customerPassword = value;
    }

    /**
     * Gets the value of the ipNetworkAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpNetworkAddress() {
        return ipNetworkAddress;
    }

    /**
     * Sets the value of the ipNetworkAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpNetworkAddress(String value) {
        this.ipNetworkAddress = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the driversLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseNumber() {
        return driversLicenseNumber;
    }

    /**
     * Sets the value of the driversLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseNumber(String value) {
        this.driversLicenseNumber = value;
    }

    /**
     * Gets the value of the driversLicenseState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseState() {
        return driversLicenseState;
    }

    /**
     * Sets the value of the driversLicenseState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseState(String value) {
        this.driversLicenseState = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the httpBrowserType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserType() {
        return httpBrowserType;
    }

    /**
     * Sets the value of the httpBrowserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserType(String value) {
        this.httpBrowserType = value;
    }

    /**
     * Gets the value of the httpBrowserEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserEmail() {
        return httpBrowserEmail;
    }

    /**
     * Sets the value of the httpBrowserEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserEmail(String value) {
        this.httpBrowserEmail = value;
    }

    /**
     * Gets the value of the httpBrowserCookiesAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserCookiesAccepted() {
        return httpBrowserCookiesAccepted;
    }

    /**
     * Sets the value of the httpBrowserCookiesAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserCookiesAccepted(String value) {
        this.httpBrowserCookiesAccepted = value;
    }

    /**
     * Gets the value of the nif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNif() {
        return nif;
    }

    /**
     * Sets the value of the nif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNif(String value) {
        this.nif = value;
    }

    /**
     * Gets the value of the personalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalID() {
        return personalID;
    }

    /**
     * Sets the value of the personalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalID(String value) {
        this.personalID = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the merchantTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTaxID() {
        return merchantTaxID;
    }

    /**
     * Sets the value of the merchantTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTaxID(String value) {
        this.merchantTaxID = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the passportCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportCountry() {
        return passportCountry;
    }

    /**
     * Sets the value of the passportCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportCountry(String value) {
        this.passportCountry = value;
    }

    /**
     * Gets the value of the customerAccountCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountCreateDate() {
        return customerAccountCreateDate;
    }

    /**
     * Sets the value of the customerAccountCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountCreateDate(String value) {
        this.customerAccountCreateDate = value;
    }

    /**
     * Gets the value of the customerAccountChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountChangeDate() {
        return customerAccountChangeDate;
    }

    /**
     * Sets the value of the customerAccountChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountChangeDate(String value) {
        this.customerAccountChangeDate = value;
    }

    /**
     * Gets the value of the customerAccountPasswordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountPasswordChangeDate() {
        return customerAccountPasswordChangeDate;
    }

    /**
     * Sets the value of the customerAccountPasswordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountPasswordChangeDate(String value) {
        this.customerAccountPasswordChangeDate = value;
    }

    /**
     * Gets the value of the pointOfReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfReference() {
        return pointOfReference;
    }

    /**
     * Sets the value of the pointOfReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfReference(String value) {
        this.pointOfReference = value;
    }

    /**
     * Gets the value of the defaultIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * Sets the value of the defaultIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultIndicator(String value) {
        this.defaultIndicator = value;
    }

    /**
     * Gets the value of the companyStreet1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyStreet1() {
        return companyStreet1;
    }

    /**
     * Sets the value of the companyStreet1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyStreet1(String value) {
        this.companyStreet1 = value;
    }

    /**
     * Gets the value of the companyStreet2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyStreet2() {
        return companyStreet2;
    }

    /**
     * Sets the value of the companyStreet2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyStreet2(String value) {
        this.companyStreet2 = value;
    }

    /**
     * Gets the value of the companyCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCity() {
        return companyCity;
    }

    /**
     * Sets the value of the companyCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCity(String value) {
        this.companyCity = value;
    }

    /**
     * Gets the value of the companyCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCountry() {
        return companyCountry;
    }

    /**
     * Sets the value of the companyCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCountry(String value) {
        this.companyCountry = value;
    }

    /**
     * Gets the value of the companyState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyState() {
        return companyState;
    }

    /**
     * Sets the value of the companyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyState(String value) {
        this.companyState = value;
    }

    /**
     * Gets the value of the companyPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPostalCode() {
        return companyPostalCode;
    }

    /**
     * Sets the value of the companyPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPostalCode(String value) {
        this.companyPostalCode = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the companyPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    /**
     * Sets the value of the companyPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPhoneNumber(String value) {
        this.companyPhoneNumber = value;
    }

    /**
     * Gets the value of the httpBrowserColorDepth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserColorDepth() {
        return httpBrowserColorDepth;
    }

    /**
     * Sets the value of the httpBrowserColorDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserColorDepth(String value) {
        this.httpBrowserColorDepth = value;
    }

    /**
     * Gets the value of the httpBrowserJavaEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserJavaEnabled() {
        return httpBrowserJavaEnabled;
    }

    /**
     * Sets the value of the httpBrowserJavaEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserJavaEnabled(String value) {
        this.httpBrowserJavaEnabled = value;
    }

    /**
     * Gets the value of the httpBrowserJavaScriptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserJavaScriptEnabled() {
        return httpBrowserJavaScriptEnabled;
    }

    /**
     * Sets the value of the httpBrowserJavaScriptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserJavaScriptEnabled(String value) {
        this.httpBrowserJavaScriptEnabled = value;
    }

    /**
     * Gets the value of the httpBrowserLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserLanguage() {
        return httpBrowserLanguage;
    }

    /**
     * Sets the value of the httpBrowserLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserLanguage(String value) {
        this.httpBrowserLanguage = value;
    }

    /**
     * Gets the value of the httpBrowserScreenHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserScreenHeight() {
        return httpBrowserScreenHeight;
    }

    /**
     * Sets the value of the httpBrowserScreenHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserScreenHeight(String value) {
        this.httpBrowserScreenHeight = value;
    }

    /**
     * Gets the value of the httpBrowserScreenWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserScreenWidth() {
        return httpBrowserScreenWidth;
    }

    /**
     * Sets the value of the httpBrowserScreenWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserScreenWidth(String value) {
        this.httpBrowserScreenWidth = value;
    }

    /**
     * Gets the value of the httpBrowserTimeDifference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserTimeDifference() {
        return httpBrowserTimeDifference;
    }

    /**
     * Sets the value of the httpBrowserTimeDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserTimeDifference(String value) {
        this.httpBrowserTimeDifference = value;
    }

    /**
     * Gets the value of the alternatePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePhoneNumber() {
        return alternatePhoneNumber;
    }

    /**
     * Sets the value of the alternatePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePhoneNumber(String value) {
        this.alternatePhoneNumber = value;
    }

    /**
     * Gets the value of the alternateEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateEmail() {
        return alternateEmail;
    }

    /**
     * Sets the value of the alternateEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateEmail(String value) {
        this.alternateEmail = value;
    }

}
