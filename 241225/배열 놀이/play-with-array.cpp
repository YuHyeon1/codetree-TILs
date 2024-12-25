#include <iostream>
#include <sstream>
#include <string>
using namespace std;

int main() {
    int n,q; cin >> n >> q;
    int arr [n];
    for (int i=0; i<n; i++) {
        cin >> arr[i];
    }
    cin.ignore();
    for (int i=0; i<q; i++) {
        string line;
        int one,two,three;
        getline(cin, line);
        stringstream ss(line);
        ss >> one >> two >> three;
        if (one == 1) {
            cout << arr[two-1] << endl;
        } else if (one == 2) {
            for (int j=0;j<n;j++) {
                if (arr[j] == two) {
                    cout << j+1 << endl;
                }
            }
        } else if (one == 3) {
            for (int j=two-1; j<three; j++) {
                cout << arr[j] << " ";
            }
            cout << endl;
        }
    }
    return 0;
}