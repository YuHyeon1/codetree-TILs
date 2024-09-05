#include <iostream>
using namespace std;

int main() {
    cout << fixed;
    
    double a = 9.2;
    double ft = 30.48;
    double b = 1.3;
    int mi = 160934;
    cout.precision(1);
    cout << a << "ft = " << a*ft << "cm\n";
    cout << b << "mi = " << b*mi << "cm";
    return 0;
}