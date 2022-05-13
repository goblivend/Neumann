public class Circle {
    private Point center;
    private int radius;
    private int angle;
    private int speed;

    public Circle(Point center, int radius, int angle, int speed) {
        this.center = center;
        this.radius = radius;
        this.angle = angle;
        this.speed = speed;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public int getAngle() {
        return angle;
    }

    public double getRadian() {
        return Math.toRadians(angle);
    }
}
