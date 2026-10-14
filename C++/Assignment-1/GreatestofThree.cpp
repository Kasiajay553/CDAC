#include <iostream>
using namespace std;
int main()
{
    int n1, n2, n3;
    cout << "enter the numbers you want to check :\n";
    cin >> n1;
    cin >> n2;
    cin >> n3;
    if (n1 > n2 && n1 > n3)
    {
        cout << "n1 is bigger number " << n1;
    }
    else if (n2 > n3 && n2 > n1)
    {
        cout << "n2 is bigger number " << n2;
    }
    else
    {
        cout << "n3 is greater number " << n3;
    }
    return 0;
}