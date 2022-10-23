/* 3. Wczytać 3 liczby całkowite i wypisać je od najmniejszej do największej. */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner skaner=new Scanner(System.in);
        int a,b,c;
        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        a=skaner.nextInt();
        System.out.println("Podaj pierwszą drugą całkowitą: ");
        b=skaner.nextInt();
        System.out.println("Podaj pierwszą trzecią całkowitą: ");
        c=skaner.nextInt();
        if((a>b)&&(a>c)&&(b>c)){
            System.out.println("Liczby od najmniejszej do największej:");
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        } else if((a>b)&&(a>c)&&(b<c)){
            System.out.println("Liczby od najmniejszej do największej:");
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }else if((b>a)&&(b>c)&&(a>c)){
            System.out.println("Liczby od najmniejszej do największej:");
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if((b>a)&&(b>c)&&(a<c)){
            System.out.println("Liczby od najmniejszej do największej:");
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if((c>a)&&(c>b)&&(a>b)){
            System.out.println("Liczby od najmniejszej do największej:");
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else {
            System.out.println("Liczby od najmniejszej do największej:");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}
