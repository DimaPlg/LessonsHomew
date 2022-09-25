 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hour, min, sec, res_sec;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours: ");
        while(true){
            hour = sc.nextInt();
            if(!(0 <= hour && hour < 24))
                System.out.println("Not correct, repeat");
            else break;
        }
        System.out.println("Enter min: ");
        while(true){
            min = sc.nextInt();
            if(!(0 <= min && min < 61))
                System.out.println("Not correct, repeat");
            else break;
        }
        System.out.println("Enter seconds: ");
        while(true){
            sec = sc.nextInt();
            if(!(0 <= sec && sec < 61))
                System.out.println("Not correct, repeat");
            else break;
        }
        res_sec = hour * 3600 + min * 60 + sec;
        System.out.println("Time: " + res_sec);
    }
}