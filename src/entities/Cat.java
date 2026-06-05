package entities;

import interfaces.Jumper;
import interfaces.Runner;

public class Cat extends Animals implements Runner, Jumper {
    private final boolean hasBoots;

    public Cat(String name, int age, boolean hasBoots) {
        super(name, age);
        // Cosa è super?
        // Richiama il costruttore padre e i suoi attributi
        this.hasBoots = hasBoots;
    }

    //Questo override a modificare il metodo makeSound(
    @Override
    public void makeSound() {
        System.out.println("Miao!");
    }

    @Override
    public void sayYourName() {
        super.sayYourName();
        // Dopo aver richiamato il comportamento del padre possiamo aggiungere altri comportamenti al figlio
        System.out.println("Per essere più precisi sono un Gatto");
    }

    //OVERLOAD
    public void sayYourName(String saluto) {
        this.sayYourName();
        // Qui il this andrà a richiamare il sayYourname precedente e quindi a sua volta andrà a chiamare quello del padre
        // Che viene chiamato dal sayYourName senza parametri
        System.out.println(saluto);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "hasBoots=" + hasBoots +
                "} " + super.toString();
    }

    @Override
    public void jump(int amount) {

    }

    @Override
    public void run(int amount) {
        System.out.println("Ha saltato di " + amount);
    }
}
