
package com.cybersource.stub;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PauseRuleResultItems complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PauseRuleResultItems">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ruleResultItem" type="{urn:schemas-cybersource-com:transaction-data-1.219}PauseRuleResultItem" maxOccurs="1000" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PauseRuleResultItems", propOrder = {
    "ruleResultItem"
})
public class PauseRuleResultItems {

    protected List<PauseRuleResultItem> ruleResultItem;

    /**
     * Gets the value of the ruleResultItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleResultItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRuleResultItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PauseRuleResultItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the ruleResultItem property.
     */
    public List<PauseRuleResultItem> getRuleResultItem() {
        if (ruleResultItem == null) {
            ruleResultItem = new ArrayList<>();
        }
        return this.ruleResultItem;
    }

}
