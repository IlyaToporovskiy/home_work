package lesson_10_homework;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

//Домашнее задание:
//1. Сосчитать частоту встречаемости слов в War and peace (файл wp.txt).
//2. Собрать все слова в группы по количеству букв: например, в одну группу попадут слова: [the, war, jar, get, met...], в другую [on, up, no, of...].
//3. Вывести топ 10 самых частых слов и фраз.
//4. Тоже, что и 2, но без артиклей, частиц и тп (без the, a, on, to...).
//5. Вывести частоту встречаемости букв анг алфавита по этой книге. Вывести в процентах для каждой буквы.
public class Start {


    public static void main(String[] args) throws IOException {

        //1. Сосчитать частоту встречаемости слов в War and peace (файл wp.txt).
        //взяли в память текст
//        countWord();

        ////2. Собрать все слова в группы по количеству букв:
//        containForLen();


        //3. Вывести топ 10 самых частых слов и фраз.
//        topTen(countWord());


        //4. Тоже, что и 2, но без артиклей, частиц и тп (без the, a, on, to...).
//        String[] str={"at","is","it","an","xx","the"}; // слова которые нужно исключить из мапы
//        containWithout(str);


        //5. Вывести частоту встречаемости букв анг алфавита по этой книге. Вывести в процентах для каждой буквы.
    }



    //1.
    public static Map<String, Integer> countWord() throws IOException {
        ClassLoader loader = Start.class.getClassLoader();
        File file = new File(loader.getResource("wp.txt").getFile());

        List<String> lines = Files.readAllLines(file.toPath());
        List<String> words = new ArrayList<>();

        for (String line : lines) {
            String[] wordSplit = line.toLowerCase()
                    .replaceAll("\\p{Punct}", " ")
                    .replaceAll("\\d", "")
                    .trim()
                    .split("\\s");
            for (String s : wordSplit) {
                if (s.length() > 0) {
                    words.add(s.trim());
                }
            }
        }

        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println("частота встречаемости слов " + map);
        return map;
    }

    //2.
    public static void containForLen() throws IOException {
        ClassLoader loader = Start.class.getClassLoader();
        File file = new File(loader.getResource("wp.txt").getFile());

        List<String> lines = Files.readAllLines(file.toPath());
        List<String> words = new ArrayList<>();

        for (String line : lines) {
            String[] wordSplit = line.toLowerCase()
                    .replaceAll("\\p{Punct}", " ")
                    .replaceAll("\\d", "")
                    .trim()
                    .split("\\s");
            for (String s : wordSplit) {
                if (s.length() > 0) {
                    words.add(s.trim());
                }
            }
        }

        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
//        System.out.println("частота встречаемости слов " + map);
        HashMap<Integer, HashSet<String>> groupWords = new HashMap<>(); // создаем HashMap
        for (String word : words) {   //перебираем
            int key = word.length();  //определяем длину слова
            if (!groupWords.containsKey(key)) {  //если HashMap не содержит наш ключ (длину слова)
                groupWords.put(key, new HashSet<>());// то добавим в мапу
            }
            groupWords.get(key).add(word);
        }
        System.out.println(groupWords);
    }

    //3.
    public static void topTen(Map<String, Integer> map) {
        TreeMap<Integer, Set<String>> treeMap = new TreeMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (!treeMap.containsKey(stringIntegerEntry.getValue())) {
                treeMap.put(stringIntegerEntry.getValue(), new HashSet<>());
            }
            treeMap.get(stringIntegerEntry.getValue()).add(stringIntegerEntry.getKey());
        }
        System.out.println("Топ 10 встречаймых слов");
        int j = 0;
        int k = 10;
        for (Map.Entry<Integer, Set<String>> entry : treeMap.entrySet()) {
            j++;
            if (j > treeMap.size() - 10) {
                System.out.println("Номер " + k + "  " + entry);
                k--;
            }
        }


//        System.out.println(Arrays.toString(map.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .limit(10).toArray()));

    }

    //4.
    public static void containWithout(String [] strings) throws IOException {
        ClassLoader loader = Start.class.getClassLoader();
        File file = new File(loader.getResource("wp.txt").getFile());

        List<String> lines = Files.readAllLines(file.toPath());
        List<String> words = new ArrayList<>();

        for (String line : lines) {
            String[] wordSplit = line.toLowerCase()
                    .replaceAll("\\p{Punct}", " ")
                    .replaceAll("\\d", "")
                    .trim()
                    .split("\\s");
            for (String s : wordSplit) {
                if (s.length() > 0) {
                    words.add(s.trim());
                }
            }
        }

        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
//        System.out.println("частота встречаемости слов " + map);
        HashMap<Integer, HashSet<String>> groupWords = new HashMap<>(); // создаем HashMap
        for (String word : words) {   //перебираем
            int key = word.length();  //определяем длину слова
            if (!groupWords.containsKey(key)) {  //если HashMap не содержит наш ключ (длину слова)

                groupWords.put(key, new HashSet<>());// то добавим в мапу
            }
            groupWords.get(key).add(word);
        }
        System.out.println(groupWords);
        groupWords.remove(1);

        for (Map.Entry<Integer, HashSet<String>> entry : groupWords.entrySet()) {
            for(int i=0;i<strings.length;i++){
                if(entry.getValue().contains(strings[i])){
                    entry.getValue().remove(strings[i]);
                }
            }

        }
        System.out.println(groupWords);
    }

}
