package Strings;

public class findTheLastPositionOfASubstringInTheString {
    /*
    В этом примере показано, как определить последнюю позицию курсора в строке с помощью метода lastIndexOf(String).
     */
    public static void main(String []args) {
        String str = "github";
        int index = str.lastIndexOf("g");

        System.out.println(index);
    }
}