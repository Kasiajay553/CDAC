#include<iostream>
using namespace std;
int main(){
    int n1;
    cout<<"enter the input value: ";
    cin>>n1;
    int n2=n1;
    int temp=n1;
    int sum=0;
    int count=0;
   while(n1>0){
    n1=n1/10;
    count++;
   }while(temp>0){
        int digit=1;
        for(int i=1;i<=count;i++){
            digit*=temp%10;
        }
       //sum += round(pow(remainder, digitCount)); 
        sum+=digit;
        temp=temp/10;
   }

   if(sum==n2){
    cout<< "it is Armstrong number"; 
   }
   else{
    cout<< "it is  NOT a Armstrong number";
   }
}
