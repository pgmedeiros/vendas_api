package com.example.loja.config;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //Aprender trabalhar com classe HttpSecurity e AuthenticationManagerBuilder

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //http.csrf().disable().
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //auth
    }


}
