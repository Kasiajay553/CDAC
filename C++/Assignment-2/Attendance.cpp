#include <iostream>
using namespace std;
int main()
{
    // 4 Students (rows), 5 Days (columns)
    // 1 = Present, 0 = Absent
    int attendance[4][5] = {
        {1, 1, 1, 0, 1}, // Student 1 (4 days present -> 80%)
        {1, 0, 1, 0, 0}, // Student 2 (2 days present -> 40%) - Shortage!
        {1, 1, 1, 1, 1}, // Student 3 (5 days present -> 100%)
        {0, 1, 0, 1, 1}  // Student 4 (3 days present -> 60%) - Shortage!
    };

    int attper[4] = {0};
    for (int i = 0; i < 4; i++)
    {
        int present = 0;
        for (int j = 0; j < 5; j++)
        {
            present += attendance[i][j];
            attper[i] = (((double)present / 5) )* 100;
        }
    }
    for (int i = 0; i < 4; i++)
    {
        cout << "Student " << i + 1 << " percentage of Attendance : " << attper[i] << endl;
    }
    for (int i = 0; i < 4; i++)
    {
        if (attper[i] < 75)
        {
            cout << "Student " << i + 1 << " percentage of Attendance <75  his/her percentage is :  " << attper[i] << endl;
        }
    }

    return 0;
}