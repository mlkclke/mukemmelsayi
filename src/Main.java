import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int sayi;
        int total=0;
        System.out.print("Bir Sayı Giriniz :");
        sayi =input.nextInt();



        for (int i = 1; i<=sayi / 2 ; i++) {
            if (sayi % i == 0) {
                total += i;
            }
        }

        if (total == sayi) {
            System.out.println(sayi + " Mükemmel bir sayıdır.");
        }else {
            System.out.println(sayi+" Mükemmel sayi değildir.");
        }




    }
}