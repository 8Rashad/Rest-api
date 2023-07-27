package com.example.ingressproject2.service;

import com.example.ingressproject2.model.DictionaryRequest;
import com.example.ingressproject2.model.DictionaryResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryService {
    public DictionaryResponse getDictionaryById(Long id){
        return new DictionaryResponse(1L, "Mobile", "Azercell");
    }
    public List<DictionaryResponse> getDictionaries(String category){
        return List.of(new DictionaryResponse(1L, "Mobile", "Azercell"));
    }

    public void saveDictionary(DictionaryRequest dictionary){

    }

}
