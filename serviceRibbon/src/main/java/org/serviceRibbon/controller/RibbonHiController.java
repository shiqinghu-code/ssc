package org.serviceRibbon.controller;

import org.serviceRibbon.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/ribbonHiController")
public class RibbonHiController {
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/getall")
	@HystrixCommand(fallbackMethod="ServiceRibbonFallback")
    public Result getall(){
		Result result = this.restTemplate.getForObject("http://service-hi/ectcnaccountpowerlog/getall", Result.class, Result.class);
        return result;
    }
	 public Result ServiceRibbonFallback(){
	        return Result.failed("调用失败");
	    }

}
