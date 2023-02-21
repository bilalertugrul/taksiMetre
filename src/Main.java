import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */

        double firstUcret=10, kmUcret=2.20,yol, ucret;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek Yol(KM) : ");
        yol = input.nextDouble();
        ucret = firstUcret + (yol*kmUcret);

        ucret = (ucret<=20) ? 20 : ucret;

        System.out.printf("Taksi Ücreti : " + ucret);

    }
}