package hus.oop.lab12.mylist;

import hus.oop.reviewfinal.de1.basicstatistics.MyLinkedList;

public class MyLinkedListIterator implements MyIterator {
    /* GỢI Ý: */
    /*
    MyLinkedListIterator cần phải tham chiếu đến node hiện tại của MyLinkedList để có thể duyệt qua
    các phần tử còn lại trong MyLinkedList.
     */
    private MyLinkedListNode currentNode;

    /**
     * Khởi tạo dữ liệu cho Iterator là node hiện tại trong MyLinkedList.
     * @param node
     */
    public MyLinkedListIterator(MyLinkedListNode node) {
        this.currentNode = node;
    }

    /**
     * Kiểm tra trong MyLinkedList có còn phần tử tiếp theo không.
     * Nếu còn thì trả về true, nếu không còn thì trả về false.
     * @return
     */
    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    /**
     * iterator dịch chuyển sang phần tử kế tiếp của MyLinkedList và trả ra dữ liệu (payload) của phần tử hiện tại của MyLinkedList.
     * @return payload của phần tử hiện tại.
     */
    @Override
    public Object next() {
//        if (hasNext()) {
//            Object current = this.currentNode.getPayload();
//            this.currentNode = currentNode.getNext();
//            return current;
//        }
//        return null;

        if (!hasNext()) {
            throw new IndexOutOfBoundsException();
        }
        Object current = currentNode.getPayload();
        currentNode = currentNode.getNext();
        return current;
    }

//    @Override
//    public void remove() {
//        /* TODO */
//        MyLinkedList.this.remove(size);
//        size--;
//    }
}
