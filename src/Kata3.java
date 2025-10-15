public class Kata3 {
    public static void main(String[] arg){
        System.out.println(inviteMoreWomen(new int[] {1, -1, 1}));  // true
        System.out.println(inviteMoreWomen(new int[] {-1, -1, -1})); // false
        System.out.println(inviteMoreWomen(new int[] {1, -1}));      // false
        System.out.println(inviteMoreWomen(new int[] {1, 1, 1}));    // true
    }

    public static boolean inviteMoreWomen(int[] l) {
        int total = 0;
        for (int i = 0; i < l.length; i++) {
            total += l[i]; // 1 for man, -1 for woman
        }
        return total > 0; // more men than women
    }
}