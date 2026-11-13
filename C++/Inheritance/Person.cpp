
#include <iostream>
using namespace std;

class Person
{
protected:
    string name;
    int age;

public:
    void getPerson()
    {
        cout << "Enter Name: ";
        cin >> name;

        cout << "Enter Age: ";
        cin >> age;
    }
};

class Student : public Person
{
protected:
    int rollno, m1, m2, m3;

public:
    void getStudent()
    {
        getPerson();

        cout << "Enter Roll Number: ";
        cin >> rollno;

        cout << "Enter marks in three subjects: ";
        cin >> m1 >> m2 >> m3;
    }
};

class Result : public Student
{
    int total;
    float percentage;
    char grade;

public:
    void calculate()
    {
        getStudent();

        total = m1 + m2 + m3;
        percentage = total / 3.0;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';
    }

    void display()
    {
        cout << "\nStudent Details";
        cout << "\nName: " << name;
        cout << "\nAge: " << age;
        cout << "\nRoll Number: " << rollno;
        cout << "\nTotal Marks: " << total;
        cout << "\nPercentage: " << percentage;
        cout << "\nGrade: " << grade;
    }
};

int main()
{
    Result r;

    r.calculate();
    r.display();

    return 0;
}
