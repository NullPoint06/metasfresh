
package de.metas.banking.camt53.jaxb.camt053_001_02;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentQuantityChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrumentQuantityChoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}DecimalNumber"/&gt;
 *           &lt;element name="FaceAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ImpliedCurrencyAndAmount"/&gt;
 *           &lt;element name="AmtsdVal" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ImpliedCurrencyAndAmount"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantityChoice", propOrder = {
    "unit",
    "faceAmt",
    "amtsdVal"
})
public class FinancialInstrumentQuantityChoice {

    @XmlElement(name = "Unit")
    protected BigDecimal unit;
    @XmlElement(name = "FaceAmt")
    protected BigDecimal faceAmt;
    @XmlElement(name = "AmtsdVal")
    protected BigDecimal amtsdVal;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnit(BigDecimal value) {
        this.unit = value;
    }

    /**
     * Gets the value of the faceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFaceAmt() {
        return faceAmt;
    }

    /**
     * Sets the value of the faceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFaceAmt(BigDecimal value) {
        this.faceAmt = value;
    }

    /**
     * Gets the value of the amtsdVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtsdVal() {
        return amtsdVal;
    }

    /**
     * Sets the value of the amtsdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtsdVal(BigDecimal value) {
        this.amtsdVal = value;
    }

}
