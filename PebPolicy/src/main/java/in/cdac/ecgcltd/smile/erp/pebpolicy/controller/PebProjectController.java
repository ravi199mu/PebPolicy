package in.cdac.ecgcltd.smile.erp.pebpolicy.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebLobTypeBean;
import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebProjectBean;
import in.cdac.ecgcltd.smile.erp.pebpolicy.model.PebProjectTypeBean;
import in.cdac.ecgcltd.smile.erp.pebpolicy.service.PebProjectService;

@Controller
public class PebProjectController {
	
	@Autowired
	private PebProjectService pebProjectService;

	@GetMapping("/")
	public String showProjectDetails(@ModelAttribute("pebProjectBean") PebProjectBean pebProjectBean,Model model) {
		
		Map<Integer, String> projectTypes = pebProjectService.getProjectType();
		Map<Integer, String> lobTypes = pebProjectService.getLobType();
		Map<String,String> countryList = pebProjectService.getCountryList();
		model.addAttribute("projectTypes", projectTypes);
		model.addAttribute("lobTypes", lobTypes);
		model.addAttribute("countryList", countryList);
		
		return "addproject";
	}
	
	@PostMapping("/")
	public String addProjectDetails(Model model,@Validated @ModelAttribute("pebProjectBean") PebProjectBean pebProjectBean,BindingResult result) {
		if(result.hasErrors()) {
			Map<Integer, String> projectTypes = pebProjectService.getProjectType();
			Map<Integer, String> lobTypes = pebProjectService.getLobType();
			Map<String,String> countryList = pebProjectService.getCountryList();
			model.addAttribute("projectTypes", projectTypes);
			model.addAttribute("lobTypes", lobTypes);
			model.addAttribute("countryList", countryList);
			return "addproject";
		}
		pebProjectService.addProjectDetails(pebProjectBean);
		return "redirect:/";
	}
	
	@GetMapping("/listproject")
	public String viewListOfProjects(Model model,@ModelAttribute("pebProjectBean") PebProjectBean pebProjectBean) {
		Map<Integer, String> projectTypes = pebProjectService.getProjectType();
		Map<Integer, String> lobTypes = pebProjectService.getLobType();
		Map<String,String> countryList = pebProjectService.getCountryList();
		model.addAttribute("projectTypes", projectTypes);
		model.addAttribute("lobTypes", lobTypes);
		model.addAttribute("countryList", countryList);
		List<String> projectTypeList = new ArrayList<String>();
		Map<Long, PebProjectBean> pebProjectList =pebProjectService.getProjectList();
		for(Map.Entry<Long, PebProjectBean> map : pebProjectList.entrySet()) {
			PebProjectTypeBean pebProjectTypeBean = pebProjectService.viewProjectTypeName(map.getValue().getSectorProjectType());
			projectTypeList.add(pebProjectTypeBean.getName());
		}
		model.addAttribute("projectTypeList", projectTypeList);
		model.addAttribute("ProjectList", pebProjectList);
		return "listproject";
	}
	
	@GetMapping("/viewproject")
	public String viewProject(Model model,@RequestParam("id") int id) {
		PebProjectBean pebProjectBean = pebProjectService.viewProjectDetails(id);
		
		PebProjectTypeBean pebProjectTypeBean = pebProjectService.viewProjectTypeName(pebProjectBean.getSectorProjectType());
		PebLobTypeBean pebLobTypeBean = pebProjectService.viewLobTypeName(pebProjectBean.getLobId());
		
		model.addAttribute("pebProjectBean", pebProjectBean);
		model.addAttribute("pebProjectTypeBean", pebProjectTypeBean);
		model.addAttribute("pebLobTypeBean", pebLobTypeBean);
		
		return "viewproject";
	}
	
	@PostMapping("/search")
	public String searchProject(@ModelAttribute("pebProjectBean") PebProjectBean pebProjectBean,Model model) {
		List<PebProjectBean> peb = pebProjectService.searchProject(pebProjectBean);
		System.out.println(peb);
		Map<Long,PebProjectBean> projectList = new HashMap<Long, PebProjectBean>(); 
		for(PebProjectBean p : peb) {
			projectList.put(p.getProjectId(), p);
		}
		model.addAttribute("ProjectList", projectList);
		return "listproject";
	}
	
	@PostMapping("/modifyproject")
	public String modifyProject(@ModelAttribute("pebProjectBean") PebProjectBean pebProjectBean,Model model) {
		
		pebProjectService.modifyProject(pebProjectBean, pebProjectBean.getProjectId());
		return "redirect:/listproject";
	}
	
	@GetMapping("/editproject")
	public String editProject(Model model, @RequestParam("id") int id) {
		
		Map<Integer, String> projectTypes = pebProjectService.getProjectType();
		Map<Integer, String> lobTypes = pebProjectService.getLobType();
		Map<String, String> countryList = pebProjectService.getCountryList();
        
		model.addAttribute("projectTypes", projectTypes);
		model.addAttribute("lobTypes", lobTypes);
		model.addAttribute("countryList", countryList);

		PebProjectBean pebProjectBean = pebProjectService.viewProjectDetails(id);
		PebProjectTypeBean pebProjectTypeBean = pebProjectService
				.viewProjectTypeName(pebProjectBean.getSectorProjectType());
		PebLobTypeBean pebLobTypeBean = pebProjectService.viewLobTypeName(pebProjectBean.getLobId());

		model.addAttribute("pebProjectBean", pebProjectBean);
		model.addAttribute("pebProjectTypeBean", pebProjectTypeBean);
		model.addAttribute("pebLobTypeBean", pebLobTypeBean);

		return "modifyproject";
	}
	
	
}
