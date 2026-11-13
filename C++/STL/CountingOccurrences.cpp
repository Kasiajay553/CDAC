#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    vector<int> vec = {5, 12, 5, 8, 23, 5, 19, 8, 5, 30};
    int target;

    cout << "Enter number to count: ";
    cin >> target;

    int occurrences = count(vec.begin(), vec.end(), target);

    cout << "Occurrences of " << target << ": " << occurrences << endl;

    return 0;
}
