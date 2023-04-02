package com.zzx.apiInterface;

import com.zzx.apiclientsdk.client.ApiClient;
import com.zzx.apiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@SpringBootTest
class ApiInterfaceApplicationTests {

    @Resource
    private ApiClient apiClient;

    @Test
    void contextLoads() {
        User user=new User();
        user.setUsername("thisistest");
        apiClient.getUsernameByPost(user);
    }

}
