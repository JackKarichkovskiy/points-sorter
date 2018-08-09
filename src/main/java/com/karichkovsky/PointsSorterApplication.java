package com.karichkovsky;

import com.karichkovsky.domain.Point2D;
import com.karichkovsky.application.ports.FilePointsReader;
import com.karichkovsky.application.ports.PointsPrinter;
import com.karichkovsky.application.sorter.PointsSorter;
import com.karichkovsky.infrastructure.console.ConsolePointsPrinter;
import com.karichkovsky.infrastructure.json.JsonPointsReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author karic
 */
public class PointsSorterApplication {

    private final FilePointsReader reader = new JsonPointsReader();
    private final PointsSorter sorter = new PointsSorter();
    private final PointsPrinter printer = new ConsolePointsPrinter();

    public static void main(String[] args) throws IOException {
        new PointsSorterApplication().go();
    }

    private void go() throws IOException {
        List<? extends Point2D> readPoints = reader.readPoints("tmp/points.json");
        List<? extends Point2D> sortedPoints = sorter.sort(readPoints,
                Comparator.comparing(Point2D::getDistanceToCenter));
        printer.print(sortedPoints);
    }
}
