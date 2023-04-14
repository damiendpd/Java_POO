public class SommeNombres {
    public static void main(String[] args) {

        int sum = 0; // La somme des nombres

        for(int i = 0; i < 10000; i++) {
            sum += i; // Ajoute chaque nombre à la somme
        }

        System.out.println("La somme des nombres est : " + sum);
    }
}
