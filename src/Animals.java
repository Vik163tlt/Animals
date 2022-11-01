import java.util.Objects;

public abstract class Animals {
    private final String name;
    private final int age;

    public Animals(String name, int age) {
        this.name = validOrDefult.validOrDefult(name, "defult");
        this.age = Math.max(age,0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public abstract void go();

    public abstract void sleep();

    public abstract void eat();

    @Override
    public String toString() {
        return  name +
                ", Возраст в годах: " + age
                ;
    }
}
