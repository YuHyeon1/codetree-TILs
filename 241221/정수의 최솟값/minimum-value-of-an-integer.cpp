#include <iostream>
using namespace std;
int min (int a, int b, int c) {
    if (a>b) {
        if (b>c) {
            return c;
        } else {
            return b;
        }
    } else {
        if (a>c) {
            return c;
        } else {
            return a;
        }
    }
}

int main() {
    // Please write your code here.
    int a,b,c;
    cin >> a;
    cin >> b;
    cin >> c;
    cout << min(a,b,c) << endl;

    return 0;
}