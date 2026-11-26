import java.sql.*;
import java.util.ArrayList;

public class BaseDeDonnees {
    private static final String URL = "jdbc:sqlite:bibliotheque.db";

    public BaseDeDonnees() {
        try (Connection conn = DriverManager.getConnection(URL);
             Statement st = conn.createStatement()) {
            st.execute("""
                CREATE TABLE IF NOT EXISTS livres (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    titre TEXT NOT NULL,
                    auteur TEXT NOT NULL,
                    disponible INTEGER NOT NULL DEFAULT 1
                )
                """);
        } catch (SQLException e) {
            System.out.println("Erreur création table : " + e.getMessage());
        }
    }

    public void ajouter(Livre livre) {
        String sql = "INSERT INTO livres(titre, auteur, disponible) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, livre.getTitre());
            ps.setString(2, livre.getAuteur());
            ps.setInt(3, livre.isDisponible() ? 1 : 0);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur ajout : " + e.getMessage());
        }
    }

    public ArrayList<Livre> lireTous() {
        ArrayList<Livre> liste = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT titre, auteur, disponible FROM livres")) {
            while (rs.next()) {
                Livre l = new Livre(rs.getString("titre"), rs.getString("auteur"));
                l.setDisponible(rs.getInt("disponible") == 1);
                liste.add(l);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lecture : " + e.getMessage());
        }
        return liste;
    }

    public void changerDisponibilite(String titre, boolean disponible) {
        String sql = "UPDATE livres SET disponible = ? WHERE LOWER(titre) = LOWER(?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, disponible ? 1 : 0);
            ps.setString(2, titre);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur mise à jour : " + e.getMessage());
        }
    }
}