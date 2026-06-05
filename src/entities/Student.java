package entities;

import interfaces.Jumper;
import interfaces.Runner;

public class Student implements Jumper, Runner {
    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String setSurname(String surname) {
        return this.surname = surname;
    }

    //INTERFACCIA
    @Override
    public void jump(int amount) {
        System.out.println("Ha saltato di " + amount);
    }

    //INTERFACCIA
    @Override
    public void run(int amount) {
        System.out.println("Ha corso " + amount + "m");
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


}
