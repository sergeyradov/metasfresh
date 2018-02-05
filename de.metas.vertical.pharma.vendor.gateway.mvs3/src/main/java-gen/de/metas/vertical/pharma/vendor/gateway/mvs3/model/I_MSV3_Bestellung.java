package de.metas.vertical.pharma.vendor.gateway.mvs3.model;


/** Generated Interface for MSV3_Bestellung
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public interface I_MSV3_Bestellung 
{

    /** TableName=MSV3_Bestellung */
    public static final String Table_Name = "MSV3_Bestellung";

    /** AD_Table_ID=540916 */
//    public static final int Table_ID = org.compiere.model.MTable.getTable_ID(Table_Name);

//    org.compiere.util.KeyNamePair Model = new org.compiere.util.KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org
     */
//    java.math.BigDecimal accessLevel = java.math.BigDecimal.valueOf(3);

    /** Load Meta Data */

	/**
	 * Get Mandant.
	 * Mandant für diese Installation.
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getAD_Client_ID();

	public org.compiere.model.I_AD_Client getAD_Client();

    /** Column definition for AD_Client_ID */
    public static final org.adempiere.model.ModelColumn<I_MSV3_Bestellung, org.compiere.model.I_AD_Client> COLUMN_AD_Client_ID = new org.adempiere.model.ModelColumn<I_MSV3_Bestellung, org.compiere.model.I_AD_Client>(I_MSV3_Bestellung.class, "AD_Client_ID", org.compiere.model.I_AD_Client.class);
    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/**
	 * Set Sektion.
	 * Organisatorische Einheit des Mandanten
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setAD_Org_ID (int AD_Org_ID);

	/**
	 * Get Sektion.
	 * Organisatorische Einheit des Mandanten
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getAD_Org_ID();

	public org.compiere.model.I_AD_Org getAD_Org();

	public void setAD_Org(org.compiere.model.I_AD_Org AD_Org);

    /** Column definition for AD_Org_ID */
    public static final org.adempiere.model.ModelColumn<I_MSV3_Bestellung, org.compiere.model.I_AD_Org> COLUMN_AD_Org_ID = new org.adempiere.model.ModelColumn<I_MSV3_Bestellung, org.compiere.model.I_AD_Org>(I_MSV3_Bestellung.class, "AD_Org_ID", org.compiere.model.I_AD_Org.class);
    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/**
	 * Get Erstellt.
	 * Datum, an dem dieser Eintrag erstellt wurde
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.sql.Timestamp getCreated();

    /** Column definition for Created */
    public static final org.adempiere.model.ModelColumn<I_MSV3_Bestellung, Object> COLUMN_Created = new org.adempiere.model.ModelColumn<I_MSV3_Bestellung, Object>(I_MSV3_Bestellung.class, "Created", null);
    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/**
	 * Get Erstellt durch.
	 * Nutzer, der diesen Eintrag erstellt hat
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getCreatedBy();

    /** Column definition for CreatedBy */
    public static final org.adempiere.model.ModelColumn<I_MSV3_Bestellung, org.compiere.model.I_AD_User> COLUMN_CreatedBy = new org.adempiere.model.ModelColumn<I_MSV3_Bestellung, org.compiere.model.I_AD_User>(I_MSV3_Bestellung.class, "CreatedBy", org.compiere.model.I_AD_User.class);
    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/**
	 * Set Aktiv.
	 * Der Eintrag ist im System aktiv
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setIsActive (boolean IsActive);

	/**
	 * Get Aktiv.
	 * Der Eintrag ist im System aktiv
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public boolean isActive();

    /** Column definition for IsActive */
    public static final org.adempiere.model.ModelColumn<I_MSV3_Bestellung, Object> COLUMN_IsActive = new org.adempiere.model.ModelColumn<I_MSV3_Bestellung, Object>(I_MSV3_Bestellung.class, "IsActive", null);
    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/**
	 * Set BestellSupportId.
	 *
	 * <br>Type: Integer
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setMSV3_BestellSupportId (int MSV3_BestellSupportId);

	/**
	 * Get BestellSupportId.
	 *
	 * <br>Type: Integer
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getMSV3_BestellSupportId();

    /** Column definition for MSV3_BestellSupportId */
    public static final org.adempiere.model.ModelColumn<I_MSV3_Bestellung, Object> COLUMN_MSV3_BestellSupportId = new org.adempiere.model.ModelColumn<I_MSV3_Bestellung, Object>(I_MSV3_Bestellung.class, "MSV3_BestellSupportId", null);
    /** Column name MSV3_BestellSupportId */
    public static final String COLUMNNAME_MSV3_BestellSupportId = "MSV3_BestellSupportId";

	/**
	 * Set MSV3_Bestellung.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setMSV3_Bestellung_ID (int MSV3_Bestellung_ID);

	/**
	 * Get MSV3_Bestellung.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getMSV3_Bestellung_ID();

    /** Column definition for MSV3_Bestellung_ID */
    public static final org.adempiere.model.ModelColumn<I_MSV3_Bestellung, Object> COLUMN_MSV3_Bestellung_ID = new org.adempiere.model.ModelColumn<I_MSV3_Bestellung, Object>(I_MSV3_Bestellung.class, "MSV3_Bestellung_ID", null);
    /** Column name MSV3_Bestellung_ID */
    public static final String COLUMNNAME_MSV3_Bestellung_ID = "MSV3_Bestellung_ID";

	/**
	 * Set Id.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setMSV3_Id (java.lang.String MSV3_Id);

	/**
	 * Get Id.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public java.lang.String getMSV3_Id();

    /** Column definition for MSV3_Id */
    public static final org.adempiere.model.ModelColumn<I_MSV3_Bestellung, Object> COLUMN_MSV3_Id = new org.adempiere.model.ModelColumn<I_MSV3_Bestellung, Object>(I_MSV3_Bestellung.class, "MSV3_Id", null);
    /** Column name MSV3_Id */
    public static final String COLUMNNAME_MSV3_Id = "MSV3_Id";

	/**
	 * Get Aktualisiert.
	 * Datum, an dem dieser Eintrag aktualisiert wurde
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.sql.Timestamp getUpdated();

    /** Column definition for Updated */
    public static final org.adempiere.model.ModelColumn<I_MSV3_Bestellung, Object> COLUMN_Updated = new org.adempiere.model.ModelColumn<I_MSV3_Bestellung, Object>(I_MSV3_Bestellung.class, "Updated", null);
    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/**
	 * Get Aktualisiert durch.
	 * Nutzer, der diesen Eintrag aktualisiert hat
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getUpdatedBy();

    /** Column definition for UpdatedBy */
    public static final org.adempiere.model.ModelColumn<I_MSV3_Bestellung, org.compiere.model.I_AD_User> COLUMN_UpdatedBy = new org.adempiere.model.ModelColumn<I_MSV3_Bestellung, org.compiere.model.I_AD_User>(I_MSV3_Bestellung.class, "UpdatedBy", org.compiere.model.I_AD_User.class);
    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
}
