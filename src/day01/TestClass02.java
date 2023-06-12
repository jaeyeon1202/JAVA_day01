package day01;

public class TestClass02 {
	public static void main(String[] args) {
		/*
		여러줄을 주석으러 묶겠다(문단주석)
		escape
		- 문자열 안에서 특수한 기능을 한다.
		\n: 엔터(역슬러시 + n)
		\t: tab만큼 오른쪽으로 커서 이동(원도우에선 스페이스바 8칸)
		\": "(큰 따옴표)하나 표현
		\\: 역슬러시 하나 표현
		*/
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("1\t1234567\t12345678\t1");
		//역슬레시가 있으면 8칸을 먼저 확보하고 나머지 공간은 건너 뜀.
		System.out.println("이름\t나이");
		System.out.println("홍길동\t20살");
		
		System.out.println(" \"   \\ ");
	
}
}
