package in.cdac.ecgcltd.smile.erp.pebpolicy.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

public class PebProjectTypeBeanRowMapper implements RowMapper<PebProjectTypeBean> {

	public PebProjectTypeBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		PebProjectTypeBean pebProjectTypeBean = new PebProjectTypeBean();
		pebProjectTypeBean.setId(rs.getInt("project_type_id"));
		pebProjectTypeBean.setName(rs.getString("project_type_name"));
//		Map<Integer,String> projectTypes = new HashMap<Integer, String>();
//		projectTypes.put(rs.getInt("project_type_id"),rs.getString("project_type_name"));
//		return projectTypes;
		return pebProjectTypeBean;
	}

}
