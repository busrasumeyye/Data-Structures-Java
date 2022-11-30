import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args){

        String[] weekdays= new String[7];
        System.out.println(Arrays.toString(weekdays));
        weekdays[0]="Monday";
        System.out.println(Arrays.toString(weekdays));
        weekdays = new String[]{"mon","tue","wed","thu","fri","sat","sun"};
        System.out.println(Arrays.toString(weekdays));

        System.out.println("Week  Days");
        for(String day: weekdays){
            System.out.println(day);
        }

        for(int i= 0; i< weekdays.length ;i++){
            weekdays[i]=weekdays[i].toUpperCase();
            System.out.println(Arrays.toString(weekdays));
        }
        System.out.println(Arrays.toString(weekdays));




    }
}
