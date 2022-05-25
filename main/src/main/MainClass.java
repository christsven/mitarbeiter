package main;

import object.TrianglePrism;
import shape.Triangle;

class MainClass {

    public static void main(String[] args) {

        TrianglePrism prism = new TrianglePrism(10, new Triangle(10, 10, 10), 10);
        System.out.println(prism.getSurface());
    }
}









