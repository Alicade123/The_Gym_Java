public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println(rps("scissors","scissors"));//draw
        System.out.println(rps("rock","rock"));//draw
        System.out.println(rps("paper","paper"));//draw
        System.out.println(rps("scissors","paper"));//Player 1 Won!
        System.out.println(rps("rock","scissors"));//Player 1 Won!
        System.out.println(rps("paper","rock"));//Player 1 Won!
        System.out.println(rps("paper","scissors"));//Player 2 Won!
    }
    public static String rps(String p1, String p2) {
        String results ="";
if(p1.equals(p2)){
    results="draw";
}
else if(p1.equals("scissors") && p2.equals("paper") || p1.equals("rock") && p2.equals("scissors") || p1.equals("paper") && p2.equals("rock")){
    results="Player 1 won!";
}
else {
    results="Player 2 won!";
}

return results;
    }
}
