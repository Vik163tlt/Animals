public abstract class Mammals extends Animals {
        private String livingEnvironment;
        private int speed;

    public Mammals(String name, int age, String livingEnvironment, int speed) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
        setSpeed(speed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public Mammals setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validOrDefult.validOrDefult(livingEnvironment,"defult");
        return this;
    }

    public int getSpeed() {
        return speed;
    }

    public Mammals setSpeed(int speed) {
        this.speed = Math.max(speed,0);
        return this;
    }

    public void go() {
        System.out.println("Животные передвигаются");
    }

    public void sleep() {
        System.out.println("Животные спят");
    }

    public void eat(){
        System.out.println("Животные едят");
    }

    public abstract void walk();

    @Override
    public String toString() {
        return super.toString() +
                ", Среда обитания: " + livingEnvironment +
                ", скорость: " + speed +" км/ч";
    }
}
