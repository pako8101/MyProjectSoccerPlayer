package com.example.football.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//ToDo Create configurations
@Configuration
public class ApplicationBeanConfiguration {

    @Bean
    public ModelMapper createModelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }


}
