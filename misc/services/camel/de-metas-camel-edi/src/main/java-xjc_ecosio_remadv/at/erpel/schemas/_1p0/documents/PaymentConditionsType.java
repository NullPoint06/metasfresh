
package at.erpel.schemas._1p0.documents;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import at.erpel.schemas._1p0.documents.ext.PaymentConditionsExtensionType;


/**
 * <p>Java class for PaymentConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentConditionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://erpel.at/schemas/1p0/documents}DueDate" minOccurs="0"/&gt;
 *           &lt;element ref="{http://erpel.at/schemas/1p0/documents}Duration" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Discount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}MinimumPayment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Comment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/ext}PaymentConditionsExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentConditionsType", propOrder = {
    "dueDate",
    "duration",
    "discount",
    "minimumPayment",
    "comment",
    "paymentConditionsExtension"
})
public class PaymentConditionsType {

    @XmlElement(name = "DueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "Discount")
    protected List<DiscountType> discount;
    @XmlElement(name = "MinimumPayment")
    protected BigDecimal minimumPayment;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "PaymentConditionsExtension", namespace = "http://erpel.at/schemas/1p0/documents/ext")
    protected PaymentConditionsExtensionType paymentConditionsExtension;

    /**
     * Date when the payment is due.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * The duration starting with the document date when the payment is due.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Details about discounts.Gets the value of the discount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountType }
     * 
     * 
     */
    public List<DiscountType> getDiscount() {
        if (discount == null) {
            discount = new ArrayList<DiscountType>();
        }
        return this.discount;
    }

    /**
     * The minimum payment which must be paid at the payment due date.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPayment() {
        return minimumPayment;
    }

    /**
     * Sets the value of the minimumPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPayment(BigDecimal value) {
        this.minimumPayment = value;
    }

    /**
     * A free-text comment for the payment conditions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the paymentConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentConditionsExtensionType }
     *     
     */
    public PaymentConditionsExtensionType getPaymentConditionsExtension() {
        return paymentConditionsExtension;
    }

    /**
     * Sets the value of the paymentConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentConditionsExtensionType }
     *     
     */
    public void setPaymentConditionsExtension(PaymentConditionsExtensionType value) {
        this.paymentConditionsExtension = value;
    }

}
