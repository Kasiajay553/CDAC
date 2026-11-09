#include <iostream>
using namespace std;



class BankAccount{
    private:
    double accountnum;
    string name;
    float balance; 

    public:
    void getdetails(){
        cout<<"enter the account num : ";
        cin>>accountnum;

        cout <<"Enter the name : ";
        cin>> name;
        cout<<"Enter the Balance : ";
        cin>> balance;

    }


    void deposit(){
        int deposite;
        cout<<"enter the deposite ammount : ";
        cin>>deposite;
        if(deposite>0){
            balance+=deposite;
        }else{
            cout<<"amount should be greater than zero"<<endl;
        }
    }

    void withdrawl(){
        int withdraw;
        cout<<"enter the amount to be withdrawed : ";
        cin>> withdraw;
        if(withdraw>balance){
            cout<<"the balance is insufficient"<<endl;
        }else{
            balance-=withdraw;
            cout<<"the remaining amout after the withdrawl is "<< balance<<endl;
        }
    }

    void display(){
        cout<<"the account number is : "<<accountnum<<endl;
        cout<<"the account holdername is : "<<name<<endl;
        cout<<"the final balance in the acount is : "<<balance<<endl;
    }
};

int main(){
    BankAccount ba;
    ba.getdetails();
    ba.display();
    ba.deposit();
    ba.display();
    ba.withdrawl();
    ba.display();

    return 0;
}