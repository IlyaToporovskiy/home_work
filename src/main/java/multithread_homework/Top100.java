package multithread_homework;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top100 {


    public static void main(String[] args) {
        // выполнить подсчет топ 100 слов параллельно

        // количество потоков должно
        // быть равно числу доступных процессоров системы
        int d = Runtime.getRuntime().availableProcessors();
        System.out.println(d);

        ClassLoader loader = Top100.class.getClassLoader();
        File file = new File(loader.getResource("wp.txt").getFile());
        List<String> lines = null;
        try {
            lines = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> words = new ArrayList<>();
        for (String line : lines) {
            String[] wordSplit = line.toLowerCase()
                    .replaceAll("\\p{Punct}", " ")
                    .replaceAll("\\d", " ")
                    .trim()
                    .split("\\s");
            for (String s : wordSplit) {
                if (s.length() > 0) {
                    words.add(s.trim());
                }
            }
        }
//        for (String word : words) {
//            System.out.println(word.length());
//        }
        System.out.println(words.size());

//        ArrayList list = new ArrayList();
//        list.subList(indexFrom, indexTo);

        HashMap<String, Integer> wordMap2 = new HashMap<>();
        ;

        MyTheard theard1 = new MyTheard(words, wordMap2, 1);

        MyTheard theard2 = new MyTheard(words, wordMap2, 2);
        MyTheard theard3 = new MyTheard(words, wordMap2, 3);
        MyTheard theard4 = new MyTheard(words, wordMap2, 4);
        MyTheard theard5 = new MyTheard(words, wordMap2, 5);
        MyTheard theard6 = new MyTheard(words, wordMap2, 6);
        MyTheard theard7 = new MyTheard(words, wordMap2, 7);
        MyTheard theard8 = new MyTheard(words, wordMap2, 8);

        theard1.run();
        theard2.run();
        theard3.run();
        theard4.run();
        theard5.run();
        theard6.run();
        theard7.run();
        theard8.run();

        System.out.println("++" + wordMap2.size());
    }
}


class MyTheard implements Runnable {
    List<String> words;
    HashMap<String, Integer> wordMap;

    public MyTheard(List<String> words, HashMap<String, Integer> map, int numProc) {
        this.words = sizeArr(words, numProc);
        this.wordMap = map;
    }


    private List<String> sizeArr(List<String> arr, int numberProc) {
        int indexTo = 71524;
        List<String> arr2;
        arr2 = arr.subList(indexTo * (numberProc - 1), indexTo * (numberProc));
        return arr2;
    }

    @Override
    public void run() {

        synchronized (wordMap) {
            for (String word : words) {
                if (wordMap.containsKey(word)) {
                    wordMap.put(word, wordMap.get(word) + 1);
                } else {
                    wordMap.put(word, 1);
                }
            }
        }
//        System.out.println(wordMap);
        System.out.println(wordMap.size());
        System.out.println("words" + words.size());
//        for (String s : wordMap.keySet()) {
////            System.out.println(s);
//        }

    }
}