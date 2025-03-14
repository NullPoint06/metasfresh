
package de.metas.edi.esb.jaxb.stepcom.invoic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Xrech4h complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Xrech4h"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HEADER" type="{}HEADER_Xrech"/&gt;
 *         &lt;element name="TRAILR" type="{}TRAILR"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Xrech4h", propOrder = {
    "header",
    "trailr"
})
public class Xrech4H {

    @XmlElement(name = "HEADER", required = true)
    protected HEADERXrech header;
    @XmlElement(name = "TRAILR", required = true)
    protected TRAILR trailr;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HEADERXrech }
     *     
     */
    public HEADERXrech getHEADER() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HEADERXrech }
     *     
     */
    public void setHEADER(HEADERXrech value) {
        this.header = value;
    }

    /**
     * Gets the value of the trailr property.
     * 
     * @return
     *     possible object is
     *     {@link TRAILR }
     *     
     */
    public TRAILR getTRAILR() {
        return trailr;
    }

    /**
     * Sets the value of the trailr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAILR }
     *     
     */
    public void setTRAILR(TRAILR value) {
        this.trailr = value;
    }

}
