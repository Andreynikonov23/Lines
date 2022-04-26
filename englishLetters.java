package nick.pack;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
    1. В метод main первым параметром приходит имя файла.
    2. Посчитать количество букв английского алфавита, которое есть в этом файле.
    3. Вывести на экран число (количество букв)
    4. Закрыть потоки. Не использовать try-with-resources
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String file1 = scanner.nextLine();
        ArrayList<String> english = new ArrayList<>();
        english.add("q");
        english.add("w");
        english.add("e");
        english.add("r");
        english.add("t");
        english.add("y");
        english.add("u");
        english.add("i");
        english.add("o");
        english.add("p");
        english.add("a");
        english.add("s");
        english.add("d");
        english.add("f");
        english.add("g");
        english.add("h");
        english.add("j");
        english.add("k");
        english.add("l");
        english.add("z");
        english.add("x");
        english.add("c");
        english.add("v");
        english.add("b");
        english.add("n");
        english.add("m");
        StringBuilder builder = new StringBuilder(file1);
        int start = builder.lastIndexOf("/") + 1;
        int end = file1.length();
        String fileName = builder.substring(start, end);
        System.out.println(fileName);
        int count = 1;
        for (int i = 0; i < english.size(); i++) {
            if (fileName.contains(english.get(i))){
                count++;
            }
        }
        System.out.println(count + " english letters");
    }
}
