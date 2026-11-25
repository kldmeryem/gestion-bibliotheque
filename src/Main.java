public class Main {
    public static void main(String[] args) {
        Livre l1 = new Livre("Le Petit Prince", "Saint-Exupéry");
        Livre l2 = new Livre("L'Alchimiste", "Paulo Coelho");

        System.out.println(l1);
        System.out.println(l2);

        l1.setDisponible(false);
        System.out.println(l1);
    }
}