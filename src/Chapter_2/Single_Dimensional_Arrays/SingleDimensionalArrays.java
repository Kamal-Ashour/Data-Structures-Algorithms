package Chapter_2.Single_Dimensional_Arrays;

import java.util.Scanner;

public class SingleDimensionalArrays {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count = 0;
        boolean UserSelect = true;
        while (UserSelect) {
            System.out.println("---------- Array Operation -----------");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter Selected Value : ");

            int UserSelectList = input.nextInt();

            switch (UserSelectList) {
                case 1:
                    count = add(numbers, count);
                    break;
                case 2:
                    display(numbers, count);
                    break;
                case 3:
                    update(numbers, count);
                    break;
                case 4:
                    count = delete(numbers, count);
                    break;
                case 5:
                    UserSelect = false;
                    break;
                default:
                    System.out.println("Invalid Input |^_^|");
            }


        }
    }

    public static void display(int[] array, int count) {
        System.out.println("Display Succesfuly ... ");
        for (int i = 0; i < count; i++) {
            System.out.println("number " + i + " = " + array[i]);
        }
    }

    public static int add(int[] array, int count) {
        if (count < array.length) {
            System.out.print("Enter number to add: ");
            int value = input.nextInt();
            array[count] = value;
            count++;
            System.out.println("Added successfully ...");
        } else {
            System.out.println("Array is full |^_^| ");
        }
        return count;
    }

    public static void update(int[] numbers, int count) {
        System.out.println("Enter Index Of Element");
        int elementIndex = input.nextInt();
        if (elementIndex >= 0 && elementIndex < count) {
            System.out.println("Enter New Value Of Element");
            int newValue = input.nextInt();
            numbers[elementIndex] = newValue;
            System.out.println("Update Succesfuly ... ");
        } else {
            System.out.println("Wrong Element Index");
        }
    }

    public static int delete(int[] numbers, int count) {
        System.out.println("Enter Index Of Element To Delete");
        int deleteIndex = input.nextInt();
        if (deleteIndex >= 0 && deleteIndex < count) {
            for (int i = deleteIndex; i < count; i++) {
                numbers[i] = numbers[i + 1];
            }
            System.out.println("Delete Succesfuly ... ");
             count--;
        } else {
            System.out.println("Wrong Element Index");
        }
        return count;
    }

}
