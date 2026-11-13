
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

class Salary : public Employee
{
    float hra, da, gross;

public:
    void calculate()
    {
        getEmployee();

        hra = basic * 0.20;
        da = basic * 0.10;
        gross = basic + hra + da;
    }

    void display()
    {
        cout << "\nEmployee Details";
        cout << "\nEmployee ID: " << empid;
        cout << "\nName: " << name;
        cout << "\nBasic Salary: " << basic;
        cout << "\nHRA: " << hra;
        cout << "\nDA: " << da;
        cout << "\nGross Salary: " << gross;
    }
};

int main()
{
    Salary s;

    s.calculate();
    s.display();

    return 0;
}
