public class Kata {
    public static void main(String[] args) {
        String input = "Hola Alicade"; // corrected greeting
        boolean result = validateHello(input);
        System.out.println("Greeting detected: " + result);
    }

    public static boolean validateHello(String greetings) {
        String[] hellos = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
        greetings = greetings.toLowerCase(); // Make it case-insensitive

        for (String hello : hellos) {
            if (greetings.contains(hello)) {
                return true;
            }
        }
        return false;
    }
}