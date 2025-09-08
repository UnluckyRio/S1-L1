public class MetodiJava {
    
    /**
     * Moltiplica due numeri interi
     * @param a primo intero
     * @param b secondo intero
     * @return il prodotto di a e b
     */
    public static int moltiplica(int a, int b) {
        return a * b;
    }
    
    /**
     * Concatena una stringa con un intero
     * @param s stringa da concatenare
     * @param n intero da concatenare
     * @return nuova stringa che concatena s e n
     */
    public static String concatena(String s, int n) {
        if (s == null) {
            return String.valueOf(n);
        }
        return s + n;
    }
    
    /**
     * Inserisce una stringa in terza posizione (indice 2) di un array
     * @param arr array di stringhe di 5 elementi
     * @param s stringa da inserire
     * @return nuovo array di 6 elementi con la stringa inserita
     */
    public static String[] inserisciInArray(String[] arr, String s) {
        // Gestione caso limite: array null
        if (arr == null) {
            String[] nuovoArray = new String[6];
            nuovoArray[2] = s;
            return nuovoArray;
        }
        
        // Gestione caso limite: array con lunghezza diversa da 5
        if (arr.length != 5) {
            System.out.println("Attenzione: l'array dovrebbe avere 5 elementi, ma ne ha " + arr.length);
        }
        
        // Creazione nuovo array di 6 elementi
        String[] nuovoArray = new String[6];
        
        // Copia i primi due elementi (indici 0 e 1)
        for (int i = 0; i < 2 && i < arr.length; i++) {
            nuovoArray[i] = arr[i];
        }
        
        // Inserisce la nuova stringa in posizione 2
        nuovoArray[2] = s;
        
        // Sposta gli elementi dalle posizioni 2, 3, 4 alle posizioni 3, 4, 5
        for (int i = 2; i < arr.length && i + 1 < nuovoArray.length; i++) {
            nuovoArray[i + 1] = arr[i];
        }
        
        return nuovoArray;
    }
    
    /**
     * Metodo main per testare i tre metodi implementati
     */
    public static void main(String[] args) {
        System.out.println("=== Test dei metodi implementati ===");
        
        // Test del metodo moltiplica
        System.out.println("\n1. Test metodo moltiplica:");
        int risultatoMoltiplicazione = moltiplica(7, 8);
        System.out.println("moltiplica(7, 8) = " + risultatoMoltiplicazione);
        
        // Test con numeri negativi
        int risultatoNegativo = moltiplica(-3, 4);
        System.out.println("moltiplica(-3, 4) = " + risultatoNegativo);
        
        // Test del metodo concatena
        System.out.println("\n2. Test metodo concatena:");
        String risultatoConcatenazione = concatena("test", 5);
        System.out.println("concatena(\"test\", 5) = \"" + risultatoConcatenazione + "\"");
        
        // Test con stringa vuota
        String risultatoVuoto = concatena("", 42);
        System.out.println("concatena(\"\", 42) = \"" + risultatoVuoto + "\"");
        
        // Test con stringa null
        String risultatoNull = concatena(null, 10);
        System.out.println("concatena(null, 10) = \"" + risultatoNull + "\"");
        
        // Test del metodo inserisciInArray
        System.out.println("\n3. Test metodo inserisciInArray:");
        String[] arrayOriginale = {"primo", "secondo", "terzo", "quarto", "quinto"};
        
        System.out.print("Array originale: [");
        for (int i = 0; i < arrayOriginale.length; i++) {
            System.out.print("\"" + arrayOriginale[i] + "\"");
            if (i < arrayOriginale.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        String[] nuovoArray = inserisciInArray(arrayOriginale, "inserito");
        
        System.out.print("Nuovo array: [");
        for (int i = 0; i < nuovoArray.length; i++) {
            System.out.print("\"" + nuovoArray[i] + "\"");
            if (i < nuovoArray.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        // Test casi limite
        System.out.println("\n4. Test casi limite:");
        
        // Test con array null
        String[] arrayDaNull = inserisciInArray(null, "test");
        System.out.print("inserisciInArray(null, \"test\"): [");
        for (int i = 0; i < arrayDaNull.length; i++) {
            System.out.print(arrayDaNull[i] == null ? "null" : "\"" + arrayDaNull[i] + "\"");
            if (i < arrayDaNull.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        // Test con array di dimensione diversa
        String[] arrayPiccolo = {"a", "b", "c"};
        String[] risultatoArrayPiccolo = inserisciInArray(arrayPiccolo, "nuovo");
        System.out.print("inserisciInArray con array di 3 elementi: [");
        for (int i = 0; i < risultatoArrayPiccolo.length; i++) {
            System.out.print(risultatoArrayPiccolo[i] == null ? "null" : "\"" + risultatoArrayPiccolo[i] + "\"");
            if (i < risultatoArrayPiccolo.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.println("\n=== Test completati ===");
    }
}