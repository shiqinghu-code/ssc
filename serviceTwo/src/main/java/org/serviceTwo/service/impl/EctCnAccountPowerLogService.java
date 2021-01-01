package org.serviceTwo.service.impl;

import org.serviceTwo.entity.EctCnAccountPowerLog;
import org.serviceTwo.mapper.EctCnAccountPowerLogMapper;
import org.serviceTwo.mapper.base.BaseMapper;
import org.serviceTwo.service.base.impl.BaseService;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import org.serviceTwo.service.IEctCnAccountPowerLogService;

@Service
public class EctCnAccountPowerLogService  extends BaseService<EctCnAccountPowerLog, String, Object> implements IEctCnAccountPowerLogService {
    @Autowired 
    private EctCnAccountPowerLogMapper ectCnAccountPowerLogMapper; 
    // 重写BaseServiceImpl抽象方法，将当前Mapper返回 
    @Override 
    protected BaseMapper<EctCnAccountPowerLog> getBaseMapper() { return ectCnAccountPowerLogMapper; } 

}