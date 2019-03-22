package kontrolnaya;

public class Admin extends User{
    @Override
    public void addLog(String s) {
        super.addLog(s);
    }

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
