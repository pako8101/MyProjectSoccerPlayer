package com.example.football.service;


import org.springframework.stereotype.Service;

//ToDo - Implement all methods

public interface TownService {

    boolean areImported();

    String readTownsFileContent() ;
	
	String importTowns();

}
