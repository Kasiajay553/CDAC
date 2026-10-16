#include <iostream>
using namespace std;

void productTotal(int a[4][6])
{
    int sum;

    cout << "Product-wise totals:" << endl;

    for (int i = 0; i < 4; i++)
    {
        sum = 0;

        for (int j = 0; j < 6; j++)
            sum = sum + a[i][j];

        cout << "Product " << i + 1 << ": " << sum << endl;
    }
}

void monthTotal(int a[4][6])
{
    int sum;

    cout << "\nMonth-wise totals:" << endl;

    for (int j = 0; j < 6; j++)
    {
        sum = 0;

        for (int i = 0; i < 4; i++)
            sum = sum + a[i][j];

        cout << "Month " << j + 1 << ": " << sum << endl;
    }
}

int main()
{
    int sales[4][6] = {
        {100, 200, 150, 250, 300, 350},
        {120, 180, 220, 240, 280, 320},
        {90, 140, 190, 210, 260, 310},
        {110, 160, 200, 230, 270, 330}
    };

    productTotal(sales);
    monthTotal(sales);

    return 0;
}