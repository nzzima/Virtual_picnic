package org.example.Service;

import java.util.*;

public class DataFrequencyOccurrenceFruitsService implements FrequencyOccurrenceFruitsService{
    @Override
    public HashMap<String, Integer> frequencyOfFruits(List<String> fruits) {
        HashMap<String, Integer> freq_fruits = new HashMap<>();
        for (String fruit : fruits) {
            Integer oldCount = freq_fruits.get(fruit);
            if (oldCount == null) {
                oldCount = 0;
            }
            freq_fruits.put(fruit, oldCount + 1);
        }
        return freq_fruits;
    }
}
