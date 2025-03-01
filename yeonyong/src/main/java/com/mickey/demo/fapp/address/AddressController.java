package com.mickey.demo.fapp.address;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddressController {

	
	@Autowired
	AddressService addressService;
	
	@RequestMapping(value="/address/addressXdmList")
	public String addressXdmList(Model model) {
		List<AddressDto> addressdtos = new ArrayList<>();
		
		addressdtos = addressService.selectList();
		
		model.addAttribute("list", addressdtos);
		return "address/addressXdmList";
		}
	
}
