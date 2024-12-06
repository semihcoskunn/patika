import java.util.Scanner;

public class PatikaUygulama6 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz(m):");
        float boy = input.nextFloat();
        System.out.print("Kilonuzu giriniz(kg):");
        float kilo = input.nextFloat();
        float vucudIndex =(kilo / (boy*boy));
        System.out.println(vucudIndex);

    }
}