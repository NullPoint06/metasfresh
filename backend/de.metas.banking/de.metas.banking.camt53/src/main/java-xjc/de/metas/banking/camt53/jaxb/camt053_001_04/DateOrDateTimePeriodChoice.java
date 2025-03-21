
package de.metas.banking.camt53.jaxb.camt053_001_04;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateOrDateTimePeriodChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateOrDateTimePeriodChoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}DatePeriodDetails"/&gt;
 *         &lt;element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}DateTimePeriodDetails"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOrDateTimePeriodChoice", propOrder = {
    "dt",
    "dtTm"
})
public class DateOrDateTimePeriodChoice {

    @XmlElement(name = "Dt")
    protected DatePeriodDetails dt;
    @XmlElement(name = "DtTm")
    protected DateTimePeriodDetails dtTm;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails }
     *     
     */
    public DatePeriodDetails getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails }
     *     
     */
    public void setDt(DatePeriodDetails value) {
        this.dt = value;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public DateTimePeriodDetails getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public void setDtTm(DateTimePeriodDetails value) {
        this.dtTm = value;
    }

}
