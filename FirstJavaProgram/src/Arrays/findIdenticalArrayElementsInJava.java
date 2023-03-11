package Arrays;

import java.util.ArrayList;

public class findIdenticalArrayElementsInJava {
    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"общий1");
        objArray2.add(1,"общий2");
        objArray2.add(2,"необщий");
        objArray2.add(3,"необщий");
        objArray.add(0,"общий1");
        objArray.add(1,"общий2");
        objArray.add(2,"необщий2");
        System.out.println("Элементы массива массив1 "+objArray);
        System.out.println("Элементы массива массив2 "+objArray2);
        objArray.retainAll(objArray2);
        System.out.println("Массив1 после сохранения общих элементов массива2 и массива1 и удаления разных "+objArray);
    }
}
