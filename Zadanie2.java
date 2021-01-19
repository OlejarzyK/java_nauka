import java.util.Scanner;

public class Zad2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("ilość znaków które wprowadziłeś ");
        System.out.println("Podaj dowolny ciąg znakow:");
        String Ciagznakow = sc.nextLine();

        System.out.println("Twój ciąg znaków ma : "+ Ciagznakow.length());


    }
}