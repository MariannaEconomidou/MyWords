package com.marianna.myWords.Dictionary;


import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
@Entity
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String word;
    @Column
    private String meaning;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
