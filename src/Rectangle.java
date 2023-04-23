import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {
    private int longueur;
    private int hauteur;

    public Rectangle(int hauteur , int longueur) throws IOException {
        this.hauteur = hauteur;
        this.longueur = longueur;
    }

    // ##### GETTERS ##### //
    public int getLongueur() { return longueur; }
    public int getHauteur() { return hauteur; }

    // ##### SETTERS ##### //
    public Rectangle setLongueur(int longueur) {
        this.longueur = longueur;
        return this;
    }

    public Rectangle setHauteur(int hauteur) {
        this.hauteur = hauteur;
        return this;
    }

    public void afficherRectangle() {
        System.out.println("Afficher Rectangle : ");
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < longueur; j++) { System.out.print('#'); }
            System.out.println();
        }
    }
}
