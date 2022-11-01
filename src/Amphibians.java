public class Amphibians extends Animals{
    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public Amphibians setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validOrDefult.validOrDefult(livingEnvironment,"defult");
        return this;
    }
    public void go(){
        System.out.println("Земноводные передвигаются");
    }
    public void sleep(){
        System.out.println("Земноводные спят");
    }
    public void eat(){
        System.out.println("Земноводные едят");
    }
    public void hunt(){
        System.out.println("Земноводные охотятся");
    }

    @Override
    public String toString() {
        return  "Земноводное - " + super.toString() +", Среда обитания: " + livingEnvironment;
    }
}
