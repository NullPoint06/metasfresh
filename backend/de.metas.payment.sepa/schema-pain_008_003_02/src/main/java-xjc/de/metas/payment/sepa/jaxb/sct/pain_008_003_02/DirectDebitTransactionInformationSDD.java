
package de.metas.payment.sepa.jaxb.sct.pain_008_003_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectDebitTransactionInformationSDD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitTransactionInformationSDD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.003.02}PaymentIdentificationSEPA"/&gt;
 *         &lt;element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.003.02}ActiveOrHistoricCurrencyAndAmountSEPA"/&gt;
 *         &lt;element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.003.02}ChargeBearerTypeSEPACode" minOccurs="0"/&gt;
 *         &lt;element name="DrctDbtTx" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.003.02}DirectDebitTransactionSDD"/&gt;
 *         &lt;element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.003.02}PartyIdentificationSEPA1" minOccurs="0"/&gt;
 *         &lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.003.02}BranchAndFinancialInstitutionIdentificationSEPA3"/&gt;
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.003.02}PartyIdentificationSEPA2"/&gt;
 *         &lt;element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.003.02}CashAccountSEPA2"/&gt;
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.003.02}PartyIdentificationSEPA1" minOccurs="0"/&gt;
 *         &lt;element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.003.02}PurposeSEPA" minOccurs="0"/&gt;
 *         &lt;element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.003.02}RemittanceInformationSEPA1Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitTransactionInformationSDD", propOrder = {
    "pmtId",
    "instdAmt",
    "chrgBr",
    "drctDbtTx",
    "ultmtCdtr",
    "dbtrAgt",
    "dbtr",
    "dbtrAcct",
    "ultmtDbtr",
    "purp",
    "rmtInf"
})
public class DirectDebitTransactionInformationSDD {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentificationSEPA pmtId;
    @XmlElement(name = "InstdAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmountSEPA instdAmt;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerTypeSEPACode chrgBr;
    @XmlElement(name = "DrctDbtTx", required = true)
    protected DirectDebitTransactionSDD drctDbtTx;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentificationSEPA1 ultmtCdtr;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentificationSEPA3 dbtrAgt;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentificationSEPA2 dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    protected CashAccountSEPA2 dbtrAcct;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentificationSEPA1 ultmtDbtr;
    @XmlElement(name = "Purp")
    protected PurposeSEPA purp;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformationSEPA1Choice rmtInf;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentificationSEPA }
     *     
     */
    public PaymentIdentificationSEPA getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentificationSEPA }
     *     
     */
    public void setPmtId(PaymentIdentificationSEPA value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmountSEPA }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmountSEPA getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmountSEPA }
     *     
     */
    public void setInstdAmt(ActiveOrHistoricCurrencyAndAmountSEPA value) {
        this.instdAmt = value;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerTypeSEPACode }
     *     
     */
    public ChargeBearerTypeSEPACode getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerTypeSEPACode }
     *     
     */
    public void setChrgBr(ChargeBearerTypeSEPACode value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the drctDbtTx property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitTransactionSDD }
     *     
     */
    public DirectDebitTransactionSDD getDrctDbtTx() {
        return drctDbtTx;
    }

    /**
     * Sets the value of the drctDbtTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitTransactionSDD }
     *     
     */
    public void setDrctDbtTx(DirectDebitTransactionSDD value) {
        this.drctDbtTx = value;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA1 }
     *     
     */
    public PartyIdentificationSEPA1 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA1 }
     *     
     */
    public void setUltmtCdtr(PartyIdentificationSEPA1 value) {
        this.ultmtCdtr = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentificationSEPA3 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA3 }
     *     
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentificationSEPA3 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA2 }
     *     
     */
    public PartyIdentificationSEPA2 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA2 }
     *     
     */
    public void setDbtr(PartyIdentificationSEPA2 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountSEPA2 }
     *     
     */
    public CashAccountSEPA2 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountSEPA2 }
     *     
     */
    public void setDbtrAcct(CashAccountSEPA2 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA1 }
     *     
     */
    public PartyIdentificationSEPA1 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA1 }
     *     
     */
    public void setUltmtDbtr(PartyIdentificationSEPA1 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeSEPA }
     *     
     */
    public PurposeSEPA getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeSEPA }
     *     
     */
    public void setPurp(PurposeSEPA value) {
        this.purp = value;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformationSEPA1Choice }
     *     
     */
    public RemittanceInformationSEPA1Choice getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformationSEPA1Choice }
     *     
     */
    public void setRmtInf(RemittanceInformationSEPA1Choice value) {
        this.rmtInf = value;
    }

}
