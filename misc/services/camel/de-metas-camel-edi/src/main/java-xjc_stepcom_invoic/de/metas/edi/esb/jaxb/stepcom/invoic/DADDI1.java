
package de.metas.edi.esb.jaxb.stepcom.invoic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DADDI1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DADDI1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DOCUMENTID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LINENUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ADDINFO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DADDI1", propOrder = {
    "documentid",
    "linenumber",
    "addinfo"
})
public class DADDI1 {

    @XmlElement(name = "DOCUMENTID", required = true)
    protected String documentid;
    @XmlElement(name = "LINENUMBER", required = true)
    protected String linenumber;
    @XmlElement(name = "ADDINFO", required = true)
    protected String addinfo;

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
     * Gets the value of the addinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDINFO() {
        return addinfo;
    }

    /**
     * Sets the value of the addinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDINFO(String value) {
        this.addinfo = value;
    }

}
