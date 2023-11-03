package com.example.football.service;

import org.springframework.stereotype.Service;

//ToDo - Implement all methods

public interface PlayerService {
    boolean areImported();

    String readPlayersFileContent() ;

    String importPlayers() ;

    String exportBestPlayers();
}
