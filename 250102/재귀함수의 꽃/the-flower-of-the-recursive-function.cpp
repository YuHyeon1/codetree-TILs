#include <iostream>

using namespace std;

int N;
void score(int n) {
    if (n==0) {
        return;
    } else {
        cout << n << " ";
        score (n-1);
        cout << n << " ";
    }
}
int main() {
    cin >> N;
    score(N);

    // Write your code here!

    return 0;
}