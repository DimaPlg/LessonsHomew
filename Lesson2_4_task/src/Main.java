import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        while(true){
            num = sc.nextInt();
            if(!(100 <= num))
                System.out.println("Not correct, repeat");
            else break;
        }
        System.out.println("Third number :"  + (num / 100) % 10);
    }
}