package org.serviceOne.service.impl;

import org.serviceOne.entity.EctCnAccountPowerLog;
import org.serviceOne.mapper.EctCnAccountPowerLogMapper;
import org.serviceOne.mapper.base.BaseMapper;
import org.serviceOne.service.base.impl.BaseService;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import org.serviceOne.service.IEctCnAccountPowerLogService;

@Service
public class EctCnAccountPowerLogService  extends BaseService<EctCnAccountPowerLog, String, Object> implements IEctCnAccountPowerLogService {
    @Autowired 
    private EctCnAccountPowerLogMapper ectCnAccountPowerLogMapper; 
    // 重写BaseServiceImpl抽象方法，将当前Mapper返回 
    @Override 
    protected BaseMapper<EctCnAccountPowerLog> getBaseMapper() { return ectCnAccountPowerLogMapper; } 

}