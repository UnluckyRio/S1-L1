# S1-L1 - Esercizi Java Fondamentali

Questo progetto contiene una collezione di programmi Java che implementano funzionalità di base per l'apprendimento dei concetti fondamentali della programmazione.

## Programmi Implementati

### 1. MetodiJava.java
Implementa tre metodi fondamentali con relative specifiche:
- **`moltiplica(int a, int b)`**: Calcola il prodotto di due numeri interi
- **`concatena(String s, int n)`**: Concatena una stringa con un numero intero
- **`inserisciInArray(String[] arr, String s)`**: Inserisce una stringa in terza posizione di un array, spostando gli elementi successivi

Il programma include un metodo `main` completo che testa tutti i metodi con diversi scenari, inclusa la gestione dei casi limite.

### 2. InputStringhe.java
Programma interattivo che:
- Richiede all'utente di inserire tre stringhe da tastiera
- Visualizza la concatenazione delle stringhe nell'ordine di inserimento
- Visualizza la concatenazione delle stringhe nell'ordine inverso
- Utilizza Scanner per l'input e fornisce output formattato

### 3. CalcoliGeometrici.java
Implementa calcoli geometrici avanzati:
- **`perimetroRettangolo(double lato1, double lato2)`**: Calcola il perimetro di un rettangolo
- **`pariDispari(int numero)`**: Verifica se un numero è pari (0) o dispari (1)
- **`areaTriangolo(double lato1, double lato2, double lato3)`**: Calcola l'area usando la formula di Erone

Il programma include validazione dei dati (triangoli validi) e un'interfaccia utente completa con riepilogo dei risultati.

## Come Eseguire

1. Compilare i file Java:
```bash
javac MetodiJava.java
javac InputStringhe.java
javac CalcoliGeometrici.java
```

2. Eseguire i programmi:
```bash
java MetodiJava
java InputStringhe
java CalcoliGeometrici
```

## Caratteristiche Tecniche

- **Gestione Input**: Utilizzo di Scanner per input interattivo
- **Validazione Dati**: Controllo di validità per triangoli e gestione casi limite
- **Output Formattato**: Risultati presentati in modo chiaro e professionale
- **Documentazione**: Tutti i metodi sono documentati con JavaDoc
- **Testing**: Ogni programma include test completi con casi d'uso diversi

## Obiettivi Didattici

- Implementazione di metodi statici
- Gestione di parametri e valori di ritorno
- Manipolazione di array e stringhe
- Input/Output con Scanner e System.out
- Validazione dei dati e gestione errori
- Calcoli matematici e geometrici
- Buone pratiche di programmazione Java