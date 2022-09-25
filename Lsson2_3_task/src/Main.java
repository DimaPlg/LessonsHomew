import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fathom: ");
        int fathom = sc.nextInt();
        System.out.println("Enter arshin: ");
        int arshin = sc.nextInt();
        System.out.println("Enter vertex: ");
        int vertex = sc.nextInt();

        System.out.println("Length: " + (((fathom * 3 + arshin) * 48 + vertex) * 4.445));
    }
}
