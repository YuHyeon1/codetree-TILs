#include <iostream>
using namespace std;

int main() {
    int a; cin >> a;
    for (int i=0; i<a; i++) {
        cout << "* ";
    }
    cout << endl;
    for (int i=1;i<a;i++) {
        if (i%2==0) {
            for (int j=0;j<a;j++) {
                if(j%2==0) {
                    cout << "  ";
                } else {
                    if (j>=i) {
                        cout << "* ";
                    } else {
                        cout << "  ";
                    }
                }
            }
            cout << endl;
        } else {
            for (int j=0;j<a;j++) {
                if(j%2==0) {
                    cout << "  ";
                } else {
                    if (j>=i) {
                        cout << "* ";
                    } else {
                        cout << "  ";
                    }
                }
            }
            cout << endl;
        }
    }
    return 0;
}