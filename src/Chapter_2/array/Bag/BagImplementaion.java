package Chapter_2.array.Bag;

public class BagImplementaion {
    public static void main(String[] args) {
        Bag<String> names = new Bag<>(5);

        System.out.println("------Adding-------");
        String name = "Ali";
        System.out.println("Adding: " + name);
        names.Add(name);

        String name2 = "Ahmad";
        System.out.println("Adding: " + name2);
        names.Add(name2);

        String name3 = "Omar";
        System.out.println("Adding: " + name3);
        names.Add(name3);

        System.out.println("------Size-------");
        System.out.println("Size : " + names.Size());

        System.out.println("------ToArray-------");
        names.ToArray();

        System.out.println("------Contains-------");
        System.out.println("Checking if the bag contains: " + name);
        boolean IsContins = names.Contins(name);
        System.out.println(name + " Is Contins : " + IsContins);

        System.out.println("------IsFull-------");
        System.out.println("Checking if the bag is full...");
        boolean BagFull = names.IsFual();
        System.out.println("Bag Full : " + BagFull);

        System.out.println("------IsEmpty-------");
        System.out.println("Checking if the bag is empty...");
        boolean BagEmpty = names.IsEmpty();
        System.out.println("Bag Empty : " + BagEmpty);

        System.out.println("------Removing-------");
        System.out.println("Removing: " + name3);
        names.remove(name3);
        System.out.println("Removing: " + 4);
        names.removeAt(4);

        System.out.println("------ToArray After Removal-------");
        names.ToArray();

    }
}