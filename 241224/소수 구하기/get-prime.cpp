#include <iostream>
using namespace std;

int main() {
    int a; cin >> a;
    int cnt = 0;
    for (int i=2; i<=a; i++) {
        for (int j=2; j<=i; j++) {
            if (i%j==0) {
                cnt++;
            }
        }
        if (cnt == 1) {
            cout << i << " ";
        }
        cnt = 0;
    }
    return 0;
}