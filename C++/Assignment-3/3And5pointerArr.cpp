#include <iostream>
using namespace std;

int main()
{
    int a[] = {10, 20, 30, 40, 50};
    int *p = a;

    cout << "3rd element = " << *(p + 2) << endl;
    cout << "5th element = " << *(p + 4) << endl;

    return 0;
}