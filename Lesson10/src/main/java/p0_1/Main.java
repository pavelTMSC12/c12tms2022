package p0_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int N = 3;
        GeomInterface g[] = new GeomInterface[N];
        g[0] = new Line();
        g[1] = new Rectangle();
        g[2] = new Triangle();

        for (GeomInterface geom : g) {
            ((Geom) geom).draw();
            if (geom instanceof MathGeom) {
//                int a = 1;
//                byte b = (byte) a;
//                Serializable rectangle = (Serializable) geom;
                System.out.println(((MathGeom) geom).getSquare());
            }
//            GeomInterface geomInterface = (GeomInterface) geom;
            System.out.println(Arrays.toString(geom.getCoords()));
        }
    }
}
