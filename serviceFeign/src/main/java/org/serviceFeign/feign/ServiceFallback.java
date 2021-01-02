package org.serviceFeign.feign;

import org.serviceFeign.common.Result;
import org.springframework.stereotype.Component;
@Component
public class ServiceFallback  implements SchedualServiceHi {

	@Override
	public Result getall() {
		// TODO Auto-generated method stub
		return Result.failed("服务调用失败!");
	}

}
