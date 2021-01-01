package org.serviceOne.mapper.base;

import tk.mybatis.mapper.common.*;

public interface BaseMapper<T> extends  MySqlMapper<T>, IdsMapper<T>, ConditionMapper<T>, Mapper<T> {
 
}