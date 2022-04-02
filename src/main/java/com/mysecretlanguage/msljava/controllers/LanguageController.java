package com.mysecretlanguage.msljava.controllers;

import com.mysecretlanguage.msljava.Language;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {
    
    @GetMapping("/api/languages/{id}/words/all")
    public Language language(@PathVariable Long id) {
        return new Language(id, "Success!");
    }
}
