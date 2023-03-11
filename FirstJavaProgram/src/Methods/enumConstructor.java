package Methods;
enum CarEnum {
    lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
    private int price;
    CarEnum(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
public class enumConstructor {
    /*
    В этом примере перечисление инициализируется с помощью конструктора и метода getPrice() и отображает значения перечислений.
     */


        public static void main(String[] args) {
            System.out.println("Все цены на автомобили:");
            for (CarEnum c : CarEnum.values())
                System.out.println(
                        c + " стоит " + c.getPrice() + " тысяч долларов.");
        }

}
