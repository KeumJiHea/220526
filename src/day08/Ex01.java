package day08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = new String("abcdefg");
		// String str = "abcdefg"; 위와 아래는 같다
		/*
		System.out.println("문자열 입력");
		str = input.next();
		System.out.println(str);
		
		System.out.println(str.toUpperCase()); //대문자 변환
		System.out.println(str.toLowerCase()); //소문자 변환
		*/
		
		System.out.println(str.charAt(0)); //0번째에 있는 값 하나만 꺼내옴
		System.out.println(str.charAt(0) == 'a'); // -> true
		System.out.println(str.charAt(1) == 'a'); // -> false
		System.out.println(str.charAt(0)-32); //숫자 형태로 나옴
		System.out.println((char)(str.charAt(0)-32)); //문자 형태로 나옴(소문자에서 -32 하면 대문자)

		str += " ";
		str += "a";
		System.out.println(str);
		
		
		str = "   aaaa aaa aaa    ";
		System.out.println(str);
		
		String re = str.trim(); // trim -> 앞 뒤로 공백을 잘라줌
		System.out.println(re);
		
		String name = "박유덕   ";
		if(name.trim().equals("박유덕")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		String addr;
		addr = "18507 서울시 종로구 종로3가 3층";
		String[] ad = addr.split(" ");
		System.out.println(ad[0]);
		System.out.println(ad[1]);
		
		String replace = addr.replace(" ", "/");
		System.out.println(replace);
		
		
		
		
		
		
	}

}
