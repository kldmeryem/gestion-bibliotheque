import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Livre> livres = new ArrayList<>();

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void afficherLivres() {
        if (livres.isEmpty()) {
            System.out.println("Aucun livre dans la bibliothèque.");
            return;
        }
        for (int i = 0; i < livres.size(); i++) {
            System.out.println((i + 1) + ". " + livres.get(i));
        }
    }

    public boolean emprunterLivre(String titre) {
        for (Livre l : livres) {
            if (l.getTitre().equalsIgnoreCase(titre) && l.isDisponible()) {
                l.setDisponible(false);
                return true;
            }
        }
        return false;
    }

    public boolean rendreLivre(String titre) {
        for (Livre l : livres) {
            if (l.getTitre().equalsIgnoreCase(titre) && !l.isDisponible()) {
                l.setDisponible(true);
                return true;
            }
        }
        return false;
    }
}