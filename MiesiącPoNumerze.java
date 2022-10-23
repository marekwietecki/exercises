/*Używając instrukcji switch napisać program wczytujący numer miesiąca (liczbę od 1 do 12) i wypisujący nazwę tego miesiąca. 
Jeżeli liczba jest spoza zakresu 1-12 program ma wypisywać komunikat o błędzie.*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner skaner=new Scanner(System.in);
        int a;
        System.out.println("Type a month number: ");
        a=skaner.nextInt();
        switch(a){
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Incorrect input");
        }
    }
}
