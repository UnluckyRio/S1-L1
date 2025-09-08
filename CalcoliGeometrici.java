import java.util.Scanner;

public class CalcoliGeometrici {
    
    /**
     * Calcola il perimetro di un rettangolo
     * @param lato1 lunghezza del primo lato
     * @param lato2 lunghezza del secondo lato
     * @return perimetro del rettangolo
     */
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }
    
    /**
     * Verifica se un numero è pari o dispari
     * @param numero il numero da verificare
     * @return 0 se il numero è pari, 1 se è dispari
     */
    public static int pariDispari(int numero) {
        return numero % 2;
    }
    
    /**
     * Calcola l'area di un triangolo usando la formula di Erone
     * @param lato1 lunghezza del primo lato
     * @param lato2 lunghezza del secondo lato
     * @param lato3 lunghezza del terzo lato
     * @return area del triangolo, -1 se i lati non formano un triangolo valido
     */
    public static double areaTriangolo(double lato1, double lato2, double lato3) {
        // Verifica che i lati formino un triangolo valido
        if (lato1 + lato2 <= lato3 || lato1 + lato3 <= lato2 || lato2 + lato3 <= lato1) {
            return -1; // Triangolo non valido
        }
        
        // Formula di Erone
        double semiperimetro = (lato1 + lato2 + lato3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * 
                               (semiperimetro - lato2) * (semiperimetro - lato3));
        return area;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Programma di Calcoli Geometrici ===");
        
        // 1. Calcolo perimetro rettangolo
        System.out.println("\n1. CALCOLO PERIMETRO RETTANGOLO");
        System.out.print("Inserisci la lunghezza del primo lato: ");
        double latoRett1 = scanner.nextDouble();
        System.out.print("Inserisci la lunghezza del secondo lato: ");
        double latoRett2 = scanner.nextDouble();
        
        double perimetro = perimetroRettangolo(latoRett1, latoRett2);
        System.out.printf("Il perimetro del rettangolo è: %.2f\n", perimetro);
        
        // 2. Verifica pari/dispari
        System.out.println("\n2. VERIFICA PARI/DISPARI");
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();
        
        int risultato = pariDispari(numero);
        if (risultato == 0) {
            System.out.println("Il numero " + numero + " è PARI (risultato: 0)");
        } else {
            System.out.println("Il numero " + numero + " è DISPARI (risultato: 1)");
        }
        
        // 3. Calcolo area triangolo
        System.out.println("\n3. CALCOLO AREA TRIANGOLO (Formula di Erone)");
        System.out.print("Inserisci la lunghezza del primo lato: ");
        double latoTri1 = scanner.nextDouble();
        System.out.print("Inserisci la lunghezza del secondo lato: ");
        double latoTri2 = scanner.nextDouble();
        System.out.print("Inserisci la lunghezza del terzo lato: ");
        double latoTri3 = scanner.nextDouble();
        
        double area = areaTriangolo(latoTri1, latoTri2, latoTri3);
        
        if (area == -1) {
            System.out.println("ERRORE: I lati inseriti non formano un triangolo valido!");
            System.out.println("Ricorda: la somma di due lati deve essere maggiore del terzo lato.");
        } else {
            System.out.printf("L'area del triangolo è: %.2f\n", area);
        }
        
        // Riepilogo risultati
        System.out.println("\n=== RIEPILOGO RISULTATI ===");
        System.out.printf("Perimetro rettangolo (%.2f x %.2f): %.2f\n", latoRett1, latoRett2, perimetro);
        System.out.println("Numero " + numero + " è " + (risultato == 0 ? "pari" : "dispari"));
        if (area != -1) {
            System.out.printf("Area triangolo (%.2f, %.2f, %.2f): %.2f\n", latoTri1, latoTri2, latoTri3, area);
        } else {
            System.out.println("Triangolo: non valido");
        }
        
        scanner.close();
        System.out.println("\nProgramma terminato.");
    }
}