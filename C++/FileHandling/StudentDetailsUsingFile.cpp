#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    ofstream outFile("students.txt");
    if (!outFile) {
        cout << "Error creating file." << endl;
        return 1;
    }

    int roll;
    string name;
    float marks;

    for (int i = 0; i < 5; i++) {
        cout << "Enter details for student " << i + 1 << " (Roll Name Marks): ";
        cin >> roll >> name >> marks;
        outFile << roll << " " << name << " " << marks << endl;
    }
    outFile.close();

    ifstream inFile("students.txt");
    cout << "\nStored Student Details:\n";
    while (inFile >> roll >> name >> marks) {
        cout << "Roll: " << roll << ", Name: " << name << ", Marks: " << marks << endl;
    }
    inFile.close();
    return 0;
}
