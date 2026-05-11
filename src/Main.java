import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Lire le fichier
        File fichier = new File("texte.txt");
        int totalMots = 0;

        System.out.println("=== Comptage de mots ===");
        System.out.println("Fichier : texte.txt");
        System.out.println("========================");

        try {
            Scanner scanner = new Scanner(fichier);

            int numeroLigne = 0;

            // Boucle qui lit chaque ligne
            while (scanner.hasNextLine()) {

                String ligne = scanner.nextLine();
                numeroLigne++;

                // Séparer la ligne par les espaces
                String[] mots = ligne.split(" ");

                // Compter les mots de cette ligne
                int motsDeLigne = mots.length;

                System.out.println("Ligne " + numeroLigne
                        + " (" + motsDeLigne + " mots) : "
                        + ligne);

                // Additionner au total
                totalMots += motsDeLigne;
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé : " + e.getMessage());
        }

        // Afficher le total
        System.out.println("========================");
        System.out.println("Total de mots : " + totalMots);
    }
}