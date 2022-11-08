package tack3.Animals.Mammal;

import java.util.Objects;

public class Herbivore extends Mammal  {

    private final String typeFood;

    public Herbivore(String name, int age, String livingEnvironment, Integer movementSpeed, String typeFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeFood = typeFood;
    }

    public void graze() {
        System.out.println(this.getName() + " пасется и кушает " + typeFood);
    }

    @Override
    public String toString() {
        return "Имя " + getName() + ", возраст - " + getAge() + " среда обитания - " + getLivingEnvironment()
                + " скорость передвижения - " + getMovementSpeed() + " тип еды " + this.typeFood;
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(typeFood, herbivore.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }
}
