    import java.util.*;

    public class Homework1 {

        public static void run() {
            Scanner scan = new Scanner(System.in);
            String input = "Two households, both alike in dignity,\n" +
                    "In fair Verona, where we lay our scene,\n" +
                    "From ancient grudge break to new mutiny,\n" +
                    "Where civil blood makes civil hands unclean.\n" +
                    "From forth the fatal loins of these two foes\n" +
                    "A pair of star-cross’d lovers take their life;\n" +
                    "Whose misadventured piteous overthrows\n" +
                    "Do with their death bury their parents’ strife.\n" +
                    "The fearful passage of their death-mark’d love,\n" +
                    "And the continuance of their parents’ rage,\n" +
                    "Which, but their children’s end, nought could remove,\n" +
                    "Is now the two hours’ traffic of our stage;\n" +
                    "The which if you with patient ears attend,\n" +
                    "What here shall miss, our toil shall strive to mend.\n";

            String[] unformatted = input.trim().split(" ");
            String[] words = splitWord(input);

            int wordCorrect = 0;
            int wordIncorrect = 0;

            while (wordCorrect < 3 && wordIncorrect < 3) {
                int randWord = (int) (Math.random() * unformatted.length);

                for (int i = 0; i < randWord; i++) {
                    System.out.print(unformatted[i] + " ");
                }

                int len = unformatted[randWord].length();
                for (int k = 0; k < len; k++) {
                    System.out.print("_");
                }

                System.out.println("\nGuess the next word: ");
                String question = scan.nextLine();

                if (question.equalsIgnoreCase(words[randWord])) {
                    wordCorrect++;
                    System.out.println("That is Correct!");
                } else {
                    wordIncorrect++;
                    System.out.println("That is incorrect");
                }
            }

            scan.close();
        }

        public static String[] splitWord(String input) {
            String cleanInput = input.replaceAll("[,.;]", "");
            return cleanInput.trim().split("\\s+");
        }
    }
