package com.jaya.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.jta.ManagedTransactionAdapter;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaya.model.Lighting;
import com.jaya.service.LightingService;

@Controller
public class LightingController {
	
	@Autowired
	private LightingService lightingService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Lighting lighting=new Lighting();
		map.put("newLighting", lighting);
		map.put("lightingList", lightingService.getAllLighting());
		return "lighting";
	}
	
	@RequestMapping(value="/lighting.do", method=RequestMethod.POST)
	public String doAction(@ModelAttribute("newLighting") Lighting lighting, BindingResult result, @RequestParam String action, Map<String, Object> map){
		
		Lighting lightingResult=new Lighting();
		String redirect="";
		switch(action.toLowerCase()){
			case "add" : 
				lightingService.addLighting(lighting);
				lightingResult = lighting;
				redirect = "redirect:/index";
				break;
			case "edit":
				lightingService.editLighting(lighting);
				lightingResult = lighting;
				redirect = "redirect:/index";
				break;
			case "delete" :
				lightingService.deleteLighting(lighting.getIdLighting());
				lightingResult=new Lighting();
				redirect = "redirect:/index";
				break;
			case "search":
				Lighting searchLighting=lightingService.getLighting(lighting.getIdLighting());
				lightingResult = searchLighting !=null ? searchLighting : new Lighting();
				redirect = "lighting";
				break;	
		}
		map.put("lighting", lightingResult);
		map.put("lightingList", lightingService.getAllLighting());
		return redirect;
	}
}
