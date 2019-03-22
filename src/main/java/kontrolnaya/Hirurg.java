package kontrolnaya;

public class Hirurg extends Doctor {
    public Hirurg(String name) {
        super(name);
    }

    @Override
    public void findUserForDoctor(String s) {
        super.findUserForDoctor(s);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Hirurg{" +
                "name='" + name + '\'' +
                '}';
    }
}
