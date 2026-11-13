#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    vector<int> vec = {15, 28, 42, 67, 81, 95};
    int target;

    cout << "Enter element to search: ";
    cin >> target;

    auto it = find(vec.begin(), vec.end(), target);

    if (it != vec.end()) {
        cout << "Element found at index: " << distance(vec.begin(), it) << endl;
    } else {
        cout << "Element not found." << endl;
    }

    return 0;
}
