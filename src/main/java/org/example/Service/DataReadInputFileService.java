package org.example.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataReadInputFileService implements ReadInputFileService{
    String filename = "input.txt";
    @Override
    public List<String> readInput() {
        List<String> fruits = new ArrayList<>();
        try(FileReader reader = new FileReader(filename)) {
            int c;
            StringBuilder fileData = new StringBuilder();
            while ((c = reader.read()) != -1) {
                fileData.append((char) c);
            }
            createList(fileData.toString(), fruits);
        } catch (IOException error) {
            System.out.printf(error.getMessage());
        }
        return fruits;
    }

    private void createList(String fileData, List<String> fruits) {
        String[] dataMassive = fileData.split(" ");
        fruits.addAll(Arrays.asList(dataMassive));
    }
}