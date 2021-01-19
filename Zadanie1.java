import java.util.Scanner;

public class Zad1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PORÓWNUJE HASŁO Z KLAWIATURY DO HASŁA W ZMIENNEJ \n");

        String haslo = "Olejarzyk";

        System.out.println("Wpisz haslo:");
        String hasloWpisane = sc.next();

        boolean Sprawdzaniehasla = haslo.equals(hasloWpisane);
        if(Sprawdzaniehasla == true){
            System.out.println("Wpisałeś poprawne hasło");
        }
        else{
            System.out.println("Wprowadziłeś złe hasło");
        }

    }
}