package day08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = new String("abcdefg");
		// String str = "abcdefg"; ���� �Ʒ��� ����
		/*
		System.out.println("���ڿ� �Է�");
		str = input.next();
		System.out.println(str);
		
		System.out.println(str.toUpperCase()); //�빮�� ��ȯ
		System.out.println(str.toLowerCase()); //�ҹ��� ��ȯ
		*/
		
		System.out.println(str.charAt(0)); //0��°�� �ִ� �� �ϳ��� ������
		System.out.println(str.charAt(0) == 'a'); // -> true
		System.out.println(str.charAt(1) == 'a'); // -> false
		System.out.println(str.charAt(0)-32); //���� ���·� ����
		System.out.println((char)(str.charAt(0)-32)); //���� ���·� ����(�ҹ��ڿ��� -32 �ϸ� �빮��)

		str += " ";
		str += "a";
		System.out.println(str);
		
		
		str = "   aaaa aaa aaa    ";
		System.out.println(str);
		
		String re = str.trim(); // trim -> �� �ڷ� ������ �߶���
		System.out.println(re);
		
		String name = "������   ";
		if(name.trim().equals("������")) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		String addr;
		addr = "18507 ����� ���α� ����3�� 3��";
		String[] ad = addr.split(" ");
		System.out.println(ad[0]);
		System.out.println(ad[1]);
		
		String replace = addr.replace(" ", "/");
		System.out.println(replace);
		
		
		
		
		
		
	}

}
