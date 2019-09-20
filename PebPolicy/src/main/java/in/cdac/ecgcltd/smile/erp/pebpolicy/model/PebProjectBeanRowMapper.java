package in.cdac.ecgcltd.smile.erp.pebpolicy.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PebProjectBeanRowMapper implements RowMapper<PebProjectBean> {

	public PebProjectBean mapRow(ResultSet rs, int rowNum) throws SQLException {

		PebProjectBean pebProjectBean = new PebProjectBean();
		
		pebProjectBean.setProjectId(rs.getLong("project_id"));
		pebProjectBean.setProjectDescription(rs.getString("project_description"));
		pebProjectBean.setProjectCountry(rs.getString("project_country"));
		pebProjectBean.setBuyerId(rs.getInt("buyer_code"));
		pebProjectBean.setContractNo(rs.getString("contract_number"));
		
		pebProjectBean.setEndDate(rs.getDate("end_date"));
		pebProjectBean.setStartDate(rs.getDate("start_date"));
		pebProjectBean.setProjectSigningDate(rs.getDate("project_signing_date"));
		
		pebProjectBean.setExporterId(rs.getInt("exporter_id"));
		pebProjectBean.setForeignCurrencyCode(rs.getString("currency_code_foreign"));
		pebProjectBean.setForeignExchangeRate(rs.getDouble("exchange_rate_foreign"));
		pebProjectBean.setLocalCurrencyCode(rs.getString("currency_code_local"));
		pebProjectBean.setLocalExchangeRate(rs.getDouble("exchange_rate_local"));
		pebProjectBean.setThirdPartyCurrencyCode(rs.getString("currency_code_third_party"));
		pebProjectBean.setThirdPartyExchangeRate(rs.getDouble("exchange_rate_third_party"));
		pebProjectBean.setLobId(rs.getInt("lob_id"));
		pebProjectBean.setFundingArrangement(rs.getString("funding_arrangement"));
		pebProjectBean.setFundingAgencyName(rs.getString("funding_agency_name"));
		pebProjectBean.setPaymentCountry(rs.getString("payment_country"));
		pebProjectBean.setProjectStatus(rs.getString("project_status"));
		pebProjectBean.setProjectValue(rs.getDouble("project_value"));
		pebProjectBean.setSectorProjectType(rs.getInt("project_type"));
		pebProjectBean.setTags(rs.getString("tags"));
		
		return pebProjectBean;
	}

}
