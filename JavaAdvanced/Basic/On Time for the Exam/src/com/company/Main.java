package com.company;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int HourExam = Integer.parseInt(input.nextLine());
        int MinutesExam = Integer.parseInt(input.nextLine());
        int StudentHour = Integer.parseInt(input.nextLine());
        int StudentMinutes = Integer.parseInt(input.nextLine());
        int Difference = (HourExam * 60 + MinutesExam) - (StudentHour * 60 +StudentMinutes);
        int HoursInMinutes = Difference/60;
        int RestMinutes = Difference%60;
        if (Difference > 30) {
            System.out.println("Early");
            if (Difference <= 59) {
                System.out.printf("%02d minutes before the start", Difference);
            }else {
                System.out.printf("%d:%02d hours before the start", HoursInMinutes, RestMinutes);
            }
        }else if (Difference == 0) {
            System.out.println("On time");
        }else if (Difference > 0){
            System.out.println("On time");
            System.out.printf("%d minutes before the start", Difference);
        }else {
            System.out.println("Late");
            if (Difference >= -59) {
                System.out.printf("%d minutes after the start", Math.abs(Difference));
            }else {
                System.out.printf("%d:%02d hours after the start", Math.abs(HoursInMinutes), Math.abs(RestMinutes));
            }
        }
    }
}