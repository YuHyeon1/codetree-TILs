#include <iostream>

using namespace std;


int n;

void baesu (int n) {
    if (n%2==0 && (n/10 + n%10)%5==0) {
        cout << "Yes";
    } else {
        cout << "No";
    }
}

int main() {
    cin >> n;
    baesu(n);
    return 0;
}