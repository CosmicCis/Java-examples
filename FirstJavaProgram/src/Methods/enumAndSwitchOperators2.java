package Methods;

public class enumAndSwitchOperators2 {
    /*
    В этом примере показано, как проверить, какой член перечисления выбран, с помощью операторов switch.
     */

    enum Choice { Choice1, Choice2, Choice3 }
    public static void main(String[] args) {
        Choice ch = Choice.Choice1;

        switch(ch) {
            case Choice1:
                System.out.println("Выбран Choice1");
                break;
            case Choice2:
                System.out.println("Выбран Choice2");
                break;
            case Choice3:
                System.out.println("Выбран Choice3");
                break;
        }
    }
}
