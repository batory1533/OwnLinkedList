public class BList<T>{

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

    }
    Node<T> head = new Node<T>(null);
    Node<T> tail = head;
    int size;

    void add(T data){
        tail = tail.next = new Node<T>(data);
        size++;
    }

        T get(int index){
            if(index < 0 || index <= size)
                throw new IndexOutOfBoundsException(index);

            Node<T> current = head.next;
            while(index > 0){
                current = current.next;
                size--;
            }
            return current.data;
        }



}
