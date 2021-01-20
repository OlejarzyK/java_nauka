import java.util.Scanner;

public class Zad3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wporwadz zdanie  :");
        String kozdanie = sc.nextLine();

        System.out.println("Twoje wpisane zdanie dużymi literami : " + kozdanie.toUpperCase());

    }
}