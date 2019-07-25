package com.example.number;

public class EvenNumber {

    public void evenNumber() {
        int sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSuma liczb: " + sum);
    }
}
