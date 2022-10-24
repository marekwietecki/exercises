import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner skaner=new Scanner(System.in);
        int a,b;
        b=0;
        a = skaner.nextInt();
        while(b<a){
            b++;
            System.out.println(b);
        } System.out.println("liczba liczb od 1 do wczytanej wynosi: " + b);

    }
}
