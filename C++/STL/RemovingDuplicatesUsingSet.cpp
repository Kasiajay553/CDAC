#include <iostream>
#include <set>
using namespace std;

int main() {
    set<int> uniqueNums;
    int num;

    cout << "Enter 10 integers: ";
    for (int i = 0; i < 10; i++) {
        cin >> num;
        uniqueNums.insert(num);
    }

    cout << "Unique elements in ascending order: ";
    for (int x : uniqueNums) {
        cout << x << " ";
    }
    cout << endl;

    return 0;
}
