package com.icloud;

import org.mybatis.spring.annotation.MapperScan;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.icloud.interceptor.TokenSupplierInterceptor;
import com.icloud.scheduler.SchedulerManage;

@SpringBootApplication

// @EnableDiscoveryClient /**注册eureka服务**/
@MapperScan("com.icloud.dao")/** 扫描mybatis mapper接口 */
@PropertySource("classpath:jdbc.properties")
@PropertySource("classpath:config.properties")
@EnableTransactionManagement/**启用注解事务管理**/



public class RibbonApplication {

	public static void main(String[] args) throws SchedulerException {
		ConfigurableApplicationContext context = SpringApplication.run(RibbonApplication.class, args);
		new SchedulerManage().startSchedule((Scheduler) context.getBean("scheduler"));
	}
	



	/** 配置拦截器 **/
	@Configuration
	static class WebMvcConfigurer extends WebMvcConfigurerAdapter {
		public void addInterceptors(InterceptorRegistry registry) {
			registry.addInterceptor(new TokenSupplierInterceptor()).addPathPatterns("/merchants/*");
		}
	}

}
