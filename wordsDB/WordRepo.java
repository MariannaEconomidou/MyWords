package com.marianna.myWords.wordsDB;

import com.marianna.myWords.Dictionary.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepo extends JpaRepository<Word,Long> {
}
