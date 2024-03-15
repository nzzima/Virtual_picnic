package org.example.Controller;

import org.example.Model.Picnic;
import org.example.Service.DataCountFruitsService;
import org.example.Service.DataFrequencyOccurrenceFruitsService;
import org.example.Service.DataLongestWordService;
import org.example.Service.DataReadInputFileService;
import org.example.View.PicnicView;

import java.util.HashMap;
import java.util.List;

public class Controller {
    private final DataReadInputFileService dataReadInputFileService;
    private final DataCountFruitsService dataCountFruitsService;
    private final DataLongestWordService dataLongestWordService;
    private final DataFrequencyOccurrenceFruitsService dataFrequencyOccurrenceFruitsService;
    private final PicnicView picnicView;

    public void start() {
        List<String> fruits = dataReadInputFileService.readInput();
        int count = dataCountFruitsService.totalCountFruits(fruits);
        String word = dataLongestWordService.findTheLongestWord(fruits);

        HashMap<String, Integer> freq_fruits = dataFrequencyOccurrenceFruitsService.frequencyOfFruits(fruits);
        freq_fruits.remove("");

        Picnic picnic = new Picnic(fruits, freq_fruits);

        picnicView.PrintResults(count, word);
        picnicView.PrintPicnic(picnic);
    }

    public Controller() {
        dataReadInputFileService = new DataReadInputFileService();
        dataCountFruitsService = new DataCountFruitsService();
        dataLongestWordService = new DataLongestWordService();
        dataFrequencyOccurrenceFruitsService = new DataFrequencyOccurrenceFruitsService();
        picnicView = new PicnicView();
    }
}
