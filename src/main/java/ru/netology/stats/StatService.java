package ru.netology.stats;

public class StatService<count> {
    public long sum(long[] items) {
        long result = 0;
        for (long item : items) {
            result += item;

        }
        return result;
    }

    public long average(long[] items) {
        return sum(items) / items.length;
    }

    public long monthWithMin(long[] items) {

        long min = items[0];
        for (long item : items) {
            if (item < min) {
                min = item;
            }

        }
        int month = 1;
        int monthWithMin = 0;
        for (long item : items) {
            if (item == min) {
                monthWithMin = month;
            }
            month += 1;

        }
        return monthWithMin;
    }

    public long monthWithMax(long[] items) {

        long max = items[0];
        for (long item : items) {
            if (item >= max) {
                max = item;
            }

        }
        int month = 1;
        int monthWithMax = 0;
        for (long item : items) {
            if (item == max) {
                monthWithMax = month;
            }
            month += 1;

        }
        return monthWithMax;
    }

    public long monthCountMoreThenAverage(long[] items) {

        long average = average(items);
        int count = 0;
        for (long item : items) {
            if (item > average) {
                count++;
            }
        }
        return count;
    }

    public long monthCountLessThenAverage(long[] items) {

        long average = average(items);
        int count = 0;
        for (long item : items) {
            if (item < average) {
                count++;
            }
        }
        return count;
    }
}

