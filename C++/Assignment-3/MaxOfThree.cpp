#include <iostream>
using namespace std;

int maximum(int a, int b, int c)
{
    if (a > b && a > c)
        return a;
    else if (b > c)
        return b;
    else
        return c;
}

float maximum(float a, float b, float c)
{
    if (a > b && a > c)
        return a;
    else if (b > c)
        return b;
    else
        return c;
}

char maximum(char a, char b, char c)
{
    if (a > b && a > c)
        return a;
    else if (b > c)
        return b;
    else
        return c;
}

int main()
{
    cout << "Maximum integer: " << maximum(10, 20, 15) << endl;
    cout << "Maximum float: " << maximum(2.5f, 5.6f, 3.4f) << endl;
    cout << "Maximum character: " << maximum('A', 'Z', 'M') << endl;

    return 0;
}