package com.example.interpreter.Word;

import java.util.List;

import com.example.interpreter.Word.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
    //List<Card> findByWord(String RuWord);

}