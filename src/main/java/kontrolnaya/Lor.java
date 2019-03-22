package kontrolnaya;

public class Lor extends  Doctor {
    public Lor(String name) {
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
        return "Lor{" +
                "name='" + name + '\'' +
                '}';
    }
}
