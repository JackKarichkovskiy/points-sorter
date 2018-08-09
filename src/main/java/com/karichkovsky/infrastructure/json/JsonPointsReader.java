package com.karichkovsky.infrastructure.json;

import com.google.gson.Gson;
import com.karichkovsky.application.model.Point2D;
import com.karichkovsky.application.ports.FilePointsReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 *
 * @author karic
 */
public class JsonPointsReader implements FilePointsReader {

    private final Gson gson = new Gson();

    @Override
    public List<? extends Point2D> readPoints(String filePath) throws IOException {
        try (Reader fileReader = new BufferedReader(new FileReader(filePath))) {
            return gson.fromJson(fileReader, JsonPoints.class).toPointList();
        }
    }
}
