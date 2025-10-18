public class RemoveChars {
    public static void main(String[] args) {
        System.out.println(remove("ab"));
        System.out.println(remove("program"));
    }
    public static String remove(String str){
       String results = "";
       if(str.length()<=2){
           results="";
       }else{
           results=str.substring(1,str.length()-1);
       }
       return results;
    }
}

