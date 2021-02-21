package kr.co.test.mytools.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
          .antMatchers("/login").permitAll()
          .antMatchers("/foos/**").hasIpAddress("11.11.11.11")
//          .anyRequest().authenticated()
//          .and()
//          .formLogin().permitAll()
          .and()
          .csrf().disable();
    }
}