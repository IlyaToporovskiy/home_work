package lessons_4_homework.Zadacha_3;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Борис");
        System.out.println(dog1);

        Dog dog2 = new Dog("Покуситель", 39, 7);
        dog2.setColor("красный");
        System.out.println(dog2);

        Dog dog3 = new Dog("Церберович", 21);
        System.out.println(dog3);

        Dog dog4 = new Dog(20, "пепельный");
        System.out.println(dog4);

        Dog dog5 = new Dog("золотой ", 2, "дом");
        System.out.println(dog5);


    }
}
