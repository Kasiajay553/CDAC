#include <iostream>
using namespace std;

class employee{
private:
    int id;
    string name;
    float BasicSalary;
    float totalSalary;
public:
    void AcceptData(){
        cout<<"enter the employee id : ";
        cin>>id;
        cout<<"enter the name of the employee : ";
        cin>>name;
        cout<<"enter the basic salary of the employee : ";
        cin>>BasicSalary;
    }

    void CalculateGrossSalary(){
        float hra;
        float da;

        hra=BasicSalary*0.2;
        da= BasicSalary*0.10;
        float pf= BasicSalary*0.12;
        totalSalary=(BasicSalary+hra+da)-pf;

    }
    void dispaly(){
        cout<<"The  total  Groos Salary of  the employee is : "<<totalSalary;
    }
};

int main(){
    employee e;
    e.AcceptData();
    e.CalculateGrossSalary();
    e.dispaly();
    return 0;
}