#define _CRT_SECURE_NO_WARNINGS
#include <iostream>

using namespace std;

int main() {

	int B = 0;
	int D = 0;
	int b, d;
	for (int i = 0; i < 3; i++) {
		scanf("%d", &b);
		if (B == 0) {
			B = b; //ó���Է��Ҷ� 
		}
		if (b < B) {
			B = b; //B�����ִµ�b����������װ�B����
		}
	}
	for (int i = 0; i < 2; i++) {
		scanf("%d", &d);
		if (D == 0) {
			D = d;
		}
		if (d < D) {
			D = d;
		}
	}
	printf("%d", B + D - 50);

	return 0;
}



