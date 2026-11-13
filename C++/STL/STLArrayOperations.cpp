#include <iostream>
#include <array>
#include <algorithm>
using namespace std;

int main() {
    array<int, 5> arr = {42, 15, 89, 7, 33};

    cout << "Original elements: ";
    for (int x : arr) {
        cout << x << " ";
    }
    cout << endl;

    arr[2] = 20;

    sort(arr.begin(), arr.end());

    cout << "Sorted elements: ";
    for (int x : arr) {
        cout << x << " ";
    }
    cout << endl;

    cout << "First element: " << arr.front() << endl;
    cout << "Last element: " << arr.back() << endl;

    return 0;
}
