#include <iostream>
using namespace std;


int main() {
    int count = 1;
    int a; cin >> a;
    for (int i=0;i<a;i++) {
        for (int j=0;j<i;j++) {
            cout << "  ";
        }
        for (int j=i;j<a;j++) {
            cout << count << " ";
            count++;
            if (count > 9) {
                count = 1;
            }
        }
        cout << endl;
    }
    return 0;
}