package org.serviceOne.controller;

import java.util.List;

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
    public List<EctCnAccountPowerLog> getEctCnAccountPowerLogList() {
        return ectCnAccountPowerLogService.findAll();
    }
}