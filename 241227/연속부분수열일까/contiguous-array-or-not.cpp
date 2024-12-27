#include <iostream>
using namespace std;

int main() {
    int n1,n2;
    cin >> n1 >> n2;
    int arr1[n1];
    int arr2[n2];
    for (int i=0; i<n1; i++) {
        cin >> arr1[i];
    }
    for (int i=0; i<n2; i++) {
        cin >> arr2[i];
    }
    int cnt = 0;
    for (int i=0; i<n1; i++) {
        if (arr1[i] == arr2[0]) {
            for (int j=i;j<i+n2;j++) {
                if (arr1[j] != arr2[j-i]) {
                    cnt++;
                    break;
                }
            }
        }
    }
    if (cnt == 0) {
        cout << "Yes";
    } else {
        cout << "No";
    }
    return 0;
}