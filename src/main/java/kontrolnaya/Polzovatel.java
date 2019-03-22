package kontrolnaya;

public class Polzovatel extends  User{
    @Override
    public boolean findUser(String s) {
        super.findUser(s);
        return false;
    }

    @Override
    public void exit() {
        super.exit();
    }
}
