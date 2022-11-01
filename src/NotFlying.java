public class NotFlying extends Birds{
    private final String typeOfMovement;

    public NotFlying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = validOrDefult.validOrDefult(typeOfMovement,"defult");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }
    public void go(){
        System.out.println("Птицы, которые не умеют летать, передвигаются");
    }
    public void sleep(){
        System.out.println("Птицы, которые не умеют летать, спят");
    }

    public void eat(){
        System.out.println("Птицы, которые не умеют летать, едят");
    }
    public void hunt(){
        System.out.println("Птицы, которые не умеют летать, охотятся");
    }

    public void walk() {
        System.out.println("Птицы, которые не умеют летать, гуляют");
    }

    @Override
    public String toString() {
        return "Птица, которая не летает - " + super.toString() +
                ", Тип передвижения: " + typeOfMovement;
    }
}
