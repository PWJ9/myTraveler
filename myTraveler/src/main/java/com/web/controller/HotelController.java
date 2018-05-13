package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HotelController {
	@Autowired
	
	@RequestMapping("_Hotel/HotelIndex")
	public String list(Model model) {		
		return "_Hotel/HotelIndex";
	}
	
	
}
