
package de.metas.edi.esb.jaxb.stepcom.desadv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HTRSD1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HTRSD1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DOCUMENTID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TRANSPORTREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANSPORTMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANSPORTMEANS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CARRIERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CARRIERDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCATIONQUAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCATIONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCATIONNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCATIONDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTRSD1", propOrder = {
    "documentid",
    "transportreference",
    "transportmode",
    "transportmeans",
    "carrierid",
    "carrierdesc",
    "locationqual",
    "locationcode",
    "locationname",
    "locationdate"
})
public class HTRSD1 {

    @XmlElement(name = "DOCUMENTID", required = true)
    protected String documentid;
    @XmlElement(name = "TRANSPORTREFERENCE")
    protected String transportreference;
    @XmlElement(name = "TRANSPORTMODE")
    protected String transportmode;
    @XmlElement(name = "TRANSPORTMEANS", required = true)
    protected String transportmeans;
    @XmlElement(name = "CARRIERID")
    protected String carrierid;
    @XmlElement(name = "CARRIERDESC")
    protected String carrierdesc;
    @XmlElement(name = "LOCATIONQUAL")
    protected String locationqual;
    @XmlElement(name = "LOCATIONCODE")
    protected String locationcode;
    @XmlElement(name = "LOCATIONNAME")
    protected String locationname;
    @XmlElement(name = "LOCATIONDATE")
    protected String locationdate;

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
     * Gets the value of the transportreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSPORTREFERENCE() {
        return transportreference;
    }

    /**
     * Sets the value of the transportreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSPORTREFERENCE(String value) {
        this.transportreference = value;
    }

    /**
     * Gets the value of the transportmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSPORTMODE() {
        return transportmode;
    }

    /**
     * Sets the value of the transportmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSPORTMODE(String value) {
        this.transportmode = value;
    }

    /**
     * Gets the value of the transportmeans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSPORTMEANS() {
        return transportmeans;
    }

    /**
     * Sets the value of the transportmeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSPORTMEANS(String value) {
        this.transportmeans = value;
    }

    /**
     * Gets the value of the carrierid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARRIERID() {
        return carrierid;
    }

    /**
     * Sets the value of the carrierid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARRIERID(String value) {
        this.carrierid = value;
    }

    /**
     * Gets the value of the carrierdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARRIERDESC() {
        return carrierdesc;
    }

    /**
     * Sets the value of the carrierdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARRIERDESC(String value) {
        this.carrierdesc = value;
    }

    /**
     * Gets the value of the locationqual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONQUAL() {
        return locationqual;
    }

    /**
     * Sets the value of the locationqual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONQUAL(String value) {
        this.locationqual = value;
    }

    /**
     * Gets the value of the locationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONCODE() {
        return locationcode;
    }

    /**
     * Sets the value of the locationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONCODE(String value) {
        this.locationcode = value;
    }

    /**
     * Gets the value of the locationname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONNAME() {
        return locationname;
    }

    /**
     * Sets the value of the locationname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONNAME(String value) {
        this.locationname = value;
    }

    /**
     * Gets the value of the locationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONDATE() {
        return locationdate;
    }

    /**
     * Sets the value of the locationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONDATE(String value) {
        this.locationdate = value;
    }

}
