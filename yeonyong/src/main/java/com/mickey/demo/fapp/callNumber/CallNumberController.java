package com.mickey.demo.fapp.callNumber;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CallNumberController {
	
	

	@Autowired
	CallNumberService callNumberService;
	
	@RequestMapping(value="/callNumber/callNumberXdmList")
	public String callNumberXdmList(Model model){
		List<CallNumberDto> callNumberDtos = new ArrayList<>();
		
		callNumberDtos = callNumberService.selectList();
		model.addAttribute("list",callNumberDtos);
		return "callNumber/callNumberXdmList";
		
	}
}
