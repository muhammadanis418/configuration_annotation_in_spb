package com.example.configuration_annotation_in_spb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

public class LowerCaseWordsService {


    private final List<String> words= Arrays.asList("code","learn","hub");

    private final PunctuationService punctuationService;

    public LowerCaseWordsService(PunctuationService punctuationService) {
        this.punctuationService = punctuationService;
    }


    public PunctuationService getPunctuationService() {
        return punctuationService;
    }

    public List<String>getAllWords(){
        return words;
    }
}
