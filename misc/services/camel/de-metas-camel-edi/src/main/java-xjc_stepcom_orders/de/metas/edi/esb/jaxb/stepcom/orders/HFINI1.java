
package de.metas.edi.esb.jaxb.stepcom.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HFINI1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HFINI1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DOCUMENTID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ADDRESSQUAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PARTYFUNCTIONQUAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ACCOUNTHOLDERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNTHOLDERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNTHOLDERCURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSTITUTIONNAMECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSTITUTIONBRANCHID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSTITUTIONNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSTITUTIONLOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HFINI1", propOrder = {
    "documentid",
    "addressqual",
    "partyfunctionqual",
    "accountholderid",
    "accountholdername",
    "accountholdercurr",
    "institutionnamecode",
    "institutionbranchid",
    "institutionname",
    "institutionlocation",
    "country"
})
public class HFINI1 {

    @XmlElement(name = "DOCUMENTID", required = true)
    protected String documentid;
    @XmlElement(name = "ADDRESSQUAL", required = true)
    protected String addressqual;
    @XmlElement(name = "PARTYFUNCTIONQUAL", required = true)
    protected String partyfunctionqual;
    @XmlElement(name = "ACCOUNTHOLDERID")
    protected String accountholderid;
    @XmlElement(name = "ACCOUNTHOLDERNAME")
    protected String accountholdername;
    @XmlElement(name = "ACCOUNTHOLDERCURR")
    protected String accountholdercurr;
    @XmlElement(name = "INSTITUTIONNAMECODE")
    protected String institutionnamecode;
    @XmlElement(name = "INSTITUTIONBRANCHID")
    protected String institutionbranchid;
    @XmlElement(name = "INSTITUTIONNAME")
    protected String institutionname;
    @XmlElement(name = "INSTITUTIONLOCATION")
    protected String institutionlocation;
    @XmlElement(name = "COUNTRY")
    protected String country;

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
     * Gets the value of the addressqual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESSQUAL() {
        return addressqual;
    }

    /**
     * Sets the value of the addressqual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESSQUAL(String value) {
        this.addressqual = value;
    }

    /**
     * Gets the value of the partyfunctionqual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTYFUNCTIONQUAL() {
        return partyfunctionqual;
    }

    /**
     * Sets the value of the partyfunctionqual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTYFUNCTIONQUAL(String value) {
        this.partyfunctionqual = value;
    }

    /**
     * Gets the value of the accountholderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTHOLDERID() {
        return accountholderid;
    }

    /**
     * Sets the value of the accountholderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTHOLDERID(String value) {
        this.accountholderid = value;
    }

    /**
     * Gets the value of the accountholdername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTHOLDERNAME() {
        return accountholdername;
    }

    /**
     * Sets the value of the accountholdername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTHOLDERNAME(String value) {
        this.accountholdername = value;
    }

    /**
     * Gets the value of the accountholdercurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTHOLDERCURR() {
        return accountholdercurr;
    }

    /**
     * Sets the value of the accountholdercurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTHOLDERCURR(String value) {
        this.accountholdercurr = value;
    }

    /**
     * Gets the value of the institutionnamecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUTIONNAMECODE() {
        return institutionnamecode;
    }

    /**
     * Sets the value of the institutionnamecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUTIONNAMECODE(String value) {
        this.institutionnamecode = value;
    }

    /**
     * Gets the value of the institutionbranchid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUTIONBRANCHID() {
        return institutionbranchid;
    }

    /**
     * Sets the value of the institutionbranchid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUTIONBRANCHID(String value) {
        this.institutionbranchid = value;
    }

    /**
     * Gets the value of the institutionname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUTIONNAME() {
        return institutionname;
    }

    /**
     * Sets the value of the institutionname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUTIONNAME(String value) {
        this.institutionname = value;
    }

    /**
     * Gets the value of the institutionlocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUTIONLOCATION() {
        return institutionlocation;
    }

    /**
     * Sets the value of the institutionlocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUTIONLOCATION(String value) {
        this.institutionlocation = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
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
    public void setCOUNTRY(String value) {
        this.country = value;
    }

}
