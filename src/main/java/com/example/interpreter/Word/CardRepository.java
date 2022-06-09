package com.example.interpreter.Word;

import java.util.List;

import com.example.interpreter.Word.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CardRepository extends JpaRepository<Card, Long> {
    //List<Card> findByWord(String RuWord);

}