#include<iostream>
using namespace std;

int main(){
 int n1;
  cout<<"enter the input value: ";
 cin>>n1; 
 int count=1;
 for(int i=2;i<0.5*n1;i++){
    if(n1/i==0){
        count=0;
    }
 }  
 if(count==0){
    cout<<"not a prime number";
 }
 else{
    cout<<"prime";
 }
}