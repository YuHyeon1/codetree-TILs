#include <iostream>
using namespace std;

int main() {
    int a; cin >> a;
    for (int i=0; i<2*a-1; i++)  {
        if (i<a) {
            for (int j=i;j<a-1;j++) {
                cout << "  ";
            }
            for (int j=i;j>=0;j--) {
                cout << "@ ";
            }
            cout << endl;
        } else {
            for (int j=i;j<2*a-1;j++) {
                cout << "@ ";
            }
            cout << endl;
        }
    }
    return 0;
}