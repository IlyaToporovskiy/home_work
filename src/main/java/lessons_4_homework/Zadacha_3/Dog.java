package lessons_4_homework.Zadacha_3;

public class Dog {
    private String name;
    private String color;
    private int weight;
    private int age;
    private String adress;


    public Dog(String name) {  //имя
        this.name = name;
        this.color = "неопределен";
        this.weight = 30;
        this.age = 3;
        this.adress = "Пушкинска дом 6";
    }

    public Dog(String name, int weight, int age) {// имя вес возраст
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "рыжый";
        this.adress = "Пушкинска дом 2";
    }

    public Dog(String name, int age) { // имя возраст
        this.name = name;
        this.age = age;
        this.weight = 30;
        this.color = "рыжый";
        this.adress = "Пушкинска дом 6";
    }

    public Dog(int weight, String color) { // имя возраст
        this.weight = weight;
        this.color = color;
        this.name = " Братело ";
        this.adress = "Пушкинска дом 6";
        this.age = 3;
    }

    public Dog(String color, int weight, String adress) {
        this.color = color;
        this.weight = weight;
        this.adress = adress;
        this.name = " Братело ";
        this.age = 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }
}
