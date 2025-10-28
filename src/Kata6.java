public class Kata6 {
public static void main(String[] args) {
    System.out.println(camelCase("helloWorld"));
    System.out.println(camelCase("camelCasingTest"));
}
        public static String camelCase(String input) {
    String results = "";
//            return input.replaceAll("([A-Z])", " $1");
            for(int i = 0; i < input.length(); i++) {
                if(Character.isUpperCase(input.charAt(i))) results += " "+input.charAt(i);
                else results += input.charAt(i);
            }
            return results;
        }

}
