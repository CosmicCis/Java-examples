package Strings;

public class compareWithEqually{
    public static void main(String []args){
        String str1 = "proglang";
        String str2 = "proglang";
        String str3 = new String ("Prog Lang");

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
    }
}