#include <iostream>
using namespace std;

int main()
{
    int a[] = {10, 20, 30, 40, 50};
    int *p = a;
    int sum = 0;
    float avg;

    for (int i = 0; i < 5; i++)
        sum = sum + *(p + i);

    avg = sum / 5.0;

    cout << "Average = " << avg;

    return 0;
}