
public class Solution {
     static void main() {
        int x= 3;
        int y = 2;
        System.out.println(areaOrPerimeter(x,y));
    }
    public static int areaOrPerimeter (int l, int w) {
        // code away...
        if (l==w) {
            return l*w;
        }else{
            return 2*l+2*w;
        }
    }
}