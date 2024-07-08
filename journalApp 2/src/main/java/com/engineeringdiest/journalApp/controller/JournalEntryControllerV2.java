package com.engineeringdiest.journalApp.controller;

import com.engineeringdiest.journalApp.entity.JournalEntry;
import com.engineeringdiest.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {



     private JournalEntryService journalEntryService;

        @GetMapping
        public List<JournalEntry> getAll(){
            return null;
        }

        @PostMapping
        public boolean createEntry(@RequestBody JournalEntry myEntry) {
                journalEntryService.save(myEntry);
            return true;
        }

        @GetMapping("/id/{myId}")
        public JournalEntry getJournalEntryById(@PathVariable Long myId){
            return  null;
        }

        @DeleteMapping("/id/{myId}")
        public JournalEntry deleteJournalEntryById(@PathVariable Long myId){
            return  null;
        }
        @PutMapping("id/{id}")
        public JournalEntry updateJournalEntryById(@PathVariable Long id, @RequestBody JournalEntry myEntry)
        {
            return null;
        }
    }

