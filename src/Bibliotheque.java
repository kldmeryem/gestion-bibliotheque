import java.util.ArrayList;

public class Bibliotheque {
    private BaseDeDonnees bdd = new BaseDeDonnees();
    private ArrayList<Livre> livres = bdd.lireTous();

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
        bdd.ajouter(livre);
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
                bdd.changerDisponibilite(l.getTitre(), false);
                return true;
            }
        }
        return false;
    }

    public boolean rendreLivre(String titre) {
        for (Livre l : livres) {
            if (l.getTitre().equalsIgnoreCase(titre) && !l.isDisponible()) {
                l.setDisponible(true);
                bdd.changerDisponibilite(l.getTitre(), true);
                return true;
            }
        }
        return false;
    }
}