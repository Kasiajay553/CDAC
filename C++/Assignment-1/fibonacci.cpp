#include<iostream>
using namespace std;
int main(){
    int n1;
    cout<<"enter the input value: ";
    cin>>n1;
    int num=0;
    int num2=1;
    for(int i=1;i<=n1;i++){
        cout<<num<<',';
        int num3=num+num2;
        num=num2;
        num2=num3;
    }
}
