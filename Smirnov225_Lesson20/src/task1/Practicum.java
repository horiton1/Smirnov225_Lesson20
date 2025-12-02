package task1;

import java.util.Arrays;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {
        List<Circle> circles = Arrays.asList(
                new Circle(3, 5, 12),
                new Circle(1, -2, 4),
                new Circle(8, 8, 8),
                new Circle(5, 1, 8)
        );

        circles.sort((Circle circle1, Circle circle2) -> {

            if(circle1.getRadius() != circle2.getRadius()) {
                return circle2.getRadius() - circle1.getRadius(); // от большего к меньшему
            }

            int sum1 = circle1.getCenterX() + circle1.getCenterY();
            int sum2 = circle2.getCenterX() + circle2.getCenterY();
            return sum2 - sum1;
        });

        for (Circle circle: circles) {
            System.out.println(circle);
        }
    }
}