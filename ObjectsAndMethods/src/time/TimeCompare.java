package time;

import java.util.Scanner;

public class TimeCompare {
    Scanner scan = new Scanner(System.in);
    private int intervalInHours;
    private int intervalInMinutes;
    private int intervalInSeconds;
    private int allSeconds;
    private boolean isBigger=false;

    public TimeCompare(int intervalInHours, int intervalInMinutes, int intervalInSeconds) {
        this.intervalInHours = intervalInHours;
        this.intervalInMinutes = intervalInMinutes;
        this.intervalInSeconds = intervalInSeconds;
    }

    public TimeCompare(int intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
    }

    public int getIntervalInHours() {
        return intervalInHours;
    }

    public int getIntervalInMinutes() {
        return intervalInMinutes;
    }

    public int getIntervalInSeconds() {
        return intervalInSeconds;
    }


    public void inputData() {
        System.out.println("Введите количество часов:");
        this.intervalInHours = scan.nextInt();
        System.out.println("Введите количество минут:");
        this.intervalInMinutes = scan.nextInt();
        System.out.println("Введите количество секунд:");
        this.intervalInSeconds = scan.nextInt();
    }



    public int calculateAllSeconds() {
        allSeconds = intervalInHours * 3600 + intervalInMinutes * 60 + intervalInSeconds;
        return allSeconds;
    }


    public boolean compareTwoIntervals(TimeCompare interval2){
        if(this.calculateAllSeconds()>interval2.calculateAllSeconds()){
            System.out.println("Первый интервал "+"("+this.calculateAllSeconds()+") секунд"+" больше "+ "второго интервала "+"("+interval2.calculateAllSeconds()+") секуед");
            isBigger=true;}
        else {
            System.out.println(this.calculateAllSeconds()+"меньше"+interval2.calculateAllSeconds());
            isBigger=false;}
        return isBigger;
    }

}
