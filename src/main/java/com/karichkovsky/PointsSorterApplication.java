package com.karichkovsky;

import com.karichkovsky.application.model.Point2D;
import com.karichkovsky.application.ports.FilePointsReader;
import com.karichkovsky.application.ports.PointsPrinter;
import com.karichkovsky.application.sorter.DistanceToCenterPointsSorter;
import com.karichkovsky.application.sorter.PointsSorter;
import com.karichkovsky.infrastructure.console.ConsolePointsPrinter;
import com.karichkovsky.infrastructure.json.JsonPointsReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author karic
 */
public class PointsSorterApplication {

    private final FilePointsReader reader = new JsonPointsReader();
    private final PointsSorter sorter = new DistanceToCenterPointsSorter();
    private final PointsPrinter printer = new ConsolePointsPrinter();

    public static void main(String[] args) throws IOException {
        new PointsSorterApplication().go();
    }

    private void go() throws IOException {
        List<? extends Point2D> readPoints = reader.readPoints("tmp/points.json");
        List<? extends Point2D> sortedPoints = sorter.sort(readPoints);
        printer.print(sortedPoints);
    }
}
