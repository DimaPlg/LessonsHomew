import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();
        String str_num = String.valueOf(num);
        System.out.println(new StringBuilder(str_num).reverse());
    }
}