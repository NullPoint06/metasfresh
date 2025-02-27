
package at.erpel.schemas._1p0.documents.extensions.edifact;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for BankCodeCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankCodeCType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
 *       &lt;attribute name="BankCodeType" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}CountryCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankCodeCType", propOrder = {
    "value"
})
public class BankCodeCType {

    @XmlValue
    protected BigInteger value;
    @XmlAttribute(name = "BankCodeType", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact")
    protected CountryCodeType bankCodeType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the bankCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getBankCodeType() {
        return bankCodeType;
    }

    /**
     * Sets the value of the bankCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setBankCodeType(CountryCodeType value) {
        this.bankCodeType = value;
    }

}
