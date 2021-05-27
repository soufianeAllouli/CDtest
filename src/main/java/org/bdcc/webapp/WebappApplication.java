package org.bdcc.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class WebappApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebappApplication.class, args);
    }

    @GetMapping()
    public Map<String,Object> test(){
        Map<String,Object> map=new HashMap<>();
        map.put("message","from Docker deployment");
        map.put("count",333);
        return map;
    }


}
