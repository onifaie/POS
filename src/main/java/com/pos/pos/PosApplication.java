package com.pos.pos;

import com.pos.pos.base.repository.baseRepository;
import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(com.pos.pos.usermanagement.repository)
@SpringBootApplication
//@SpringBootApplication
//@ComponentScan (basePackages ="com.pos.pos.usermanagement.mapper")
//@ComponentScan ("com.pos.pos.usermanagement.mapper"+"com.pos.pos.base.mapper")



//@EnableMongoRepositories ("com.pos.pos.server.repository") // this fix the problem
//@ComponentScan(basePackages = "com.pos.pos.usermanagement.AppuserController")
//@ComponentScan(basePackages = "com.pos.pos.base.service")
//@ComponentScan(basePackages = "com.pos.pos.usermanagement.service")


//@EnableJpaRepositories("com.pos.pos.usermanagement.repository")

//@EnableJpaRepositories("com.pos.pos.usermanagement.AppuserController")
//@EnableJpaRepositories("com.pos.pos.usermanagement.AppuserController")

public class PosApplication  {

    public static void main(String[] args) {
        SpringApplication.run(PosApplication.class, args);
    }

}
