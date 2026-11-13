
#include <iostream>
using namespace std;

class Employee
{
protected:
    int empid;
    string name;
    float basic;

public:
    void getEmployee()
    {
        cout << "Enter Employee ID: ";
        cin >> empid;

        cout << "Enter Employee Name: ";
        cin >> name;

        cout << "Enter Basic Salary: ";
        cin >> basic;
    }
};

class Performance
{
protected:
    int rating;

public:
    void getRating()
    {
        cout << "Enter Performance Rating (1-5): ";
        cin >> rating;
    }
};

class Bonus : public Employee, public Performance
{
    float bonus, total;

public:
    void calculate()
    {
        getEmployee();
        getRating();

        if (rating == 4 || rating == 5)
            bonus = basic * 0.10;
        else if (rating == 3)
            bonus = basic * 0.05;
        else
            bonus = 0;

        total = basic + bonus;
    }

    void display()
    {
        cout << "\nEmployee Details";
        cout << "\nEmployee ID: " << empid;
        cout << "\nName: " << name;
        cout << "\nBasic Salary: " << basic;
        cout << "\nPerformance Rating: " << rating;
        cout << "\nBonus: " << bonus;
        cout << "\nTotal Salary: " << total;
    }
};

int main()
{
    Bonus b;

    b.calculate();
    b.display();

    return 0;
}
