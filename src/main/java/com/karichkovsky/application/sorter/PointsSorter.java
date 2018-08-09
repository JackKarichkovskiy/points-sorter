package com.karichkovsky.application.sorter;

import com.karichkovsky.application.model.Point2D;
import java.util.List;

/**
 *
 * @author karic
 */
public interface PointsSorter {

    List<? extends Point2D> sort(List<? extends Point2D> points);
}
