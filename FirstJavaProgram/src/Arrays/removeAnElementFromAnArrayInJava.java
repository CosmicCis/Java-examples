package Arrays;

import java.util.ArrayList;

public class removeAnElementFromAnArrayInJava {
    /*
    В следующем примере показано удаление из массива в Java.
     */
    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        objArray.clear();
        objArray.add(0,"0-ой элемент");
        objArray.add(1,"1-ый элемент");
        objArray.add(2,"2-ой элемент");
        System.out.println("Массив перед удалением элемента "+objArray);
        objArray.remove(1);
        objArray.remove("0-ой элемент");
        System.out.println("Массив после удаления элемента "+objArray);
    }
}
