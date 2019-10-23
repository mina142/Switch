import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int month;
        String monthName = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter 30 or 31: ");
        int num = keyboard.nextInt();


        switch(num) {
            case 30:
                monthName = "September, April, June, November";
                break;
            case 31:
                monthName = "Jan, Feb, March, July, Aug, Oct";
        }
        System.out.println(monthName);
    }
}
