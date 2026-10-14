#include<iostream>
using namespace std;
int main(){
    int n1;
    cout<<"enter the input value: ";
    cin>>n1;
    int fac=1;
    for(int i=1;i<=n1;i++){
       fac*=i;
    }
    cout<<fac;
}