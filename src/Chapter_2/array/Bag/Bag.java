package Chapter_2.array.Bag;

public class Bag<T> {
    private T[] items;
    private int Capacity;
    private int size;
    private int empty = 0;

    public Bag(int capacity) {
        this.Capacity = capacity;
        this.items = (T[]) new Object[capacity];
        this.size = 0;
    }

    public void Add(T item) {
        if (IsFual()) {
            System.out.println("Sorry Bag is full !!! back later");
            return;
        }
        addItem(item);
        System.out.println(item + " : Added successfully ...");
    }

    public void remove(T item) {
        if (!IsEmpty()) {
            int index = indexOf(item);
            if (index != -1) {
                for (int i = index; i < size - 1; i++) {
                    this.items[i] = this.items[i + 1];
                }
                size--;
            } else {
                System.out.println("Item Not Found ... ");
            }
        } else {
            System.out.println("Bag Is Empty ... ");
        }
    }

    private int indexOf(T item) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.items[i] == item) {
                index = i;
            }
        }
        return index;
    }

    public void removeAt(int index) {
        T item = get(index);
        if (item != null) {
            remove(item);
        } else {
            System.out.println(" Index Not Found ....");
        }
    }

    public T get(int index) {
        if (!IsEmpty() && index >= 0 && index < size) {
            for (int i = 0; i < size; i++) {
                if (items[i] == items[index]) {
                    return items[i];
                }
            }
        }
        return null;
    }

    public void ToArray() {
        for (int i = 0; i < size; i++) {
            System.out.println("Item : " + items[i]);
        }
    }

    public boolean Contins(T item) {
        boolean IsFound = false;
        if (!IsEmpty()) {
            for (int i = 0; i < size; i++) {
                if (items[i] == item) {
                    IsFound = true;
                    break;
                }
            }
        }
        return IsFound;
    }

    private void addItem(T item) {
        this.items[size] = item;
        size++;
    }

    public boolean IsFual() {
        return this.Capacity == this.size;
    }

    public int Size() {
        return this.size;
    }

    public boolean IsEmpty() {
        return this.size == empty;
    }


}
