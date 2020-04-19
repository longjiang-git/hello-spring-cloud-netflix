package hello.spring.cloud.web.admin.feign.hystrix.service.hystrix;

import hello.spring.cloud.web.admin.feign.hystrix.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
