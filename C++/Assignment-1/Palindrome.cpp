#include<iostream>
using namespace std;
int main(){
    int n1;
    cout<<"enter the input value: ";
    cin>>n1;
    int n2=n1;
    int rev=0;
    while(n1>0){
        rev=rev*10+(n1%10);
        n1=n1/10;
        
    }
  if(rev==n2){
    cout<< "the number is  Palindrome";
  }
  else{
    cout<< "the number is not a Palindrome";
  }
}