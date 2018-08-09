package com.karichkovsky.application.ports;

import com.karichkovsky.domain.Point2D;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author karic
 */
public interface FilePointsReader {

    List<? extends Point2D> readPoints(String filePath) throws IOException;
}
