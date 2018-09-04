package time;

import time.TimeCompare;

public class TimeInterval {
    public static void main(String[] args) {
        TimeCompare firstInterval = new TimeCompare(2,1,1);
        //firstInterval.inputData();
        TimeCompare secondInterval = new TimeCompare(60);
        //secondInterval.inputData();
        firstInterval.compareTwoIntervals(secondInterval);

    }
}
