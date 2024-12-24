#include <iostream>
using namespace std;

int main() {
    int a; cin >> a;
    int count = 1;
    for (int i=0; i<a; i++) {
        for (int j=0; j<a; j++) {
            if (i%2==0) {
                cout << count+j << " ";
            } else {
                cout << count+a-j-1 << " ";
            }
        }
        count+=a;
        cout << endl;
    }
    return 0;
}