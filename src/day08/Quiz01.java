package day08;

import java.util.ArrayList;

public class Quiz01 {

	public static void main(String[] args) {
		
//		// 1�� ����
//		String nice = "Have a nice day Have a nice day Have a nice day";
//		ArrayList wherea = new ArrayList();
//		
//		for(int i=0;i<nice.length();i++) {
//			if(nice.charAt(i)=='a')
//				wherea.add(i);
//		}
//		System.out.print(wherea);

		
		// 2�� ����
		
//		String funjava = "It is a fun java programming";
//		int a=0;
//		int g=0;
//		
//		System.out.println("�� ����: " + funjava.length());
//		
//		for(int i=0 ; i<funjava.length();i++) {
//			if(funjava.charAt(i)=='a') {
//				a++;
//			}else if(funjava.charAt(i)=='g')
//				g++;
//		}
//		System.out.println("a ����: " + a);
//		System.out.println("g ����: " + g);
//		
		
//		// ����3 ������ ������ �� ���� �ִ��� �� �� ���� ��Ȳ���� ù��° ���ĺ��� �빮�ڷ� ����
//		String str = new String("tESt  sTring  change   first");
//		String changeStr = new String();
//		// changeStr�� ���� ������� ���� ������ ���� 1���ھ� �߰����ٰ���
//		int i=0;
//
//		str = str.toLowerCase(); //���� �ҹ��ڷ� ��ȯ
//		if(str.charAt(0) >='a' && str.charAt(0) <='z') {
//			changeStr+=(char)(str.charAt(i)-32);
//			i++;
//		} // ù������ t���� ���� �ִ� �κ� t�� T�� �����
//		
//		while(i<str.length()) { // ����� 2���� ��
//			if(str.charAt(i) != ' ') {
//				changeStr+=str.charAt(i);
//				i++;
//				continue;
//			} // ������ �ƴ� ��� �״�� changeStr�� �߰���
//			// continue�� ���� ù if���� ���ư�
//			while(str.charAt(i) == ' ') { // ���� ������ ��� �������� ��
//				changeStr+=str.charAt(i);
//				i++;
//			} // ���� �κ��� ���� ������ �״�� changeStr�� �߰�
//			// ���� ������ �ƴ� ��� �Ʒ� �������� �̵�
//			if(str.charAt(i) >= 'a' && str.charAt(i) <='z')
//				changeStr+=(char)(str.charAt(i)-32);
//			i++;
//		} // ������ ���� ���� ù���ڴ� �빮�ڰ� �Ǿ�� �ϹǷ� �빮�ڷ� �ٲ� ��
//		// changeStr�� �߰�����
//		
//		System.out.println(str);
//		System.out.println(changeStr);
//		System.out.println("����");

		
		
		// ���� 4 �Ʒ� ������ replace�� �̿��ؼ� ���� �� ���
//		String str = "�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��";
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
		
		String str = "�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��";
		System.out.println("====���� �� str====\n"+str);
		
		str = str.replace("-", ":"); // -�� :���� ����
		
		String[] arrStr = str.split("\n"); // \n�� �������� �и��ؼ� ����Ʈ�� ����
		// arrStr[0] = "�谳��:2017��"
		str=""; //str �ʱ�ȭ
		
		for(int i=0;i<arrStr.length;i++) {
			String[] reStr = arrStr[i].split(":"); //reStr ����Ʈ�� :�� �������� �и��ؼ� ����
			// reStr[0] = "�谳��"
			// reStr[1] = "2017��"
			reStr[1]=reStr[1].replace(reStr[1], "1999��"); 
			//reStr[1]="1999��";
			str+=(reStr[0]+":"+reStr[1]+"\n");
			// str�� "�谳��:1999��\n"���� ����
		}
		System.out.println("====���� �� str====\n"+str);
		
		
		
		
	}

}
