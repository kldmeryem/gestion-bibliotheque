import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bibliotheque biblio = new Bibliotheque();

        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n=== MENU BIBLIOTHEQUE ===");
            System.out.println("1. Afficher les livres");
            System.out.println("2. Ajouter un livre");
            System.out.println("3. Emprunter un livre");
            System.out.println("4. Rendre un livre");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            while (!sc.hasNextInt()) {
                System.out.print("Entrez un nombre : ");
                sc.next();
            }
            choix = sc.nextInt();
            sc.nextLine(); // vider la ligne

            switch (choix) {
                case 1:
                    biblio.afficherLivres();
                    break;
                case 2:
                    System.out.print("Titre : ");
                    String titre = sc.nextLine().trim();
                    System.out.print("Auteur : ");
                    String auteur = sc.nextLine().trim();
                    if (titre.isEmpty() || auteur.isEmpty()) {
                        System.out.println("Titre et auteur ne peuvent pas être vides.");
                    } else {
                        biblio.ajouterLivre(new Livre(titre, auteur));
                        System.out.println("Livre ajouté.");
                    }
                    break;
                case 3:
                    System.out.print("Titre à emprunter : ");
                    String t1 = sc.nextLine();
                    System.out.println(biblio.emprunterLivre(t1)
                            ? "Emprunt réussi." : "Livre introuvable ou déjà emprunté.");
                    break;
                case 4:
                    System.out.print("Titre à rendre : ");
                    String t2 = sc.nextLine();
                    System.out.println(biblio.rendreLivre(t2)
                            ? "Retour réussi." : "Livre introuvable ou non emprunté.");
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 0);

        sc.close();
    }
}