package in.cdac.ecgcltd.smile.erp.pebpolicy.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebLobTypeBean;
import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebLobTypeBeanRowMapper;
import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebProjectBean;
import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebProjectBeanRowMapper;
import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebProjectTypeBean;
import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebProjectTypeBeanRowMapper;

@Repository
public class PebProjectDaoImpl implements PebProjectDao {

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	private SimpleJdbcCall jdbcCall;

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Resource(name = "dataSource")
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		jdbcCall = new SimpleJdbcCall(dataSource);
	}

	public String addProjectDetails(PebProjectBean pebProjectBean) {

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("project_value", pebProjectBean.getProjectValue());
		paramSource.addValue("project_country", pebProjectBean.getProjectCountry());
		paramSource.addValue("lob_id", pebProjectBean.getLobId());
		paramSource.addValue("buyer_code", pebProjectBean.getBuyerId());
		paramSource.addValue("funding_arrangement", pebProjectBean.getFundingArrangement());
		paramSource.addValue("start_date", pebProjectBean.getStartDate());
		paramSource.addValue("end_date", pebProjectBean.getEndDate());
		paramSource.addValue("project_type", pebProjectBean.getSectorProjectType());
		paramSource.addValue("project_description", pebProjectBean.getProjectDescription());
		paramSource.addValue("project_signing_date", pebProjectBean.getProjectSigningDate());
		paramSource.addValue("contract_number", pebProjectBean.getContractNo());
		paramSource.addValue("payment_country", pebProjectBean.getPaymentCountry());
		paramSource.addValue("project_status", pebProjectBean.getProjectStatus());
		paramSource.addValue("tags", pebProjectBean.getTags());
		paramSource.addValue("exporter_id", pebProjectBean.getExporterId());
		paramSource.addValue("funding_agency_name", pebProjectBean.getFundingAgencyName());
		paramSource.addValue("currency_code_local", pebProjectBean.getLocalCurrencyCode());
		paramSource.addValue("currency_code_foreign", pebProjectBean.getForeignCurrencyCode());
		paramSource.addValue("currency_code_third_party", pebProjectBean.getThirdPartyCurrencyCode());
		paramSource.addValue("exchange_rate_local", pebProjectBean.getLocalExchangeRate());
		paramSource.addValue("exchange_rate_foreign", pebProjectBean.getForeignExchangeRate());
		paramSource.addValue("exchange_rate_third_party", pebProjectBean.getThirdPartyExchangeRate());
		paramSource.addValue("created_by", "-1");
		int inserted = namedParameterJdbcTemplate.update(PebProjectQueries.INSERT_PROJECT_DETAILS, paramSource);
		if (inserted > 0) {
			return "inserted successfully";
		} else {
			return "something went wrong";
		}

	}

	public Map<Integer, String> getProjectType() {
		List<PebProjectTypeBean> pebProjectType = namedParameterJdbcTemplate
				.query(PebProjectQueries.GET_PEB_POLICY_PROJECT_TYPE_MASTER_DETAILS, new PebProjectTypeBeanRowMapper());
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		for (PebProjectTypeBean pebpt : pebProjectType) {
			map1.put(pebpt.getId(), pebpt.getName());
		}
		return map1;
	}

	public Map<Integer, String> getLobType() {
		List<PebLobTypeBean> pebLobType = namedParameterJdbcTemplate
				.query(PebProjectQueries.GET_PEB_LOB_PROPOSAL_TYPE_MASTER_DETAILS, new PebLobTypeBeanRowMapper());
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		for (PebLobTypeBean peblt : pebLobType) {
			map1.put(peblt.getId(), peblt.getName());
		}
		return map1;
	}

	public Map<String, String> getCountryList() {
		Map<String, String> countryMap = new LinkedHashMap<String, String>();
		countryMap.put("NA", "----Please Select----");
		countryMap.put("NPL", "Nepal");
		countryMap.put("SL", "SriLanka");
		countryMap.put("TH", "Thailand");
		countryMap.put("ML", "Malaysia");
		countryMap.put("GH", "Ghana");
		countryMap.put("NI", "Nigeria");
		countryMap.put("ET", "Ethiopia");
		return countryMap;
	}

	public Map<Long, PebProjectBean> getProjectList() {
		// TODO Auto-generated method stub
		List<PebProjectBean> pebProjectBean = namedParameterJdbcTemplate.query(PebProjectQueries.GET_PROJECT_LIST,
				new PebProjectBeanRowMapper());
		Map<Long, PebProjectBean> map3 = new HashMap<Long, PebProjectBean>();
		for (PebProjectBean list : pebProjectBean) {
			map3.put(list.getProjectId(), list);
		}
		return map3;
	}

	public PebProjectBean viewProjectDetails(int id) {
		// TODO Auto-generated method stub
		return namedParameterJdbcTemplate.queryForObject(PebProjectQueries.GET_PROJECT_DETAILS_BY_ID,
				new MapSqlParameterSource("project_id", id), new PebProjectBeanRowMapper());
	}

	public PebProjectTypeBean viewProjectTypeName(int id) {
		// TODO Auto-generated method stub
		return namedParameterJdbcTemplate.queryForObject(
				PebProjectQueries.GET_PEB_POLICY_PROJECT_TYPE_MASTER_DETAILS_BY_ID,
				new MapSqlParameterSource("project_type_id", id), new PebProjectTypeBeanRowMapper());
	}

	public PebLobTypeBean viewLobTypeName(int id) {
		// TODO Auto-generated method stub
		return namedParameterJdbcTemplate.queryForObject(
				PebProjectQueries.GET_PEB_LOB_PROPOSAL_TYPE_MASTER_DETAILS_BY_ID,
				new MapSqlParameterSource("lob_proposal_type_id", id), new PebLobTypeBeanRowMapper());
	}

	public List<PebProjectBean> searchProject(PebProjectBean pebProjectBean) {

		MapSqlParameterSource paramMap = new MapSqlParameterSource();
		paramMap.addValue("contract_number", pebProjectBean.getContractNo());
		paramMap.addValue("project_country", pebProjectBean.getProjectCountry());

		paramMap.addValue("start_date", pebProjectBean.getStartDate());
		paramMap.addValue("end_date", pebProjectBean.getEndDate());

		paramMap.addValue("project_type", pebProjectBean.getSectorProjectType());
		paramMap.addValue("project_status", pebProjectBean.getProjectStatus());
		paramMap.addValue("exporter_id", pebProjectBean.getExporterId());
		paramMap.addValue("buyer_code", pebProjectBean.getBuyerId());
		String tags = "%"+pebProjectBean.getTags()+"%";
		
		if(!pebProjectBean.getTags().isEmpty()) {
			paramMap.addValue("tags",tags);
			return namedParameterJdbcTemplate.query(PebProjectQueries.SEARCH_PEB_PROJECT_BY_TAGS, paramMap,new PebProjectBeanRowMapper());
		}else {
			System.out.println("inside normal");
			return namedParameterJdbcTemplate.query(PebProjectQueries.SEARCH_PEB_PROJECT, paramMap,new PebProjectBeanRowMapper());
		}

	}

	public void modifyProject(PebProjectBean pebProjectBean, Long id) {
		// TODO Auto-generated method stub
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("v_project_id", id);
		paramMap.put("v_project_value", pebProjectBean.getProjectValue());
		paramMap.put("v_project_country", pebProjectBean.getProjectCountry());
		paramMap.put("v_lob_id", pebProjectBean.getLobId());
		paramMap.put("v_buyer_code", pebProjectBean.getBuyerId());
		paramMap.put("v_funding_arrangement", pebProjectBean.getFundingArrangement());
		paramMap.put("v_start_date", pebProjectBean.getStartDate());
		paramMap.put("v_end_date", pebProjectBean.getEndDate());
		paramMap.put("v_project_type", pebProjectBean.getSectorProjectType());
		paramMap.put("v_project_description", pebProjectBean.getProjectDescription());
		paramMap.put("v_project_signing_date", pebProjectBean.getProjectSigningDate());
		paramMap.put("v_contract_number", pebProjectBean.getContractNo());
		paramMap.put("v_payment_country", pebProjectBean.getPaymentCountry());
		paramMap.put("v_project_status", pebProjectBean.getProjectStatus());
		paramMap.put("v_tags", pebProjectBean.getTags());
		paramMap.put("v_exporter_id", pebProjectBean.getExporterId());
		paramMap.put("v_funding_agency_name", pebProjectBean.getFundingAgencyName());
		paramMap.put("v_currency_code_local", pebProjectBean.getLocalCurrencyCode());
		paramMap.put("v_currency_code_foreign", pebProjectBean.getForeignCurrencyCode());
		paramMap.put("v_currency_code_third_party", pebProjectBean.getThirdPartyCurrencyCode());
		paramMap.put("v_exchange_rate_local", pebProjectBean.getLocalExchangeRate());
		paramMap.put("v_exchange_rate_foreign", pebProjectBean.getForeignExchangeRate());
		paramMap.put("v_exchange_rate_third_party", pebProjectBean.getThirdPartyExchangeRate());
		paramMap.put("v_created_by", "-1");

		jdbcCall.withFunctionName("PEB_MODIFY_PROJECT_DETAILS").executeFunction(Void.class, paramMap);

	}

}
