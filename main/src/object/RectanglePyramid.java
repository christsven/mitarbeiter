package object;

import shape.Rectangle;

public class RectanglePyramid extends Pyramid {

    public RectanglePyramid(int id, Rectangle shape, double height) {
        super(id, shape, height);
    }

    @Override
    double getLateralSurface() {
        //TODO to be implemented
        return 0;
    }
}
