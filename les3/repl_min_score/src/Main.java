import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        n = sc.nextInt();

        int[] array_sc;
        array_sc = new int[n];

        System.out.println("Choose how to fill the array: ");
        ch = sc.nextInt();

        if(ch == 1){
            for (int i = 0; i < array_sc.length; i++){
                System.out.println(" value " + i + " - ");
                array_sc[i] = sc.nextInt();
            }
        } else {
            array_filling(array_sc, n);
        }
        array_sort(array_sc);
        diff_ch(array_sc, n);
        for (int i = 0; i < array_sc.length; i++){
            System.out.print(array_sc[i] + " ");
        }
    }
    public static void array_filling(int[] arr_f, int size){
        for (int i = 0; i < arr_f.length; i++){
            arr_f[i] = (int)(Math.random()*(11) + 0);
        }
    }
    public static void array_sort(int[] arr_f_s){
        int t_temp, res_t = 1, res = 0;
        while ( res != res_t){
            res = res_t;
            for (int i = 0; i < arr_f_s.length - 1; i++) {
                if (arr_f_s[i] > arr_f_s[i + 1]) {
                    t_temp = arr_f_s[i];
                    arr_f_s[i] = arr_f_s[i + 1];
                    arr_f_s[i + 1] = t_temp;
                    res_t++;
                }
            }
        }
    }

    public static void diff_ch(int[] arr_ch, int size) {
        int sum = 0;
        if((arr_ch[1] - arr_ch[0]) >= 3){
            for (int j = 1; j < arr_ch.length; j++ ){
                sum = sum + arr_ch[j];
            }
            arr_ch[0] = sum / (arr_ch.length - 1);
        }
    }
}