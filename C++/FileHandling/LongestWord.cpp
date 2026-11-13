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

    string word, longestWord = "";
    while (file >> word) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
    }

    file.close();
    cout << "Longest word: " << longestWord << endl;
    return 0;
}
