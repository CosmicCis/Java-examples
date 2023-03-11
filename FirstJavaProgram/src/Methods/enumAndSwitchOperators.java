package Methods;
enum Car {
    lamborghini,geely,audi,fiat,honda
}
public class enumAndSwitchOperators {
    /*
    В этом примере показано, как проверить, какой член перечисления выбран, с помощью операторов switch.
     */

    public static void main(String args[]){
        Car c;
        c = Car.lamborghini;
        switch(c) {
            case lamborghini:
                System.out.println("Твой выбор Lamborghini!");
                break;
            case geely:
                System.out.println("Твой выбор Geely!");
                break;
            case audi:
                System.out.println("Твой выбор Audi!");
                break;
            case fiat:
                System.out.println("Твой выбор Fiat!");
                break;
            case honda:
                System.out.println("Твой выбор Honda!");
                break;
            default:
                System.out.println("Я не знаю твою машину.");
                break;
        }
    }
}
