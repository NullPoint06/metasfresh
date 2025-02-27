
package at.erpel.schemas._1p0.documents.extensions.edifact;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for ForecastListLineItemExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastListLineItemExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}AdditionalBusinessPartner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}FreeText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}MaterialAuthorizationDuration" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ProductionAuthorizationDuration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastListLineItemExtensionType", propOrder = {
    "additionalBusinessPartner",
    "freeText",
    "materialAuthorizationDuration",
    "productionAuthorizationDuration"
})
public class ForecastListLineItemExtensionType {

    @XmlElement(name = "AdditionalBusinessPartner")
    protected List<BusinessEntityType> additionalBusinessPartner;
    @XmlElement(name = "FreeText")
    protected FreeTextType freeText;
    @XmlElement(name = "MaterialAuthorizationDuration")
    protected Duration materialAuthorizationDuration;
    @XmlElement(name = "ProductionAuthorizationDuration")
    protected Duration productionAuthorizationDuration;

    /**
     * Used to provide details about additional business partners, which are not contained in the core schema, such as ultimate consignee, etc.Gets the value of the additionalBusinessPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalBusinessPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalBusinessPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessEntityType }
     * 
     * 
     */
    public List<BusinessEntityType> getAdditionalBusinessPartner() {
        if (additionalBusinessPartner == null) {
            additionalBusinessPartner = new ArrayList<BusinessEntityType>();
        }
        return this.additionalBusinessPartner;
    }

    /**
     * Arbitrary free text, which is sent with the forecast - e.g., "Factory closed due to holidays between 20.06. and 01.07."
     * 
     * @return
     *     possible object is
     *     {@link FreeTextType }
     *     
     */
    public FreeTextType getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextType }
     *     
     */
    public void setFreeText(FreeTextType value) {
        this.freeText = value;
    }

    /**
     * Additional duration information for MaterialAuthorization (.../ForecastListLineItem/AdditionalForecastInformation/MaterialAuthorization) coded in ISO 8601/durations format.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaterialAuthorizationDuration() {
        return materialAuthorizationDuration;
    }

    /**
     * Sets the value of the materialAuthorizationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaterialAuthorizationDuration(Duration value) {
        this.materialAuthorizationDuration = value;
    }

    /**
     * Additional duration information for ProductionAuthorization (.../ForecastListLineItem/AdditionalForecastInformation/ProductionAuthorization) coded in ISO 8601/durations format.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getProductionAuthorizationDuration() {
        return productionAuthorizationDuration;
    }

    /**
     * Sets the value of the productionAuthorizationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setProductionAuthorizationDuration(Duration value) {
        this.productionAuthorizationDuration = value;
    }

}
