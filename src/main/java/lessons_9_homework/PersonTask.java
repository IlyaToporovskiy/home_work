package lessons_9_homework;


// написать генератор списка объектов класса Person
// Сортировать объекты Person по:
// имени
// имени и зарплате
// имени, зарплате, возрасту и компании


import java.util.*;

class Person implements Comparable<Person> {
    private NameBase name;
    private int age;
    private int salary;
    private CompanyBase company;

    public Person(NameBase name, int age, int salary, CompanyBase company) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.company = company;
    }

    public NameBase getName() {
        return name;
    }

    public void setName(NameBase name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompany(CompanyBase company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public CompanyBase getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                ", salary=" + salary +
                ", company=" + company +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                salary == person.salary &&
                Objects.equals(name, person.name) &&
                Objects.equals(company, person.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, company);
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}

public class PersonTask {
    public static void main(String[] args) {
        List<Person> personList = PersonGenerator.generatPerson(10);
//        System.out.println(personList);
//        TreeSet<Person> users = new TreeSet<>(new NameComp());
//        users.addAll(personList);
//                System.out.println(users);
        ArrayList<Person> personArrayList = new ArrayList<>(personList);
        System.out.println("Не сортированный список  " + personArrayList);
//        Collections.sort(personArrayList);
//        System.out.println("Сортированный список по имени " + personArrayList);

        Collections.sort(personArrayList,new NameComparator());
        System.out.println("Сортированный список по имени " + personArrayList);

//        Comparator<User> userComparator = new UserNameComparator()
//                .thenComparing(new UserAgeComparator());
        Comparator<Person> nameSalaryComparator =new NameComparator()
                .thenComparing(new SalaryComparator());
        Collections.sort(personArrayList,nameSalaryComparator );
        System.out.println("Сортированный список по имени и зарплате " + personArrayList);

        // имени, зарплате, возрасту и компании
        Comparator<Person> sortAllComparator =new NameComparator()
                .thenComparing(new SalaryComparator()).thenComparing(new AgeComparator().thenComparing(new CompanyComparator()));
        Collections.sort(personArrayList,sortAllComparator);
        System.out.println("имени, зарплате, возрасту и компании "+personArrayList);
    }

}

class PersonGenerator {
    private NameBase nameBase;
    private CompanyBase companyBase;

    public NameBase getNameBase() {
        return nameBase;
    }

    public CompanyBase getCompanyBase() {
        return companyBase;
    }

    public static List<Person> generatPerson(int numPerson) {
        if (numPerson < 1) {
            return Collections.emptyList();// если у нас не правильно указан список то возвращаем пустой Лист
        }
        Random random = new Random(); //создаем объект класса Рандом
        ArrayList<Person> personList = new ArrayList<>(numPerson); // пустой массив куда будем загонять объект Person

        int typesCount = NameBase.values().length; //количество Имен
        int typesCount2 = typesCount; //количество Имен

        for (int i = 0; i < numPerson; i++) {
            personList.add(
                    new Person(
                            NameBase.getName(random.nextInt(typesCount)),
                            random.nextInt(80) + 18, random.nextInt(100000), CompanyBase.getCompany(random.nextInt(typesCount2)))
            );
        }
        return personList;

    }
}

enum NameBase {
    Abc, Bd, Cd, Dd, Fd,
    Gd, Hd, Id, Kd, Ld;

    public static NameBase getName(int indexName) {
        for (NameBase name : values()) {
            if (name.ordinal() == indexName) {
                return name;
            }
        }
        throw new AssertionError("Не правильнй номер элемента" + indexName);
    }
}

enum CompanyBase {

    CHEVRON, VOLK, APPLE, WALMART, GAZPROM, BP,
    CITIGROUP, HSBC, ICBC, BMV, AMG;

    public static CompanyBase getCompany(int indexCompany) {
        for (CompanyBase company : values()) {
            if (company.ordinal() == indexCompany) {
                return company;
            }
        }
        throw new AssertionError("Не правильнй номер элемента" + indexCompany);
    }
}


class NameComparator implements Comparator<Person> {
    public int compare(Person a1, Person a2) {
        return a1.getName().compareTo(a2.getName());
    }
}
class SalaryComparator implements  Comparator<Person>{
    public int compare(Person p1,Person p2){
        if(p1.getSalary()==p2.getSalary()){
            return 0;
        }
        else if(p1.getSalary()>p2.getSalary()){
            return 1;
        }else
            return -1;
    }
}

class AgeComparator implements  Comparator<Person>{
    public int compare(Person p1,Person p2){
        if(p1.getSalary()==p2.getSalary()){
            return 0;
        }
        else if(p1.getSalary()>p2.getSalary()){
            return 1;
        }else
            return -1;
    }
}

class CompanyComparator implements Comparator<Person> {
    public int compare(Person a1, Person a2) {
        return a1.getName().compareTo(a2.getName());
    }
}