package object;

import shape.Triangle;

public class TrianglePyramid extends Pyramid {

    public TrianglePyramid(int id, Triangle shape, double height) {
        super(id, shape, height);
    }

    @Override
    double getLateralSurface() {
        //TODO to be implemented
        return 0;
    }
}
