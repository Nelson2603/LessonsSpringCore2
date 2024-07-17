package org.example.lessonsspringcore2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Auto {
    private int id;
    private Engine engine;
    private String model;
}
