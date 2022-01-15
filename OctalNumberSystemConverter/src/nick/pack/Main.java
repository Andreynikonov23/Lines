package nick.pack;


import java.util.Scanner;

public class Main {
    /*Создайте программу которая конвертирует из
     десятичной системы счисления в восьмиричную и наоборот.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите десятичное число");
        int tenNum = scanner.nextInt();
        toOctal(tenNum);
        System.out.println();
        System.out.println("Введите восьмиричное число");
        int eightNum = scanner.nextInt();
        check(eightNum);
    }
    public static void toOctal (int tenNum){
        int j = 0;
        for (int i = tenNum; i > 0; i/=8, j++) {
        }
        int[] remains = new int[j];
        for (int i = tenNum, c = 0; i > 0; i/=8, c++) {
            int rem = i%8;
            remains[c] = rem;
        }
        int[] newRem = new int[remains.length];
        for (int i = remains.length - 1, v = 0; i >= 0; i--, v++) {
            newRem[v] = remains[i];
        }
        for (int i = 0; i < newRem.length; i++) {
                System.out.print(newRem[i]);
        }
    }
    public static void toDecimal(int eightNum){
        String str = String.valueOf(eightNum);
        int[] array = new int[str.length()];
        int a = str.length();
        for (int i = 0; i < 3; i++) {
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int[] reverse = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        int eight = 8;
        int[] sumArr = new int[reverse.length];
        sumArr[0] = reverse[0];
        sumArr[1] = reverse[1] * 8;
        for (int i = 2; i < array.length; i++) {
            eight *=8;
            sumArr[i] = reverse[i] * eight;
        }
        int sum = 0;
        for (int i = 0; i < sumArr.length; i++) {
            sum += sumArr[i];
        }
        System.out.println(sum);
    }
    public static void check(int eightNum){
        String str = String.valueOf(eightNum);
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 8){
                toDecimal(eightNum);
            } else
                System.out.println("Введено недопустимое значение");
            break;
        }
    }
}
