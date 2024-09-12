#include <iostream>
using namespace std;

void TenStarsinFiveColumn() {
    for (int i =0; i<5;i++) {
        for (int j=0;j<10;j++) {
            cout << "*";
        }
        cout << endl;
    }
}

int main() {
    TenStarsinFiveColumn();
    return 0;
}