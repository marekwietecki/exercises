/*Wczytujący liczbę punktów zdobytych na sprawdzianie. Liczbę punków wczytujemy z klawiatury.
	Następnie wypisujący otrzymaną ocenę według tabeli: 0 -50 pkt – dwójka; 51-70 pkt – trójka; 71-90 pkt – czwórka; 90-100 pkt - piątka.*/
  
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner skaner=new Scanner(System.in);
        System.out.println("Podaj liczbę punktów zdobytych na sprawdzianie: ");
        int a;
        a=skaner.nextInt();
        if(a<0||a>100){
            System.out.println("Niepoprawna liczba punktów");
        } else if(a>=0&&a<=50) {
            System.out.println("Twoja ocena to: 2");
        } else if(a>50&&a<70) {
            System.out.println("Twoja ocena to: 3");
        } else if(a>70&&a<=90) {
            System.out.println("Twoja ocena to: 4");
        } else if(a>90&&a<=100){
            System.out.println("Twoja ocena to: 5");
        }


    }
}
