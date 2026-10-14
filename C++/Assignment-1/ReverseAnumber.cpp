#include<iostream>
using namespace std;
int main(){
    int n1,num2=0;
    cout<<"enter the input value: ";
    cin>>n1;
    while(n1>0){
        num2=num2*10+(n1%10);
        n1=n1/10;

    }
  cout<<"the reverse number : "<<num2;
}