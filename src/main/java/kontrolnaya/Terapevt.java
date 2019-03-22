package kontrolnaya;

public class Terapevt extends  Doctor{
    public Terapevt(String name) {
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
        return "Terapevt{" +
                "name='" + name + '\'' +
                '}';
    }
}
