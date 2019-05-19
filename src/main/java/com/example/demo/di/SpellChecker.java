package com.example.demo.di;

import java.util.Objects;


/**
 *  依赖注入就是 如果我要创建SpellChecker 这个类的对象，必须先创建它所依赖的 Lexicon 这个类
 */
public class SpellChecker {

    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary){
        this.dictionary= Objects.requireNonNull(dictionary);
    }
}
