
package at.erpel.schemas._1p0.documents.extensions.edifact;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for INVRPTListLineItemExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INVRPTListLineItemExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Details" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InventoryMovementDirectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="InventoryMovementReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="InventoryBalanceMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Code" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Type"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="InventoryQuantities" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}InventoryAdjustmentQuantity" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ActualInventoryQuantity" minOccurs="0"/&gt;
 *                             &lt;element name="Quantity" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Unit"/&gt;
 *                                     &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Type"/&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="InventoryDates" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}BookingDate" minOccurs="0"/&gt;
 *                             &lt;element name="Date" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
 *                                     &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Type"/&gt;
 *                                     &lt;attribute name="DateFormatCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="InventoryReferences" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OriginalShippmentReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" minOccurs="0"/&gt;
 *                             &lt;element name="OrderReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" minOccurs="0"/&gt;
 *                             &lt;element name="InvoiceReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" minOccurs="0"/&gt;
 *                             &lt;element name="StockEntryReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" minOccurs="0"/&gt;
 *                             &lt;element name="AdditionalReferences" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INVRPTListLineItemExtensionType", propOrder = {
    "details"
})
public class INVRPTListLineItemExtensionType {

    @XmlElement(name = "Details")
    protected List<INVRPTListLineItemExtensionType.Details> details;

