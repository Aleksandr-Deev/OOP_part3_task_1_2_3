package tack3.Animals.Bird;

import java.util.Objects;

public class NotFlyingBird extends Bird {

    private final String typeMovement;


    public NotFlyingBird(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment);
        this.typeMovement = typeMovement;
    }

    public void walk() {
        System.out.println(this.getName() + " гуляет " + typeMovement);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NotFlyingBird that = (NotFlyingBird) o;
        return Objects.equals(typeMovement, that.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMovement);
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }
}
