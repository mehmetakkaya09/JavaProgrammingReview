package day02_09_17_2022;

import java.time.LocalDateTime;

public class BonusForWeek {
    public static void main(String[] args) {
        /*
        şu anki zaman girilince aşağıdaki sonuç çıkacak şekilde program yazılacak
        hour:minutes:seconds
         */
        LocalDateTime today = LocalDateTime.now();
        int hour = today.getHour();
        int minute = today.getMinute();
        int second = today.getSecond();
        System.out.println(hour+":"+minute+":"+second);

    }
}