    /**
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INVRPTListLineItemExtensionType.Details }
     * 
     * 
     */
    public List<INVRPTListLineItemExtensionType.Details> getDetails() {
        if (details == null) {
            details = new ArrayList<INVRPTListLineItemExtensionType.Details>();
        }
        return this.details;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="InventoryMovementDirectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="InventoryMovementReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="InventoryBalanceMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Code" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Type"/&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="InventoryQuantities" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}InventoryAdjustmentQuantity" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ActualInventoryQuantity" minOccurs="0"/&gt;
     *                   &lt;element name="Quantity" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Unit"/&gt;
     *                           &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Type"/&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="InventoryDates" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}BookingDate" minOccurs="0"/&gt;
     *                   &lt;element name="Date" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
     *                           &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Type"/&gt;
     *                           &lt;attribute name="DateFormatCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="InventoryReferences" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OriginalShippmentReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" minOccurs="0"/&gt;
     *                   &lt;element name="OrderReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" minOccurs="0"/&gt;
     *                   &lt;element name="InvoiceReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" minOccurs="0"/&gt;
     *                   &lt;element name="StockEntryReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" minOccurs="0"/&gt;
     *                   &lt;element name="AdditionalReferences" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inventoryMovementDirectionCode",
        "inventoryMovementReasonCode",
        "inventoryBalanceMethodCode",
        "code",
        "inventoryQuantities",
        "inventoryDates",
        "inventoryReferences"
    })
    public static class Details {

        @XmlElement(name = "InventoryMovementDirectionCode")
        protected String inventoryMovementDirectionCode;
        @XmlElement(name = "InventoryMovementReasonCode")
        protected String inventoryMovementReasonCode;
        @XmlElement(name = "InventoryBalanceMethodCode")
        protected String inventoryBalanceMethodCode;
        @XmlElement(name = "Code")
        protected List<INVRPTListLineItemExtensionType.Details.Code> code;
        @XmlElement(name = "InventoryQuantities")
        protected INVRPTListLineItemExtensionType.Details.InventoryQuantities inventoryQuantities;
        @XmlElement(name = "InventoryDates")
        protected INVRPTListLineItemExtensionType.Details.InventoryDates inventoryDates;
        @XmlElement(name = "InventoryReferences")
        protected INVRPTListLineItemExtensionType.Details.InventoryReferences inventoryReferences;

        /**
         * Gets the value of the inventoryMovementDirectionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInventoryMovementDirectionCode() {
            return inventoryMovementDirectionCode;
        }

        /**
         * Sets the value of the inventoryMovementDirectionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInventoryMovementDirectionCode(String value) {
            this.inventoryMovementDirectionCode = value;
        }

        /**
         * Gets the value of the inventoryMovementReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInventoryMovementReasonCode() {
            return inventoryMovementReasonCode;
        }

        /**
         * Sets the value of the inventoryMovementReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInventoryMovementReasonCode(String value) {
            this.inventoryMovementReasonCode = value;
        }

        /**
         * Gets the value of the inventoryBalanceMethodCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInventoryBalanceMethodCode() {
            return inventoryBalanceMethodCode;
        }

        /**
         * Sets the value of the inventoryBalanceMethodCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInventoryBalanceMethodCode(String value) {
            this.inventoryBalanceMethodCode = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the code property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INVRPTListLineItemExtensionType.Details.Code }
         * 
         * 
         */
        public List<INVRPTListLineItemExtensionType.Details.Code> getCode() {
            if (code == null) {
                code = new ArrayList<INVRPTListLineItemExtensionType.Details.Code>();
            }
            return this.code;
        }

        /**
         * Gets the value of the inventoryQuantities property.
         * 
         * @return
         *     possible object is
         *     {@link INVRPTListLineItemExtensionType.Details.InventoryQuantities }
         *     
         */
        public INVRPTListLineItemExtensionType.Details.InventoryQuantities getInventoryQuantities() {
            return inventoryQuantities;
        }

        /**
         * Sets the value of the inventoryQuantities property.
         * 
         * @param value
         *     allowed object is
         *     {@link INVRPTListLineItemExtensionType.Details.InventoryQuantities }
         *     
         */
        public void setInventoryQuantities(INVRPTListLineItemExtensionType.Details.InventoryQuantities value) {
            this.inventoryQuantities = value;
        }

        /**
         * Gets the value of the inventoryDates property.
         * 
         * @return
         *     possible object is
         *     {@link INVRPTListLineItemExtensionType.Details.InventoryDates }
         *     
         */
        public INVRPTListLineItemExtensionType.Details.InventoryDates getInventoryDates() {
            return inventoryDates;
        }

        /**
         * Sets the value of the inventoryDates property.
         * 
         * @param value
         *     allowed object is
         *     {@link INVRPTListLineItemExtensionType.Details.InventoryDates }
         *     
         */
        public void setInventoryDates(INVRPTListLineItemExtensionType.Details.InventoryDates value) {
            this.inventoryDates = value;
        }

        /**
         * Gets the value of the inventoryReferences property.
         * 
         * @return
         *     possible object is
         *     {@link INVRPTListLineItemExtensionType.Details.InventoryReferences }
         *     
         */
        public INVRPTListLineItemExtensionType.Details.InventoryReferences getInventoryReferences() {
            return inventoryReferences;
        }

        /**
         * Sets the value of the inventoryReferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link INVRPTListLineItemExtensionType.Details.InventoryReferences }
         *     
         */
        public void setInventoryReferences(INVRPTListLineItemExtensionType.Details.InventoryReferences value) {
            this.inventoryReferences = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Type"/&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Code {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Type", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact")
            protected String type;

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
             * 
             * 												The type of code, e.g., inventory type code.
             * 											
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}BookingDate" minOccurs="0"/&gt;
         *         &lt;element name="Date" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
         *                 &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Type"/&gt;
         *                 &lt;attribute name="DateFormatCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bookingDate",
            "date"
        })
        public static class InventoryDates {

            @XmlElement(name = "BookingDate")
            protected ExtendedDateType bookingDate;
            @XmlElement(name = "Date")
            protected List<INVRPTListLineItemExtensionType.Details.InventoryDates.Date> date;

            /**
             * Actual booking date if this inventory report record.
             * 
             * @return
             *     possible object is
             *     {@link ExtendedDateType }
             *     
             */
            public ExtendedDateType getBookingDate() {
                return bookingDate;
            }

            /**
             * Sets the value of the bookingDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExtendedDateType }
             *     
             */
            public void setBookingDate(ExtendedDateType value) {
                this.bookingDate = value;
            }

            /**
             * Gets the value of the date property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the date property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link INVRPTListLineItemExtensionType.Details.InventoryDates.Date }
             * 
             * 
             */
            public List<INVRPTListLineItemExtensionType.Details.InventoryDates.Date> getDate() {
                if (date == null) {
                    date = new ArrayList<INVRPTListLineItemExtensionType.Details.InventoryDates.Date>();
                }
                return this.date;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
             *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Type"/&gt;
             *       &lt;attribute name="DateFormatCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Date {

                @XmlValue
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar value;
                @XmlAttribute(name = "Type", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact")
                protected String type;
                @XmlAttribute(name = "DateFormatCode", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact")
                @XmlSchemaType(name = "anySimpleType")
                protected String dateFormatCode;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setValue(XMLGregorianCalendar value) {
                    this.value = value;
                }

                /**
                 * 
                 * 																The type of date, please use EDIFACT code lists.
                 * 															
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the dateFormatCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDateFormatCode() {
                    return dateFormatCode;
                }

                /**
                 * Sets the value of the dateFormatCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDateFormatCode(String value) {
                    this.dateFormatCode = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}InventoryAdjustmentQuantity" minOccurs="0"/&gt;
         *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ActualInventoryQuantity" minOccurs="0"/&gt;
         *         &lt;element name="Quantity" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Unit"/&gt;
         *                 &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Type"/&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "inventoryAdjustmentQuantity",
            "actualInventoryQuantity",
            "quantity"
        })
        public static class InventoryQuantities {

            @XmlElement(name = "InventoryAdjustmentQuantity")
            protected ExtendedQuantityType inventoryAdjustmentQuantity;
            @XmlElement(name = "ActualInventoryQuantity")
            protected ExtendedQuantityType actualInventoryQuantity;
            @XmlElement(name = "Quantity")
            protected List<INVRPTListLineItemExtensionType.Details.InventoryQuantities.Quantity> quantity;

            /**
             * 
             * 												The changed relative quantity of inventory stocks.
             * 											
             * 
             * @return
             *     possible object is
             *     {@link ExtendedQuantityType }
             *     
             */
            public ExtendedQuantityType getInventoryAdjustmentQuantity() {
                return inventoryAdjustmentQuantity;
            }

            /**
             * Sets the value of the inventoryAdjustmentQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExtendedQuantityType }
             *     
             */
            public void setInventoryAdjustmentQuantity(ExtendedQuantityType value) {
                this.inventoryAdjustmentQuantity = value;
            }

            /**
             * 
             * 												The actual absolut stock quantity.
             * 											
             * 
             * @return
             *     possible object is
             *     {@link ExtendedQuantityType }
             *     
             */
            public ExtendedQuantityType getActualInventoryQuantity() {
                return actualInventoryQuantity;
            }

            /**
             * Sets the value of the actualInventoryQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExtendedQuantityType }
             *     
             */
            public void setActualInventoryQuantity(ExtendedQuantityType value) {
                this.actualInventoryQuantity = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the quantity property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getQuantity().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link INVRPTListLineItemExtensionType.Details.InventoryQuantities.Quantity }
             * 
             * 
             */
            public List<INVRPTListLineItemExtensionType.Details.InventoryQuantities.Quantity> getQuantity() {
                if (quantity == null) {
                    quantity = new ArrayList<INVRPTListLineItemExtensionType.Details.InventoryQuantities.Quantity>();
                }
                return this.quantity;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Unit"/&gt;
             *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Type"/&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Quantity {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Unit", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact")
                protected String unit;
                @XmlAttribute(name = "Type", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact")
                protected String type;

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
                 * 
                 * 																The unit in which the quantity is provided.
                 * 															
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

                /**
                 * 
                 * 																The type of quantity, please use EDIFACT code lists.
                 * 															
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="OriginalShippmentReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" minOccurs="0"/&gt;
         *         &lt;element name="OrderReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" minOccurs="0"/&gt;
         *         &lt;element name="InvoiceReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" minOccurs="0"/&gt;
         *         &lt;element name="StockEntryReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" minOccurs="0"/&gt;
         *         &lt;element name="AdditionalReferences" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "originalShippmentReference",
            "orderReference",
            "invoiceReference",
            "stockEntryReference",
            "additionalReferences"
        })
        public static class InventoryReferences {

            @XmlElement(name = "OriginalShippmentReference")
            protected DocumentReferenceType originalShippmentReference;
            @XmlElement(name = "OrderReference")
            protected DocumentReferenceType orderReference;
            @XmlElement(name = "InvoiceReference")
            protected DocumentReferenceType invoiceReference;
            @XmlElement(name = "StockEntryReference")
            protected DocumentReferenceType stockEntryReference;
            @XmlElement(name = "AdditionalReferences")
            protected List<DocumentReferenceType> additionalReferences;

            /**
             * Gets the value of the originalShippmentReference property.
             * 
             * @return
             *     possible object is
             *     {@link DocumentReferenceType }
             *     
             */
            public DocumentReferenceType getOriginalShippmentReference() {
                return originalShippmentReference;
            }

            /**
             * Sets the value of the originalShippmentReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentReferenceType }
             *     
             */
            public void setOriginalShippmentReference(DocumentReferenceType value) {
                this.originalShippmentReference = value;
            }

            /**
             * Gets the value of the orderReference property.
             * 
             * @return
             *     possible object is
             *     {@link DocumentReferenceType }
             *     
             */
            public DocumentReferenceType getOrderReference() {
                return orderReference;
            }

            /**
             * Sets the value of the orderReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentReferenceType }
             *     
             */
            public void setOrderReference(DocumentReferenceType value) {
                this.orderReference = value;
            }

            /**
             * Gets the value of the invoiceReference property.
             * 
             * @return
             *     possible object is
             *     {@link DocumentReferenceType }
             *     
             */
            public DocumentReferenceType getInvoiceReference() {
                return invoiceReference;
            }

            /**
             * Sets the value of the invoiceReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentReferenceType }
             *     
             */
            public void setInvoiceReference(DocumentReferenceType value) {
                this.invoiceReference = value;
            }

            /**
             * Gets the value of the stockEntryReference property.
             * 
             * @return
             *     possible object is
             *     {@link DocumentReferenceType }
             *     
             */
            public DocumentReferenceType getStockEntryReference() {
                return stockEntryReference;
            }

            /**
             * Sets the value of the stockEntryReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentReferenceType }
             *     
             */
            public void setStockEntryReference(DocumentReferenceType value) {
                this.stockEntryReference = value;
            }

            /**
             * Gets the value of the additionalReferences property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the additionalReferences property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdditionalReferences().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DocumentReferenceType }
             * 
             * 
             */
            public List<DocumentReferenceType> getAdditionalReferences() {
                if (additionalReferences == null) {
                    additionalReferences = new ArrayList<DocumentReferenceType>();
                }
                return this.additionalReferences;
            }

        }

    }

}
