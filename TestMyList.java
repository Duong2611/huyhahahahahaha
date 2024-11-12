package hus.oop.lab12.mylist;

public class TestMyList {
    public static void main(String[] args) {
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        System.out.println("Testing MyArrayList:");
        MyArrayList arrayList = new MyArrayList();
        arrayList.append(10.0);
        arrayList.append(20.0);
        arrayList.append(30.0);
        arrayList.append(40.0);

        MyIterator myArrayListIterator = arrayList.iterator();
        while (myArrayListIterator.hasNext()) {
            System.out.println(myArrayListIterator.next());
        }
        BasicStatistic statistic = new BasicStatistic(arrayList);
        System.out.println("Data: " + arrayList);
        System.out.println("Max: " + statistic.max());
        System.out.println("Min: " + statistic.min());
        System.out.println("Mean: " + statistic.mean());
        System.out.println("Variance: " + statistic.variance());
        System.out.println();
    }

    public static void testMyLinkedList() {
        System.out.println("Testing MyLinkedList:");
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.append(10.0);
        linkedList.append(20.0);
        linkedList.append(30.0);
        linkedList.append(40.0);
        MyIterator myArrayListIterator = linkedList.iterator();
        while (myArrayListIterator.hasNext()) {
            System.out.println(myArrayListIterator.next());
        }

        BasicStatistic statistic = new BasicStatistic(linkedList);
        System.out.println("Data: " + linkedList);
        System.out.println("Max: " + statistic.max());
        System.out.println("Min: " + statistic.min());
        System.out.println("Mean: " + statistic.mean());
        System.out.println("Variance: " + statistic.variance());
        System.out.println();
    }
}

