import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int h1, m1, h2, m2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter departure time, hours: ");
        while(true){
            h1 = sc.nextInt();
            if(!(0 <= h1 && h1 < 24))
                System.out.println("Not correct, repeat");
            else break;
        }
        System.out.println("Enter departure time, minutes: ");
        while(true){
            m1 = sc.nextInt();
            if(!(0 <= m1 && m1 < 61))
                System.out.println("Not correct, repeat");
            else break;
        }
        System.out.println("Enter arrivals time, hours: ");
        while(true){
            h2 = sc.nextInt();
            if(!(0 <= h2 && h2 < 24 && h1 < h2))
                System.out.println("Not correct, repeat");
            else break;
        }
        System.out.println("Enter arrivals time, minutes: ");
        while(true){
            m2 = sc.nextInt();
            if(!(0 <= m2 && m2 < 61))
                System.out.println("Not correct, repeat");
            else break;
        }

        System.out.println("Travel time, minutes: " + ((h2 * 60 + m2) -(h1 * 60 + m1) ));
    }
}