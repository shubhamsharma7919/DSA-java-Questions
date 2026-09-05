public class printIncreasingRecursion
{
    public static void printInc(int n) {
       if (n == 0) {
           return;
       }
       printInc(n-1);
       System.out.println(n);
       
    }
	public static void main(String[] args) {
	      int n = 4;
	      printInc(n);
	      
	}
}