import java.util.Scanner;

public class VerifNombre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int n = input.nextInt();

        // Vérifie si le nombre est pair ou impair
        if(n % 2 == 0) {
            System.out.println(n + " est un nombre pair.");
        } else {
            System.out.println(n + " est un nombre impair.");
        }

        // Vérifie si le nombre est premier
        boolean isPremier = true;
        if(n <= 1) {
            isPremier = false;
        } else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isPremier = false;
                    break;
                }
            }
        }

        if(isPremier) {
            System.out.println(n + " est un nombre premier.");
        } else {
            System.out.println(n + " n'est pas un nombre premier.");
        }
    }
}
