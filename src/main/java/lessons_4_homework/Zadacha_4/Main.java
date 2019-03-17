package lessons_4_homework.Zadacha_4;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Борис", 6, 10, 6);//10
        Cat cat2 = new Cat("Филя", 8, 6, 9);//6.75

        System.out.println("Кот 1 " + cat1.formula());
        System.out.println("Кот 2 " + cat2.formula());
        cat1.fight(cat2);
        cat2.fight(cat2);
        System.out.println("Кот "+cat1.getName()+" дерется с "+cat2.getName()+ " результат схватки ="+cat1.fight(cat2));
        System.out.println("Кот "+cat2.getName()+" дерется с "+cat1.getName()+ " результат схватки ="+cat2.fight(cat1));
    }
}
