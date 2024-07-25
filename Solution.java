package nick.pack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    private static final Pattern PATTERN =  Pattern.compile(".*<([a-zA-Z0-9\\s]+?)>(.+)<(/\\1)>", Pattern.CASE_INSENSITIVE);
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            Matcher matcher = PATTERN.matcher(line);
            boolean isFind = extract(matcher);
            if (!isFind) {
                System.out.println("None");
            }
            testCases--;
        }
    }
    private static boolean extract(Matcher matcher) {
        while (matcher.find()) {
            if (matcher.group(1).equals(matcher.group(3).replace("/", ""))) {
                String content = matcher.group(2);
                Matcher underMatcher = PATTERN.matcher(content);
                if (content.matches(PATTERN.pattern())) {
                    extract(underMatcher);
                } else if (content.contains("<") && content.contains(">")) {
                    System.out.println("None");
                    return true;
                } else {
                    System.out.println(content);
                    return true;
                }
            } else {
                System.out.println("None");
                return true;
            }
        }
        return false;
    }
}



