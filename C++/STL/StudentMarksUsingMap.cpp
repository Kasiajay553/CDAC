#include <iostream>
#include <map>
using namespace std;

int main() {
    map<int, float> studentMarks;
    int roll;
    float marks;

    for (int i = 0; i < 5; i++) {
        cout << "Enter Roll Number and Marks for student " << i + 1 << ": ";
        cin >> roll >> marks;
        studentMarks[roll] = marks;
    }

    int searchRoll;
    cout << "\nEnter roll number to search: ";
    cin >> searchRoll;

    if (studentMarks.find(searchRoll) != studentMarks.end()) {
        cout << "Marks: " << studentMarks[searchRoll] << endl;
    } else {
        cout << "Student record not found." << endl;
    }

    return 0;
}
