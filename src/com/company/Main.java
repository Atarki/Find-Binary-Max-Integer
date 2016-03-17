package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numberList = new ArrayList<Integer>();

        for (int i = 0; i < 10000; i++) {
            numberList.add(random.nextInt(100000));
        }
        Collections.sort(numberList);

        int binaryInteger = getMaxBinaryInteger2(numberList, 22);

        System.out.println("+++++++++++++++++++ MAX NUMBER +++++++++++++++++");
        System.out.println("Number: " + binaryInteger);
    }

    public static int getMaxBinaryInteger2(List<Integer> integer, int period) {
        int maxNumber = 0;
        int maxIntCount = 0;

        for (int i = 0; i < integer.size(); i++) {
            String binaryNumber = Integer.toString(integer.get(i),2);

            if (binaryNumber.length() < period) {
                int charCount = binaryNumber.length() - binaryNumber.replaceAll("1", "").length();
                if (charCount >= maxIntCount) {
                    maxIntCount = charCount;
                    maxNumber = integer.get(i);
                }
                System.out.println("number: [ " + integer.get(i) + " ] = " + binaryNumber + " count of [1] : " + charCount);
            }
        }
        return maxNumber;
    }
}

