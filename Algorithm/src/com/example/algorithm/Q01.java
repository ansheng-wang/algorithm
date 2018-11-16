package com.example.algorithm;

// 回文十进制数
/**
 * 求用十进制、二进制、八进制表示都是回文数的所有数字中，大于十进制数10 的最小值。
 * 
 * @author user
 *
 */
public class Q01 {

	public static void main(String[] args) {

		for (int i = 11;; i = i + 2) {

			if (String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString())) {

				if (Integer.toBinaryString(i)
						.equals(new StringBuilder(Integer.toBinaryString(i)).reverse().toString())) {

					if (Integer.toOctalString(i)
							.equals(new StringBuilder(Integer.toOctalString(i)).reverse().toString())) {

						System.out.println(i);
						System.out.println(Integer.toBinaryString(i));
						System.out.println(Integer.toOctalString(i));
						break;
					}
				}
			}
		}
	}
}
