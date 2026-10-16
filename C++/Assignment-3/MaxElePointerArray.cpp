#include <iostream>
using namespace std;

int main()
{
    int a[] = {10, 50, 20, 80, 30};
    int *p = a;
    int max = *p;

    for (int i = 1; i < 5; i++)
    {
        if (*(p + i) > max)
            max = *(p + i);
    }

    cout << "Maximum element = " << max;

    return 0;
}