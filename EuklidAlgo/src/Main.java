//Aufgabe aus: Algorithmen und Datenstrukturen Ü: E01-Exercise-sheet-de.pdf
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int wahl = 0;
        int zahl1 = 0;
        int zahl2 = 0;
        while (wahl != 9){
            System.out.println("1: Euklidischer Algoritmus");
            System.out.println("2: Euklidischer Algoritmus Modulo");
            System.out.println("3: Euklidischer Algoritmus Rekursiv");
            System.out.println("4: Euklidischer Algoritmus Rekursiv Modulo");
            System.out.println("9: Programm beenden");
            System.out.print("Bitte geben Sie ein was Sie tun möchten: ");
            Scanner scan = new Scanner(System.in);
            wahl = scan.nextInt();
            if (wahl != 9) {
                System.out.print("Bitte geben Sie eine Zahl ein: ");
                zahl1 = scan.nextInt();
                System.out.print("Bitte geben Sie eine weitere Zahl ein: ");
                zahl2 = scan.nextInt();
            }
            menueWahl(wahl,zahl1,zahl2);
        }
    }

    public static void menueWahl(int wahl, int a, int b){
        switch (wahl) {
            case 1:
                System.out.println("ggT: " + Euklid(a, b));
                break;
            case 2:
                System.out.println("ggT: " + EuklidMod(a, b));
                break;
            case 3:
                System.out.println("ggT: " + EuklidRekursiv(a, b));
                break;
            case 4:
                System.out.println("ggT: " + EuklidModRekursiv(a, b));
                break;
            case 9:
                System.out.println("Ende");
                break;
            default :
                System.out.println("Bitte wählen Sie aus dem Menü aus.");
        }
    }

    public static int Euklid(int a, int b){
        if (a == 0){
            return b;
        }
        else{
            while (b != 0){
                if (a > b){
                    a = a - b;
                }else{
                    b = b - a;
                }
            }
        }
        return a;
    }

    public static int EuklidRekursiv(int a, int b){
        if (b == 0){
            return a;
        }else{
            if (a == 0){
                return b;
            }else{
                if ( a > b ){
                    return EuklidRekursiv(a-b,b);
                }else{
                    return EuklidRekursiv(a,b-a);
                }
            }
        }
    }

    public static int EuklidMod(int a, int b){
        int h = 0;
        while (b != 0){
            h = a % b;
            a = b;
            b = h;
        }
        return a;
    }

    public static int EuklidModRekursiv(int a, int b){
        if (b == 0){
            return a;
        }else{
            return EuklidModRekursiv(b, a%b);
        }
    }
}
