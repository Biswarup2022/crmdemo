package crmdemo2;

public class ExpOnMethod {
	public static int sumOfRange(int start,int end) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum=sum+i;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumOfRange(1,10));
	}
	
}
