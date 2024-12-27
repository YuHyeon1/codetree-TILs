#include <iostream>

using namespace std;

int main() {
    // 정수 n과 q을 입력받습니다.
	int n, q;
	cin >> n >> q;
	int arr[100];
	
	// arr를 입력받습니다.
	for(int i = 0; i < n; i++)
		cin >> arr[i];
	
	// q개의 질의를 수행합니다.
	for(int i = 0; i < q; i++) {
		// 몇번째 질의인지 확인합니다.
		int q_type;
		cin >> q_type;
		
		if(q_type == 1) {
			// a를 입력받은 후, a번째 원소를 출력합니다.
			int a;
			cin >> a;
			
			// a번째 원소를 출력합니다.
			cout << arr[a - 1] << endl;
		}
		else if(q_type == 2) {
			// a를 입력받은 후, 배열에 숫자 a가 있다면 가장 index가 작은 원소가 몇번째인지 출력합니다. 없다면 0을 출력합니다.
			int a;
			cin >> a;
			
			// 가장 index가 작은 원소에 있는 숫자 a를 찾습니다.
			int idx = -1;
			for(int j = 0; j < n; j++) {
				if(arr[j] == a) {
					idx = j;
					break;
				}
			}
			
			// 숫자 a가 몇번째인지 출력합니다. 없다면 0을 출력합니다.
			cout << idx + 1 << endl;
		}
		else {
			// a, b를 입력받은 후, a번째 원소부터 b번째 원소까지 공백을 사이에 두고 출력합니다.
			int a, b;
			cin >> a >> b;
			
			// a번째 원소부터 b번째 원소까지 공백을 사이에 두고 출력합니다.
			for(int j = a - 1; j < b; j++) {
				cout << arr[j] << " ";
			}
			cout << endl;
		}
	}
	
    return 0;
}