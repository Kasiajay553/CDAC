#include <iostream>
#include <fstream>
#include <cctype>
using namespace std;

int main() {
    ifstream inFile("lowercase.txt");
    ofstream outFile("uppercase.txt");

    if (!inFile || !outFile) {
        cout << "Error opening file." << endl;
        return 1;
    }

    char ch;
    while (inFile.get(ch)) {
        outFile.put(toupper(ch));
    }

    inFile.close();
    outFile.close();
    cout << "File converted to uppercase successfully." << endl;
    return 0;
}
