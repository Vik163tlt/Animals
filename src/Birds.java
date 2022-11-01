public abstract class Birds extends Animals {
    private String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public Birds setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validOrDefult.validOrDefult(livingEnvironment, "defult");
        return this;
    }

    public void go() {
        System.out.println("Птицы передвигаются");
    }

    public void sleep() {
        System.out.println("Птицы спят");
    }

    public void eat(){
        System.out.println("Птицы едят");
    }

    public abstract void hunt();

    @Override
    public String toString() {
        return super.toString() +
                ", Среда обитания: " + livingEnvironment;
    }
}
