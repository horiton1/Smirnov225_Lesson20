package task1;

class Circle {

    private final int centerX;
    private final int centerY;
    private final int radius;

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Радиус окружности: " + radius
                + ", координаты: "
                + centerX
                + ", "
                + centerY;
    }

    //добавьте геттеры для координат центра
    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }
}