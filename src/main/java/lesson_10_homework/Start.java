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
//        for (String word : words) {
//            System.out.println(word);
//        }
    Map<String, Integer> map = new HashMap<>();
    for (String s : words) {
      if (map.containsKey(s)) {
        map.put(s, map.get(s) + 1);
      } else {
        map.put(s, 1);
      }
    }
    System.out.println("частота встречаемости слов " + map);

    ////2. Собрать все слова в группы по количеству букв:
    HashMap<Integer,HashSet<String>> groupWords =new HashMap<>(); // создаем HashMap
    for(String word :words){   //перебираем
      int key =word.length();  //определяем длину слова
      if(!groupWords.containsKey(key)){  //если HashMap не содержит наш ключ (длину слова)
        groupWords.put(key,new HashSet<>());// то добавим в мапу
      }
      groupWords.get(key).add(word);
    }
    System.out.println(groupWords);


  }

//  public static void groupForWords(Map<String, Integer> ob) {
//    int count = 0;
//    for (String s : ob.keySet()) {
//      if (s.length() > count) {
//        count = s.length();
//      }
//    }
//    System.out.println(count); //длина слова
//    for (int i = 1; i <= count; i++) {
//      Map<String,Integer> map2 =new HashMap<>();
//      for (Map.Entry entry : ob.entrySet()) {
//        if (entry.getKey().toString().length() == i) {
//
//          System.out.println("Слова с количеством букв " + i + " " + entry.getKey());
//        }
//      }
//
//
//    }
//
//  }

}
