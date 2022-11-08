package tack3.Animals.Mammal;

import java.util.Objects;

public class Predator extends Mammal {

    private final String typeFood;

    public Predator(String name, int age, String livingEnvironment, Integer movementSpeed, String typeFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeFood = typeFood;
    }

    public void hunt() {
        System.out.println(this.getName() + " охотится на " +typeFood);
    }

    @Override
    public String toString() {
        return "Имя " + getName() + ", возраст - " + getAge() + " среда обитания - " + getLivingEnvironment()
                + " скорость передвижения - " + getMovementSpeed() + " тип еды " + this.typeFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeFood, predator.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }
}
