package com.karichkovsky.infrastructure.json;

import com.google.gson.Gson;
import com.karichkovsky.domain.Point2D;
import com.karichkovsky.app.ports.FilePointsReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Objects;

/**
 * Implementation of Point2D objects reader specified to work with json format.
 *
 * @see FilePointsReader
 * @author karichkovkyi
 */
public class JsonPointsReader implements FilePointsReader {

    /**
     * Helper for reading objects from json format.
     */
    private final Gson gson = new Gson();

    /**
     * Reads Point2D objects from json file specified in input file path.
     *
     * @param filePath path to the json file
     * @return list of read converted Point2D objects
     * @throws IOException if some IO problems in file reading
     * @see Point2D
     */
    @Override
    public List<? extends Point2D> readPoints(String filePath) throws IOException {
        Objects.requireNonNull(filePath);

        try (Reader fileReader = new BufferedReader(new FileReader(filePath))) {
            return gson.fromJson(fileReader, JsonPoints.class).toPointList();
        }
    }
}
