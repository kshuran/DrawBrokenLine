package com.kshuran.drawbrokenline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Кулацкий
 */
public class DrawBrokenLine {

    public DrawBrokenLine() {
    }

    public List<Point> drawBrokenLine(List<String> list) {
        Comparator<Point> byXthenY = Comparator.comparingInt(Point::getX)
                .thenComparing(Point::getY);
        List<Point> points = new ArrayList<>();
        Point point;
        for(String lst : list) {
            String[] str = lst.split(";", 2);
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            point = new Point(x, y);
            points.add(point);
            
        }
        points.sort(byXthenY);
        return points;
    }

}
