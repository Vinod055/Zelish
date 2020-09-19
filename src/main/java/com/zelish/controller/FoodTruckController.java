package com.zelish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.ModelAndView;


import com.zelish.model.FoodTruckModel;
import com.zelish.service.FoodTruckService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;


@RestController
@RequestMapping(path="/")
public class FoodTruckController {
	
	@Autowired
	private FoodTruckService foodTruckService;
	
	HttpServletRequest request;
	public  static final String STATUS_APPROVED="APPROVED";
	public  static final String STATUS_CANCLED="CANCLED";

	
	public ModelAndView editPage() {
		
		
		return null;
		
			}
	
	@PostMapping(path="/addApplication")
	public Response addApplication(@RequestBody FoodTruckModel foodTruckModel,@RequestParam String status) {
		
		if(status.equals("APPROVED")) {
			foodTruckModel.setStatus(STATUS_APPROVED);
			
		}else if(status.equals("CANCLED")) {
				foodTruckModel.setStatus(STATUS_CANCLED);
		}
		
		return null;
	}

}
