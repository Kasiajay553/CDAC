#include <iostream>
#include <fstream>
#include <string>
using namespace std;

class Employee {
public:
    int id;
    string name;
    double salary;

    void input() {
        cout << "Enter Employee ID, Name, and Salary: ";
        cin >> id >> name >> salary;
    }

    void display() {
        cout << "ID: " << id << ", Name: " << name << ", Salary: Rs." << salary << endl;
    }
};

int main() {
    Employee emp[5];
    ofstream outFile("employees.txt");
    if (!outFile) {
        cout << "Error creating file." << endl;
        return 1;
    }

    for (int i = 0; i < 5; i++) {
        emp[i].input();
        outFile << emp[i].id << " " << emp[i].name << " " << emp[i].salary << endl;
    }
    outFile.close();

    ifstream inFile("employees.txt");
    Employee temp;
    cout << "\nEmployees with salary greater than Rs.30,000:\n";
    while (inFile >> temp.id >> temp.name >> temp.salary) {
        if (temp.salary > 30000) {
            temp.display();
        }
    }
    inFile.close();
    return 0;
}
