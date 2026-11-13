#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ifstream file("input.txt");
    if (!file) {
        cout << "Error opening file." << endl;
        return 1;
    }

    char ch;
    int count = 0;
    while (file.get(ch)) {
        count++;
    }

    file.close();
    cout << "Total characters: " << count << endl;
    return 0;
}
