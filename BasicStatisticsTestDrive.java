package hus.oop.lab12.mylist;

import hus.oop.reviewfinal.de1.basicstatistics.BasicStatistic;
import hus.oop.reviewfinal.de1.basicstatistics.MyArrayList;
import hus.oop.reviewfinal.de1.basicstatistics.MyLinkedList;

import java.util.Random;

public class BasicStatisticsTestDrive {
    public static void main(String[] args) {
        System.out.println("Test MyArrayList");
        testMyArrayList();
        System.out.println("\nTest MyLinkedList");
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        Random random = new Random();
        int length = random.nextInt(21) + 30;
        hus.oop.reviewfinal.de1.basicstatistics.MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < length; i++) {
            myArrayList.append(random.nextDouble() * 19 + 1);
        }

        hus.oop.reviewfinal.de1.basicstatistics.BasicStatistic statistics = new hus.oop.reviewfinal.de1.basicstatistics.BasicStatistic(myArrayList);
        System.out.println("ArrayList: " + myArrayList);
        System.out.println("Max: " + statistics.max());
        System.out.println("Min: " + statistics.min());
        System.out.println("Mean: " + statistics.mean());
        System.out.println("Variance: " + statistics.variance());
    }

    public static void testMyLinkedList() {
        Random random = new Random();
        int length = 30 + random.nextInt(21); // [30, 50]
        hus.oop.reviewfinal.de1.basicstatistics.MyLinkedList linkedList = new MyLinkedList();
        for (int i = 0; i < length; i++) {
            linkedList.append(1 + random.nextDouble() * 19); // [1, 20]
        }
        hus.oop.reviewfinal.de1.basicstatistics.BasicStatistic statistics = new BasicStatistic(linkedList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Max: " + statistics.max());
        System.out.println("Min: " + statistics.min());
        System.out.println("Mean: " + statistics.mean());
        System.out.println("Variance: " + statistics.variance());
    }
}
