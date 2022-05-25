package object;

import shape.Triangle;

public class TrianglePyramid extends Pyramid {

    public TrianglePyramid(int id, Triangle shape, double height) {
        super(id, shape, height);
    }


    /*
    ∆ssa+∆ssb+∆ssc
    wobei s=√(h^2+〖〖(2∙sh〗_a)〗^2 )
    und 〖sh〗_a (Länge der Seitenhalbierenden von a)
    〖sh〗_a=1/2 √(〖2∙b〗^2+〖2∙c〗^2-a^2 )

    *
    **/
    @Override
    double getLateralSurface() {
        //TODO to be implemented
        return 0;
    }
}
