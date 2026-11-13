#include <iostream>
#include <fstream>
#include <cctype>
using namespace std;

int main() {
    ifstream file("input.txt");
    if (!file) {
        cout << "Error opening file." << endl;
        return 1;
    }

    char ch;
    int vowels = 0, consonants = 0;

    while (file.get(ch)) {
        if (isalpha(ch)) {
            char lower = tolower(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
    }

    file.close();
    cout << "Vowels: " << vowels << endl;
    cout << "Consonants: " << consonants << endl;
    return 0;
}
