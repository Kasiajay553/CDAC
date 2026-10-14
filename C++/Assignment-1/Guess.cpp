#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int main() {
    srand(time(0));
    int secret = rand() % 100 + 1;
    int guess;
    bool win = false;

    for (int i = 1; i <= 7; i++) {
        cout << "Enter your guess: ";
        cin >> guess;

        if (guess == secret) {
            cout << "Correct! Attempt number: " << i << endl;
            win = true;
            break;
        } else if (guess > secret) {
            cout << " Your is Higher" << endl;
        } else {
            cout << " Your is Lower" << endl;
        }
    }

    if (!win) {
        cout << "Secret number was: " << secret << endl;
    }

    return 0;
}
