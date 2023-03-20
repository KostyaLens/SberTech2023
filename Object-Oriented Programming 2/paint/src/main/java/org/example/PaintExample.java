package org.example;

public class PaintExample {
    public static void main(String[] args) {
        Circle circle = new Circle(12,43,10,5);
        System.out.println(FigureUtil.area(circle));
        FigureUtil.draw(circle, Figure.Color.YELLOW);
        FigureUtil.draw(circle, Figure.Color.BLUE);
        FigureUtil.draw(circle);
        Square square = new Square(44,1,5,1);
        System.out.println(FigureUtil.area(square));
        FigureUtil.draw(square);
        Rectangle rectangle = new Rectangle(54,34,15,4);
        System.out.println(FigureUtil.perimetr(rectangle));
        Triangle tri = new Triangle(160,30,12,43);
        FigureUtil.draw(tri, Figure.Color.RED);





    }

}
