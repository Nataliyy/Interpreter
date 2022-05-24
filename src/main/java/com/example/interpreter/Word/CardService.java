package com.example.interpreter.Word;

import com.example.interpreter.Word.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    private CardRepository repository;
    //    Раньше было:
    //    private SortedMap<String, Definition> dictionary;

    public CardService() {

    }

    public CardRepository getRepository() {
        return repository;
    }

//    public List<Card> getAllCards() {
//        return this.repository.findAll();
//    }
//
//    public Card getCard(String RuWord) {
//        return this.repository.findByWord(RuWord).get(0);
//    }

}
