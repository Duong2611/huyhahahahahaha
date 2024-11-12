package hus.oop.lab12.mylist;

public class TestMyList2 {
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

        // Test size() method
        System.out.println("Size of ArrayList: " + arrayList.size());

        // Test get() method
        System.out.println("Element at index 2: " + arrayList.get(2));

        // Test remove() method
        arrayList.remove(1);
        System.out.println("After removing element at index 1: " + arrayList);

        // Test insert() method
        arrayList.insert(50.0, 1);
        System.out.println("After inserting 50.0 at index 1: " + arrayList);

        // Test iterator
        System.out.println("Test iterator");
        MyIterator myArrayListIterator = arrayList.iterator();
        while (myArrayListIterator.hasNext()) {
            System.out.println(myArrayListIterator.next());
        }

        // Test statistics
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

        // Test size() method
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Test get() method
        System.out.println("Element at index 2: " + linkedList.get(2));

        // Test remove() method
        linkedList.remove(1);
        System.out.println("After removing element at index 1: " + linkedList);

        // Test insert() method
        linkedList.insert(50.0, 1);
        System.out.println("After inserting 50.0 at index 1: " + linkedList);

        // Test iterator
        System.out.println("Test iterator");
        MyIterator myLinkedListIterator = linkedList.iterator();
        while (myLinkedListIterator.hasNext()) {
            System.out.println(myLinkedListIterator.next());
        }

        // Test statistics
        BasicStatistic statistic = new BasicStatistic(linkedList);
        System.out.println("Data: " + linkedList);
        System.out.println("Max: " + statistic.max());
        System.out.println("Min: " + statistic.min());
        System.out.println("Mean: " + statistic.mean());
        System.out.println("Variance: " + statistic.variance());
        System.out.println();
    }
}
