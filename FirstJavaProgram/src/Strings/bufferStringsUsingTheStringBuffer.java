package Strings;

public class bufferStringsUsingTheStringBuffer {
    /*
    В следующем примере строки буферизуются и сбрасываются с помощью метода emit().
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("привет");
        sb.append(" мир!");
        sb.insert(0, " GitHub, ");
        System.out.print(sb);
    }
}
