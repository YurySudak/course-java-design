package com.rakovets.course.design.practice.pizzeria.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileLoader {

    public static Map<String, String> loadMap(String path) {
        Map<String, String> map = new LinkedHashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("=");
                map.put(data[0], data[1]);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
