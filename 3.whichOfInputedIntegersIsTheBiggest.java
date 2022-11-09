import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Napisać program wczytujący 10 liczb całkowitych i wypisuje największą z nich (nie uzywać tablicy, program nie musi zapamiętywać wczytywanych liczb).*/

        int x = 0;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        y = scanner.nextInt();
        for (int i = 0; i < 8; i++) {
            System.out.println("Podaj liczbę całkowitą: ");
            if (y >= x) {
                x = y;
            }
            y = scanner.nextInt();
        } System.out.println("Największą liczbą z podanych jest: "+x);
    }
}
