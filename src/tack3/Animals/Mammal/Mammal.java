package tack3.Animals.Mammal;

import tack3.Animals.Animals;

import java.util.Objects;

public abstract class Mammal extends Animals {

    private final String livingEnvironment;
    private final Integer movementSpeed;

    public Mammal(String name, int age, String livingEnvironment, Integer movementSpeed) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.movementSpeed = movementSpeed;
    }

    public void walk() {
        System.out.println(this.getName() + " гуляет по " + livingEnvironment
                + " со скоростью " + movementSpeed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(livingEnvironment, mammal.livingEnvironment) && Objects.equals(movementSpeed, mammal.movementSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public Integer getMovementSpeed() {
        return movementSpeed;
    }
}
