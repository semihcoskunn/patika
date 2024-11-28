import java.util.Scanner;

public class patikaUygulama1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Turkce notunuzu giriniz:");
        int turkce = input.nextInt();

        System.out.println("Matematik notunuzu giriniz:");
        int mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        int fiz = input.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        int kim = input.nextInt();

        System.out.println("Biyoloji notunuzu giriniz:");
        int bio = input.nextInt();

        double ortalama = (turkce + mat + fiz + kim + bio)/5;
        System.out.println("Ortalama:" +ortalama);
        
        String a = (ortalama >= 60) ? "Gecti" : "Kaldi";
        System.out.println(a);
    }
}