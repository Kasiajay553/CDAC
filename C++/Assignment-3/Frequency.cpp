#include <iostream>
using namespace std;

void frequency(int a[], int n)
{
    int visited[5] = {0};

    for (int i = 0; i < n; i++)
    {
        if (visited[i] == 1)
            continue;

        int count = 1;

        for (int j = i + 1; j < n; j++)
        {
            if (a[i] == a[j])
            {
                count++;
                visited[j] = 1;
            }
        }

        cout << a[i] << " occurs " << count << " times" << endl;
    }
}

int main()
{
    int a[] = {2, 3, 2, 5, 3};
    int n = 5;

    frequency(a, n);

    return 0;
}