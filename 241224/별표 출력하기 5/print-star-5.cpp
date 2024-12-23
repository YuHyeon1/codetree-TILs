#include <iostream>
using namespace std;

int main() {
    int a; cin >> a;
    for (int i=0; i<a; i++) {
        for (int j=i; j<a; j++) {
            for (int k=i; k<a; k++) {
                cout << "*";
            }
            cout << " ";
        }
        cout << endl;
    }
    return 0;
}