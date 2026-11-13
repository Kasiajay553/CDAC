
#include <iostream>
using namespace std;

class Student
{
protected:
    int rollno;
    string name;

public:
    void getStudent()
    {
        cout << "Enter Roll Number: ";
        cin >> rollno;

        cout << "Enter Name: ";
        cin >> name;
    }
};

class Result : public Student
{
    int m1, m2, m3;
    int total;
    float average;

public:
    void getMarks()
    {
        getStudent();

        cout << "Enter marks in three subjects: ";
        cin >> m1 >> m2 >> m3;
    }

    void display()
    {
        total = m1 + m2 + m3;
        average = total / 3.0;

        cout << "\nStudent Details";
        cout << "\nRoll Number: " << rollno;
        cout << "\nName: " << name;
        cout << "\nTotal Marks: " << total;
        cout << "\nAverage Marks: " << average;
    }
};

int main()
{
    Result r;

    r.getMarks();
    r.display();

    return 0;
}
