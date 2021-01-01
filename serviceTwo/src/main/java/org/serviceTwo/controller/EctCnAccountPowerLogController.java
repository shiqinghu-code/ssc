package org.serviceTwo.controller;

import org.serviceTwo.entity.EctCnAccountPowerLog;
import org.serviceTwo.service.IEctCnAccountPowerLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


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