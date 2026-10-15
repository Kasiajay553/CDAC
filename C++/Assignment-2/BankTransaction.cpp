#include <iostream>
#include <iterator>
using namespace std;

int main(){
    // 12 months of transaction amounts (Positive = Credit, Negative = Debit)
int arr[] = {1200, -450, 2500, -1100, -85, 3000, -1500, 450, -200, 1800, -950, 3500};


    
    int maxele=arr[0];
    int minele=arr[0];
    int hic=0;
    int hid=0;
    int sum=0;
    int crcount=0;
    int decount=0;
    int len = sizeof(arr) / sizeof(arr[0]);
    for(int i=0;i<len;i++){
        //Calculate the net balance at end of year.
        sum+=arr[i];


        //Find the month with highest credit and highest debit.
        if(maxele<arr[i]){
            maxele=arr[i];
            hic=i;
        }
        if(minele>arr[i]){
            minele=arr[i];
            hid=i;
        }
        
        //Count the number of credit and debit transactions separately
        if(arr[i]>0){
           crcount++;
        }
        else{
            decount++;
        }
        


    }

    
    cout<<"Net Balanace "<<sum <<endl;
    cout<<"the highest credit amount " <<maxele<<" in the  month of : "<<hic<<endl<<"The highest debit amount " <<minele<<" in the  month of : "<<hid<<endl;
    cout<<"number of credit : "<<crcount<<endl<<"number of debit : "<<decount<<endl;
    cout<<"all months where the transaction was a debit"<<endl;
    for(int i=0;i<len;i++){
        if(arr[i]<0){
            cout<<"The amount debit is  "<<-(arr[i])<<" in the month of : "<<i<<endl;
        }
        
    }
    
}