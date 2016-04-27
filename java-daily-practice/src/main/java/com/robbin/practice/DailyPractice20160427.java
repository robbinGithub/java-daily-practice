package com.robbin.practice;

/**
 * 一个女孩卖鲜花，晴天一天卖20条，雨天可以卖12条，现在连续几天共卖出112条鲜花，平均每天卖出14条，现在请编程实现几天晴天，几天阴天
 * 
 * @author Zhang.chaojian
 * 
 */
public class DailyPractice20160427 {

	public static void main(String[] args) {
//		二元一次方程求解
		
		// int a :晴天数
		// int b ：雨天数
		// a*20+b*12 = 112
		// (a+b)*14 = 112
		// a =2
		// b = 6

		int i = 0; // 晴天
		int j = 0; // 阴天
		for (i = 0; i < 8; i++) {
			for (j = 0; j < 8; j++) {
				if (i * 20 + j * 12 == 112 && ((i + j) * 14 == 112)) {
					System.out.println("晴天的天数：" + i);
					System.out.println("雨天的天数：" + j);
				}
			}

		}

	}

}
