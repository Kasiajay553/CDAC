#include <iostream>
using namespace std;

class Rectangle
{
private:
    int length;
    int breadth;
    int areares;
    int perres;

public:
    void acceptdimensions()
    {
        cout << "enter the length of rectangle : ";
        cin >> length;
        cout << "enter the breadth of rectangle : ";
        cin >> breadth;
    }
    void calucate()
    {
        areares = length * breadth;
        perres = 2 * (length + breadth);
    }

    void displayResult()
    {
        cout << "The length of rectangle is : " << length << endl;
        cout << "The breadth of rectangle is : " << breadth << endl;
        cout << "The area of rectangle is : " << areares << endl;
        cout << "The perimeter of rectangle is : " << perres << endl;
    }
};

int main()
{
    Rectangle r;
    r.acceptdimensions();
    r.calucate();
    r.displayResult();
    return 0;
}
