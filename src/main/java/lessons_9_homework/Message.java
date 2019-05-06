package lessons_9_homework;

import java.util.*;


enum MessagePriority {
    LOW, MEDIUM, HIGH, URGENT;

    public static MessagePriority getPriority(int ord) {
        for (MessagePriority mp : values()) {
            if (ord == mp.ordinal()) {
                return mp;
            }
        }
        throw new AssertionError("Wrong ordinal: " + ord);
    }
}


public class Message {
    private int code;
    private MessagePriority priority;

    public Message(int code, MessagePriority priority) {
        this.code = code;
        this.priority = priority;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public MessagePriority getPriority() {
        return priority;
    }

    public void setPriority(MessagePriority priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (code != message.code) return false;
        return priority == message.priority;
    }

    @Override
    public int hashCode() {
        int result = code;
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", priority=" + priority +
                '}';
    }


    public static void main(String[] args) {
        List<Message> messages = MessageGenerator.generate(10);
        messages.size();
        countEachPriority(messages);
        countEachCode(messages);
        uniqueMessageCount(messages);
        System.out.println(messages);
        uniqueMessagesInOriginalOrder(messages);
        removeEach(messages,MessagePriority.LOW);
        removeOther(messages,MessagePriority.HIGH);

    }

    private static void countEachPriority(List<Message> messageList) {
        // Подсчитать количество сообщений для каждого приоритела
        // Ответ в консоль
        int countLow = 0, countMedium = 0, countHigh = 0, countUrgent = 0;
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).getPriority() == MessagePriority.LOW) {
                countLow++;
            }
            if (messageList.get(i).getPriority() == MessagePriority.MEDIUM) {
                countMedium++;
            }
            if (messageList.get(i).getPriority() == MessagePriority.HIGH) {
                countHigh++;
            }
            if (messageList.get(i).getPriority() == MessagePriority.URGENT) {
                countUrgent++;
            }

        }
        System.out.println("Количесвто сообщений " + "\n" + "LOW = " + countLow + "\n"
                + "High = " + countHigh + "\n"
                + "MEDIUM = " + countMedium + "\n"
                + "URGENT = " + countUrgent + "\n");
    }

    private static void countEachCode(List<Message> messageList) {
        // Подсчитать количество сообщений для каждого кода сообщения
        // Ответ в консоль
        HashSet<Integer> hashSetCode = new HashSet<>(); //создаем коллекцию SET  с уникальными элементами
        for (Message message : messageList) {//делаем перебор для Message идем по списку
            int code = message.getCode(); //получаем код в сообщении
            if (hashSetCode.contains(code)) {//если Set содержит уже этот код то пропускаем
                continue;
            } else { //если не содержит Set код то добовляем его в SET и считаем количество совпадений
                hashSetCode.add(code);
                int count =0;
                for (Message message1 : messageList) { // считаем совпадения
                    if(message1.getCode()==code){
                        count++;
                    }

                }System.out.println("code "+ code + "= " + count + "раз");
            }

        }
    }

    private static void uniqueMessageCount(List<Message> messageList) {
        // Подсчитать количество уникальных сообщений
        // Ответ в консоль
        HashSet<Message> messageHashSet =new HashSet<>(messageList);
        System.out.println(messageHashSet.size());
    }

    private static LinkedHashSet<Message> uniqueMessagesInOriginalOrder(List<Message> messageList){
        // вернуть только неповторяющиеся сообщения и в том порядке, в котором они
        // встретились в первоначальном списке
        // Например, было
//        [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        // на выходе:
        // [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        LinkedHashSet<Message> linkedHashSet =new LinkedHashSet<>(messageList);

        return linkedHashSet;
    }

    private static void removeEach(List<Message> messageList, MessagePriority priority){
        // удалить из коллекции каждое сообщение с заданным приоритетом
        // вывод до удалеия и после удаления
        System.out.println("Before remove " + "\n" + messageList);
        ArrayList<Message> arr=new ArrayList<>(messageList);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getPriority()==priority){
                arr.remove(i);
            }
        }
        System.out.println("After remove " + "\n" + arr);
    }

    private static void removeOther(List<Message> messageList, MessagePriority priority){
        // удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        // вывод до удалеия и после удаления
        System.out.println("Before remove " + "\n" + messageList);
        ArrayList<Message> arr=new ArrayList<>(messageList);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getPriority()!=priority){
                arr.remove(i);
                i--;  //необходимо чтобы после удаления не пропустить элемент
            }
        }
        System.out.println("After remove " + "\n" + arr);
    }
}

class MessageGenerator {
    public static List<Message> generate(int num) {
        if (num <= 0) {
            return Collections.emptyList();
        }

        Random random = new Random();
        List<Message> messages = new ArrayList<>(num);

//        values() - вернет массив констант
        int typesCount = MessagePriority.values().length;

        for (int i = 0; i < num; i++) {
            messages.add(
                    new Message(
                            random.nextInt(10),
                            MessagePriority.getPriority(random.nextInt(typesCount)))
            );
        }

        return messages;
    }
}