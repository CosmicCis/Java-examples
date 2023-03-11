package Strings;

public class replaceInJava {
    /*
    Следующий пример показывает как заменить в Java символ в строке или подстроку внутри строки с помощью метода replace() класса String (см. также методы replaceFirst() и replaceAll()).
     */
    public static void main(String args[]){
        String str = "Github";
        System.out.println(str.replace("P", "F"));
        System.out.println(str.replaceFirst("G", "d"));
        System.out.println(str.replaceAll("g", "d"));
    }
}
