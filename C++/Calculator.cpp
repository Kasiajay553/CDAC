#include <iostream>

using namespace std;
int main()
{
    bool loop = true;
    while(loop){
        cout << "---------------------------------------\n";
        cout << "choose the operator\n";
        cout << "select one(+ - / % *) \n";
        cout << "select 'e' for exit\n"; 

        cout << "enter the operator:\n";
        char choice;
        cin >> choice;
        
        
        if (choice == 'e') {
            cout << "Exiting the program...\n";
            break; 
        }
        int num1, num2;
        cout << "Enter the number 1: ";
        cin >> num1;
        cout << "Enter the number 2: ";
        cin >> num2;
        
        switch (choice)
        {
            case '+':
            {
                cout << "the addition of two numbers\n";
                cout << num1 + num2 << endl;
                break;
            }
            case '-':
            {
                cout << "the sub of two numbers\n";
                cout << num1 - num2 << endl;
                break;
            }
            case '*':
            {
                cout << "the mul of two numbers\n";
                cout << num1 * num2 << endl;
                break;
            }
            case '/':
            {
                cout << "the division of two numbers\n";
                
                if (num2 == 0) {
                    cout << "Error: Division by zero is not allowed!\n";
                } else {
                    cout << num1 / num2 << endl;
                }
                break;
            }
            case '%':
            {
                cout << "the modulus of two numbers\n";
                if (num2 == 0) {
                    cout << "Error: Modulus by zero is not allowed!\n";
                } else {
                    cout << num1 % num2 << endl;
                }
                break;
            }
            default:
            {
                cout<<"eneter the correct operator";
            }
        }
    }
    return 0;
}
