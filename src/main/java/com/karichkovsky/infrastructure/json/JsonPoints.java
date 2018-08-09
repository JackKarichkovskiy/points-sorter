package com.karichkovsky.infrastructure.json;

import com.karichkovsky.application.model.Point2D;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author karic
 */
public class JsonPoints {

    private int[][] points;

    public int[][] getPoints() {
        return points;
    }

    public void setPoints(int[][] points) {
        this.points = points;
    }

    public List<Point2D> toPointList() {
        return Arrays.stream(points)
                .map(p -> new Point2D(p[0], p[1]))
                .collect(Collectors.toList());
    }
}
