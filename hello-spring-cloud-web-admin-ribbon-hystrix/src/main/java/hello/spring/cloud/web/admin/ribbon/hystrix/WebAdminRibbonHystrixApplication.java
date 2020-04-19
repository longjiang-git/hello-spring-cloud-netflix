package hello.spring.cloud.web.admin.ribbon.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class WebAdminRibbonHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonHystrixApplication.class,args);
    }
}
