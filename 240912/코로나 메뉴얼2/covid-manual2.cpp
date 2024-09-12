#include <iostream>
using namespace std;

int main() {
    int arr[4];
    for (int i=0;i<4;i++) {
            arr[i] = 0;
        }
    for (int i=0;i<3;i++) {
        char a;
        int b;
        cin >> a;
        cin >> b;
        if (a == 'Y') {
            if (b >=37) {
                arr[0]++;
            } else {
                arr[2]++;
            }
        } else {
            if (b>=37) {
                arr[1]++;
            } else {
                arr[3]++;
            }
        }

        
    }
    for (int i=0;i<4;i++) {
            cout << arr[i] <<" ";
        } if (arr[0]>=2) {
            cout << "E";
        }
    return 0;
}