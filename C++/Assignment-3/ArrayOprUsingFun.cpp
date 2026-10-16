#include <iostream>
using namespace std;

void initialize(int a[], int n)
{
    int temp[] = {10, 20, 5, 40, 15};

    for (int i = 0; i < n; i++)
        a[i] = temp[i];
}

void display(int a[], int n)
{
    cout << "Array elements: ";
    for (int i = 0; i < n; i++)
        cout << a[i] << " ";
    cout << endl;
}

void sum(int a[], int n)
{
    int s = 0;

    for (int i = 0; i < n; i++)
        s = s + a[i];

    cout << "Sum = " << s << endl;
}

void maximum(int a[], int n)
{
    int max = a[0];

    for (int i = 1; i < n; i++)
        if (a[i] > max)
            max = a[i];

    cout << "Maximum = " << max << endl;
}

void minimum(int a[], int n)
{
    int min = a[0];

    for (int i = 1; i < n; i++)
        if (a[i] < min)
            min = a[i];

    cout << "Minimum = " << min << endl;
}

int main()
{
    int a[5], n = 5;

    initialize(a, n);
    display(a, n);
    sum(a, n);
    maximum(a, n);
    minimum(a, n);

    return 0;
}