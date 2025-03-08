import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        double armut = scanner.nextDouble();
        System.out.println("Elma Kaç Kilo ? :");
        double elma = scanner.nextDouble();
        System.out.println("Domates Kaç Kilo ? :");
        double domates = scanner.nextDouble();
        System.out.println("Muz Kaç Kilo ? :");
        double muz = scanner.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? :");
        double patlican = scanner.nextDouble();

        double tutar=armut * 2.14 + elma*3.67+ domates*1.11 + muz*0.95 + patlican *5.00;
        System.out.println("Toplam Tutar: " + tutar +"TL");



    }
}
