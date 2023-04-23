import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class NombreMotsFichier {
    public static void NombreMotsFichier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le chemin du fichier :");
        String chemin = scanner.nextLine();

        try {
            File fichier = new File(chemin);
            Scanner lecteur = new Scanner(fichier);

            int nombreDeMots = 0;
            while (lecteur.hasNext()) {
                String ligne = lecteur.nextLine();
                String[] mots = ligne.split("\\s+");
                nombreDeMots += mots.length;
            }

            lecteur.close();
            System.out.println("Le fichier contient " + nombreDeMots + " mots.");
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'a pas été trouvé.");
            e.printStackTrace();
        }
    }
}
