import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Napisać program wczytujący 10 liczb całkowitych i wypisujący je w odwrotnej kolejności niż były podawane.*/
        Scanner scanner = new Scanner(System.in);

        int[]tab=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Podaj liczbę całkowitą: ");
            tab[i]=scanner.nextInt();
        }
        System.out.println("Liczby wpisane od ostatniej do pierwszej to: ");
        for(int i=9;i>=0;i--){
            System.out.println(tab[i]);
        }
    }
}
