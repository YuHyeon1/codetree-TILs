#include <iostream>
using namespace std;

void print1234 (int n) {
    for (int i=0;i<n;i++) {
        cout << "12345^&*()_\n"; 
    }
}

int main() {
    int a;
    cin >> a;
    print1234(a);
    return 0;
}