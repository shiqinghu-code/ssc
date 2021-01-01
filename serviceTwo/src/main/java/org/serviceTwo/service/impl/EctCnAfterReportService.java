package org.serviceTwo.service.impl;

import org.serviceTwo.entity.EctCnAfterReport;
import org.serviceTwo.mapper.EctCnAfterReportMapper;
import org.serviceTwo.mapper.base.BaseMapper;
import org.serviceTwo.service.base.impl.BaseService;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import org.serviceTwo.service.IEctCnAfterReportService;

@Service
public class EctCnAfterReportService  extends BaseService<EctCnAfterReport, String, Object> implements IEctCnAfterReportService {
    @Autowired 
    private EctCnAfterReportMapper ectCnAfterReportMapper; 
    // 重写BaseServiceImpl抽象方法，将当前Mapper返回 
    @Override 
    protected BaseMapper<EctCnAfterReport> getBaseMapper() { return ectCnAfterReportMapper; } 

}