package org.example.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Picnic {

    List<String> fruits = new ArrayList<>();
    HashMap<String, Integer> count_fruits = new HashMap<>();

    public Picnic() {
    }

    public Picnic(List<String> fruits, HashMap<String, Integer> count_fruits) {
        this.fruits = fruits;
        this.count_fruits = count_fruits;
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    public HashMap<String, Integer> getCount_fruits() {
        return count_fruits;
    }

    public void setCount_fruits(HashMap<String, Integer> count_fruits) {
        this.count_fruits = count_fruits;
    }
}
