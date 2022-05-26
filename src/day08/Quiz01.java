package day08;

import java.util.ArrayList;

public class Quiz01 {

	public static void main(String[] args) {
		
//		// 1번 문제
//		String nice = "Have a nice day Have a nice day Have a nice day";
//		ArrayList wherea = new ArrayList();
//		
//		for(int i=0;i<nice.length();i++) {
//			if(nice.charAt(i)=='a')
//				wherea.add(i);
//		}
//		System.out.print(wherea);

		
		// 2번 문제
		
//		String funjava = "It is a fun java programming";
//		int a=0;
//		int g=0;
//		
//		System.out.println("총 개수: " + funjava.length());
//		
//		for(int i=0 ; i<funjava.length();i++) {
//			if(funjava.charAt(i)=='a') {
//				a++;
//			}else if(funjava.charAt(i)=='g')
//				g++;
//		}
//		System.out.println("a 개수: " + a);
//		System.out.println("g 개수: " + g);
//		
		
//		// 문제3 현재의 공백은 몇 개가 있는지 알 수 없는 상황에서 첫번째 알파벳만 대문자로 변경
//		String str = new String("tESt  sTring  change   first");
//		String changeStr = new String();
//		// changeStr은 아직 비어있음 밑의 과정을 통해 1문자씩 추가해줄거임
//		int i=0;
//
//		str = str.toLowerCase(); //전부 소문자로 변환
//		if(str.charAt(0) >='a' && str.charAt(0) <='z') {
//			changeStr+=(char)(str.charAt(i)-32);
//			i++;
//		} // 첫글자인 t만을 위해 있는 부분 t를 T로 만든다
//		
//		while(i<str.length()) { // 여기는 2부터 들어감
//			if(str.charAt(i) != ' ') {
//				changeStr+=str.charAt(i);
//				i++;
//				continue;
//			} // 공백이 아닐 경우 그대로 changeStr에 추가됨
//			// continue를 통해 첫 if절로 돌아감
//			while(str.charAt(i) == ' ') { // 만약 공백일 경우 이쪽으로 옴
//				changeStr+=str.charAt(i);
//				i++;
//			} // 공백 부분이 끝날 때까지 그대로 changeStr에 추가
//			// 만약 공백이 아닐 경우 아래 문장으로 이동
//			if(str.charAt(i) >= 'a' && str.charAt(i) <='z')
//				changeStr+=(char)(str.charAt(i)-32);
//			i++;
//		} // 공백이 끝난 뒤의 첫문자는 대문자가 되어야 하므로 대문자로 바꾼 뒤
//		// changeStr에 추가해줌
//		
//		System.out.println(str);
//		System.out.println(changeStr);
//		System.out.println("종료");

		
		
		// 문제 4 아래 내용을 replace를 이용해서 저장 후 출력
//		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
//		System.out.println(str);
//		System.out.println();
//		
//		String rstr = str.replace(" -", " : ");
//		System.out.println(rstr);
//		System.out.println();
//		
//		rstr = rstr.replace("2017", "1999");
//		rstr = rstr.replace("2015", "1999");
//		rstr = rstr.replace("2018", "1999");
//		
//		str = rstr;
//		System.out.println(str);
//		
		
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		System.out.println("====변경 전 str====\n"+str);
		
		str = str.replace("-", ":"); // -를 :으로 변경
		
		String[] arrStr = str.split("\n"); // \n을 기준으로 분리해서 리스트에 저장
		// arrStr[0] = "김개똥:2017년"
		str=""; //str 초기화
		
		for(int i=0;i<arrStr.length;i++) {
			String[] reStr = arrStr[i].split(":"); //reStr 리스트에 :을 기준으로 분리해서 저장
			// reStr[0] = "김개똥"
			// reStr[1] = "2017년"
			reStr[1]=reStr[1].replace(reStr[1], "1999년"); 
			//reStr[1]="1999년";
			str+=(reStr[0]+":"+reStr[1]+"\n");
			// str에 "김개똥:1999년\n"으로 저장
		}
		System.out.println("====변경 후 str====\n"+str);
		
		
		
		
	}

}
