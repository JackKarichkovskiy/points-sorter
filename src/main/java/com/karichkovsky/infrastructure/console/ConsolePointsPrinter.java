package com.karichkovsky.infrastructure.console;

import com.karichkovsky.application.model.Point2D;
import com.karichkovsky.application.ports.PointsPrinter;
import java.util.List;

/**
 *
 * @author karic
 */
public class ConsolePointsPrinter implements PointsPrinter {

    @Override
    public void print(List<? extends Point2D> points) {
        System.out.println(points);
    }
}
