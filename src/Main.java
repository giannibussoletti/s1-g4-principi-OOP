import entities.Cat;
import entities.Dog;

public class Main {
    static void main() {
        //I 4 PILASTRI DELLA PROGRAMMAZIONE OOP
        //----------Incapsulamento------------
        //Rimuovere l'accesso a parti di codice e renderle private
        // per proteggerle e filtrare come modificarlo (Vedere lezione precedente)

        //----------EREDITARIETÀ------
        // Si può andare a definire una classe padre, chiamata "superclasse"
        // e le classi figlie chiamate sottoclasse
        // Es. Classe padre VEICOLO --> Classi figlie AUTO, CAMION, MOTO ecc...
        // Tutti i VEICOLI hanno: targa, ruote, colore, motore ecc...
        // Questo permette di creare un codice più pulito, riutilizzabile
        // e permette di fare un refactoring o un cambiamento più veloce e sicuro in futuro

        // Per estendere una classe si usa la parola "extends"
        // Ereditandone tutti gli attributi e i metodi
        // in Java un sottoclasse può essere estesa solo da una classe padre.

        // L'estensione di una classe deve rispettare le regole di visibilità viste precedentemente.
        // Membri public: Sempre accessibili dalla sottoclasse, indipendentemente dal package
        // Membri protected: specificatamente progettati per l'ereditarietà; sono accessibili dalla sottoclasse anche se si        trova in un package differente
        // Membri package-friendly: Accessibili solo se la sottoclasse risiede nello stesso package della superclasse
        // Membri private: Mai accessibili direttamente. La sottoclasse li eredita (esistono in memoria), ma può
        // interagire con essi solo tramite metodi public o protected (Getter/Setter)

        // La sottoclasse non si limita a ereditare, ma espande le capacità della superclasse aggiungendo
        // comportamenti unici e specifici. Questi metodi definiscono l'identità propria della sottoclasse
        // Lo scopo è implementare azioni che non avrebbero senso nella superclasse
        // (es. un aereo decolla, ma un veicolo generico no)

        //-------OVERLOADING----------
        // L'Overloading avviene quando nella sottoclasse definiamo un metodo con lo stesso nome di uno
        // ereditato, ma con una lista di parametri differente (per numero o tipo)
        // In pratica metodo della sottoclasse si "affianca" a quello della superclasse senza sostituirlo
        // II compilatore decide quale metodo invocare in base agli argomenti passati durante la chiamata
        // N.B. (L'Overloading non implica necessariamente ereditari


        //--------OVERRIDE-------------
        // L'Overriding si verifica quando la sottoclasse riscrive un metodo della superclasse mantenendo
        // identica la firma (nome, parametri e tipo di ritorno) II metodo della sottoclasse "maschera"
        // completamente quello della superclasse
        // @Override: Indica esplicitamente al compilatore l'intenzione di sovrascrivere, prevenendo errori di
        // battitura (non è obbligatoria ma molto consigliata)
//        Animals animal01 = new Animals("Lola", 10);

        Cat cat01 = new Cat("Tom", 2, false);
        Dog dog01 = new Dog("Doggo", 2, false);

        dog01.sayYourName("Ciao a tutti");


        //-------ASTRAZIONE------
        // Una classe astratta serve a raggruppare attributi e
        //metodi comuni, ma impedisce la creazione di oggetti
        //"generici" che non avrebbero senso nella realtà. È il
        //perfetto punto di partenza per una gerarchia
        //La classe astratta Veicolo funge da "base sicura".
        //Fornisce il costruttore e il metodo accendiMotore() a
        //tutti i figli, ma rimane un'entità puramente concettuale

        // public abstract class Veicolo // abstract farà in modo che non sia possibile creare veicoli
        // Una classe abstract possono dichiarare dei metodi astratti
        // Es. public abstract void muoviti() <-- Anche questo verrà ereditàto dai figli e saranno questi
        // a decidere come "muoversi" tramite un override.

        cat01.sayYourName();

        //-------INTERFACCE----------
        // Le interface si usano per fare in modo che classi e sottoclassi che non hanno superclassi in comune
        // possano usare dei metodi specifici dichiarate nell'interfaccia
    }


}
