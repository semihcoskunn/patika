import java.util.Scanner;

public class PatikaUygulama5 {
    public static void main (String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Yaricapi giriniz:");
        double r = input.nextDouble();
        System.out.println("Dairenin kaç derecelik kisminin alanini istiyorsunuz?(0 =< a =< 360):");
        double a = input.nextDouble();
        while (a > 360 || a < 0 ) {
            System.out.println("a derecesi 0 ile 360 derece arasinda olmali.");
            System.out.println("Dairenin kaç derecelik kisminin alanini istiyorsunuz?(0 =< a =< 360):");
            a = input.nextDouble();
        }
        double alan = (pi * r * r * a)/360 ;
        System.out.println("Alan:" +alan);
    }
}