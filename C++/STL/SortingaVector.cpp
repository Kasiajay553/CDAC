#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    vector<int> vec(10);

    cout << "Enter 10 integers: ";
    for (int i = 0; i < 10; i++) {
        cin >> vec[i];
    }

    sort(vec.begin(), vec.end());
    cout << "Ascending order: ";
    for (int x : vec) {
        cout << x << " ";
    }
    cout << endl;

    sort(vec.begin(), vec.end(), greater<int>());
    cout << "Descending order: ";
    for (int x : vec) {
        cout << x << " ";
    }
    cout << endl;

    return 0;
}
