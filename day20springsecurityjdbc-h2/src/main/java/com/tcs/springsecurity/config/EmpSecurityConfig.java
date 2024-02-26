package com.tcs.springsecurity.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class EmpSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	DataSource datasource;
	
	protected void configure(AuthenticationManagerBuilder auth)throws Exception {
//		auth.inMemoryAuthentication()
//		.withUser("bond")
//		.password("james")
//		.roles("USER")
//		.and()
//		.withUser("poo")
//		.password("bear")
//		.roles("ADMIN");
		auth.jdbcAuthentication().dataSource(datasource); 
	}
      @Bean
      @SuppressWarnings("deprecation")
      public PasswordEncoder getPasswordEncoder() {
    	  return NoOpPasswordEncoder.getInstance();
      }
      
      @Override
      protected void configure(HttpSecurity http) throws Exception{
    	  http.authorizeRequests()
    	  .antMatchers("/admin").hasRole("ADMIN")
    	  .antMatchers("/user").hasRole("USER")
    	  .antMatchers("/").permitAll()
    	  .and()
    	  .formLogin();
    	  
    	   
      }
      
}
