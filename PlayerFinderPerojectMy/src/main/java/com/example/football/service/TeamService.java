package com.example.football.service;

import org.springframework.stereotype.Service;

//ToDo - Implement all methods

public interface TeamService {
    boolean areImported();

    String readTeamsFileContent() ;

    String importTeams() ;

}
