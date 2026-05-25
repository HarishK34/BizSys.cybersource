
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Wallet complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Wallet">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="userPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="avv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="eciRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticatonMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardEnrollmentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paresStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="veresEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="totalPurchaseAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="subtotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="giftWrapAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="promotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="enrollmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="staySignedInIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="httpResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="errorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pinURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wallet", propOrder = {
    "type",
    "orderID",
    "merchantReferenceID",
    "userPhone",
    "avv",
    "eciRaw",
    "authenticatonMethod",
    "cardEnrollmentMethod",
    "paresStatus",
    "veresEnrolled",
    "xid",
    "totalPurchaseAmount",
    "subtotalAmount",
    "discountAmount",
    "giftWrapAmount",
    "eventType",
    "promotionCode",
    "enrollmentID",
    "staySignedInIndicator",
    "authenticationData",
    "deviceID",
    "httpResponse",
    "errorCode",
    "errorDescription",
    "pinURL"
})
public class Wallet {

    protected String type;
    protected String orderID;
    protected String merchantReferenceID;
    protected String userPhone;
    protected String avv;
    protected String eciRaw;
    protected String authenticatonMethod;
    protected String cardEnrollmentMethod;
    protected String paresStatus;
    protected String veresEnrolled;
    protected String xid;
    protected String totalPurchaseAmount;
    protected String subtotalAmount;
    protected String discountAmount;
    protected String giftWrapAmount;
    protected String eventType;
    protected String promotionCode;
    protected String enrollmentID;
    protected String staySignedInIndicator;
    protected String authenticationData;
    protected String deviceID;
    protected String httpResponse;
    protected String errorCode;
    protected String errorDescription;
    protected String pinURL;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the merchantReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReferenceID() {
        return merchantReferenceID;
    }

    /**
     * Sets the value of the merchantReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReferenceID(String value) {
        this.merchantReferenceID = value;
    }

    /**
     * Gets the value of the userPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * Sets the value of the userPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPhone(String value) {
        this.userPhone = value;
    }

    /**
     * Gets the value of the avv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvv() {
        return avv;
    }

    /**
     * Sets the value of the avv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvv(String value) {
        this.avv = value;
    }

    /**
     * Gets the value of the eciRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEciRaw() {
        return eciRaw;
    }

    /**
     * Sets the value of the eciRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEciRaw(String value) {
        this.eciRaw = value;
    }

    /**
     * Gets the value of the authenticatonMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticatonMethod() {
        return authenticatonMethod;
    }

    /**
     * Sets the value of the authenticatonMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticatonMethod(String value) {
        this.authenticatonMethod = value;
    }

    /**
     * Gets the value of the cardEnrollmentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardEnrollmentMethod() {
        return cardEnrollmentMethod;
    }

    /**
     * Sets the value of the cardEnrollmentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardEnrollmentMethod(String value) {
        this.cardEnrollmentMethod = value;
    }

    /**
     * Gets the value of the paresStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParesStatus() {
        return paresStatus;
    }

    /**
     * Sets the value of the paresStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParesStatus(String value) {
        this.paresStatus = value;
    }

    /**
     * Gets the value of the veresEnrolled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeresEnrolled() {
        return veresEnrolled;
    }

    /**
     * Sets the value of the veresEnrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeresEnrolled(String value) {
        this.veresEnrolled = value;
    }

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXid() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXid(String value) {
        this.xid = value;
    }

    /**
     * Gets the value of the totalPurchaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    /**
     * Sets the value of the totalPurchaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPurchaseAmount(String value) {
        this.totalPurchaseAmount = value;
    }

    /**
     * Gets the value of the subtotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Sets the value of the subtotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotalAmount(String value) {
        this.subtotalAmount = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the giftWrapAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftWrapAmount() {
        return giftWrapAmount;
    }

    /**
     * Sets the value of the giftWrapAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftWrapAmount(String value) {
        this.giftWrapAmount = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the enrollmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentID() {
        return enrollmentID;
    }

    /**
     * Sets the value of the enrollmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentID(String value) {
        this.enrollmentID = value;
    }

    /**
     * Gets the value of the staySignedInIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaySignedInIndicator() {
        return staySignedInIndicator;
    }

    /**
     * Sets the value of the staySignedInIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaySignedInIndicator(String value) {
        this.staySignedInIndicator = value;
    }

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
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the httpResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpResponse() {
        return httpResponse;
    }

    /**
     * Sets the value of the httpResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpResponse(String value) {
        this.httpResponse = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the pinURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinURL() {
        return pinURL;
    }

    /**
     * Sets the value of the pinURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinURL(String value) {
        this.pinURL = value;
    }

}
