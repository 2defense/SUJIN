package com.project1.subi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class PurchaseCheckController {
	
	@Autowired
	OrderService service;

	@RequestMapping("/subi/purchaseCheck")
	public ModelAndView select() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("subi/purchaseCheck");
		return mv;
	}
}