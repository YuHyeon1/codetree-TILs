#include <iostream>

using namespace std;

int N;

void printscore (int n) {
    if (n == 0) {
        return;
    } else {
        for (int i=1; i<=n; i++) {
            cout << i << " ";
        } 
        cout << endl;
        for (int i=n; i>=1; i--) {
            cout << i << " ";
        }
    }
}

int main() {
    cin >> N;
    printscore(N);
    // Write your code here!

    return 0;
}