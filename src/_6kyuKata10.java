import java.util.Date;

public class _6kyuKata10 {
    public static void main(String[] args) {


        Date date = new Date();
        System.out.println(countMinutes(date));
//        System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
    }
    public static String countMinutes(Date d){
        int hours = d.getHours();
        int minutes = d.getMinutes();
        int totalMinutes = hours * 60 + minutes;

        int minutesLeft = 1440-totalMinutes;
//if(minutes ==0)minutesLeft = (24-hours)*60;
//minutesLeft = (23-hours)*60 +(60-minutes);
return minutesLeft+" "+(minutesLeft==1?"minute":"minutes");
    }

}
