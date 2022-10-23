package StringTasks;

import java.util.Scanner;

public class Task1 {
    public Task1(String[] words, String[] months, String[] monthDate, int[] days){
            for(int i = 0; i < 12; i++){
                if(words[1].equalsIgnoreCase(months[i]) && i < 9) {
                words[1] = monthDate[i];
                if(Integer.parseInt(words[2])%4 == 0 && 0 < Integer.parseInt(words[0]) && Integer.parseInt(words[0]) < (days[1] + 1))
                    if(words[1].equalsIgnoreCase(".02.") || words[1].equalsIgnoreCase(" february "))
                    System.out.println(words[0] + words[1] + words[2]);
                if(0 < Integer.parseInt(words[0]) && Integer.parseInt(words[0]) < days[i])
                    System.out.println(words[0] + words[1] + words[2]);
                }
                if(words[1].equalsIgnoreCase(months[i]) && i > 9){
                words[1] = monthDate[i];
                if(0 < Integer.parseInt(words[0]) && Integer.parseInt(words[0]) < days[i])
                    System.out.println(words[0] + words[1] + words[2]);
            }
            }
    }
}

