package com.karichkovsky.application.ports;

import com.karichkovsky.domain.Point2D;
import java.util.List;

/**
 *
 * @author karic
 */
public interface PointsPrinter {

    void print(List<? extends Point2D> points);
}
