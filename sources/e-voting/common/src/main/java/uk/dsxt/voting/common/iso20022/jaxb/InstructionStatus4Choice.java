//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 03:58:45 PM GMT+03:00 
//


package uk.dsxt.voting.common.iso20022.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionStatus4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstructionStatus4Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PrcgSts" type="{}InstructionProcessingStatus1"/>
 *         &lt;element name="RjctnSts" type="{}AdditionalStatus1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionStatus4Choice", propOrder = {
    "prcgSts",
    "rjctnSts"
})
public class InstructionStatus4Choice {

    @XmlElement(name = "PrcgSts")
    protected InstructionProcessingStatus1 prcgSts;
    @XmlElement(name = "RjctnSts")
    protected AdditionalStatus1 rjctnSts;

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus1 }
     *     
     */
    public InstructionProcessingStatus1 getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus1 }
     *     
     */
    public void setPrcgSts(InstructionProcessingStatus1 value) {
        this.prcgSts = value;
    }

    /**
     * Gets the value of the rjctnSts property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalStatus1 }
     *     
     */
    public AdditionalStatus1 getRjctnSts() {
        return rjctnSts;
    }

    /**
     * Sets the value of the rjctnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalStatus1 }
     *     
     */
    public void setRjctnSts(AdditionalStatus1 value) {
        this.rjctnSts = value;
    }

}
