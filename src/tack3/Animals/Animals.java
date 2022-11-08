package tack3.Animals;

import java.util.Objects;

public abstract class Animals {

    private String name;
    private int age;

    public Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    public abstract void eat();

    public void sleep() {

    }

    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Имя " + getName() + ", возраст " + getAge();
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
            if (name == null || name.isBlank() || name.isEmpty()) {
                this.name = "Имя не указана";
            } else {
                this.name = name;
            }
    }

    public final int getAge() {
        return this.age;
    }

    public final void setAge(int age) {
            if (age <= 0) {
                this.age = 0;
            } else {
                this.age = age;
            }
    }
}
