package in.cdac.ecgcltd.smile.erp.pebpolicy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cdac.ecgcltd.smile.erp.pebpolicy.dao.PebProjectDao;
import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebLobTypeBean;
import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebProjectBean;
import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebProjectTypeBean;


@Service
public class PebProjectServiceImpl implements PebProjectService, PebProjectDao {


	@Autowired
	private PebProjectDao pebProjectDao;
	
	public String addProjectDetails(PebProjectBean pebProjectBean) {
		// TODO Auto-generated method stub
		return pebProjectDao.addProjectDetails(pebProjectBean);
	}

	public Map<Integer,String> getProjectType() {
		return pebProjectDao.getProjectType();
	}

	public Map<Integer,String> getLobType() {
		return pebProjectDao.getLobType();
	}

	public Map<String, String> getCountryList(){
		return pebProjectDao.getCountryList();
	}

	public Map<Long, PebProjectBean> getProjectList() {
		// TODO Auto-generated method stub
		return pebProjectDao.getProjectList();
	}

	public PebProjectBean viewProjectDetails(int id) {
		// TODO Auto-generated method stub
		return pebProjectDao.viewProjectDetails(id);
	}

	public PebProjectTypeBean viewProjectTypeName(int id) {
		// TODO Auto-generated method stub
		return pebProjectDao.viewProjectTypeName(id);
	}

	public PebLobTypeBean viewLobTypeName(int id) {
		// TODO Auto-generated method stub
		return pebProjectDao.viewLobTypeName(id);
	}

	public List<PebProjectBean> searchProject(PebProjectBean pebProjectBean) {
		return pebProjectDao.searchProject(pebProjectBean);
	}

	public void modifyProject(PebProjectBean pebProjectBean, Long id) {
		// TODO Auto-generated method stub
		System.out.println("sfsdfgsdfg");
		pebProjectDao.modifyProject(pebProjectBean, id);
	}
	

}
