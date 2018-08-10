package com.karichkovsky.app.ports;

import com.karichkovsky.domain.Point2D;
import java.util.List;

public interface PointsPrinter {

    void print(List<? extends Point2D> points);
}
