#include <iostream>
using namespace std;

int main() {
    double hours;
    cout << "Enter hours: ";
    cin >> hours;

    double charge = 0.0;
    const double maintenance = 10.0;

    if (hours <= 2) {
        charge = hours * 20.0;
    } else if (hours>2 and hours <= 5) {
        charge = hours  * 30.0;
    } else {
        charge = hours* 50.0;
    }

    double total = charge + maintenance;

    cout << "Duration: " << hours << " hours" << endl;
    cout << "Charges: " << charge << endl;
    cout << "Maintenance: " << maintenance << endl;
    cout << "Total: " << total << endl;

    return 0;
}
