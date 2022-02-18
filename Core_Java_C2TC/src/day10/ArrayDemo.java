package day10;

public class ArrayDemo {

	public static void main(String[] args) {
	
		int[] a=new int[5];
		a[0]=5;
		a[1]=6;
		a[2]=7;
		a[3]=8;
		a[4]=9;
		for(int i=0; i<5; i++) {
		//for(int i=0; i<a.length; i++) {
			try {
				System.out.println("Print array A:" +a[i]);
			/*} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();*/
			} finally {
				System.out.println("Iam out of array");
			}
			}
		//System.out.println("Iam out of array");
	}

}
