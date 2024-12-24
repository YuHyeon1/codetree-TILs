#include <iostream>
using namespace std;

int main() {
    int a; cin >> a;
    int count = 2;
    for (int i=0; i<a; i++) {
        for (int j=0; j<a; j++) {
            cout << count << " ";
            count+=2;
            if (count == 10) {
                count = 2;
            }
        }
        cout << endl;
    }
    return 0;
}