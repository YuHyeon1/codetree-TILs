#include <iostream>
using namespace std;

int main() {
    int count = 0;
    int a; cin >> a;
    for (int i=0; i<a; i++) {
        int k; cin >> k;
        while (k!=1) {
            if (k%2==0) {
                k /= 2;
                count++;
            } else {
                k *= 3;
                k += 1;
                count++;
            }
        }
        cout << count << endl;
        count = 0;
    }
    return 0;
}