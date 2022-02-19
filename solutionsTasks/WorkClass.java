package solutionsTasks;

public class WorkClass {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 11, 15};
        int target = 10;
        int[] resultArray = twoSum(numbers, target);
        printArray(resultArray);

    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int dif;
        for (int i = 0; i < numbers.length; i++) {
            dif = target - (numbers[i]);
            for (int j = i + 1; j < numbers.length; j++) {
                if (dif == numbers[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void printArray(int[] resultArray) {
        System.out.print("[ ");
        for (int i : resultArray) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}
