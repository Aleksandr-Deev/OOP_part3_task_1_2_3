package tack3.Animals.Bird;

import java.util.Objects;

public class FlyingBird extends Bird {

    private final String typeMovement;

    public FlyingBird(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment);
        this.typeMovement = typeMovement;
    }

    public void fly() {
        System.out.println(this.getName() + " летает " + typeMovement);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlyingBird that = (FlyingBird) o;
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
