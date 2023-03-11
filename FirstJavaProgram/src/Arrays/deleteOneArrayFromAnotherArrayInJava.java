package Arrays;

import java.util.ArrayList;

    /*
        В следующем примере используется метод Removeall для удаления одного массива.
     */
public class deleteOneArrayFromAnotherArrayInJava {
    public static void main(String[] args)  {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();

        objArray.add(0,"common1");
        objArray.add(1,"common2");
        objArray.add(2,"notcommon2");

        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");


        System.out.println("Элементы массива массив1 " +objArray);
        System.out.println("Элементы массива массив2 " +objArray2);

        objArray.removeAll(objArray2);

        System.out.println("Элементы массива массив1 после удаления схожих элементов из него " +objArray);
        System.out.println("Элементы массива массив2 " +objArray2);
    }
}