#include <iostream>
using namespace std;

int main() {
    int a; cin >> a;
    int first = 1;
    int second = a+1;
        
    for (int i=0; i<2*a; i++) {
        if (i%2==0) {
            for (int j=0; j<first; j++) {
                cout << "* ";
            }
            first++;
            cout << endl;
        } else {
            for (int j=1; j<second; j++) {
                cout << "* ";
            }
            second--;
            cout << endl;
        }
    }
    return 0;
}