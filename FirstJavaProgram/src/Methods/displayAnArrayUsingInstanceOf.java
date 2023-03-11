package Methods;

import java.util.ArrayList;
import java.util.Vector;

public class displayAnArrayUsingInstanceOf {
    /*
    В этом примере метод displayObjectClass() отображает класс объекта, который передается в этот метод в качестве аргумента.
     */
    public static void main(String[] args) {
        Object testObject = new ArrayList();
        displayObjectClass(testObject);
    }
    public static void displayObjectClass(Object o) {
        if (o instanceof Vector) System.out.println(
                "Объект был экземпляром класса java.util.Vector");
        else if (o instanceof ArrayList) System.out.println(
                "Объект был экземпляром класса java.util.ArrayList");
        else System.out.println("Объект был экземпляром " + o.getClass());
    }
}
