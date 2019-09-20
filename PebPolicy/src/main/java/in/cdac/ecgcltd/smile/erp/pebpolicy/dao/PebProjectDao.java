package in.cdac.ecgcltd.smile.erp.pebpolicy.dao;

import java.util.List;
import java.util.Map;

import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebLobTypeBean;
import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebProjectBean;
import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebProjectTypeBean;

public interface PebProjectDao {
	
	public String addProjectDetails(PebProjectBean pebProjectBean);
	public Map<Integer,String>  getProjectType();
	public Map<Integer,String> getLobType();
	public Map<String,String> getCountryList();
	public Map<Long, PebProjectBean> getProjectList();
	public PebProjectBean viewProjectDetails(int id);
	public PebProjectTypeBean viewProjectTypeName(int id);
	public PebLobTypeBean viewLobTypeName(int id);
	public List<PebProjectBean> searchProject(PebProjectBean pebProjectBean);
	public void modifyProject(PebProjectBean pebProjectBean, Long id);
}
