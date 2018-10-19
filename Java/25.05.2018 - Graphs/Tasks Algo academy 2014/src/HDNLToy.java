import java.util.Scanner;
import java.util.Stack;

public class HDNLToy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        in.nextLine();
        String[] combinations = new String[num];
        for (int i = 0; i < num; i++) {
            combinations[i] = in.nextLine();
        }
        printHDNL(combinations);

    }

    private static void printHDNL(String[] combinations) {
        Scanner in = new Scanner(System.in);

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < combinations.length; i++) {
            while (!stack.isEmpty() && Integer.parseInt(combinations[i].substring(1)) <= Integer.parseInt(stack.peek().substring(1))) {
                System.out.printf("%s</%s>\n",new String(new char[stack.size()]).replace("\0", " "),stack.pop());
            }
            stack.push(combinations[i]);
            System.out.printf("%s<%s>\n",new String(new char[stack.size()]).replace("\0", " "),combinations[i]);


        }
        while(!stack.isEmpty()) {
            System.out.printf("%s</%s>\n",new String(new char[stack.size()]).replace("\0", " "), stack.pop());
        }
    }
//        solve(in);
//    }
//
//    private static void solve(Scanner in) {
//        int n = in.nextInt();
//        in.nextLine();
//        Stack<Tag> stack = new Stack<>();
//        for (int i = 0; i < n; i++) {
//            String tagString = in.nextLine();
//            char name = tagString.charAt(0);
//            int level = Integer.parseInt(tagString.substring(1));
//            while (!stack.empty() && stack.peek().level >= level) {
//                Tag tag = stack.pop();
//                int countOfSpaces = tag.getParentsCount();
//                String offset = repeat(' ', countOfSpaces);
//                System.out.println(offset + "</" + tag + ">");
//            }
//
//            int parentsCount = 0;
//            if (!stack.empty()) {
//                parentsCount = stack.peek().getParentsCount() + 1;
//            }
//
//            String offset = repeat(' ', parentsCount);
//            Tag newTag = new Tag(name, level, parentsCount);
//            System.out.println(offset + "<" + newTag + ">");
//            stack.push(newTag);
//        }
//
//        while (!stack.empty()) {
//            Tag tag = stack.pop();
//            int countOfSpaces = tag.getParentsCount();
//            String offset = repeat(' ', countOfSpaces);
//            System.out.println(offset + "</" + tag + ">");
//        }
//    }
//
//    private static String repeat(char ch, int count) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < count; i++) {
//            builder.append(ch);
//        }
//        return builder.toString();
//    }
//
//    static class Tag {
//        private char name;
//        private int level;
//        private int parentsCount;
//
//        public Tag(char name, int level) {
//            this(name, level, 0);
//        }
//
//        public Tag(char name, int level, int parentsCount) {
//
//            this.name = name;
//            this.level = level;
//            this.parentsCount = parentsCount;
//        }
//
//        public char getName() {
//            return name;
//        }
//
//        public int getLevel() {
//            return level;
//        }
//
//        @Override
//        public String toString() {
//            return String.format("%c%d", getName(), getLevel());
//        }
//
//        public int getParentsCount() {
//            return parentsCount;
//        }
// }
}
