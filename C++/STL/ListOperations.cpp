#include <iostream>
#include <list>
using namespace std;

int main() {
    list<int> myList;

    myList.push_back(20);
    myList.push_back(30);
    myList.push_front(10);
    myList.push_front(5);
    myList.push_back(40);

    myList.pop_front();
    myList.pop_back();

    cout << "List elements: ";
    for (int x : myList) {
        cout << x << " ";
    }
    cout << endl;

    return 0;
}
