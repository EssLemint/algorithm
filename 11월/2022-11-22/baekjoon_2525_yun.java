package baekjoon_221122;

import java.util.Scanner;

public class B2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h, m, mm;
		h = sc.nextInt();
		m = sc.nextInt();
		mm = sc.nextInt();
		
		h += mm / 60; //�丮�ð��� 60�� �̻��̸� �Ѵ� ��ŭ h�� ����
		m += mm % 60; //���� �� m�� ����
		
		if(m>=60) {
			h += 1; //m�� 60 �̻��̸� h �ѽð� ���ϰ�
			m -= 60; //m�� 60 ��
		}
		
		if(h>=24) {
			h -= 24; //h�� 24�� �̻��̸� 24 ��(24�� 0���� ǥ��)
		}
		
		System.out.println(h+" "+m);
	}
}