package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSumSales(int[] sales) {
        return sumAllSales(sales) / sales.length;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minAverageSales(int[] sales) {
        int getAverage = averageSumSales(sales);
        int counter = 0;
        for (int sale : sales) {
            if (sale < getAverage) {
                counter++;
            }
        }
        return counter;
    }

    public int maxAverageSales(int[] sales) {
        int getAverage = averageSumSales(sales);
        int counter = 0;
        for (int sale : sales) {
            if (sale > getAverage) {
                counter++;
            }
        }
        return counter;
    }
}




