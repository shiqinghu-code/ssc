package org.serviceFeign.feign;

import org.serviceFeign.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "service-hi", fallback=ServiceFallback.class)
public interface SchedualServiceHi {
	 @RequestMapping(value = "/ectcnaccountpowerlog/getall", method = RequestMethod.GET)
	 Result  getall();
}
