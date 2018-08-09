package com.karichkovsky.application.model;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author karic
 */
public final class Point2D {

    public static final Point2D CENTER = new Point2D(0, 0);

    private final int x;
    private final int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistanceTo(Point2D other) {
        Objects.requireNonNull(other);

        BigDecimal xDistance = new BigDecimal(other.x).subtract(new BigDecimal(this.x));
        BigDecimal yDistance = new BigDecimal(other.y).subtract(new BigDecimal(this.y));
        return Math.sqrt(xDistance.multiply(xDistance).add(yDistance.multiply(yDistance)).doubleValue());
    }

    public double getDistanceToCenter() {
        return getDistanceTo(CENTER);
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + ']';
    }

}
