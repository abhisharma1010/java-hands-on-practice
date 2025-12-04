public class SecondLargestInArray {

    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 45, 10};
        System.out.println("Second Largest: " + secondLargest(arr));
    }
}
