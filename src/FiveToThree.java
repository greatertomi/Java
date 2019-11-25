public class FiveToThree {
    public static void main(String[] args) {
        String word = "bathe";

        String[] tokens = word.split("");

        for(int i=0; i < tokens.length; i++) {
            for(int j = 0; j < tokens.length; j++) {
                for (int k=0; k < tokens.length; k++) {
                    if(i == j || j == k || i == k) continue;
                    System.out.println(tokens[i] + tokens[j] + tokens[k]);
                }
            }
        }

    }
}
