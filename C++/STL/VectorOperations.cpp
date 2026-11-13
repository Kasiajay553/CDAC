#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> vec;

    vec.push_back(10);
    vec.push_back(20);
    vec.push_back(30);
    vec.push_back(40);
    vec.push_back(50);

    vec.pop_back();

    cout << "Remaining elements: ";
    for (int x : vec) {
        cout << x << " ";
    }
    cout << endl;

    return 0;
}
