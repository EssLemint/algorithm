#include <iostream>
#include<string>
using namespace std;

int main()
{
	char a[7]; //�� ���� �ִ� ���̰� 6���ڶ�� �߱� ������ ũ�⸦ 7�� ������ 
	cin >> a; ;

	cout << strtol(a, nullptr, 16);

	return 0;
}