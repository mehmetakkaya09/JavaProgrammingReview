package day02_09_17_2022;

public class ConvertMiutesToYearAndDay {
    public static void main(String[] args) {
        int m =5465465;
        int year = m/(60*24*365);
        int remDay = m%(60*24*365);
        int day = remDay/(60*24);
        System.out.println(m + " minutes is approximately " + year+ " year and " + day + " days");
    }
}
