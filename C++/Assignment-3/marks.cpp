#include <iostream>

using namespace std;

void display(int marks[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << "the marks of Student " << i + 1 << " is  " << marks[i] << endl;
    }
}
void sortByMarks(int marks[], int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (marks[i] > marks[j])
            {

                int temp = marks[i];
                marks[i] = marks[j];
                marks[j] = temp;
            }
        }
    }
    for (int i = 0; i < n; i++)
    {
        cout << marks[i] << " , ";
    }
}

void assignranks(int marks[], int n)
{
    int current_rank = 1;
    for (int i = n - 1; i >= 0; i--)
    {
        if (i < n - 1 && marks[i] < marks[i + 1])
        {
            current_rank = (n - 1) - i + 1;
        }
        cout << endl
             << "rank  " << current_rank << " with the marks " << marks[i];
    }
}
int main()
{
    int marks[] = {78, 85, 92, 64, 92, 51, 88};
    int n = sizeof(marks) / sizeof(marks[0]);

    display(marks, n);

    sortByMarks(marks, n);

    assignranks(marks, n);

    return 0;
}