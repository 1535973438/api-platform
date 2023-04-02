package com.zzx.common.client;


import com.zzx.common.model.entity.InterfaceInfo;
import com.zzx.common.model.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "api")

public interface InnerInterfaceInfoService {
    @PostMapping("/api/getinterfaceinfo")
    InterfaceInfo getInterfaceInfo(@RequestParam("url")String url, @RequestParam("method")String method);

    @PostMapping("/api/invokecount")
    boolean invokeCount(@RequestParam("interfaceInfoId") long interfaceInfoId, @RequestParam("userId") long userId);
    @PostMapping("/api/getinvokeuser")
    User getInvokeUser(@RequestParam("accessKey")String accessKey);
}
