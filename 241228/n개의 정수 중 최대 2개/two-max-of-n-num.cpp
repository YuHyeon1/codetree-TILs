#include <iostream>
using namespace std;

int main() {
    int n; cin >> n;
    int arr[n];
    for (int i=0;i<n;i++) {
        cin >> arr[i];
    }
    int max, maax = -2147483648;
    for (int i=0;i<n;i++) {
        if (max<arr[i]) {
            max = arr[i];
        }        
    }
    for (int i=0;i<n;i++) {
        if (max == arr[i]) {
            arr[i] = 0;
            break;
        }        
    }
    for (int i=0;i<n;i++) {
        if (maax<arr[i]) {
            maax = arr[i];
        }        
    }
    cout << max << " " << maax;
    return 0;
}