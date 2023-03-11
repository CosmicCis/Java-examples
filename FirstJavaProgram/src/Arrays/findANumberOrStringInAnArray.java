package Arrays;

import java.util.ArrayList;

public class findANumberOrStringInAnArray {
    /*
    В следующем примере используется в Java метод Contains для поиска в массиве строки.
     */

    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"общий1");
        objArray2.add(1,"общий2");
        objArray2.add(2,"необщий");
        objArray2.add(3,"необщий1");
        objArray.add(0,"общий1");
        objArray.add(1,"общий2");
        System.out.println("Элементы массива массив1 "+objArray);
        System.out.println("Элементы массива массив2 "+objArray2);
        System.out.println("Массив1 содержит строку общий2? "
                +objArray.contains("общий1"));
        System.out.println("Массив2 содержит массив1? "
                +objArray2.contains(objArray) );
    }
}
