#include <iostream>
using namespace std;

int main() {
    long long num;
    cout << "Enter a number: ";
    cin >> num;

    if (num < 0) {
        num = -num;
    }

    int freq[10] = {0};

    if (num == 0) {
        freq[0] = 1;
    }

    long long temp = num;
    while (temp > 0) {
        int digit = temp % 10;
        freq[digit]++;
        temp /= 10;
    }

    
    cout << "Digit frequencies in " << num << ":" << endl;
    for (int i = 0; i < 10; i++) {
        if (freq[i] > 0) {
            cout << "Digit " << i << " occurs " << freq[i] << " time(s)" << endl;
        }
    }

    return 0;
}
