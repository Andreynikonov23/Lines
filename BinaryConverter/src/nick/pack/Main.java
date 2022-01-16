package nick.pack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Создайте конвертер который переводит
        из двоичного числа в десятичное и наооборот
        из десятичного в двоичное
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двоичное число");
        int biNum = scanner.nextInt();
        System.out.println(outBinary(biNum));
        System.out.println("Введите число");
        int num = scanner.nextInt();
        check(num);
    }
    public static void toBinary(int num){
        int i = 2, count = 0;
        for (; i < num - i; i *= 2, count++) {
        }
        int res = num;
        int[] array = new int[count + 2];
        for (int j = i, c = 0; j > 0; j /= 2, c++) {
            if (res < j){
                array[c] = 0;
            } else {
                res -= j;
                array[c] = 1;
            }
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
    }
    public static int outBinary(int biNum){
        String str = String.valueOf(biNum);
        int[] array = new int[str.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int[] reverse = new int[array.length];
        for (int i = array.length -1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        int count = 2;
        array[0] = reverse[0];
        array[1] = reverse[1] * count;
        for (int i = 2; i < reverse.length; i++) {
            count = count * 2;
            array[i] = reverse[i] * count;
        }
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res +=array[i];
        }
        return res;
    }
    public static void check(int num){
        String str = String.valueOf(num);
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 1){
                if (i == array.length -1) {
                    outBinary(num);
                }
            } else {
                System.out.println("Введено недопустимое значение");
                break;
            }
        }
    }
}
