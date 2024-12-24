#include <iostream>
using namespace std;

int main() {
    int count = 0;
    int cnt =0;
    int a,b; cin >> a >> b;
    for (int i=a; i<=b; i++) {
        for (int j=1;j<i;j++) {
            if (i%j==0) {
                count +=j;
            }
        }
        if (count == i) {
            cnt++;
        }
    }
    cout << cnt;
    return 0;
}