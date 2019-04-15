package fitness;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class FitnessRegistrator {
    private ArrayList<Human> inGym = new ArrayList<>();
    private ArrayList<Human> inPool = new ArrayList<>();
    private ArrayList<Human> inGroup = new ArrayList<>();
    final int CLIENT = 10;
    // либо
    private HashMap<String, HashSet> clients = new HashMap<>();

    public void addFor(Human human, FitnessServiceEnumeration type) throws NoAccessException, QueueException {
        if (isAccessEnable(human, type)==false) {
            throw new NoAccessException("Нет доступа в это время");
        }
        switch (type) {
            case GROUP:
                containErr(inGroup, human);
                if (inGroup.size() == CLIENT) {
                    throw new QueueException("лимит на " + CLIENT);
                }
                inGroup.add(human);

                break;
            case POOL:
                containErr(inPool, human);
                if (inPool.size() == CLIENT) {
                    throw new QueueException("лимит на " + CLIENT);
                }
                inPool.add(human);
                break;
            case GYM:
                containErr(inGym, human);
                if (inGym.size() == CLIENT) {
                    throw new QueueException("лимит на " + CLIENT);
                }
                inGym.add(human);
                break;
        }

    }

    public void containErr(ArrayList<Human> arr, Human human) throws NoAccessException {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(human)) {
                throw new NoAccessException("отказано такой пользователь уже есть");
            }

        }
    }

    public boolean isAccessEnable(Human human, FitnessServiceEnumeration type) {
        Class humanClass = human.getClass();
        if (humanClass.isAnnotationPresent(AccessMode.class)) {
            AccessMode accessMode = (AccessMode) humanClass.getDeclaredAnnotation(AccessMode.class);
            if (FitnessServiceEnumeration.GYM.equals(type)) {
                if ((Integer.parseInt(accessMode.gym()) > LocalDateTime.now().getHour()) && LocalDateTime.now().getHour() > 8)
                    return true;
            } else if (FitnessServiceEnumeration.POOL.equals(type)) {
                if (Integer.parseInt(accessMode.pool()) > LocalDateTime.now().getHour() && LocalDateTime.now().getHour() > 8)
                    return true;
            } else if (FitnessServiceEnumeration.GROUP.equals(type)) {
                if (Integer.parseInt(accessMode.group()) > LocalDateTime.now().getHour() && LocalDateTime.now().getHour() > 8)
                    return true;
            }
        }
        return false;
    }

    public void removeAll(Human human){
        inGym.remove(human);
        inGroup.remove(human);
        inPool.remove(human);
    }

    public  void sortClients(){
            inGroup.sort(comparator);
            inPool.sort(comparator);
            inGym.sort(comparator);

        ArrayList<ArrayList<Human>> humanArrayList =new ArrayList<>(2);
        humanArrayList.add(inGym);
        humanArrayList.add(inPool);
        humanArrayList.add(inGroup);


        for (ArrayList<Human> humans : humanArrayList) {
            System.out.println(humans);
        }

//<фамилия> <имя> <тип клиента> <место нахождения>


    }

Comparator<Human> comparator =new Comparator<Human>() {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}.thenComparing(new Comparator<Human>() {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getName().compareTo(o2.getName());
    }
});



    @Override
    public String toString() {
        return "FitnessRegistrator{" +
                "inGym=" + inGym +
                ", inPool=" + inPool +
                ", inGroup=" + inGroup +

                '}';
    }

    public static void main(String[] args) throws NoAccessException, QueueException {
        FitnessRegistrator f = new FitnessRegistrator();
        DayClient dayClient1=new DayClient("1", "11", 1990);
        DayClient dayClient2=new DayClient("2", "12", 1990);
        DayClient dayClient3=new DayClient("3", "13", 1990);
        DayClient dayClient4=new DayClient("4", "14", 1990);
        DayClient dayClient5=new DayClient("5", "15", 1990);
        DayClient dayClient6=new DayClient("6", "16", 1990);
        f.addFor(dayClient3, FitnessServiceEnumeration.GROUP);
        f.addFor(dayClient2, FitnessServiceEnumeration.GROUP);
        f.addFor(dayClient1, FitnessServiceEnumeration.GROUP);

        f.addFor(dayClient6, FitnessServiceEnumeration.GROUP);
        f.addFor(dayClient5, FitnessServiceEnumeration.GROUP);
        f.addFor(dayClient4, FitnessServiceEnumeration.GROUP);
//        f.removeAll(dayClient);
        f.sortClients();
//        System.out.println(f.sortClients());


    }

}
