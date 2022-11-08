package tack3.Animals.Bird;

import tack3.Animals.Animals;

import java.util.Objects;

public abstract class Bird extends Animals {

    private final String livingEnvironment;

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    public void hunt() {
        System.out.println(this.getName() + " гуляет по " + livingEnvironment);
    }

    @Override
    public String toString() {
        return "Имя " + getName() + ", возраст - " + getAge() + " среда обитания - " + getLivingEnvironment();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(livingEnvironment, bird.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
}
