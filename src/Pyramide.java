public class Pyramide {
    public static void main(String[] args) {
        int n = 5; // Nombre de lignes de la pyramide
        char c = '*'; // Caractère utilisé pour dessiner la pyramide

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Ajoute des espaces pour aligner la pyramide
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(c); // Ajoute le caractère pour dessiner la pyramide
            }
            System.out.println(); // Passe à la ligne suivante
        }
    }
}
