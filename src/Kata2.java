import java.util.Scanner;

public class Kata2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = input.nextInt();
        System.out.println(switchItUp(number));
    }
    public static String switchItUp(int number){
        return switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Error";
        };

    }
}