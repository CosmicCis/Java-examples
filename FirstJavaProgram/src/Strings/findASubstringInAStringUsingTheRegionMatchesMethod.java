package Strings;

public class findASubstringInAStringUsingTheRegionMatchesMethod {
    /*
    В следующем примере определяются совпадения в двух строках с помощью метода regionMatches().
     */
    public static void main(String[] args) {

        String firstString = "Метод regionMatches сравнивает части строк";

        String secondString = "В Java есть метод regionmatches";

        System.out.println("Равны ли части строк без учета регистра? - "
                + firstString.regionMatches(6, secondString, 18, 13));

        // указываем true первым параметром,
        // чтобы Java не игнорировала регистр
        System.out.println("Равны ли части строк с учетом регистра? - "
                + firstString.regionMatches(true, 6, secondString, 18, 13));
    }
}
