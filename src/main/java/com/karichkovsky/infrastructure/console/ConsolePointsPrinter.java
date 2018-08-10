package com.karichkovsky.infrastructure.console;

import com.karichkovsky.domain.Point2D;
import com.karichkovsky.app.ports.PointsPrinter;
import java.util.List;

public class ConsolePointsPrinter implements PointsPrinter {

    @Override
    public void print(List<? extends Point2D> points) {
        System.out.println(points);
    }
}
