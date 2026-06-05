package entities;

import interfaces.Jumper;
import interfaces.Runner;

public class Dog extends Animals implements Jumper, Runner {
    private final boolean isACop;

    public Dog(String name, int age, boolean isACop) {
        super(name, age); // Questo si genera quando gli attributi della classe padre sono private
        this.name = name; // con il protected possiamo accedere agli attributi padre direttamente
        this.isACop = isACop;
    }

    //OVERLOAD
    public void sayYourName(String saluto) {
        this.sayYourName();
        System.out.println(saluto);

    }

    //INTERFACCIA
    @Override
    public void jump(int amount) {
        System.out.println("Ha saltato di " + amount);
    }

    //INTERFACCIA
    @Override
    public void run(int amount) {

    }


    //Questo override a modificare il metodo makeSound(
    @Override
    public void makeSound() {
        System.out.println("Bau!");
    }

    @Override
    public void sayYourName() {
        super.sayYourName();
        System.out.println("Per essere più precisi sono un Cane!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isACop=" + isACop +
                "} " + super.toString();
    }

}
