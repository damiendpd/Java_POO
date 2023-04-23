import java.util.Date;
public class User {
    private int Id;

    private String Nom;

    private String Prenom;

    private Date DateNaissance;

    public User(int id, String nom, String prenom, Date dateNaissance) {
        this.Id = id;
        this.Nom = nom;
        this.Prenom = prenom;
        this.DateNaissance = dateNaissance;
    }

    // ##### GETTERS ##### //
    public int getId() { return Id; }
    public String getNom() { return Nom; }
    public String getPrenom() { return Prenom; }
    public Date getDateNaissance() { return DateNaissance; }

    // ##### SETTERS ##### //
    public void setId(int id) {
        this.Id = id;
    }
    public void setNom(String nom) {
        this.Nom = nom;
    }
    public void setPrenom(String prenom) {
        this.Prenom = prenom;
    }
    public void setDateNaissance(Date dateNaissance) {
        this.DateNaissance = dateNaissance;
    }
}
