package com.example.football.service.impl;

import com.example.football.models.dto.ImportStatRootDTO;
import com.example.football.repository.StatRepository;
import com.example.football.service.StatService;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//ToDo - Implement all methods
@Service
public class StatServiceImpl implements StatService {

    private final StatRepository statRepository;


    public StatServiceImpl(StatRepository statRepository) throws JAXBException {
        this.statRepository = statRepository;
        JAXBContext context = JAXBContext.newInstance(ImportStatRootDTO.class);

    }

    @Override
    public boolean areImported() {
        return this.statRepository.count()>0;
    }

    @Override
    public String readStatsFileContent() throws IOException {
        Path path = Path.of("src", "main", "resources", "files", "xml", "stats.xml");
        return Files.readString(path);
    }

    @Override
    public String importStats() {
        return null;
    }
}
