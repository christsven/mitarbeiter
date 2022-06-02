package object;

import shape.Triangle;

public class TrianglePyramid extends Pyramid {

    public TrianglePyramid(int id, Triangle shape, double height) {
        super(id, shape, height);
    }

    /*
     * TODO implement me
     *
     * 1. Mitte finden mit A, B, C gegeben
     *
     * A = Area of base
     * p = perimeter of base
     * s = slant height
     *
     * A+1/2*p*s
     *
     * davon für lateral scheis die area abziehen
     *
     * bullshit weil die seiten nicht gleich lang sind
     *
     */
    @Override
    double getLateralSurface() {
        //TODO to be implemented
        return 0;
    }
}
