package com.jk.staffservice;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-provider",fallback = StaffServiceFallBack.class)
public interface StaffService {
}
