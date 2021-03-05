package com.marcinha.limitless.service;

import com.marcinha.limitless.entity.Word;
import com.marcinha.limitless.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class WordServiceImpl implements WordService {

    private WordRepository repository;

    public WordServiceImpl() {
    }

    @Autowired
    public WordServiceImpl(WordRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Word> findAll() {
      return   repository.findAll();
    }

    @Override
    public void save(Word word) {
        repository.save(word);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Word findOne(int id) {
        Word word = null;
        Optional<Word> wordOptional = repository.findById(id);

        if(wordOptional.isPresent()){
             word = wordOptional.get();
        }
        else{
            System.out.println("There is no world like this in the list");
        }

        return word ;
    }
}
