#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    ifstream file("input.txt");
    if (!file) {
        cout << "Error opening file." << endl;
        return 1;
    }

    string target, word;
    cout << "Enter the word to search: ";
    cin >> target;

    int count = 0;
    while (file >> word) {
        if (word == target) {
            count++;
        }
    }

    file.close();
    cout << "The word '" << target << "' occurs " << count << " times." << endl;
    return 0;
}
