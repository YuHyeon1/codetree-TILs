#include <iostream>

using namespace std;

int N;

void helloworld(int n) {
    int cnt = 0;
    if (n == cnt) {
        return;
    } else {
        cout << "HelloWorld" << endl;
        helloworld(n-1);
    }
}
int main() {
    cin >> N;
    helloworld(N);
    // Write your code here!

    return 0;
}