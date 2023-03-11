package Methods;

public class redefiningAMethod {
    /*
    Этот пример демонстрирует способ переопределения метода подклассами с разным количеством и типом параметров.
     */
    public static void main (String []agrs) {
        Figure f = new Figure(10 , 10);
        Rectangle r = new Rectangle(9 , 5);
        Figure figref;
        figref = f;
        System.out.println("Площадь: "+figref.area());
        figref = r;
        System.out.println("Площадь: "+figref.area());
    }
}
class Figure {
    double dim1;
    double dim2;
    Figure(double a , double b) {
        dim1 = a;
        dim2 = b;
    }
    Double area() {
        System.out.println("Внутренняя площадь для фигуры.");
        return(dim1*dim2);
    }
}
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a ,b);
    }
    Double area() {
        System.out.println("Внутренняя площадь для прямоугольника.");
        return(dim1*dim2);
    }
}
