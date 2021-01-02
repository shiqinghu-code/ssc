package org.serviceFeign.controller;

import org.serviceFeign.common.Result;
import org.serviceFeign.feign.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hiController")
public class HiController {
	@Autowired
	SchedualServiceHi schedualServiceHi;
	
	@RequestMapping(value = "/getall",method = RequestMethod.GET)
	public  Result getall() {
		return schedualServiceHi.getall();
	}
}
