package entities;

public abstract class Animals {
    //Attributi Comuni
    protected String name;
    protected int age;

    // Una classe astratta ha comunque un costruttore perché
    // Quest'ultimo verrà utilizzato dai figli
    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abbiamo reso questo metodo astratto, quindi senza un corpo di azioni
    // Avendo fatto questa cosa adesso ogni sottoclasse dovrà avere questo metodo dichiarato
    // e ogni animale avrà il suo corpo di azioni da eseguire.
    public abstract void makeSound();
//    { System.out.println("Questo è il mio verso");}

    public void sayYourName() {
        System.out.println("Mi chiamo: " + this.name + "\nLa mia età è: " + this.age);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
