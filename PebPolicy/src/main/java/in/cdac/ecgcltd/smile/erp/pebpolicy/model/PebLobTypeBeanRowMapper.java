package in.cdac.ecgcltd.smile.erp.pebpolicy.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

public class PebLobTypeBeanRowMapper implements RowMapper<PebLobTypeBean>{

	public  PebLobTypeBean  mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		  PebLobTypeBean pebLobTypebean = new PebLobTypeBean();
		  pebLobTypebean.setId(rs.getInt("lob_proposal_type_id"));
		  pebLobTypebean.setName(rs.getString("lob_proposal_name"));
		 
		/*
		 * Map<Integer,String> lobTypes = new HashMap<Integer, String>();
		 * lobTypes.put(rs.getInt("lob_proposal_type_id"),rs.getString(
		 * "lob_proposal_name"));
		 */
		return pebLobTypebean;
	}

}
