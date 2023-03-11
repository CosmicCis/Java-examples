package Strings;

public class findTheLastPositionOfASubstringInAString{
    /*
    Как найти последнюю позицию подстроки в строке?
    В этом примере показано, как определить последнюю позицию подстроки внутри строки с помощью метода lastIndexOf(String).
     */
    public static void main(String[] args) {
        String str = "Привет мир, привет читатель!";
        int index = str.lastIndexOf("привет");

        if(index == - 1){
            System.out.println("Подстрока \"привет\" не найдена");
        } else {
            System.out.println("Последнее вхождение подстроки \"привет\" в индексе " + index);
        }
    }
}