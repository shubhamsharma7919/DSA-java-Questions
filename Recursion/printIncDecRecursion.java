public class printIncDecRecursion
{
    public static void printIncDec(int n) {
       if (n == 1) {
           System.out.println("1");
           return;
       }
       System.out.println(n);
       printIncDec(n-1);
       System.out.println(n);
       
    }
	public static void main(String[] args) {
	      int n = 4;
	      printIncDec(n);
	      
	}
}