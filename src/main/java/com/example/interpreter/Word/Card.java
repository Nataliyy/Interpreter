package com.example.interpreter.Word;

import javax.persistence.*;

@Entity

public class Card {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String EnWord;
    private String RuWord;
    private String Transcription;

    public Card() {

    }

    public Card(String EnWord, String RuWord, String Transcription) {
        this.EnWord = EnWord;
        this.RuWord = RuWord;
        this.Transcription = Transcription;

    }

    // Не пугайтесь. Здесь вместо void стоит Definition,
    // чтобы можно было добавлять значения в одну строчку:
    // (new Definition("яблоко")).addDefinition(new WordDefinition())


    public String getEnWord() {
        return EnWord;
    }

    public String getRuWord() {
        return RuWord;
    }

    public String getTranscription() {
        return Transcription;
    }
}

