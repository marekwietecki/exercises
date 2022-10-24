/*3. Wczytaćliczbęcałkowitąi obliczyćilośćjej dzienników przy uyciu ptli while.*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner skaner=new Scanner(System.in);
        int a,b,c;
        b=1;
        c=0;
        System.out.println("wprowadz liczbe calkowita: ");
        a = skaner.nextInt();
        while(a>b) {
            if (a % b == 0) {
                System.out.println("dzielnikiem liczby "+a+" jest liczba: "+b);
                c++;
            } b++;
        } System.out.println("liczba dzielnikow liczby: "+a+" wynosi: " + c);
    }
}
