#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
using namespace std;

int main() {
    ifstream file("input.txt");
    if (!file) {
        cout << "Error opening file." << endl;
        return 1;
    }

    string line, word;
    int lineCount = 0, wordCount = 0;

    while (getline(file, line)) {
        lineCount++;
        stringstream ss(line);
        while (ss >> word) {
            wordCount++;
        }
    }

    file.close();
    cout << "Total lines: " << lineCount << endl;
    cout << "Total words: " << wordCount << endl;
    return 0;
}
