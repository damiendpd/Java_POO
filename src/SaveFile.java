import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class SaveFile {
    public static void SaveFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une phrase :");
        String phrase = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("phrase.txt");
            writer.write(phrase);
            writer.close();
            System.out.println("La phrase a été enregistrée dans le fichier.");
        } catch (IOException e) {
            System.out.println("Erreur lors de l'enregistrement de la phrase dans le fichier.");
            e.printStackTrace();
        }
    }
}
