package nick.pack;


import java.io.IOException;
import java.util.*;

public class Main {
    /*
    1) Даны IP-адрес и маска подсети, необходимо вычислить адрес сети - метод getNetAddress.
    Используйте операцию поразрядной конъюнкции (логическое И).
     */
    private static String[] ipArray;
    private static String[] maskArray;
    private static String[] addressArray;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ip");
        String ip = scanner.nextLine();
        System.out.println("Введите маску подсети");
        String mask = scanner.nextLine();
        System.out.println("Введите адрес сети");
        String address = scanner.nextLine();
        ipArray = new String[4];
        maskArray = new String[4];
        addressArray = new String[4];
        getNetAddress(ip, mask, address);
        print();
    }
    public static void getNetAddress(String ip, String mask, String address){
        StringTokenizer ipToken = new StringTokenizer(ip, ".");
        StringTokenizer maskToken = new StringTokenizer(mask, ".");
        StringTokenizer addressToken = new StringTokenizer(address, ".");
        String ipBinary = "";
        String maskBinary = "";
        String addressBinary = "";
        int arrayCount = 0;
        while (ipToken.hasMoreTokens()){
            String string = ipToken.nextToken();
            int count = 0;
            ArrayList<Integer> binary = new ArrayList<>();
            int i = Integer.parseInt(string);
            int a = Integer.parseInt(string);
            while (a >= 0){
                a /= 2;
                count++;
                if (a == 0){
                    break;
                }
            }
            int[] array = new int[count];
            int c = 0;
            while (i >= 0){
                if (i == 1){
                    array[c] = 1;
                } else if (i == 0) {
                    array[c] = 0;
                }else if (i%2 == 0){
                    array[c] = 0;
                } else
                    array[c] = 1;
                i /= 2;
                c++;
                if (i == 0){
                    break;
                }
            }
            int[] reverse = new int[array.length];
            if (array.length == 1 && array[0] == 1){
                reverse[0] = 1;
            } else if (array.length == 1 && array[0] == 0) {
                reverse[0] = 0;
            } else {
                for (int j = array.length - 1, k = 0; j >= 0; j--, k++) {
                    if (array[j] == 1) {
                        reverse[k] = 1;
                    } else
                        reverse[k] = array[j];
                }
            }
            String str = "";
            for (int j = 0; j < reverse.length; j++) {
                str = str + "" + reverse[j];
            }
            ipArray[arrayCount] = str;
            arrayCount++;
        }
        arrayCount = 0;


        while (maskToken.hasMoreTokens()){
            String string = maskToken.nextToken();
            int count = 0;
            int i = Integer.parseInt(string);
            int a = Integer.parseInt(string);
            while (a >= 0){
                a /= 2;
                count++;
                if (a == 0){
                    break;
                }
            }
            int[] array = new int[count];
            int c = 0;
            while (i >= 0){
                if (i == 1){
                    array[c] = 1;
                } else if (i == 0) {
                    array[c] = 0;
                }else if (i%2 == 0){
                    array[c] = 0;
                } else
                    array[c] = 1;
                i /= 2;
                c++;
                if (i == 0){
                    break;
                }
            }
            int[] reverse = new int[array.length];
            if (array.length == 1 && array[0] == 1){
                reverse[0] = 1;
            } else if (array.length == 1 && array[0] == 0) {
                reverse[0] = 0;
            } else {
                for (int j = array.length - 1, k = 0; j >= 0; j--, k++) {
                    if (array[j] == 1) {
                        reverse[k] = 1;
                    } else
                        reverse[k] = array[j];
                }
            }
            String str = "";
            for (int j = 0; j < reverse.length; j++) {
                str = str + "" + reverse[j];
            }
            maskArray[arrayCount] = str;
            arrayCount++;
        }
        arrayCount = 0;


        while (addressToken.hasMoreTokens()){
            String string = addressToken.nextToken();
            int count = 0;
            int i = Integer.parseInt(string);
            int a = Integer.parseInt(string);
            while (a >= 0){
                a /= 2;
                count++;
                if (a == 0){
                    break;
                }
            }
            int[] array = new int[count];
            int c = 0;
            while (i >= 0){
                if (i == 1){
                    array[c] = 1;
                } else if (i == 0) {
                    array[c] = 0;
                }else if (i%2 == 0){
                    array[c] = 0;
                } else
                    array[c] = 1;
                i /= 2;
                c++;
                if (i == 0){
                    break;
                }
            }
            int[] reverse = new int[array.length];
            if (array.length == 1 && array[0] == 1){
                reverse[0] = 1;
            } else if (array.length == 1 && array[0] == 0) {
                reverse[0] = 0;
            } else {
                for (int j = array.length - 1, k = 0; j >= 0; j--, k++) {
                    if (array[j] == 1) {
                        reverse[k] = 1;
                    } else
                        reverse[k] = array[j];
                }
            }
            String str = "";
            for (int j = 0; j < reverse.length; j++) {
                str = str + "" + reverse[j];
            }
            addressArray[arrayCount] = str;
            arrayCount++;
        }
    }
    public static void print(){
        System.out.print("IP адрес: ");
        for (int i = 0; i < ipArray.length; i++) {
            System.out.print(ipArray[i] + " ");
        }
        System.out.println();
        System.out.print("Маска подсети: ");
        for (int i = 0; i < maskArray.length; i++) {
            System.out.print(maskArray[i] + " ");
        }
        System.out.println();
        System.out.print("Адрес сети: ");
        for (int i = 0; i < addressArray.length; i++) {
            System.out.print(addressArray[i] + " ");
        }

    }
}
