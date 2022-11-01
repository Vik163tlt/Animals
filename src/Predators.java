public class Predators extends Mammals{
    private String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed);
        setTypeOfFood(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public Predators setTypeOfFood(String typeOfFood) {
        this.typeOfFood = validOrDefult.validOrDefult(typeOfFood,"defult");
        return this;
    }

    public void go(){
        System.out.println("Хищные животные передвигаются");
    }

    public void sleep(){
        System.out.println("Хищные животные спят");
    }

    public void eat(){
        System.out.println("Хищные животные едят");
    }

    public void walk() {
        System.out.println("Хищные животные гуляют");
    }

    public void hunt(){
        System.out.println("Хищные животные охотятся");
    }

    public String toString() {
        return  "Хищное животное - " + super.toString() + ", Пища: " + typeOfFood ;
    }
}
