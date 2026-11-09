import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mevcutKat;
        int hedefKat;
        int mesafe;

        System.out.print("Mevcut katı giriniz: ");
        mevcutKat = scanner.nextInt();

        System.out.print("Hedef katı giriniz: ");
        hedefKat = scanner.nextInt();

        if (mevcutKat < 1 || mevcutKat > 10 || hedefKat < 1 || hedefKat > 10) {
            System.out.println("Hatalı kat girdiniz!");
        } else {
            mesafe = Math.abs(hedefKat - mevcutKat);

            System.out.println("Mevcut kat: " + mevcutKat);
            System.out.println("Hedef kat: " + hedefKat);
            System.out.println("Mesafe: " + mesafe + " kat");

            if (hedefKat > mevcutKat) {
                System.out.println("Yukarı çık");
            } else if (hedefKat < mevcutKat) {
                System.out.println("Aşağı in");
            } else {
                System.out.println("Hareket etme");
            }
        }

        scanner.close();
    }
}
