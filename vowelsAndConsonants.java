package nick.pack;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*
    Написать программу, которая вводит с клавиатуры строку текста.
    Программа должна вывести на экран две строки:
    1. первая строка содержит только гласные буквы из введённой строки.
    2. вторая - только согласные буквы и знаки препинания из введённой строки.
    Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        char[] vowels = {'а','е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
        char[] consonants = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',',', '.'};
        char[] array = str.toLowerCase(Locale.ROOT).toCharArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (array[i] == vowels[j]){
                    System.out.print(array[i] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < consonants.length; j++) {
                if (array[i] == consonants[j]){
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
