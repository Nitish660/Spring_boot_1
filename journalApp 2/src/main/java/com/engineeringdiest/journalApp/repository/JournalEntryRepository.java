package com.engineeringdiest.journalApp.repository;

import com.engineeringdiest.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {


}
