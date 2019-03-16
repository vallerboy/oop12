package points;

public class Starter {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,2);
        Point3D point3D = new Point3D(3,4,5);

        Point3D newPoint = new Point3D(point2D, 1);

        System.out.println(point3D);
    }
}
