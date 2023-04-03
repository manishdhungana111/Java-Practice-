public class StringReassmable {
    public static void main(String[] args) {


            String input = "MY PHONE IS DEAD";
            String result = "";
            char character;
            for (int i = 0; i < input.length(); i++) {
                character = input.charAt(i);
                if (character != 'A' && character != 'E' & character != 'I' && character != 'O' && character != 'U') {
                    System.out.print("");
                } else {
                    input += character;
                }
            }
            System.out.println(input);
            System.out.println(result);
        
    }
}