
#include <iostream>
using namespace std;

class BankAccount
{
protected:
    long double accno;
    string name;
    float balance;

public:
    void getDetails()
    {
        cout << "Enter Account Number: ";
        cin >> accno;

        cout << "Enter Account Holder Name: ";
        cin >> name;

        cout << "Enter Balance: ";
        cin >> balance;
    }
};

class SavingsAccount : public BankAccount
{
public:
    void calculate()
    {
        getDetails();

        balance = balance + (balance * 0.04);

        cout << "\nSavings Account Details";
        cout << "\nAccount Number: " << accno;
        cout << "\nAccount Holder: " << name;
        cout << "\nUpdated Balance: " << balance;
    }
};

class CurrentAccount : public BankAccount
{
public:
    void calculate()
    {
        getDetails();

        balance = balance - 500;

        cout << "\nCurrent Account Details";
        cout << "\nAccount Number: " << accno;
        cout << "\nAccount Holder: " << name;
        cout << "\nUpdated Balance: " << balance;
    }
};

int main()
{
    SavingsAccount s;
    CurrentAccount c;

    cout << "Savings Account\n";
    s.calculate();

    cout << "\n\nCurrent Account\n";
    c.calculate();

    return 0;
}
