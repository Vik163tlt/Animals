public class Flying extends Birds{
    private final String typeOfMovement;

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = validOrDefult.validOrDefult(typeOfMovement,"defult");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }
    public void go(){
        System.out.println("Птицы, которые умеют летать, передвигаются");
    }
    public void sleep(){
        System.out.println("Птицы, которые умеют летать, спят");
    }

    public void eat(){
        System.out.println("Птицы, которые умеют летать, едят");
    }

    public void hunt(){
        System.out.println("Птицы, которые умеют летать, охотятся");
    }

    public void fly() {
        System.out.println("Летающие птицы");
    }


    @Override
    public String toString() {
        return "Птица, которая летает - " + super.toString() +
                ", Тип передвижения: " + typeOfMovement;
    }
}
