#include <iostream>
#include <iterator>
using namespace std;

int main(){
    int arr[]={10, 9, 12, 17, 13, 12, 11, 10, 19, 18};

    
    int maxele=arr[0];
    int minele=arr[0];
    int sum=0;
    int count=0;
    int len = sizeof(arr) / sizeof(arr[0]);
    for(int i=0;i<len;i++){
        //Find the most expensive and cheapest item.
        if(maxele<arr[i]){
            maxele=arr[i];
        }
        if(minele>arr[i]){
            minele=arr[i];
        }
        //Calculate the average price of all items.
        sum+=arr[i];
        //Count how many items cost more than ₹500.
        if(arr[i]>500){
            count++;
        }
        


    }
    //Sort the prices in ascending order and display them.
    for(int i=0;i<len;i++){
        for(int j=i+1;j<len;j++){
            
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
    }
    cout<<"the most expensive item "<<maxele<<endl;
    cout<<"the Chespest item "<<minele<<endl;
    cout<<"Average price "<<sum/len <<endl;
    cout<<"items cost more than 500 "<<count<<endl;
    cout<<"Sored array by price"<<endl;
    for(int i=0;i<len;i++){
        cout<<arr[i]<<" , ";
    }
    
}