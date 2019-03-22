package kontrolnaya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Login spisokUser = new Login();
//
//        spisokUser.addLog("Admin");
//        spisokUser.addLog("Hirurg");
//        spisokUser.addLog("Terapevt");
//        spisokUser.addLog("Lor");
//        spisokUser.addLog("GlavVrach");
//        spisokUser.findUser("Terapevt");

//        System.out.println(spisokUser);
        Object [] zapis=new Object[14];

        boolean authorIsValid = true ;
        while(authorIsValid) {
            System.out.println("Авторизуйтесь в программе");
            Scanner input =new Scanner(System.in);
            String s = input.nextLine();
            Polzovatel p1=new Polzovatel();
            if(p1.findUser(s)==true){
                authorIsValid=false;

            }

        }
        System.out.println("Вы прошли авторизацию ");

    }
}
