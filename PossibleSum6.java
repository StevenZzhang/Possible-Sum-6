import java.util.*;
public class PossibleSum6 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 6, 2};
        System.out.println(possibleSumSix(0, arr, 8));
    }
    //Part 1
    public static boolean possibleSum(int startindex, int[] arr, int sum) {
        if (sum == 0) {
            return true;
        }
        if (sum < 0 || startindex >= arr.length) {
            return false;
        }
        else {
            return possibleSum(startindex + 1, arr, sum - arr[startindex]) || possibleSum(startindex + 1, arr, sum);
        }
    }
    //Part 2
    public static boolean possibleSumSix(int startindex, int[] arr, int sum) {
        if (sum == 0) {
            return true;
        }
        if (sum < 0 || startindex >= arr.length) {
            return false;
        }
        else {
            if (arr[startindex] == 6) {
                return possibleSumSix(startindex + 1, arr, sum - 6);
            }
            else {
                return possibleSumSix(startindex + 1, arr, sum - arr[startindex]) || possibleSumSix(startindex + 1, arr, sum);
            }
        }
    }
}