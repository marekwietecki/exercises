/* 2. Wczytać 3 liczby całkowite i wypisać najmniejsza z nich. */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner skaner=new Scanner(System.in);
        int a,b,c,x;
        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        a=skaner.nextInt();
        System.out.println("Podaj pierwszą drugą całkowitą: ");
        b=skaner.nextInt();
        System.out.println("Podaj pierwszą trzecią całkowitą: ");
        c=skaner.nextInt();
        if(a<=b&&a<=c) {
            System.out.println("Najmniejszą liczbą jest: " + a);
        } else if(b<=a&&b<=c) {
            System.out.println("Najmniejszą liczbą jest: " + b);
        } else if(c<=a&&c<=b) {
            System.out.println("Najmniejszą liczbą jest: " + c);
        }

    }
}
