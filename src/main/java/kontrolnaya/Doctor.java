package kontrolnaya;

public class Doctor implements InterfaceDoctor{
    String name;


    @Override
    public void findUserForDoctor(String s) {

    }


    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                '}';
    }
}
