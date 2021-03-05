package com.marcinha.limitless.service;

import com.marcinha.limitless.entity.Word;

import java.util.List;

public interface WordService {

    List<Word> findAll();
    void save(Word word);
    void delete(int id);
    Word findOne(int id);
}
