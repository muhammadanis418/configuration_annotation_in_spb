package com.example.configuration_annotation_in_spb.service;

import java.util.Arrays;
import java.util.List;

public class PunctuationService {

    private final List<Character> punctationMarks= Arrays.asList('.',';','!','?');

    public List<Character> getAllPunctuationMarks(){
        return punctationMarks;
    }
}
