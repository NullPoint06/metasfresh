
package at.erpel.schemas._1p0.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}BankName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}BankCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}BIC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}BankAccountNr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}IBAN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}BankAccountOwner" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountType", propOrder = {
    "bankName",
    "bankCode",
    "bic",
    "bankAccountNr",
    "iban",
    "bankAccountOwner"
})
public class AccountType {

    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "BankCode")
    protected BankCodeCType bankCode;
    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "BankAccountNr")
    protected String bankAccountNr;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "BankAccountOwner")
    protected String bankAccountOwner;

    /**
     * Name of the bank institute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * The bank code.
     * 
     * @return
     *     possible object is
     *     {@link BankCodeCType }
     *     
     */
    public BankCodeCType getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankCodeCType }
     *     
     */
    public void setBankCode(BankCodeCType value) {
        this.bankCode = value;
    }

    /**
     * Bank identification code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Bank account number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNr() {
        return bankAccountNr;
    }

    /**
     * Sets the value of the bankAccountNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNr(String value) {
        this.bankAccountNr = value;
    }

    /**
     * International Bank Account Number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Name of the bank account holder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountOwner() {
        return bankAccountOwner;
    }

    /**
     * Sets the value of the bankAccountOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountOwner(String value) {
        this.bankAccountOwner = value;
    }

}
