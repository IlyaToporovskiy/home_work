//package kontrolnaya;
//
//import java.util.Arrays;
//
//public class Login {
//    String [] data = new String[20] ;
//    boolean isValid;
//
//public void addLog(String s){
//
//    outher:   for(int i =0;i<data.length;i++){
//         if (data[i]==null){
//             data[i]=s;
//             break outher;
//         }else  if(data[data.length-1]!=null){
//             System.out.println("мест нет для пользователей расширь массив");
//         }
//     }
//}
//public void findUser(String s){ //поиск пользователя
//    for(int i =0;i<data.length;i++){
//        if (data[i]==s){
//            System.out.println("пользователь авторизован  и есть в списке");
//            isValid=true;
//            break ;
//        }else {
//            System.out.println("пользователь не авторизован ,нужно добавить в список ");
//        }
//    }
//
//}
//
//
//    public String[] getData() {
//        return data;
//    }
//
//    public void setData(String[] data) {
//        this.data = data;
//    }
//
//    @Override
//    public String toString() {
//        return "Login{" +
//                "data=" + Arrays.toString(data) +
//                '}';
//    }
//}
