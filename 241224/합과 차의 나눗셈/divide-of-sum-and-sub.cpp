#include <iostream>
using namespace std;

int main() {
    cout << fixed;
    double a,b;
    cin >> a >> b;
    cout.precision(2);
    double c = a+b;
    cout << c / (a-b) << endl;
    return 0;
}