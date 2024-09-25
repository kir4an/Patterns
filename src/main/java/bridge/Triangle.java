package bridge;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Рисуем треугольник!");
        color.fillColor();
    }
}
