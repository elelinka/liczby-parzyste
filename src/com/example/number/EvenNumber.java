package com.example.number;

public class EvenNumber {

    public void evenNumber() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nSuma liczb: " + sum);
    }
}
