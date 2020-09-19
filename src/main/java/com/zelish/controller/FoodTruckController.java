package com.zelish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.ModelAndView;


import com.zelish.model.FoodTruckModel;
import com.zelish.service.FoodTruckService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
public class FoodTruckController {
	
	@Autowired
	private FoodTruckService foodTruckService;
	
	HttpServletRequest request;

	
	public ModelAndView editPage() {
		
		
		return null;
		
			}
	
	public FoodTruckModel addApplication(FoodTruckModel foodTruckModel) {
		
		
		
		return foodTruckModel;
	}

}
