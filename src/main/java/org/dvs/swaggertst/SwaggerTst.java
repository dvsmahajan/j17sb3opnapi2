package org.dvs.swaggertst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title = "User API", version = "2.0", description = "User Information"))
public class SwaggerTst {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerTst.class,args);
    }


}
