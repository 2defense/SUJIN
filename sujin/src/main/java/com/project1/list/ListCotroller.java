package com.project1.list;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ListCotroller {
	@RequestMapping("/subi/recommendListMain")
	public ModelAndView select() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("subi/recommendListMain");
		return mv;
	}
}