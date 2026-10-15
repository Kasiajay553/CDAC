#include <iostream>
using namespace std;

int main()
{

    int matrixA[2][3] = {
        {1, 3, 5},
        {7, 9, 11}};

    int matrixB[2][3] = {
        {2, 4, 6},
        {8, 10, 12}};

    int result[2][3];

    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            result[i][j] = matrixA[i][j] + matrixB[i][j];
        }
    }
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << result[i][j] << "  ";
        }
        cout << endl;
    }

    return 0;
}