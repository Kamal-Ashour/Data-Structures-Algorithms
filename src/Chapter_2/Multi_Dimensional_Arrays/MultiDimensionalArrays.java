package Chapter_2.Multi_Dimensional_Arrays;

import java.util.Scanner;

public class MultiDimensionalArrays {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String students[][] = new String[3][2];
        int size = 0;
        boolean UserSelect = true;
        while (UserSelect) {
            System.out.println("---------- Student Operation -----------");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter Selected Operation Value : ");

            int UserSelectList = input.nextInt();

            switch (UserSelectList) {
                case 1:
                    size = addStudent(students, size);
                    break;
                case 2:
                    displayStudents(students, size);
                    break;
                case 3:
                    updateStudent(students, size);
                    break;
                case 4:
                    size = deleteStudent(students,size);
                    break;
                case 5:
                    UserSelect = false;
                    break;
                default:
                    System.out.println("Invalid Input |^_^|");
            }
        }
    }

    public static void displayStudents(String[][] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Name = " + array[i][0]);
            System.out.println( "Grade = " + array[i][1]);
        }
        System.out.println("Display Succesfuly ... ");
    }

    public static int addStudent(String[][] array, int size) {
        if (size < array.length) {
            System.out.print("Enter Student Name to add: ");
            String StuName = input.next();
            System.out.print("Enter Student Grade: ");
            String StuGrade = input.next();
            array[size][0] = StuName;
            array[size][1] = StuGrade;
            size++;
            System.out.println("Student Added successfully ...");
        } else {
            System.out.println("Student Added Failed ...");
        }
        return size;
    }


    public static void updateStudent(String[][] array, int size) {
        System.out.println("Enter Index Of Element");
        int updateIndex = input.nextInt();
        if (updateIndex >= 0 && updateIndex < size) {
            System.out.print("Enter Student Name to add: ");
            String StuName = input.next();
            System.out.print("Enter Student Grade: ");
            String StuGrade = input.next();

            array[updateIndex][0] = StuName;
            array[updateIndex][1] = StuGrade;
            System.out.println("Update Succesfuly ... ");
        } else {
            System.out.println("Wrong Element Index");
        }
    }

    public static int deleteStudent(String[][] array, int size) {
        System.out.println("Enter Index Of Element To Delete");
        int deleteIndex = input.nextInt();
        if (deleteIndex >= 0 && deleteIndex < size) {
            for (int i = deleteIndex; i < size-1; i++) {
                array[i][0] = array[i + 1][0];
                array[i][1] = array[i + 1][1];
            }
            System.out.println("Delete Succesfuly ... ");
            size--;
        } else {
            System.out.println("Wrong Element Index");
        }
        return size;
    }
}
