package de.metas.datev.model;

import java.math.BigDecimal;
import javax.annotation.Nullable;
import org.adempiere.model.ModelColumn;

/** Generated Interface for DATEV_ExportLine
 *  @author metasfresh (generated) 
 */
@SuppressWarnings("unused")
public interface I_DATEV_ExportLine 
{

	String Table_Name = "DATEV_ExportLine";

//	/** AD_Table_ID=540935 */
//	int Table_ID = org.compiere.model.MTable.getTable_ID(Table_Name);


	/**
	 * Set activityname.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setActivityName (@Nullable java.lang.String ActivityName);

	/**
	 * Get activityname.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getActivityName();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_ActivityName = new ModelColumn<>(I_DATEV_ExportLine.class, "ActivityName", null);
	String COLUMNNAME_ActivityName = "ActivityName";

	/**
	 * Get Client.
	 * Client/Tenant for this installation.
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getAD_Client_ID();

	String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/**
	 * Set Organisation.
	 * Organisational entity within client
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setAD_Org_ID (int AD_Org_ID);

	/**
	 * Get Organisation.
	 * Organisational entity within client
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getAD_Org_ID();

	String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/**
	 * Set Amount.
	 * Amount
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setAmt (BigDecimal Amt);

	/**
	 * Get Amount.
	 * Amount
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	BigDecimal getAmt();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_Amt = new ModelColumn<>(I_DATEV_ExportLine.class, "Amt", null);
	String COLUMNNAME_Amt = "Amt";

	/**
	 * Set Source Amount.
	 * Amount Balance in Source Currency
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setAmtSource (@Nullable BigDecimal AmtSource);

	/**
	 * Get Source Amount.
	 * Amount Balance in Source Currency
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	BigDecimal getAmtSource();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_AmtSource = new ModelColumn<>(I_DATEV_ExportLine.class, "AmtSource", null);
	String COLUMNNAME_AmtSource = "AmtSource";

	/**
	 * Set Name.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setBPName (@Nullable java.lang.String BPName);

	/**
	 * Get Name.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getBPName();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_BPName = new ModelColumn<>(I_DATEV_ExportLine.class, "BPName", null);
	String COLUMNNAME_BPName = "BPName";

	/**
	 * Set Partner Value.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setBPValue (@Nullable java.lang.String BPValue);

	/**
	 * Get Partner Value.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getBPValue();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_BPValue = new ModelColumn<>(I_DATEV_ExportLine.class, "BPValue", null);
	String COLUMNNAME_BPValue = "BPValue";

	/**
	 * Set Accounting Schema.
	 * Rules for accounting
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_AcctSchema_ID (int C_AcctSchema_ID);

	/**
	 * Get Accounting Schema.
	 * Rules for accounting
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getC_AcctSchema_ID();

	@Nullable org.compiere.model.I_C_AcctSchema getC_AcctSchema();

	void setC_AcctSchema(@Nullable org.compiere.model.I_C_AcctSchema C_AcctSchema);

	ModelColumn<I_DATEV_ExportLine, org.compiere.model.I_C_AcctSchema> COLUMN_C_AcctSchema_ID = new ModelColumn<>(I_DATEV_ExportLine.class, "C_AcctSchema_ID", org.compiere.model.I_C_AcctSchema.class);
	String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

	/**
	 * Set Activity.
	 * Business Activity
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_Activity_ID (int C_Activity_ID);

	/**
	 * Get Activity.
	 * Business Activity
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getC_Activity_ID();

	String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

	/**
	 * Set Business Partner.
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_BPartner_ID (int C_BPartner_ID);

	/**
	 * Get Business Partner.
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getC_BPartner_ID();

	String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/**
	 * Set Document Type.
	 * Document type or rules
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_DocType_ID (int C_DocType_ID);

	/**
	 * Get Document Type.
	 * Document type or rules
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getC_DocType_ID();

	String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/**
	 * Set Name der Belegart.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_DocType_Name (@Nullable java.lang.String C_DocType_Name);

	/**
	 * Get Name der Belegart.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getC_DocType_Name();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_C_DocType_Name = new ModelColumn<>(I_DATEV_ExportLine.class, "C_DocType_Name", null);
	String COLUMNNAME_C_DocType_Name = "C_DocType_Name";

	/**
	 * Set Invoice.
	 * Invoice Identifier
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_Invoice_ID (int C_Invoice_ID);

	/**
	 * Get Invoice.
	 * Invoice Identifier
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getC_Invoice_ID();

	@Nullable org.compiere.model.I_C_Invoice getC_Invoice();

	void setC_Invoice(@Nullable org.compiere.model.I_C_Invoice C_Invoice);

	ModelColumn<I_DATEV_ExportLine, org.compiere.model.I_C_Invoice> COLUMN_C_Invoice_ID = new ModelColumn<>(I_DATEV_ExportLine.class, "C_Invoice_ID", org.compiere.model.I_C_Invoice.class);
	String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";

	/**
	 * Set Credit Account.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setCR_Account (@Nullable java.lang.String CR_Account);

	/**
	 * Get Credit Account.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getCR_Account();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_CR_Account = new ModelColumn<>(I_DATEV_ExportLine.class, "CR_Account", null);
	String COLUMNNAME_CR_Account = "CR_Account";

	/**
	 * Get Created.
	 * Date this record was created
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getCreated();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_Created = new ModelColumn<>(I_DATEV_ExportLine.class, "Created", null);
	String COLUMNNAME_Created = "Created";

	/**
	 * Get Created By.
	 * User who created this records
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getCreatedBy();

	String COLUMNNAME_CreatedBy = "CreatedBy";

	/**
	 * Set Tax.
	 * Tax identifier
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_Tax_ID (int C_Tax_ID);

	/**
	 * Get Tax.
	 * Tax identifier
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getC_Tax_ID();

	String COLUMNNAME_C_Tax_ID = "C_Tax_ID";

	/**
	 * Set Steuersatz.
	 *
	 * <br>Type: Number
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_Tax_Rate (@Nullable BigDecimal C_Tax_Rate);

	/**
	 * Get Steuersatz.
	 *
	 * <br>Type: Number
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	BigDecimal getC_Tax_Rate();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_C_Tax_Rate = new ModelColumn<>(I_DATEV_ExportLine.class, "C_Tax_Rate", null);
	String COLUMNNAME_C_Tax_Rate = "C_Tax_Rate";

	/**
	 * Set Currency.
	 * Maintain Currencies
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setCurrency (@Nullable java.lang.String Currency);

	/**
	 * Get Currency.
	 * Maintain Currencies
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getCurrency();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_Currency = new ModelColumn<>(I_DATEV_ExportLine.class, "Currency", null);
	String COLUMNNAME_Currency = "Currency";

	/**
	 * Set Accounting Date.
	 * Accounting Date
	 *
	 * <br>Type: Date
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDateAcct (@Nullable java.sql.Timestamp DateAcct);

	/**
	 * Get Accounting Date.
	 * Accounting Date
	 *
	 * <br>Type: Date
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.sql.Timestamp getDateAcct();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_DateAcct = new ModelColumn<>(I_DATEV_ExportLine.class, "DateAcct", null);
	String COLUMNNAME_DateAcct = "DateAcct";

	/**
	 * Set Date.
	 * Transaction Date
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDateTrx (@Nullable java.sql.Timestamp DateTrx);

	/**
	 * Get Date.
	 * Transaction Date
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.sql.Timestamp getDateTrx();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_DateTrx = new ModelColumn<>(I_DATEV_ExportLine.class, "DateTrx", null);
	String COLUMNNAME_DateTrx = "DateTrx";

	/**
	 * Set DATEV Export.
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setDATEV_Export_ID (int DATEV_Export_ID);

	/**
	 * Get DATEV Export.
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getDATEV_Export_ID();

	de.metas.datev.model.I_DATEV_Export getDATEV_Export();

	void setDATEV_Export(de.metas.datev.model.I_DATEV_Export DATEV_Export);

	ModelColumn<I_DATEV_ExportLine, de.metas.datev.model.I_DATEV_Export> COLUMN_DATEV_Export_ID = new ModelColumn<>(I_DATEV_ExportLine.class, "DATEV_Export_ID", de.metas.datev.model.I_DATEV_Export.class);
	String COLUMNNAME_DATEV_Export_ID = "DATEV_Export_ID";

	/**
	 * Set DATEV Export Line.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setDATEV_ExportLine_ID (int DATEV_ExportLine_ID);

	/**
	 * Get DATEV Export Line.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getDATEV_ExportLine_ID();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_DATEV_ExportLine_ID = new ModelColumn<>(I_DATEV_ExportLine.class, "DATEV_ExportLine_ID", null);
	String COLUMNNAME_DATEV_ExportLine_ID = "DATEV_ExportLine_ID";

	/**
	 * Set Description.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDescription (@Nullable java.lang.String Description);

	/**
	 * Get Description.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getDescription();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_Description = new ModelColumn<>(I_DATEV_ExportLine.class, "Description", null);
	String COLUMNNAME_Description = "Description";

	/**
	 * Set Document Base Type.
	 * Logical type of document
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDocBaseType (@Nullable java.lang.String DocBaseType);

	/**
	 * Get Document Base Type.
	 * Logical type of document
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getDocBaseType();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_DocBaseType = new ModelColumn<>(I_DATEV_ExportLine.class, "DocBaseType", null);
	String COLUMNNAME_DocBaseType = "DocBaseType";

	/**
	 * Set Document No.
	 * Document sequence number of the document
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDocumentNo (@Nullable java.lang.String DocumentNo);

	/**
	 * Get Document No.
	 * Document sequence number of the document
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getDocumentNo();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_DocumentNo = new ModelColumn<>(I_DATEV_ExportLine.class, "DocumentNo", null);
	String COLUMNNAME_DocumentNo = "DocumentNo";

	/**
	 * Set Debit Account.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDR_Account (@Nullable java.lang.String DR_Account);

	/**
	 * Get Debit Account.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getDR_Account();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_DR_Account = new ModelColumn<>(I_DATEV_ExportLine.class, "DR_Account", null);
	String COLUMNNAME_DR_Account = "DR_Account";

	/**
	 * Set Due Date.
	 * Date when the payment is due
	 *
	 * <br>Type: Date
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDueDate (@Nullable java.sql.Timestamp DueDate);

	/**
	 * Get Due Date.
	 * Date when the payment is due
	 *
	 * <br>Type: Date
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.sql.Timestamp getDueDate();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_DueDate = new ModelColumn<>(I_DATEV_ExportLine.class, "DueDate", null);
	String COLUMNNAME_DueDate = "DueDate";

	/**
	 * Set Active.
	 * The record is active in the system
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setIsActive (boolean IsActive);

	/**
	 * Get Active.
	 * The record is active in the system
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	boolean isActive();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_IsActive = new ModelColumn<>(I_DATEV_ExportLine.class, "IsActive", null);
	String COLUMNNAME_IsActive = "IsActive";

	/**
	 * Set Sales Transaction.
	 * This is a Sales Transaction
	 *
	 * <br>Type: Text
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setIsSOTrx (@Nullable java.lang.String IsSOTrx);

	/**
	 * Get Sales Transaction.
	 * This is a Sales Transaction
	 *
	 * <br>Type: Text
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getIsSOTrx();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_IsSOTrx = new ModelColumn<>(I_DATEV_ExportLine.class, "IsSOTrx", null);
	String COLUMNNAME_IsSOTrx = "IsSOTrx";

	/**
	 * Set Order Reference.
	 * Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner
	 *
	 * <br>Type: Text
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setPOReference (@Nullable java.lang.String POReference);

	/**
	 * Get Order Reference.
	 * Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner
	 *
	 * <br>Type: Text
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getPOReference();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_POReference = new ModelColumn<>(I_DATEV_ExportLine.class, "POReference", null);
	String COLUMNNAME_POReference = "POReference";

	/**
	 * Set Posting Type.
	 *
	 * <br>Type: Text
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setPostingType (@Nullable java.lang.String PostingType);

	/**
	 * Get Posting Type.
	 *
	 * <br>Type: Text
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getPostingType();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_PostingType = new ModelColumn<>(I_DATEV_ExportLine.class, "PostingType", null);
	String COLUMNNAME_PostingType = "PostingType";

	/**
	 * Set Tax Amount Source.
	 * Tax Amount in source currency
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setTaxAmtSource (@Nullable BigDecimal TaxAmtSource);

	/**
	 * Get Tax Amount Source.
	 * Tax Amount in source currency
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	BigDecimal getTaxAmtSource();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_TaxAmtSource = new ModelColumn<>(I_DATEV_ExportLine.class, "TaxAmtSource", null);
	String COLUMNNAME_TaxAmtSource = "TaxAmtSource";

	/**
	 * Get Updated.
	 * Date this record was updated
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getUpdated();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_Updated = new ModelColumn<>(I_DATEV_ExportLine.class, "Updated", null);
	String COLUMNNAME_Updated = "Updated";

	/**
	 * Get Updated By.
	 * User who updated this records
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getUpdatedBy();

	String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/**
	 * Set VAT Code.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setVATCode (@Nullable java.lang.String VATCode);

	/**
	 * Get VAT Code.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	@Nullable java.lang.String getVATCode();

	ModelColumn<I_DATEV_ExportLine, Object> COLUMN_VATCode = new ModelColumn<>(I_DATEV_ExportLine.class, "VATCode", null);
	String COLUMNNAME_VATCode = "VATCode";
}
