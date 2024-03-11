package org.example.View;

import org.example.Model.Picnic;

import java.util.*;

public class PicnicView {
    public void PrintPicnic(Picnic picnic) {
        List<String> unique = RemoveRepeatedElems(picnic.getFruits());
        System.out.println("========================== P I C N I C ==========================");
        System.out.println("Каждый гость мог принести с собой все что угодно.");
        System.out.println("На нашем пикнике большое разнообразие продуктов и вещевых позиций:");
        for (String fruit : unique) {
            System.out.println(fruit);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Причем некоторые из них даже повторяются:\n");
        for (String key : picnic.getCount_fruits().keySet()) {
            String value = picnic.getCount_fruits().get(key).toString();
            System.out.println(key + " --> " + value + " шт.");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Наиболее популярные позиции:\n");
        for (String key : picnic.getCount_fruits().keySet()) {
            String value = picnic.getCount_fruits().get(key).toString();
            if(picnic.getCount_fruits().get(key) >= 99) {
                System.out.println(key + " --> " + value + " шт.");
            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("=================================================================");
    }

    public void PrintResults(int count, String word) {
        System.out.println("\n/////////////////////////////////////////////////////////////////");
        System.out.println("Результаты:");
        System.out.println("Количество слов в файле input.txt --> " + count);
        System.out.println("Самое длинное слово --> " + word);
        System.out.println("/////////////////////////////////////////////////////////////////\n");
    }

    private List<String> RemoveRepeatedElems(List<String> fruits) {
        Set<String> set = new HashSet<>(fruits);
        return new ArrayList<>(set);
    }
}
