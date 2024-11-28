import java.util.Scanner;

public class patikaUygulama4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kmBasi = 2.20;
        double ucret;
        System.out.println("Taksiyle kac km gideceksiniz? :");
        double km = input.nextDouble();
        ucret = ( km < 4.5 ) ? 20 : (10+(km*kmBasi));
        System.out.println("Odemeniz gereken tutar:" +ucret);

    }
}