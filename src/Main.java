import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz?: ");
        int sayi=scn.nextInt();
        int sayilar;
        int enB=0,enK=0;
        for (int i=1;i<=sayi;i++){
            System.out.println(i+". sayiyi giriniz: ");
            sayilar=scn.nextInt();
            if (enB<sayilar){
                enB=sayilar;
            }
            if (enK>sayilar){
                enK=sayilar;
            }
        }

        System.out.println("En küçük sayı: "+ enK);
        System.out.println("En büyük sayı: "+ enB);

    }
}
