package org.serviceOne.controller;

import org.serviceOne.entity.EctCnAfterReport;
import org.serviceOne.service.IEctCnAfterReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/ectcnafterreport")
public class EctCnAfterReportController {
    @Autowired
    IEctCnAfterReportService ectCnAfterReportService;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<EctCnAfterReport> getEctCnAfterReportList() {
        return ectCnAfterReportService.findAll();
    }
}