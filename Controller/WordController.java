package com.marianna.myWords.Controller;

import com.marianna.myWords.Dictionary.Word;
import com.marianna.myWords.Sentence.SentenceGenerator;
import com.marianna.myWords.wordsDB.WordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
public class WordController {

    @Autowired
    private WordRepo wordRepo;

    @GetMapping("/")
    public String getPage()
    {return "hello";}
    @GetMapping("/words")
    public List<Word> getWords(){
     return wordRepo.findAll();
    }
    @PostMapping("/saveword")
    public String saveWord(@RequestBody Word word)
    {   wordRepo.save(word);
        return "saved";
    }


    private final SentenceGenerator sentenceGenerator;

    public WordController(SentenceGenerator sentenceGenerator) {
        this.sentenceGenerator = sentenceGenerator;
    }

    @GetMapping("/sentence")
    public String chatGPT(@RequestParam String prompt) {
        String prompt2="Make a sentence with "+prompt;
        return sentenceGenerator.getSentence(prompt2);
    }


}
