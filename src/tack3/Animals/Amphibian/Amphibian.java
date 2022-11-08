package tack3.Animals.Amphibian;

import tack3.Animals.Animals;

import java.util.Objects;

public class Amphibian extends Animals {

    private String livingEnvironment;


    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("кушаю");
    }

    @Override
    public void go() {
        System.out.println("двигаюсь.");
    }

    public void hunt() {
        System.out.println("охочусь.");
    }

    @Override
    public String toString() {
        return "Имя " + getName() + ", возраст " + getAge() +
                ", среда обитания " + getLivingEnvironment();
    }

    public final String getLivingEnvironment() {
        return livingEnvironment;
    }

    public final void setLivingEnvironment(String livingEnvironment) {
            if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
                this.livingEnvironment = "Имя не указана";
            } else {
                this.livingEnvironment = livingEnvironment;
            }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(livingEnvironment, amphibian.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
