package com.robbin.practice;

/**
 * һ��Ů�����ʻ�������һ����20�������������12���������������칲����112���ʻ���ƽ��ÿ������14������������ʵ�ּ������죬��������
 * 
 * @author Zhang.chaojian
 * 
 */
public class DailyPractice20160427 {

	public static void main(String[] args) {
//		��Ԫһ�η������
		
		// int a :������
		// int b ��������
		// a*20+b*12 = 112
		// (a+b)*14 = 112
		// a =2
		// b = 6

		int i = 0; // ����
		int j = 0; // ����
		for (i = 0; i < 8; i++) {
			for (j = 0; j < 8; j++) {
				if (i * 20 + j * 12 == 112 && ((i + j) * 14 == 112)) {
					System.out.println("�����������" + i);
					System.out.println("�����������" + j);
				}
			}

		}

	}

}
