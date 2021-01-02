package org.serviceOne.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.serviceOne.common.Result;
import org.serviceOne.entity.EctCnAccountPowerLog;
import org.serviceOne.service.IEctCnAccountPowerLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ectcnaccountpowerlog")
public class EctCnAccountPowerLogController {
    @Autowired
    IEctCnAccountPowerLogService ectCnAccountPowerLogService;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public  Result getEctCnAccountPowerLogList() {
    	List<EctCnAccountPowerLog> list=ectCnAccountPowerLogService.findAll();
    	Map<String,Object> map=new HashMap<String,Object>();
    	map.put("list", list);
    	map.put("service", "one");
        return Result.success(map);
    }
}