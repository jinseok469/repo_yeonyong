package com.mickey.demo.fapp.dob;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DobController {
	@Autowired
	DobService dobService;
	
	@RequestMapping(value="/dob/dobXdmList")
	public String dobXdmList(Model model) {
		List<DobDto> dobdtos = new ArrayList<>();
		
		dobdtos = dobService.selectList();
		model.addAttribute("list", dobdtos);
		return "dob/dobXdmList";
		}

}
