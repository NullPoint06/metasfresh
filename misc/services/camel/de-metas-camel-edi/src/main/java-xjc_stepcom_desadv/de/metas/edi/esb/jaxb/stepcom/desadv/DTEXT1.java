
package de.metas.edi.esb.jaxb.stepcom.desadv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTEXT1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTEXT1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DOCUMENTID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LINENUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FREETEXTQUAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FREETEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FREETEXTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FREETEXTLANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FREETEXTFUNCTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTEXT1", propOrder = {
    "documentid",
    "linenumber",
    "freetextqual",
    "freetext",
    "freetextcode",
    "freetextlanguage",
    "freetextfunction"
})
public class DTEXT1 {

    @XmlElement(name = "DOCUMENTID", required = true)
    protected String documentid;
    @XmlElement(name = "LINENUMBER", required = true)
    protected String linenumber;
    @XmlElement(name = "FREETEXTQUAL", required = true)
    protected String freetextqual;
    @XmlElement(name = "FREETEXT")
    protected String freetext;
    @XmlElement(name = "FREETEXTCODE")
    protected String freetextcode;
    @XmlElement(name = "FREETEXTLANGUAGE")
    protected String freetextlanguage;
    @XmlElement(name = "FREETEXTFUNCTION")
    protected String freetextfunction;

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
     * Gets the value of the linenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINENUMBER() {
        return linenumber;
    }

    /**
     * Sets the value of the linenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINENUMBER(String value) {
        this.linenumber = value;
    }

    /**
     * Gets the value of the freetextqual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREETEXTQUAL() {
        return freetextqual;
    }

    /**
     * Sets the value of the freetextqual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREETEXTQUAL(String value) {
        this.freetextqual = value;
    }

    /**
     * Gets the value of the freetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREETEXT() {
        return freetext;
    }

    /**
     * Sets the value of the freetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREETEXT(String value) {
        this.freetext = value;
    }

    /**
     * Gets the value of the freetextcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREETEXTCODE() {
        return freetextcode;
    }

    /**
     * Sets the value of the freetextcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREETEXTCODE(String value) {
        this.freetextcode = value;
    }

    /**
     * Gets the value of the freetextlanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREETEXTLANGUAGE() {
        return freetextlanguage;
    }

    /**
     * Sets the value of the freetextlanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREETEXTLANGUAGE(String value) {
        this.freetextlanguage = value;
    }

    /**
     * Gets the value of the freetextfunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREETEXTFUNCTION() {
        return freetextfunction;
    }

    /**
     * Sets the value of the freetextfunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREETEXTFUNCTION(String value) {
        this.freetextfunction = value;
    }

}
