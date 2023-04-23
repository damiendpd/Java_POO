public class Voiture {
    private int Id;
    private String Modele;
    private String Marque;

    public Voiture(int id, String modele, String marque) {
        this.Id = id;
        this.Modele = modele;
        this.Marque = marque;
    }

    // ##### GETTERS ##### //
    public int getId() { return Id; }
    public String getModele() { return Modele; }
    public String getMarque() { return Marque; }

    // ##### SETTERS ##### //
    public void setId(int id) {
        this.Id = id;
    }
    public void setModele(String modele) {
        this.Modele = modele;
    }
    public void setMarque(String marque) {
        this.Marque = marque;
    }
}
