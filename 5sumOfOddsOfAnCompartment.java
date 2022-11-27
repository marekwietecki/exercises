import java.util.Scanner;
//Napisać program obliczający sumę liczb nieparzystych z przedziału <x,y>. Wartości x i y podaje użytkownik.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int x=scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int y=scanner.nextInt();
        int z=0;

        while(x<y){
            x++;
            if(x%2==0){
                z=z+x;
            }
        }

        while(x>y){
            y++;
            if(y%2==0){
                z=z+y;
            }
        }
        System.out.println("Suma nieparzystych liczb z przedziału <x,y> wynosi: "+z);
    }
}
