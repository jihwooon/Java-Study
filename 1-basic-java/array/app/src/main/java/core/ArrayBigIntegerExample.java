package core;

import org.testng.annotations.Test;

import java.math.BigInteger;

public class ArrayBigIntegerExample {

    public static void main(String[] args) {
        BigInteger[] numbers = new BigInteger[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = BigInteger.valueOf(i);
            System.out.println("BigInteger : " + numbers);
            System.out.println("BigInteger : " + numbers.length);
        }
    }
}
