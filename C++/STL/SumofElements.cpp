#include <iostream>
#include <vector>
#include <numeric>
using namespace std;

int main() {
    vector<int> vec = {12, 24, 36, 48, 60};

    int sum = accumulate(vec.begin(), vec.end(), 0);

    cout << "Sum of elements: " << sum << endl;

    return 0;
}
