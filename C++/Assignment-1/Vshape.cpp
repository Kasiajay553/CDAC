#include <iostream>
using namespace std;

int main() {
    int stars;
    cout << "Enter number of stars: ";
    cin >> stars;

    for (int i = stars; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            cout << "*";
        }
        cout << endl;
    }

    for (int i = 2; i <= stars; i++) {
        for (int j = 1; j <= i; j++) {
            cout << "*";
        }
        cout << endl;
    }
    return 0;
}
