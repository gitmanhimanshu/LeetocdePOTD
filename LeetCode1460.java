import java.util.Arrays;

class LeetCode1460 {
    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(arr,target);
    }
    public static void main(String[] args) {
        int a[]={6,2,1,8};
        int b[]={1,8,2,6};
        System.out.println(canBeEqual(b, a));

    }
}