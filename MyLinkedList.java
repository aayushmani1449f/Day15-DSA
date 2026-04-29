public class MyLinkedList<K, V> {
    public MyMapNode<K, V> head;
    public MyMapNode<K, V> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(MyMapNode<K, V> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public MyMapNode<K, V> search(K key) {
        MyMapNode<K, V> tempNode = head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void delete(K key) {
        MyMapNode<K, V> tempNode = head;
        MyMapNode<K, V> previousNode = null;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key)) {
                if (previousNode == null) {
                    this.head = tempNode.getNext();
                } else {
                    previousNode.setNext(tempNode.getNext());
                }
                if (tempNode == this.tail) {
                    this.tail = previousNode;
                }
                return;
            }
            previousNode = tempNode;
            tempNode = tempNode.getNext();
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" + head + '}';
    }
}
