package Methods;
class MyClass {
    int height;
    MyClass() {
        System.out.println("кирпичи");
        height = 0;
    }
    MyClass(int i) {
        System.out.println("Строительство нового дома высотой " + i + " футов");
        height = i;
    }
    void info() {
        System.out.println("Высота дома " + height + " футов");
    }
    void info(String s) {
        System.out.println(s + ": высота дома " + height + " футов");
    }
}
public class methodOverloadingInJava {
    /*
    В этом примере показан способ перегрузки метода в зависимости от типа и количества параметров.
     */
    public static void main(String[] args) {
        MyClass t = new MyClass(0);
        t.info();
        t.info("перегруженный метод");

        //Перегруженный конструктор:
        new MyClass();
    }

}
