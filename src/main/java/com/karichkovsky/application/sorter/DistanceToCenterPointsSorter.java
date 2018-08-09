package com.karichkovsky.application.sorter;

import com.karichkovsky.application.model.Point2D;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author karic
 */
public class DistanceToCenterPointsSorter implements PointsSorter {

    @Override
    public List<? extends Point2D> sort(List<? extends Point2D> points) {
        return points.stream()
                .sorted(Comparator.comparing(Point2D::getDistanceToCenter))
                .collect(Collectors.toList());
    }

}
