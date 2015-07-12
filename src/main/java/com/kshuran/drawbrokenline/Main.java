package com.kshuran.drawbrokenline;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Кулацкий
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("1;-3");
        list.add("-5;8");
        list.add("4;0");
        list.add("4;-2");
        list.add("-4;3");
        list.add("2;-2");
        list.add("1;4");
        list.add("1;0");
        list.add("2;-2");
        list.add("-1;-3");
        list.add("-4;-2");
        
        DrawBrokenLine dbl = new DrawBrokenLine();
        List<Point> sortedList = dbl.drawBrokenLine(list);
        for (Point p : sortedList){
            System.out.println("x = " + p.getX() + "; y = " + p.getY() + ";");
        }
    }
    
}
