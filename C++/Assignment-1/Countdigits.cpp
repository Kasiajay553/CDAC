#include<iostream>
using namespace std;
int main(){
    int n1,count=0;
    cout<<"enter the input value: ";
    cin>>n1;
    while(n1>0){
        n1=n1/10;
        count++;
    }
  cout<<"the  number of digits "<<count;
}