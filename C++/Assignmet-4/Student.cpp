#include <iostream>
using namespace std;

class Student{
    private:
     int rollno;
     string name;
     int marks[3];

    public:
     void aceeptdetails(){
        cout<<"Enter the rollno number :";
        cin>>rollno;
        cout<<"Enter the Name :";
        cin >> name;
        cout<<"Enter the marks of three Subjects :";
        for(int i=0;i<3;i++){
            cin>>marks[i];
        }
     }
     void totalmarks(){
        int total=0;
        for(int i=0;i<3;i++){
            total+=marks[i];
        }
        cout<<"The total marks :  "<<total<<endl;
        cout<<"The percentage is : "<<(total/300.0f)*100.0f<<endl;


     }
     void display(){
        cout<<"the student rollono is : "<< rollno<<endl;
        cout<<"the name of the student is : "<<name<<endl;
        for(int i=0;i<3;i++){
            cout<<"the marks of subject "<<i+1<<" : "<<marks[i]<<endl;
        } 
     }
};

int main(){
    Student s;
    s.aceeptdetails();
    s.display();
    s.totalmarks();
    return 0;
}