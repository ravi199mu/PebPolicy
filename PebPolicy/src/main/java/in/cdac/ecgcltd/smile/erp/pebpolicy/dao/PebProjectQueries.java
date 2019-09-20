package in.cdac.ecgcltd.smile.erp.pebpolicy.dao;

public class PebProjectQueries {
	
	public static final String INSERT_PROJECT_DETAILS = "insert into peb_project_details "+
					"(project_value,project_country,lob_id,buyer_code," + 
					"funding_arrangement,start_date,end_date,project_type,project_description,project_signing_date," + 
					"contract_number,payment_country,project_status,tags,exporter_id,funding_agency_name," + 
					"currency_code_local,currency_code_foreign,currency_code_third_party,exchange_rate_local," + 
					"exchange_rate_foreign,exchange_rate_third_party,created_by,created_on)"
					+ ""
					+ " values(:project_value,:project_country,:lob_id,:buyer_code," + 
					":funding_arrangement,:start_date,:end_date,:project_type,:project_description,:project_signing_date," + 
					":contract_number,:payment_country,:project_status,:tags,:exporter_id,:funding_agency_name," + 
					":currency_code_local,:currency_code_foreign,:currency_code_third_party,:exchange_rate_local," + 
					":exchange_rate_foreign,:exchange_rate_third_party,:created_by,now())";
	
	public static final String GET_PEB_POLICY_PROJECT_TYPE_MASTER_DETAILS = "select project_type_id,project_type_name from peb_policy_project_type_master";
	
	public static final String GET_PEB_LOB_PROPOSAL_TYPE_MASTER_DETAILS = "select lob_proposal_type_id,lob_proposal_name from peb_lob_proposal_type_master";
	
	public static final String GET_PEB_LOB_PROPOSAL_TYPE_MASTER_DETAILS_BY_ID = "select lob_proposal_type_id,lob_proposal_name from peb_lob_proposal_type_master where lob_proposal_type_id = :lob_proposal_type_id";
	
	public static final String GET_PEB_POLICY_PROJECT_TYPE_MASTER_DETAILS_BY_ID = "select project_type_id,project_type_name from peb_policy_project_type_master where project_type_id = :project_type_id";
	
	public static final String GET_PROJECT_LIST =  "select "+
			"project_id,project_value,project_country,lob_id,buyer_code," + 
			"funding_arrangement,start_date,end_date,project_type,project_description,project_signing_date," + 
			"contract_number,payment_country,project_status,tags,exporter_id,funding_agency_name," + 
			"currency_code_local,currency_code_foreign,currency_code_third_party,exchange_rate_local," + 
			"exchange_rate_foreign,exchange_rate_third_party from peb_project_details";
	
	public static final String GET_PROJECT_DETAILS_BY_ID = "select "+
			"project_id,project_value,project_country,lob_id,buyer_code," + 
			"funding_arrangement,start_date,end_date,project_type,project_description,project_signing_date," + 
			"contract_number,payment_country,project_status,tags,exporter_id,funding_agency_name," + 
			"currency_code_local,currency_code_foreign,currency_code_third_party,exchange_rate_local," + 
			"exchange_rate_foreign,exchange_rate_third_party from peb_project_details where project_id = :project_id";
	
	
	  public static final String SEARCH_PEB_PROJECT_BY_TAGS = "select "+
	  "project_id,project_value,project_country,lob_id,buyer_code," +
	  "funding_arrangement,start_date,end_date,project_type,project_description,project_signing_date,"
	  +
	  "contract_number,payment_country,project_status,tags,exporter_id,funding_agency_name,"
	  +
	  "currency_code_local,currency_code_foreign,currency_code_third_party,exchange_rate_local,"
	  +
	  "exchange_rate_foreign,exchange_rate_third_party from peb_project_details"
	  +
	  
	  " where " +
	  
	  "(contract_number= :contract_number)" +
	  "or (project_country = :project_country)" +
	  "or (start_date = :start_date)" +
	  "or (end_date = :end_date)" +
	  "or (project_type =:project_type)" +
	  "or (project_status =:project_status)" +
	  "or (exporter_id =:exporter_id)" +
	  "or (buyer_code =:buyer_code)" +
	  "or (tags ilike :tags or tags is null) ";
	  
	  public static final String SEARCH_PEB_PROJECT = "select "+
			  "project_id,project_value,project_country,lob_id,buyer_code," +
			  "funding_arrangement,start_date,end_date,project_type,project_description,project_signing_date,"
			  +
			  "contract_number,payment_country,project_status,tags,exporter_id,funding_agency_name,"
			  +
			  "currency_code_local,currency_code_foreign,currency_code_third_party,exchange_rate_local,"
			  +
			  "exchange_rate_foreign,exchange_rate_third_party from peb_project_details"
			  +
			  
			  " where " +
			  
			  "(contract_number= :contract_number)" +
			  "or (project_country = :project_country)" +
			  "or (start_date = :start_date)" +
			  "or (end_date = :end_date)" +
			  "or (project_type =:project_type)" +
			  "or (project_status =:project_status)" +
			  "or (exporter_id =:exporter_id)" +
			  "or (buyer_code =:buyer_code)";
	  
	 
}
