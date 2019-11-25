public class PigLatin {
    public static void main(String[] args) {
        String sentence = "The pig jumped over the wall";
        String[] tokens = sentence.split(" ");
        for (String word: tokens) {
            System.out.println(printPigLatin(word));
        }
    }

    public static String printPigLatin(String word) {
        String[] letters = word.split("");
        StringBuilder wordBuilder = new StringBuilder();
        for(int i = 1; i < letters.length; i++) {
            wordBuilder.append(letters[i]);
        }
        wordBuilder.append(letters[0]+"ay");
        word = wordBuilder.toString();
        return word;
    }
}
