import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int n, m, min_value_el_array, max_value_el_array, g =0, k =0;
        int[] array1, array2, array3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the first array: ");
        n = sc.nextInt();
        System.out.println("Enter size of the second array: ");
        m = sc.nextInt();
        System.out.println("Enter minimal value of element array: ");
        min_value_el_array = sc.nextInt();
        System.out.println("Enter max value of element array: ");
        max_value_el_array = sc.nextInt();

        array1 = new int[n];
        array_filling(array1, n, min_value_el_array, max_value_el_array);
        array_sort(array1);

        array2 = new int[m];
        array_filling(array2, m, min_value_el_array, max_value_el_array);
        array_sort(array2);

        array3 = new int [array1.length +array2.length];
            for(int j = 0; j < array3.length; j++) {
                if (g == array1.length) {
                    array3[j] = array2[k];
                    k++;
                }
                else if (k == array2.length) {
                    array3[j] = array1[g];
                    g++;
                }
                else if (array1[g] <= array2[k]) {
                    array3[j] = array1[g];
                    g++;
                }else{
                    array3[j] = array2[k];
                    k++;
                }
                System.out.print(array3[j] + " ");
            }
    }
    public static void array_filling(int[] arr_f, int size, int min, int max){
        for (int i = 0; i < arr_f.length; i++){
            arr_f[i] = (int)(Math.random()*(max-min+1)+min);
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
}
