#include <iostream>

using namespace std;

int n;
void printstar (int n) {
    if (n==0) {
        return;
    } else {
        printstar(n-1);
        for (int i=0;i<n;i++) {
            cout << "*";
        }
        cout << endl;
    }
}
int main() {
    cin >> n;
    printstar(n);

    // Write your code here!

    return 0;
}