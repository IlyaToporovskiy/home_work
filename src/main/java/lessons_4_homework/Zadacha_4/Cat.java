package lessons_4_homework.Zadacha_4;

public class Cat {
    private String name;
    private int age;
    private int weigth;
    private int strength;

    public Cat() {
        this.age=1;
    }

    public Cat(String name, int age, int weigth, int strength) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double formula(){
        double   formula=(double)this.weigth*this.strength/this.age;
        return  formula;
    }

    boolean fight(Cat anotherCat){

        if(anotherCat.formula()>this.formula()){
//            System.out.println("\n"+ " Другой кот выиграл");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                ", strength=" + strength +
                '}';
    }
}
