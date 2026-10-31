package Chapter_3.LinkedList.SingleLinkedList;

public class SingleLinkedList<T> {
    class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    Node<T> head;
    int size;

    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void InsertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void DeleteFromBeginning() {
        if (!IsEmpty()) {
            head = head.next;
            size--;
        } else {
            System.out.println("Empty Linked List");
        }
    }

    public void InsertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (IsEmpty()) {
            InsertAtBeginning(data);
        } else if (head.next == null) {
            head.next = newNode;
            size++;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            size++;
        }
    }

    public void DeleteFromEnd() {
        if (IsEmpty()) {
            System.out.println("List Is Empty ...");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            Node<T> cureent = head;
            while (cureent.next.next != null) {
                cureent = cureent.next;
            }
            cureent.next = null;
            size--;
        }
    }

    public void display() {
        Node<T> current = head;
        if (IsEmpty()) {
            System.out.println("List Is Empty");
        } else {
            while (current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println("");
        }
    }

    public boolean IsEmpty() {
        return head == null;
    }

    public int Size() {
        return this.size;
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        SingleLinkedList<String> NameList = new SingleLinkedList<>();

        System.out.println("------InsertAtBeginning-------");
        System.out.println("Inserting at beginning: Ali");
        NameList.InsertAtBeginning("Ali");
        System.out.println("Inserting at beginning: Omar");
        NameList.InsertAtBeginning("Omar");

        System.out.println("------InsertAtEnd-------");
        System.out.println("Inserting at end: Fadi");
        NameList.InsertAtEnd("Fadi");
        System.out.println("Inserting at end: Ahmad");
        NameList.InsertAtEnd("Ahmad");

        System.out.println("------IsEmpty-------");
        System.out.println("List Is Empty : " + NameList.IsEmpty());

        System.out.println("------Size-------");
        System.out.println("The Size Of List : " + NameList.Size());

        System.out.println("------Display-------");
        NameList.display();

        System.out.println("------DeleteFromBeginning-------");
        System.out.println("Deleting from beginning...");
        NameList.DeleteFromBeginning();
        NameList.display();

        System.out.println("------DeleteFromEnd-------");
        System.out.println("Deleting from end...");
        NameList.DeleteFromEnd();
        NameList.display();
    }

}
