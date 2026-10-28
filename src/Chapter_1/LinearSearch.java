package Chapter_1;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 5;
        numbers[1] = 4;
        numbers[2] = 7;
        numbers[3] = 9;
        numbers[4] = 11;
        numbers[5] = 55;
        numbers[6] = 36;
        numbers[7] = 41;
        numbers[8] = 46;
        numbers[9] = 44;
        LinearSearchM(numbers, 55);
    }

    public static void LinearSearchM(int[] arr, int target) {
        boolean isFound = false;
        for (int item = 0; item < arr.length; item++) {
            if (arr[item] == target) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Target :" + target + " Is Found");
        } else {
            System.out.println("Target :" + target + " Is Not Found");

        }
    }
}
