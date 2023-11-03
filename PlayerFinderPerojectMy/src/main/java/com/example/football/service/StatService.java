package com.example.football.service;

import org.springframework.stereotype.Service;

//ToDo - Implement all methods

public interface StatService {
    boolean areImported();

    String readStatsFileContent() ;

    String importStats() ;

}
