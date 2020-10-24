package com.company;

public class JavaExample {
    public static void main(String args[]){
        String str = new String("SELECT * from company_view FROM TEHRE;");

        System.out.print("String after replacing com with net :" );
        System.out.println(str.replaceFirst("com", "net"));

        System.out.print("String after replacing Site name:" );
        System.out.println(str.replaceFirst("(?i)(select (.+?) from)", "SELECT COUNT(*) FROM"));

    }
}
