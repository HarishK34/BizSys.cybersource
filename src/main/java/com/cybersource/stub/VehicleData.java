
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VehicleData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="connectorType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="chargingReasonCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleData", propOrder = {
    "connectorType",
    "chargingReasonCode"
})
public class VehicleData {

    protected BigInteger connectorType;
    protected BigInteger chargingReasonCode;

    /**
     * Gets the value of the connectorType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConnectorType() {
        return connectorType;
    }

    /**
     * Sets the value of the connectorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConnectorType(BigInteger value) {
        this.connectorType = value;
    }

    /**
     * Gets the value of the chargingReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargingReasonCode() {
        return chargingReasonCode;
    }

    /**
     * Sets the value of the chargingReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargingReasonCode(BigInteger value) {
        this.chargingReasonCode = value;
    }

}
