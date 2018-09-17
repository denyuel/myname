import java.util.ArrayList;
import java.util.Scanner;


public class hangmantrial {

    static public void guess(String word, int life) {

        char[] unfilled = new char[word.length()];
        int i = 0;
        while (i < word.length()) {
            unfilled[i] = '-';
            if (word.charAt(i) == ' ') {
                unfilled[i] = ' ';
            }
            i++;
        }
        System.out.print(unfilled);
        System.out.println("       Life remaining=" + life);

        {

            Scanner s = new Scanner(System.in);

            ArrayList<Character> l = new ArrayList<Character>();

            while (life > 0) {
                char x = s.next().charAt(0);

                if (l.contains(x)) {
                    System.out.println("Already entered");
                    continue;
                }

                l.add(x);

                if (word.contains(x + "")) {
                    for (int y = 0; y < word.length(); y++) {
                        if (word.charAt(y) == x) {
                            unfilled[y] = x;
                        }
                    }
                } else {
                    life--;
                }

                if (word.equals(String.valueOf(unfilled))) {
                    System.out.println(unfilled);
                    System.out.println("You won!!!");
                    break;
                }

                System.out.print(unfilled);
                System.out.println("      Life remaining=" + life);

            }
            if (life == 0) {
                System.out.println("You lose");
            }
        }

    }

    public static void main(String args[]) {

        String word = "Welcome to java";
        int life = 5;
        guess(word, life);
    }
}
