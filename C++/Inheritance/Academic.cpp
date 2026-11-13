
#include <iostream>
using namespace std;

class Academic
{
protected:
    int m1, m2, m3;

public:
    void getAcademic()
    {
        cout << "Enter marks in three subjects: ";
        cin >> m1 >> m2 >> m3;
    }
};

class Sports
{
protected:
    int sportsMarks;

public:
    void getSports()
    {
        cout << "Enter Sports Marks: ";
        cin >> sportsMarks;
    }
};

class Result : public Academic, public Sports
{
    int total;

public:
    void calculate()
    {
        getAcademic();
        getSports();

        total = m1 + m2 + m3 + sportsMarks;
    }

    void display()
    {
        cout << "\nAcademic Marks: " << m1 + m2 + m3;
        cout << "\nSports Marks: " << sportsMarks;
        cout << "\nCombined Score: " << total;
    }
};

int main()
{
    Result r;

    r.calculate();
    r.display();

    return 0;
}
