#include <iostream>
using namespace std;

void mergeArrays(int a[], int b[], int c[], int n, int m)
{
    int i;

    for (i = 0; i < n; i++)
        c[i] = a[i];

    for (i = 0; i < m; i++)
        c[n + i] = b[i];

    cout << "Merged array: ";
    for (i = 0; i < n + m; i++)
        cout << c[i] << " ";
}

int main()
{
    int a[] = {1, 2, 3};
    int b[] = {4, 5, 6};
    int c[6];

    mergeArrays(a, b, c, 3, 3);

    return 0;
}