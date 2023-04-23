import java.util.Random;
import java.util.Scanner;
public class NombreJuste {
    public static void NombreJuste() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nombreADeviner = random.nextInt(100) + 1;
        int nombreDeCoups = 0;
        int proposition;

        System.out.println("Juste nombre : \nJe pense à un nombre entre 1 et 100. Devinez le nombre :");

        do {
            proposition = scanner.nextInt();
            nombreDeCoups++;

            if (proposition < nombreADeviner) {
                System.out.println("Plus grand !");
            } else if (proposition > nombreADeviner) {
                System.out.println("Plus petit !");
            }
        } while (proposition != nombreADeviner);

        System.out.println("Bravo, vous avez trouvé le nombre en " + nombreDeCoups + " coups !");
    }
}
