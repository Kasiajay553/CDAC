#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    vector<int> vec = {25, 11, 78, 4, 92, 36, 51, 19, 64, 8};

    int maxVal = *max_element(vec.begin(), vec.end());
    int minVal = *min_element(vec.begin(), vec.end());

    cout << "Maximum element: " << maxVal << endl;
    cout << "Minimum element: " << minVal << endl;

    return 0;
}
