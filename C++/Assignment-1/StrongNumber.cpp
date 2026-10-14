#include<iostream>
using namespace std;
int main(){
    int n1;
    cout<<"enter the input value: ";
    cin>>n1;
  
    int temp=n1;
    int sum=0;
   
  while(temp>0){
        int digit=temp%10;
        int facsum=1;
        for(int i=1;i<=digit;i++){
         facsum*=i;
        }
      
        sum+=facsum;
        temp=temp/10;
   
   }

   if(sum==n1){
    cout<< "it is strong number"; 
   }
   else{
    cout<< "it is  NOT a strong number";
   }
}