package com.example.ingressproject2.controller;

import com.example.ingressproject2.model.DictionaryRequest;
import com.example.ingressproject2.model.DictionaryResponse;
import com.example.ingressproject2.service.DictionaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/dictionaries")
@RequiredArgsConstructor
public class DictionaryController {
    private final DictionaryService dictionaryService;
    @GetMapping("/{id}")
    public DictionaryResponse getDictionaryById(
            @RequestHeader(name = "User-Id") Long userId,
            @PathVariable Long id){
        return dictionaryService.getDictionaryById(id);
    }
    @GetMapping
    public List<DictionaryResponse> getDictionaries(

            @RequestParam(required = false) String category){
        return dictionaryService.getDictionaries(category);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveDictionary(@RequestBody DictionaryRequest dictionary){

    }
}
