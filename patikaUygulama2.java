import java.util.Scanner;

public class patikaUygulama2 {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Urun fiyati giriniz:");
        double urunFiyat = input.nextDouble();


        int kdv = (1000 > urunFiyat && urunFiyat > 0) ? 18 : 8;


        urunFiyat += ((urunFiyat*kdv)/100);
        System.out.println("Urunun KDV dahil fiyati:" +urunFiyat);



    }
}