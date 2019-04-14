package fitness;

import java.text.SimpleDateFormat;
import java.util.Date;

@AccessMode(gym = "16", group = "16", pool = "0")
public class DayClient extends Human{

    private String endOfReg; //дата окончания регистрации
    private Access group = new Access(8, 16, FitnessServiceEnumeration.GROUP);
    private Access gym = new Access(8, 16, FitnessServiceEnumeration.GYM);

    public Access getGroup() {
        return group;
    }

    public void setGroup(Access group) {
        this.group = group;
    }


    public DayClient(String name, String surname, int bYear) {
        super(name, surname, bYear);
        this.setRegDate(getDateNow());
//        "12.04.2019";
        //TODO: подсчет даты окончания регистрации отдельным методом
//        this.endOfReg = "12.04.2020";
        this.endOfReg = setEndOfReg();
    }

    public DayClient(String name, String surname, int bYear, String regDate, int end) {
        //TODO: подсчет даты окончания регистрации отдельным методом
        super(name, surname, bYear, regDate);
//        this.endOfReg = "12.08.2019";
        this.endOfReg = setEndOfRegMonth(end);
    }

    public String setEndOfReg(){
        Date dateNow = new Date();
        dateNow.setYear(dateNow.getYear()+1);
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        String s= formatForDateNow.format(dateNow);
        System.out.println("Текущая дата " + formatForDateNow.format(dateNow));
        return s;
    }
    public String setEndOfRegMonth(int monthEnd){
        Date dateNow = new Date();
        dateNow.setMonth(dateNow.getMonth()+monthEnd);
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        String s= formatForDateNow.format(dateNow);
        System.out.println("Текущая дата " + formatForDateNow.format(dateNow));
        return s;
    }

}
