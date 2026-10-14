#include <iostream>
using namespace std;
int main()
{

    int y1;
    cout << "enter the year you want to check : ";
    cin >> y1;
    if ((y1 % 4 == 0 && y1 %100 != 0)||(y1%400==0))
    {
        cout << "the year is leap year " << y1;
    }
    else
    {
        cout << "the year is not leap year " << y1;
    }
    return 0;
}