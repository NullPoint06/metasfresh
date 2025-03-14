
package de.metas.edi.esb.jaxb.stepcom.desadv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HALCH1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HALCH1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DOCUMENTID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ALLOWCHARGEQUAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ALLOWCHARGECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ALLOWCHARGEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPECSERVICECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPECSERVICEDESC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPECSERVICEDESC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAXCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAXRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAXCATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAXAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAXABLEAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HALCH1", propOrder = {
    "documentid",
    "allowchargequal",
    "allowchargecode",
    "allowchargeid",
    "specservicecode",
    "specservicedesc1",
    "specservicedesc2",
    "percentage",
    "amount",
    "currency",
    "taxcode",
    "taxrate",
    "taxcategory",
    "taxamount",
    "taxableamount"
})
public class HALCH1 {

    @XmlElement(name = "DOCUMENTID", required = true)
    protected String documentid;
    @XmlElement(name = "ALLOWCHARGEQUAL", required = true)
    protected String allowchargequal;
    @XmlElement(name = "ALLOWCHARGECODE")
    protected String allowchargecode;
    @XmlElement(name = "ALLOWCHARGEID")
    protected String allowchargeid;
    @XmlElement(name = "SPECSERVICECODE")
    protected String specservicecode;
    @XmlElement(name = "SPECSERVICEDESC1")
    protected String specservicedesc1;
    @XmlElement(name = "SPECSERVICEDESC2")
    protected String specservicedesc2;
    @XmlElement(name = "PERCENTAGE")
    protected String percentage;
    @XmlElement(name = "AMOUNT")
    protected String amount;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "TAXCODE")
    protected String taxcode;
    @XmlElement(name = "TAXRATE")
    protected String taxrate;
    @XmlElement(name = "TAXCATEGORY")
    protected String taxcategory;
    @XmlElement(name = "TAXAMOUNT")
    protected String taxamount;
    @XmlElement(name = "TAXABLEAMOUNT")
    protected String taxableamount;

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
     * Gets the value of the allowchargequal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWCHARGEQUAL() {
        return allowchargequal;
    }

    /**
     * Sets the value of the allowchargequal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWCHARGEQUAL(String value) {
        this.allowchargequal = value;
    }

    /**
     * Gets the value of the allowchargecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWCHARGECODE() {
        return allowchargecode;
    }

    /**
     * Sets the value of the allowchargecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWCHARGECODE(String value) {
        this.allowchargecode = value;
    }

    /**
     * Gets the value of the allowchargeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWCHARGEID() {
        return allowchargeid;
    }

    /**
     * Sets the value of the allowchargeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWCHARGEID(String value) {
        this.allowchargeid = value;
    }

    /**
     * Gets the value of the specservicecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPECSERVICECODE() {
        return specservicecode;
    }

    /**
     * Sets the value of the specservicecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPECSERVICECODE(String value) {
        this.specservicecode = value;
    }

    /**
     * Gets the value of the specservicedesc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPECSERVICEDESC1() {
        return specservicedesc1;
    }

    /**
     * Sets the value of the specservicedesc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPECSERVICEDESC1(String value) {
        this.specservicedesc1 = value;
    }

    /**
     * Gets the value of the specservicedesc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPECSERVICEDESC2() {
        return specservicedesc2;
    }

    /**
     * Sets the value of the specservicedesc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPECSERVICEDESC2(String value) {
        this.specservicedesc2 = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERCENTAGE() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERCENTAGE(String value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNT(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the taxcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXCODE() {
        return taxcode;
    }

    /**
     * Sets the value of the taxcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXCODE(String value) {
        this.taxcode = value;
    }

    /**
     * Gets the value of the taxrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXRATE() {
        return taxrate;
    }

    /**
     * Sets the value of the taxrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXRATE(String value) {
        this.taxrate = value;
    }

    /**
     * Gets the value of the taxcategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXCATEGORY() {
        return taxcategory;
    }

    /**
     * Sets the value of the taxcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXCATEGORY(String value) {
        this.taxcategory = value;
    }

    /**
     * Gets the value of the taxamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXAMOUNT() {
        return taxamount;
    }

    /**
     * Sets the value of the taxamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXAMOUNT(String value) {
        this.taxamount = value;
    }

    /**
     * Gets the value of the taxableamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXABLEAMOUNT() {
        return taxableamount;
    }

    /**
     * Sets the value of the taxableamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXABLEAMOUNT(String value) {
        this.taxableamount = value;
    }

}
