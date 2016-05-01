/**
 *
 */
package marathon;

//Author: G. Allen Johnson 
//Midterm Project - Part 2 
//Class: CS 17.11 - D. Pearson
//Version: 1.6

public class Marathon {
    static int trackIndex;
    static int a;
    static int b;

    public static int findFirst(int[] time) {
        trackIndex = 0;

        // Steps through array and finds shortest time
        for (int i = 0; i < (time.length - 1); i++) {
            a = time[i];
            b = time[i + 1];
            if ((a < b) && (a <= time[trackIndex])) {
                trackIndex = i;
            }
            if ((b < a) && (b < time[trackIndex])) {
                trackIndex = i + 1;
            }
        }
        return trackIndex;

    }

    public static int findSecond(int[] time, int f) {
        int first = f;
        trackIndex = 0;
        // Makes first into last
        time[first] = time[first] * 100;

        // Steps through array and finds shortest time
        for (int i = 0; i < (time.length - 1); i++) {
            a = time[i];
            b = time[i + 1];
            if ((a < b) && (a <= time[trackIndex])) {
                trackIndex = i;
            }
            if ((b < a) && (b < time[trackIndex])) {
                trackIndex = i + 1;
            }
        }
        return trackIndex;

    }

    public static void main(String[] arguments) {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
                "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
                "Daniel", "Neda", "Aaron", "Kate" };

        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
                393, 299, 343, 317, 265 };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        // Finds and prints first place
        int first = findFirst(times);
        System.out.println();
        System.out.println("First place was: " + names[first]
                + ", with a time of: " + times[first] + " minutes.");
        System.out.println();

        // Finds and prints second place
        int second = findSecond(times, first);
        System.out.println("Second place was: " + names[second]
                + ", with a time of: " + times[second] + " minutes.");

    }
}
