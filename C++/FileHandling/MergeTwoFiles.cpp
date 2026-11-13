#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    ifstream file1("file1.txt");
    ifstream file2("file2.txt");
    ofstream merged("merged.txt");

    if (!file1 || !file2 || !merged) {
        cout << "Error opening one or more files." << endl;
        return 1;
    }

    string line;
    while (getline(file1, line)) {
        merged << line << endl;
    }
    while (getline(file2, line)) {
        merged << line << endl;
    }

    file1.close();
    file2.close();
    merged.close();
    cout << "Files merged successfully into merged.txt." << endl;
    return 0;
}
