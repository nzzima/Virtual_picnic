package org.example.Service;

import java.util.List;

public class DataLongestWordService implements LongestWordService{
    @Override
    public String findTheLongestWord(List<String> fruits) {
        String word = "";
        int max = 0;
        for (String fruit : fruits) {
            if (fruit.length() > max) {
                max = fruit.length();
                word = fruit;
            }
        }
        return word;
    }
}
