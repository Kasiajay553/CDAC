#include <iostream>
using namespace std;

int main()
{

    int matrixA[3][3] = {
        {1, 3, 5},
        {7, 9, 11},
        {8, 9, 10}};

    int matrixB[3][3] = {
        {2, 4, 6},
        {8, 10, 12},
        {9, 4, 5}};

    int result[3][3]={0};

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {   for(int k=0;k<3; k++){

            result[i][j]+= matrixA[i][k] * matrixB[k][j];
        }
            
        }
    }
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << result[i][j] << "  ";
        }
        cout << endl;
    }

    return 0;
}