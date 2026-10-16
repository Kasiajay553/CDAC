#include <iostream>
using namespace std;
int main()
{
    // 3 Students (rows), 4 Subjects (columns)
    int marks[3][4] = {
        {85, 92, 78, 90}, // Student 1 Marks
        {88, 76, 95, 89}, // Student 2 Marks
        {92, 90, 85, 96}  // Student 3 Marks
    };

    int stdmarks[3] = {0};
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            stdmarks[i] += marks[i][j];
        }
    }
    int maxmarks = stdmarks[0];
    for (int i = 0; i < 3; i++)
    {
        cout << "Student " << i + 1 << " Total marks : " << stdmarks[i] << endl;
        if (stdmarks[i] > maxmarks)
        {
            maxmarks = stdmarks[i];
        }
    }
    cout << "the topper total marks is : " << maxmarks << endl;

    int avgmarks[4] = {0};
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            avgmarks[i] += marks[j][i];
        }
    }
    for (int i = 0; i < 4; i++)
    {
        cout << "Subject " << i + 1 << " Average marks : " << (double)avgmarks[i] / 4 << endl;
    }
    return 0;
}