public class Tester {
    public static void main(String[] args) {
        int err = 0;
        Point p1 = new Point(1, 2);
        Point p2 = new Point(p1);
        Point p3 = new Point(8, 3);
        Point p4 = new Point(15, -3);
        Triangle t1 = new Triangle(p1, p3, p4);
        Triangle t2 = new Triangle(0, 0, 1, 0, 0, 1);
        Triangle t3 = new Triangle(0, 0, 4, 0, 2, 2 * Math.sqrt(3));
        Triangle t4 = new Triangle(3,-3, 8, 9, 1, 2);
        Triangle t5 = new Triangle(p4, p4, p1);

        err += check("p1.getX()", p1.getX(), 1.0);
        err += check("p2.getY()", p2.getY(), 2.0);
        err += check("p1.distanceTo(p3)", p1.distanceTo(p3), 7.0710678118654755);
        err += check("p1.distanceTo(p1)", p1.distanceTo(p1), 0.0);
        err += check("p1.equals(p2)", p1.equals(p2), true);
        err += check("p1.equals(p3)", p1.equals(p3), false);
        err += check("p1.equals(p1)", p1.equals(p1), true);
        err += check("t1.getPerimeter()", t1.getPerimeter(), 31.15668101647687);
        err += check("t1.getArea()", t1.getArea(), 24.499999999999975);
        err += check("t1.classify()", t1.classify(), "scalene");
        err += check("t2.classify()", t2.classify(), "isosceles");
        err += check("t3.classify()", t3.classify(), "equilateral");
        err += check("t1.toString()", t1.toString(), "v1(1.0, 2.0) v2(8.0, 3.0) v3(15.0, -3.0)");
        t2.setVertex(1, p4);
        err += check("t2.toString()", t2.toString(), "v1(0.0, 0.0) v2(15.0, -3.0) v3(0.0, 1.0)");
        err += check("t4.toString()", t4.toString(), "v1(3.0, -3.0) v2(8.0, 9.0) v3(1.0, 2.0)");
        err += check("t5.toString()", t5.toString(), "v1(15.0, -3.0) v2(15.0, -3.0) v3(1.0, 2.0)");

        if (err == 0) System.out.println("All good!");
        else if (err == 1) System.out.println("Uh oh... 1 error found.");
        else System.out.println("Uh oh... " + err + " errors found.");
    }

    public static int check(String name, Object actual, Object expected) {
        if (actual.equals(expected)) return 0;
        else {
            System.out.println("Failure on " + name + ": Expected \"" +
                                expected + "\", got \"" + actual + "\".");
            return 1;
        }
    }
}
