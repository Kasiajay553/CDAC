#include<iostream>
using namespace std;
int main(){
 int n1;
 long long int sum=0;
 cout<<"enter the input value: ";
 cin>>n1;
 while(n1>0){
    sum=sum+n1;
    n1--;
 }   
 cout<<"the sum of n natural numbers is: "<<sum;
}