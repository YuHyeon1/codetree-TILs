#include <iostream>
using namespace std;

int main() {
    int a; cin >> a;
    for (int i=1; i<=a; i++) {
        for (int j=1; j<=a; j++) {
            if (j%2==1) {
                cout << i;
            } else {
                cout << a+1-i;
            }
        }
        cout << endl;
    }
    return 0;
}