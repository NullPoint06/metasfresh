
package de.metas.edi.esb.jaxb.metasfresh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EDI_Imp_C_UOM_Lookup_UOMSymbolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDI_Imp_C_UOM_Lookup_UOMSymbolType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="X12DE355" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDI_Imp_C_UOM_Lookup_UOMSymbolType", propOrder = {
    "x12DE355"
})
public class EDIImpCUOMLookupUOMSymbolType {

    @XmlElement(name = "X12DE355", required = true)
    protected String x12DE355;

    /**
     * Gets the value of the x12DE355 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX12DE355() {
        return x12DE355;
    }

    /**
     * Sets the value of the x12DE355 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX12DE355(String value) {
        this.x12DE355 = value;
    }

}
