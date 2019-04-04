package com.yyy;


import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@MapperScan("com.yyy.mapper.xml")/*notes：加了这个才能正常注入mapper，但是多模块的貌似不顶用，要在mapper接口加@Mapper*/
@ComponentScan(basePackages= {"com.yyy", "org.n3r.idworker"})/*notes：不加这个会注入失败*/
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
