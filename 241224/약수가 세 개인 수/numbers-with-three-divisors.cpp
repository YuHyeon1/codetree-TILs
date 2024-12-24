#include <iostream>
using namespace std;

int main() {
    int cnt,count = 0;
    int a,b; cin >> a >> b;
    for (int i=a;i<=b;i++) {
        for (int j=1;j<=i;j++) {
            if (i%j==0) {
                cnt+=1;
            }
        }
        if (cnt==3) {
            count +=1;
        }
        cnt =0;
    }
    cout << count;
    return 0;
}