package com.engineeringdiest.journalApp.service;

import com.engineeringdiest.journalApp.entity.JournalEntry;
import com.engineeringdiest.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


public class JournalEntryService {



    private JournalEntryRepository journalEntryRepository;

    public void save(JournalEntry journalEntry) {
        journalEntryRepository.save(journalEntry);
    }
}
