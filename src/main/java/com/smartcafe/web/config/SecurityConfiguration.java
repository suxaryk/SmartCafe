package com.smartcafe.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {

        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery(
                        "select name, password from user where name=?")
                .authoritiesByUsernameQuery(
                        "SELECT name, type \n" +
                        "FROM user\n" +
                        "INNER JOIN user_role \n" +
                        "ON user.user_id = user_role.user_id\n" +
                        "INNER JOIN role\n" +
                        "ON role.role_id = user_role.role_id " +
                        "WHERE name=?"
                );

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/", "/login", "/static/**").permitAll()
                .antMatchers("/table/**", "/menu/**", "/order/**").access("hasRole('Barmen') and hasRole('Owner')")
                .antMatchers("/admin/**").access("hasRole('Admin') and hasRole('Owner')")
                .and().formLogin().loginPage("/login")
                .usernameParameter("ssoId").passwordParameter("password")
                .and().csrf()
                .and().exceptionHandling().accessDeniedPage("/Access_Denied");
    }
}
