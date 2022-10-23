import StringTasks.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] month = {"january", "february", "march", "april", "may", "june", "july", "august", "september",
                "october", "november", "december"};
        String[] month1 = {" january ", " february ", " march ", " april ", " may ", " june ", " july ", " august ", " september ",
                " october ", " november ", " december "};
        int[] day ={32, 29, 32, 31,  32, 31,  32, 32, 31, 32, 31, 32};
        String[] monthDate = {".01.", ".02.", ".03.", ".04.", ".05.", ".06.", ".07.", ".08.", ".09.", ".10.", ".11.", ".12."};
        String[] monthDate2 = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input date for 1'st task:");
        String date = scanner.nextLine();
        String dateError = date.toLowerCase();
        if(dateError.matches("\\d{2}\\s\\w*\\s\\d{4}")){
            String[] words = dateError.split(" ");
            new Task1(words, month, monthDate, day);
        }else System.out.println("False");



        System.out.println("Input date for 2'st task:");
        String date1 = scanner.nextLine();
        if(date1.matches("\\d{2}\\.\\d{2}\\.\\d{4}")){
            String[] words1 = date1.split("\\.");
            new Task1(words1, monthDate2, month1, day);
        }else System.out.println("False");




    }
}