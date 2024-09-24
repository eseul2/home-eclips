
public class Hello {

	public static void main(String[] args) {

		
	
		
		System.out.println("hello,world");
		System.out.println("hello,world");
	
		System.out.println("hello,world");
		System.out.println("hello,world");
		System.out.println("hello,world");
		System.out.println("hello,world");

		int age = 20;
		age = 20 + 12;
		System.out.println(age);
		

		int x = 5;
		int y = 3;
		
		System.out.println(x+y);
		
		final int score = 100;
	//	score = 200;
		System.out.println(score);
		
		
		boolean power = false;
		
		float f = 3.14f;
		
		char ch = 'v';
		
		System.out.println(f);
		
		System.out.println(10.0/3);
		
		
		int i = 5; 
		int j = 0;
		
		j = i++; // 후위형
		System.out.println("j=i++; 실행 후, i="+ j);
		
		
		i = 5;   // 결과를 비교하기 위해 i와 j값을 다시 5와 0으로 변경
		j = 0;
		
		j = ++i;
		System.out.println("j=++i; 실행 후, i="+ j);
		
		
		
		i = -10;
		i = -i;
		System.out.println(i);
		
		double d = 84.5;
		int score2 = (int) d;
		System.out.println(score2);
		
		
		double pi = 3.141592;
		double shortpi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortpi);
		
	}
}