import java.util.Scanner;
public class NombreMots {
    public static void NombreMots() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une phrase :");
        String phrase = scanner.nextLine();

        int nombreDeMots = phrase.split("\\s+").length;
        System.out.println("Il y a " + nombreDeMots + " mots dans la phrase.");
    }
}
