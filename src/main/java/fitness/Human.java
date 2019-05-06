package fitness;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    protected String name;
    private String surname;
    private int bYear;
    private String regDate;

    public Human(String name, String surname, int bYear, String regDate) {
        this.name = name;
        this.surname = surname;
        this.bYear = bYear;
        this.regDate = regDate;
    }

    public Human(String name, String surname, int bYear) {
        this.name = name;
        this.surname = surname;
        this.bYear = bYear;
//        this.regDate = "12.04.1019";
        this.regDate = getDateNow();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getbYear() {
        return bYear;
    }

    public void setbYear(int bYear) {
        this.bYear = bYear;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
    public String getDateNow(){
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        String s= formatForDateNow.format(dateNow);
//        System.out.println("Текущая дата " + formatForDateNow.format(dateNow));
        return s;
    }

    @Override
    public String toString() {
        return  " surname='" + surname + '\'' +
                "name='" + name + '\'' +
                ", bYear=" + bYear +
                ", regDate='" + regDate + '\'' +
                '}';
    }
}
