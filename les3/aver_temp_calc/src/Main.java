import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0, ch, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array, between 28 - 31: ");
        n = sc.nextInt();

        int[] array_sc;
        array_sc = new int[n];

        System.out.println("Choose how to fill the array: 1 - input by your hand, random -other num. ");
        ch = sc.nextInt();

        if(ch == 1){
            for (int i = 0; i < array_sc.length; i++){
                System.out.println(" value " + i + " - ");
                array_sc[i] = sc.nextInt();
            }
        } else {
            array_filling(array_sc, n);
        }

        for (int i = 0; i < array_sc.length; i++){
            System.out.print(array_sc[i] + " ");
        }

        for (int i = 0; i < array_sc.length; i++){
            sum = sum + array_sc[i];
        }
        System.out.println("Average temperature per month " + (sum/array_sc.length));
    }
    public static void array_filling(int[] arr_f, int size){
        for (int i = 0; i < arr_f.length; i++){
            arr_f[i] = (int)(Math.random()*(91) - 45);
        }
    }
}