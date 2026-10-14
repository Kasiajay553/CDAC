#include <iostream>
using namespace std;

int main() {
    int lines;
    cout << "Enter number of lines: ";
    cin >> lines;

    for (int i = 1; i <= lines; i++) {
        for (int j = 1; j <= lines - i; j++) {
            cout << " ";
        }
        for (int k = 1; k <= i; k++) {
            cout << "* ";
        }
        cout << endl;
    }
    return 0;
}
