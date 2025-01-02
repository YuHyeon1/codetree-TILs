#include <iostream>
using namespace std;

int main() {
    int a,b,count = 0;
    cin >> a >> b;
    for (int i=a; i<=b; i++) {
        bool sosu = true;
        for (int j=2;j<i;j++) {
                if (i%j==0) {
                    sosu = false;
                    break;
                }
            }
        if (sosu == true) {
                count += i;        
            } 
        }
    cout << count;
    return 0;
}