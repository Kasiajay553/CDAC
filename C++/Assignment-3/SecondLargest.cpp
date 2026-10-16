#include <iostream>
using namespace std;

void secondLargest(int a[], int n)
{
    int largest = a[0], second = a[0];

    for (int i = 1; i < n; i++)
    {
        if (a[i] > largest)
        {
            second = largest;
            largest = a[i];
        }
        else if (a[i] > second && a[i] < largest)
        {
            second = a[i];
        }
    }

    cout << "Second largest element is: " << second;
}

int main()
{
    int a[] = {10, 25, 8, 40, 30};
    int n = 5;

    secondLargest(a, n);

    return 0;
}