
package at.erpel.schemas._1p0.documents.extensions.edifact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for FurtherIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FurtherIdentificationType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://erpel.at/schemas/1p0/documents/extensions/edifact&gt;AlphaNumIDType"&gt;
 *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}IdentificationType use="required""/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FurtherIdentificationType", propOrder = {
    "value"
})
public class FurtherIdentificationType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "IdentificationType", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", required = true)
    protected String identificationType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Used to identify the type of further information. Currently, the following identification types are used: 
     * 								ZZZ ... mutually defined ID by both parties
     * 								IssuedBySupplier      ...  ID given by supplier
     * 								IssuedByCustomer    ...  ID given by customer 
     * 								FiscalNumber           ... fiscal number of party
     * 						
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationType() {
        return identificationType;
    }

    /**
     * Sets the value of the identificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationType(String value) {
        this.identificationType = value;
    }

}
