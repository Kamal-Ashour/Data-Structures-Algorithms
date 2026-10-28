package Chapter_1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 17, 89, 92, 97, 99};
        BinarySearchM(numbers, 98);
    }

    public static void BinarySearchM(int[] arr, int target) {
        boolean isFound = false;
        int NextStep = 1;
        int PreviousStep = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                isFound = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + NextStep;
            } else {
                right = mid + PreviousStep;
            }
        }

        if (isFound) {
            System.out.println("Target :" + target + " Is Found");
        } else {
            System.out.println("Target :" + target + " Is Not Found");
        }

    }
}
