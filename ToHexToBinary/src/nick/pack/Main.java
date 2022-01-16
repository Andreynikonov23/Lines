package nick.pack;


import java.util.Scanner;

public class Main {
    /*Создайте программу которая конвертирует из шестнадцатиричного
      числа в двоичное число и наоборот.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 16-ное число");
        String hex = scanner.nextLine();
        //1010111111001111
        checkHex(hex);
        System.out.println();
        System.out.println("Введите 2-ное число");
        String binary = scanner.nextLine();
        checkBinary(binary);
    }
    public static void toBinary(String str){
        int[] reverse = new int[toInt(str).length];
        for (int i = reverse.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[i] = toInt(str)[j];
        }
        int sixteen = 16;
        int[] array = new int[reverse.length];
        array[0] = reverse[0];
        array[1] = reverse[1] * sixteen;
        for (int i = 2; i < array.length; i++) {
            sixteen *= 16;
            array[i] = reverse[i] * sixteen;
        }
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        int i = 2, count = 0;
        for (; i < res - i; i *= 2, count++) {
        }
        int result = res;
        int[] newArray = new int[count + 2];
        for (int j = i, c = 0; j > 0; j /= 2, c++) {
            if (result < j){
                newArray[c] = 0;
            } else {
                result -= j;
                newArray[c] = 1;
            }
        }
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j]);
        }
    }
    public static void toHex(String str){
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
        int j = 0;
        for (int i = res; i > 0; i /=16, j++) {
        }
        int[] newArray = new int[j];
        for (int i = res, c = 0; i > 0; i /=16, c++) {
            newArray[c] = i%16;
        }
        int[] newReverse = new int[newArray.length];
        for (int i = newReverse.length -1, c = 0; i >= 0; i--, c++) {
            newReverse[c] = newArray[i];
        }
        System.out.print(toStr(newReverse));
    }









    public static int[] toInt(String str){
        char[] chars = new char[str.length()];
        int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(i);
        }
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '0') {
                ints[i] = 0;
            }
            if (chars[i] == '1') {
                ints[i] = 1;
            }
            if (chars[i] == '2') {
                ints[i] = 2;
            }
            if (chars[i] == '3') {
                ints[i] = 3;
            }
            if (chars[i] == '4') {
                ints[i] = 4;
            }
            if (chars[i] == '5') {
                ints[i] = 5;
            }
            if (chars[i] == '6') {
                ints[i] = 6;
            }
            if (chars[i] == '7') {
                ints[i] = 7;
            }
            if (chars[i] == '8') {
                ints[i] = 8;
            }
            if (chars[i] == '9') {
                ints[i] = 9;
            }
            if (chars[i] == 'A' || chars[i] == 'a') {
                ints[i] = 10;
            }
            if (chars[i] == 'B' || chars[i] == 'b') {
                ints[i] = 11;
            }
            if (chars[i] == 'C' || chars[i] == 'c') {
                ints[i] = 12;
            }
            if (chars[i] == 'D' || chars[i] == 'd') {
                ints[i] = 13;
            }
            if (chars[i] == 'E' || chars[i] == 'e') {
                ints[i] = 14;
            }
            if (chars[i] == 'F' || chars[i] == 'f') {
                ints[i] = 15;
            }
        }
        return ints;
    }
    public static char[] toStr(int[] num){
        char[] chars = new char[num.length];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) num[i];
        }
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 0) {
                chars[i] = '0';
            }
            if(chars[i] == 1) {
                chars[i] = '1';
            }
            if(chars[i] == 2) {
                chars[i] = '2';
            }
            if(chars[i] == 3) {
                chars[i] = '3';
            }
            if(chars[i] == 4) {
                chars[i] = '4';
            }
            if(chars[i] == 5) {
                chars[i] = '5';
            }
            if(chars[i] == 6) {
                chars[i] = '6';
            }
            if(chars[i] == 7) {
                chars[i] = '7';
            }
            if(chars[i] == 8) {
                chars[i] = '8';
            }
            if(chars[i] == 9) {
                chars[i] = '9';
            }
            if(chars[i] == 10) {
                chars[i] = 'A';
            }
            if(chars[i] == 11) {
                chars[i] = 'B';
            }
            if(chars[i] == 12) {
                chars[i] = 'C';
            }
            if(chars[i] == 13) {
                chars[i] = 'D';
            }
            if(chars[i] == 14) {
                chars[i] = 'E';
            }
            if(chars[i] == 15) {
                chars[i] = 'F';
            }
        }
        return chars;
    }
    public static void checkHex(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(i);
        }
        int i = 0;
        for (; i < chars.length; i++) {
            if (chars[i] == '0' || chars[i] == '1' || chars[i] == '2' || chars[i] == '3' || chars[i] == '4' || chars[i] == '5' || chars[i] == '6'
                    || chars[i] == '7' || chars[i] == '8' || chars[i] == '9' || chars[i] == 'A' || chars[i] == 'a' || chars[i] == 'B' || chars[i] == 'b'
                    || chars[i] == 'C' || chars[i] == 'c' || chars[i] == 'D' || chars[i] == 'd' || chars[i] == 'E' || chars[i] == 'e'
                    || chars[i] == 'F' || chars[i] == 'f') {
                if (i == chars.length - 1){
                    toBinary(str);
                }
            } else {
                System.out.println("Введено неверное число");
                break;
            }
        }
    }
    public static void checkBinary(String str){
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 1){
                if (i == array.length -1) {
                    toHex(str);
                }
            } else {
                System.out.println("Введено недопустимое значение");
                break;
            }
        }
    }
}
