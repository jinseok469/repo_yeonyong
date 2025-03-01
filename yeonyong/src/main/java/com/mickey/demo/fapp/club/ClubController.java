package com.mickey.demo.fapp.club;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClubController {

// 입력되는 주소에 매칭이 되는 html 정보를 정의
//	html로 데이터 전

	@Autowired
	ClubService clubService;

//	@RequestMapping(value = "/club/clubXdmList")
//	public String codeGroupXdmList(Model model) {
//
//		List<ClubDto> clubDtos = new ArrayList<>();
//		clubDtos = clubService.selectList();
//		
//		model.addAttribute("list",clubDtos);
//		
//		return "club/clubXdmList";
//	}
	@RequestMapping(value = "/club/clubXdmList")
	public String codeGroupXdmList(Model model) {
		
		
		model.addAttribute("list",clubService.selectList());
		
		return "club/clubXdmList";
	}
}
