import java.util.Scanner;

public class InputStringhe {
    
    public static void main(String[] args) {
        // Creazione dello Scanner per leggere l'input da tastiera
        Scanner scanner = new Scanner(System.in);
        
        // Array per memorizzare le tre stringhe
        String[] stringhe = new String[3];
        
        System.out.println("=== Programma di concatenazione stringhe ===");
        System.out.println("Inserisci tre stringhe:");
        
        // Richiesta delle tre stringhe all'utente
        for (int i = 0; i < 3; i++) {
            System.out.print("Inserisci la " + (i + 1) + "° stringa: ");
            stringhe[i] = scanner.nextLine();
        }
        
        // Concatenazione nell'ordine di inserimento
        String concatenazioneNormale = stringhe[0] + stringhe[1] + stringhe[2];
        
        // Concatenazione nell'ordine inverso
        String concatenazioneInversa = stringhe[2] + stringhe[1] + stringhe[0];
        
        // Visualizzazione dei risultati
        System.out.println("\n=== Risultati ===");
        System.out.println("Concatenazione nell'ordine di inserimento: \"" + concatenazioneNormale + "\"");
        System.out.println("Concatenazione nell'ordine inverso: \"" + concatenazioneInversa + "\"");
        
        // Chiusura dello Scanner
        scanner.close();
        
        System.out.println("\nProgramma terminato.");
    }
}