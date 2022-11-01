public class Herbivorous extends Mammals{
    private String typeOfFood;

    public Herbivorous(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed);
        setTypeOfFood(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public Herbivorous setTypeOfFood(String typeOfFood) {
        this.typeOfFood = validOrDefult.validOrDefult(typeOfFood,"defult");
        return this;
    }

    public final void go(){
        System.out.println("Травоядные животные передвигаются");
    }
    public final void sleep(){
        System.out.println("Травоядные животные спят");
    }

    public final void eat(){
        System.out.println("Травоядные животные едят");
    }

    public final void walk() {
        System.out.println("Травоядные животные гуляют");
    }

    public final void graze(){
        System.out.println("Травоядные животные пасуться");
    }

    @Override
    public String toString() {
        return  "Травоядное животное - " + super.toString() + ", Пища: " + typeOfFood ;
    }
}
