package Strings;

public class compareWithCompareTo {
    public static void main(String args[]){
        String firstStr = "Привет Мир!";
        String secondStr = "привет мир!";
        Object objStr = firstStr;

        System.out.println(firstStr.compareTo(secondStr));
        System.out.println(firstStr.compareToIgnoreCase(secondStr));
        System.out.println(firstStr.compareTo(objStr.toString()));
    }
}