#include <iostream>
using namespace std;

int main()
{
    int a[] = {10, 20, 30, 40, 50};
    int *p = a;

    cout << "Array elements: ";

    for (int i = 0; i < 5; i++)
        cout << *(p + i) << " ";

    return 0;
}