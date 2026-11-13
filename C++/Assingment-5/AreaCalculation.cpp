
#include <iostream>
using namespace std;

class Shape
{
protected:
    float length, breadth;

public:
    void getDimensions()
    {
        cout << "Enter Length: ";
        cin >> length;

        cout << "Enter Breadth: ";
        cin >> breadth;
    }
};

class Rectangle : public Shape
{
public:
    void calculate()
    {
        getDimensions();

        cout << "Area of Rectangle: " << length * breadth;
    }
};

class Triangle : public Shape
{
public:
    void calculate()
    {
        getDimensions();

        cout << "Area of Triangle: " << 0.5 * length * breadth;
    }
};

int main()
{
    Rectangle r;
    Triangle t;

    cout << "Rectangle Details\n";
    r.calculate();

    cout << "\n\nTriangle Details\n";
    t.calculate();

    return 0;
}
