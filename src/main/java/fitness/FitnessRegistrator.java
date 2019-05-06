package fitness;

import java.io.IOException;
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

    public void addFor(Human human, FitnessServiceEnumeration type) throws NoAccessException, QueueException, IOException {
//        //проверка времени, если поздно то нужно закоммитить 2 строчки ниже
//        if (isAccessEnable(human, type)==false) {
//            throw new NoAccessException("Нет доступа в это время");
//        }
        switch (type) {
            case GROUP:
                containErr(inGroup, human);
                if (inGroup.size() == CLIENT) {
                    throw new QueueException("лимит на " + CLIENT);
                }
                inGroup.add(human);
                FitnessLogger.writeLog(human,type);

                break;
            case POOL:
                containErr(inPool, human);
                if (inPool.size() == CLIENT) {
                    throw new QueueException("лимит на " + CLIENT);
                }
                inPool.add(human);
                FitnessLogger.writeLog(human,type);
                break;
            case GYM:
                containErr(inGym, human);
                if (inGym.size() == CLIENT) {
                    throw new QueueException("лимит на " + CLIENT);
                }
                inGym.add(human);
                FitnessLogger.writeLog(human,type);
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

        for (Human human : inGym) {
            System.out.println(human.getSurname() + " " + human.getName() + "    " + human.getClass().getSimpleName() + " - GYM");
        }
        for (Human human : inPool) {
            System.out.println(human.getSurname() + " " + human.getName() + "    " + human.getClass().getSimpleName() + " - POOL");
        }
        for (Human human : inGroup) {
            System.out.println(human.getSurname() + " " + human.getName() + "    " + human.getClass().getSimpleName() + " - GROUP");
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



}
