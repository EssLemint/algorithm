package baekjoon_221121;

import java.util.Scanner;

public class B2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b && a==c && b==c) { //���� �� 3��
			//10000��+(���� ��)x1000��
			System.out.println(10000+(a*1000));
		}else if(a==b || a==c || b==c) { //���� �� 2��
			//1000��+(���� ��)x100��
			if(a==b) {
				System.out.println(1000+(a*100));
			}else if(a==c) {
				System.out.println(1000+(a*100));			
			}else if(b==c) {
				System.out.println(1000+(b*100));
			}
		}else { //��� �ٸ� ��
			//�� �� ���� ū ��x100��
			if(a>b && a>c) {
				System.out.println(a*100);
			}else if(b>a && b>c) {
				System.out.println(b*100);
			}else if(c>a && c>b){
				System.out.println(c*100);
			}
		}
	}
}
