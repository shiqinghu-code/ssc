package org.serviceOne.service.impl;

import org.serviceOne.entity.EctCnAfterReport;
import org.serviceOne.mapper.EctCnAfterReportMapper;
import org.serviceOne.mapper.base.BaseMapper;
import org.serviceOne.service.base.impl.BaseService;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import org.serviceOne.service.IEctCnAfterReportService;

@Service
public class EctCnAfterReportService  extends BaseService<EctCnAfterReport, String, Object> implements IEctCnAfterReportService {
    @Autowired 
    private EctCnAfterReportMapper ectCnAfterReportMapper; 
    // 重写BaseServiceImpl抽象方法，将当前Mapper返回 
    @Override 
    protected BaseMapper<EctCnAfterReport> getBaseMapper() { return ectCnAfterReportMapper; } 

}