package day01;

public class TestClass03 {
	public static void main(String[] args) {
		System.out.println(100+100);
		System.out.println(100.123+100.123);
		
		System.out.println("안녕"+"하세요");
		System.out.println("100"+100);
		System.out.println("백"+100);
		
		System.out.println("안녕"+100+300);
		//안녕100(문자열) -> 안녕100300
		//문자열+숫자=문자열, 문자열+숫자=문자열 그래서 안녕100300
		//안녕400으로 하고 싶다면 "안녕"+(100+300)해야함
		System.out.println("안녕"+(100+300));
	}

}
