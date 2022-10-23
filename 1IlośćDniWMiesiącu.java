/*
Pobierający od użytkownika rok i miesiąc i drukuje na ekranie informacje o tym ile zadany miesiąc ma dni
*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner skaner=new Scanner(System.in);
        int a,b;
        System.out.println("Type number of year: ");
        a=skaner.nextInt();
        System.out.println("Type number of month: ");
        b=skaner.nextInt();
        if(b==1||b==3||b==5||b==7||b==8||b==10||b==12){
            System.out.println("Month has 31 days");
        } else if(b==4||b==6||b==9||b==11) {
            System.out.println("Month has 30 days");
        } else {
            System.out.println("Month has 28days");
        }
    }
}
//uwzględnić lata przestępne
