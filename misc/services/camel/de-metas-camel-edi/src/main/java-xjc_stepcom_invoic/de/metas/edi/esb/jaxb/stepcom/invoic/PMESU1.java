
package de.metas.edi.esb.jaxb.stepcom.invoic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PMESU1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PMESU1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DOCUMENTID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MEASUREQUAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MEASUREATTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEASUREUNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEASUREVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMESU1", propOrder = {
    "documentid",
    "measurequal",
    "measureattr",
    "measureunit",
    "measurevalue"
})
public class PMESU1 {

    @XmlElement(name = "DOCUMENTID", required = true)
    protected String documentid;
    @XmlElement(name = "MEASUREQUAL", required = true)
    protected String measurequal;
    @XmlElement(name = "MEASUREATTR")
    protected String measureattr;
    @XmlElement(name = "MEASUREUNIT")
    protected String measureunit;
    @XmlElement(name = "MEASUREVALUE")
    protected String measurevalue;

    /**
     * Gets the value of the documentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTID() {
        return documentid;
    }

    /**
     * Sets the value of the documentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTID(String value) {
        this.documentid = value;
    }

    /**
     * Gets the value of the measurequal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEASUREQUAL() {
        return measurequal;
    }

    /**
     * Sets the value of the measurequal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEASUREQUAL(String value) {
        this.measurequal = value;
    }

    /**
     * Gets the value of the measureattr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEASUREATTR() {
        return measureattr;
    }

    /**
     * Sets the value of the measureattr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEASUREATTR(String value) {
        this.measureattr = value;
    }

    /**
     * Gets the value of the measureunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEASUREUNIT() {
        return measureunit;
    }

    /**
     * Sets the value of the measureunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEASUREUNIT(String value) {
        this.measureunit = value;
    }

    /**
     * Gets the value of the measurevalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEASUREVALUE() {
        return measurevalue;
    }

    /**
     * Sets the value of the measurevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEASUREVALUE(String value) {
        this.measurevalue = value;
    }

}
