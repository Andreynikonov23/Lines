import java.util.*;
import java.util.regex.*;

public class XMLExtractor {
    private static final Pattern PATTERN = Pattern.compile("<(.+?)>(.+)<(/\\1)>");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            Matcher matcher = PATTERN.matcher(line);
            int count = extract(matcher);
            if (count == 0) {
                System.out.println("None");
            }
            testCases--;
        }
    }

    private static int extract(Matcher matcher) {
        int count = 0;
        while (matcher.find()) {
            if (matcher.group(1).equals(matcher.group(3).replace("/", ""))) {
                count++;
                String content = matcher.group(2);
                Matcher underMatcher = PATTERN.matcher(content);
                Matcher testMatcher = PATTERN.matcher(content);
                if (testMatcher.find()) {
                    count += extract(underMatcher);
                } else if (content.contains("<") && content.contains(">")) {
                    count--;
                } else {
                    System.out.println(content);
                }
            }
        }
        return count;
    }
}
