
package at.erpel.schemas._1p0.documents.extensions.edifact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Department" minOccurs="0"/&gt;
 *         &lt;element name="CustomerReferenceNumber" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}AlphaNumType_35" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}FiscalNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerExtensionType", propOrder = {
    "department",
    "customerReferenceNumber",
    "fiscalNumber"
})
public class CustomerExtensionType {

    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "CustomerReferenceNumber")
    protected String customerReferenceNumber;
    @XmlElement(name = "FiscalNumber")
    protected String fiscalNumber;

    /**
     * Department at the customer's side.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the customerReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReferenceNumber() {
        return customerReferenceNumber;
    }

    /**
     * Sets the value of the customerReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReferenceNumber(String value) {
        this.customerReferenceNumber = value;
    }

    /**
     * Fiscal number of the customer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalNumber() {
        return fiscalNumber;
    }

    /**
     * Sets the value of the fiscalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalNumber(String value) {
        this.fiscalNumber = value;
    }

}
