package com.marcinha.limitless.repository;

import com.marcinha.limitless.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Integer> {

}
