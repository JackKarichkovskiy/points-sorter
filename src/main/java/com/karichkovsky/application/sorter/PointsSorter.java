package com.karichkovsky.application.sorter;

import com.karichkovsky.domain.Point2D;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author karic
 */
public class PointsSorter {

    public List<? extends Point2D> sort(List<? extends Point2D> points, Comparator<? super Point2D> comparator) {
        return points.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
