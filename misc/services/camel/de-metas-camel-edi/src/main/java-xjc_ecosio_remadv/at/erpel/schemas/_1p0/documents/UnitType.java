
package at.erpel.schemas._1p0.documents;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for UnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://erpel.at/schemas/1p0/documents&gt;Decimal4Type"&gt;
 *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents}Unit use="required""/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitType", propOrder = {
    "value"
})
public class UnitType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "Unit", namespace = "http://erpel.at/schemas/1p0/documents", required = true)
    protected String unit;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * The type of unit. ERPEL recommends the use of code list UN/ECE recommendation 20. Note, that ERPEL supports both representations for piece: PCE and C62. A list of valid codes may be found under https://docs.ecosio.com/files/Measure_Unit_Qualifiers_6411.pdf
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
