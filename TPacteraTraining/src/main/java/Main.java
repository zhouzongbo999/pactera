


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='a';
		int i=(int)c;
		System.out.println(i);
		int j=i+26;
		//A Ϊ65
		for(i=i-32;i<j;i++){
//			System.out.println((int)(26*Math.random()));
			System.out.println(i);
			System.out.println((char)i);
		}
		System.out.println(c+i);
		//end method
	}

}
