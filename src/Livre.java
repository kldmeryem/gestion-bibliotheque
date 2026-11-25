public class Livre {
    private String titre;
    private String auteur;
    private boolean disponible;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = true;
    }

    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    @Override
    public String toString() {
        return titre + " - " + auteur + (disponible ? " [disponible]" : " [emprunté]");
    }
}