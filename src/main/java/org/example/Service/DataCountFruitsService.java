package org.example.Service;

import java.util.List;

public class DataCountFruitsService implements CountFruitsService{
    @Override
    public Integer totalCountFruits(List<String> fruits) {
        return fruits.size();
    }
}
