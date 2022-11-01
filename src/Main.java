public class Main {
    public static void main(String[] args) {

        Herbivorous gazelle = new Herbivorous("Газель",3,"Пустыня", 50,"трава");
        Herbivorous giraffe = new Herbivorous("Жираф",5,"Сованна", 30,"листья");
        Herbivorous horse = new Herbivorous("Лошадь",6,"Степь", 55,"трава");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        gazelle.graze();

        Predators hyena = new Predators("Гиена", 2,"Сованна",35,"Мясо");
        Predators tiger = new Predators("Тигр", 5,"Зоопарк",55,"Мясо");
        Predators bear = new Predators("Медведь", 6,"Лес",40,"Рыба");

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        hyena.walk();

        Amphibians frog = new Amphibians("Лягушка", 1,"Озеро");
        Amphibians snake = new Amphibians("Уж пресноводный", 2,"   ");

        System.out.println(frog);
        System.out.println(snake);
        frog.hunt();

        NotFlying dodo = new NotFlying("Птица Додо", 3,null, "Ходит");
        NotFlying penguin = new NotFlying("Пингвин", -5,"Южный полюс", "Плавает");
        NotFlying peacock = new NotFlying("Птица Додо", 10,"Тропики","Ходит" );

        System.out.println(dodo);
        System.out.println(penguin);
        System.out.println(peacock);
dodo.walk();

        Flying seagull = new Flying("Чайка", 2,"Вблизи водохранилищ","Летает");
        Flying albatross = new Flying("Альбатрос", 0,"    ",null);
        Flying falcon = new Flying("Сокол", 4,"Равнина","Летает");
        Flying falcon2 = new Flying("Сокол", 0,"    ",null);

        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
        seagull.fly();

        System.out.println(falcon.equals(falcon2));




    }
}