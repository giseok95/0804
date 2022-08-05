//7개의 피보나치 수열 출력 n=(n-1)+(n-2)
public class Practice {
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			System.out.print(fibo(i) + "\t");
		}
	}
static int fibo(int n) {
	if(n==1||n==2) return 1;
	else return fibo(n-1)+fibo(n-2);
}
}
//int before =1;
//int after =0;
//int next=0;
//
//for(int i=0; i<7; i++) {
//	System.out.println(before+"\t");
//	next=before+after;
//	before=after;
//	after=next;
