import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {
    public static void main(String[] args) {

        System.out.println(duplicateCount(""));//0
        System.out.println(duplicateCount("abcde"));// 0)
        System.out.println(duplicateCount("abcdeaa"));//1
        System.out.println(duplicateCount("abcdeaB"));//2
        System.out.println(duplicateCount("Indivisibilities"));//2
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyz"));//0
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzaaAb"));//2
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));//26
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));//26
    }
    public static int duplicateCount(String text) {
        text=text.toLowerCase();

        for(int i=0;i<text.length();i++){

        }
       return text.length();
    }
}
