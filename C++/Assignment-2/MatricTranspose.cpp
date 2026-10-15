#include <iostream>
using namespace std;

int main()
{

    int matrixA[2][3] = {
        {1, 3, 5},
        {7, 9, 11}};

    int result[3][2];

    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            result[j][i] = matrixA[i][j];
        }
    }
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cout << result[i][j] << "  ";
        }
        cout << endl;
    }

    return 0;
}