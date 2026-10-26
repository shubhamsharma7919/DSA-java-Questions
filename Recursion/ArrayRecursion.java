public class ArrayRecursion
{
    public static int maxOfArray(int[] arr, int idx) {
       
       if (idx == arr.length) {
           return Integer.MIN_VALUE;
       }
       
       int number = maxOfArray(arr, idx+1);
       int max = Math.max(number, arr[idx]);
       return max;
    }
	public static void main(String[] args) {
	      int[] arr = {1,7,45,8,11};
	      int idx = 0;
	      System.out.println(maxOfArray(arr, idx));
	      
	}
}