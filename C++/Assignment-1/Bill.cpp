#include <iostream>
using namespace std;

int main() {
    double units;
    cout << "Enter the number of units consumed: ";
    cin >> units;

    double billAmount = 0.0;
    const double fixedCharge = 50.0;

    if (units <= 100) {
        billAmount = units * 3.00;
    } else if (units>100 and units <= 200) {
        billAmount = units*4.50;
    } else {
        billAmount = units*6.00;
    }

    double totalBill = billAmount + fixedCharge;

    cout << "Total Electricity Bill: " << totalBill << endl;

    return 0;
}
