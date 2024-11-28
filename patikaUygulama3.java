import java.util.Scanner;

public class patikaUygulama3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk kenarin uzunlugunu yaziniz:");
        int a = input.nextInt();
        System.out.println("Ikinci kenarin uzunlugunu giriniz:");
        int b = input.nextInt();
        System.out.println("Ucuncu kenarin uzunlugunu yaziniz.");
        int c = input.nextInt();
        float u = (a+b+c)/2;
        float cevre = 2 * u;
        double alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));
        System.out.println("Cevre: " + cevre + "  Alan: " + alan);
    }
}