package com.marcinha.limitless.entity;

import javax.persistence.*;

@Entity
@Table(name="word")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name = "string")
    private String word;


    public Word(){}

    public Word(String word) {
        this.word = word;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Word:" +
                "id =  " + id +
                ", word = '" + word ;
    }
}
