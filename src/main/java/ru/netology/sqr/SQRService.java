package ru.netology.sqr;

public class SQRService {
    int counter = 0;

    public int sqrCounter(int a, int b) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= a & b >= i * i) {
                counter = counter +1;
            }
        }
        return counter;
    }
}
