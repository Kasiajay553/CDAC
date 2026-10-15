#include <iostream>
using namespace std;

int main()
{

    double arr[] = {250.0, 1200.0, 450.0, 3200.0, 950.0, 150.0, 1100.0, 600.0};
    double uparr[sizeof(arr) / sizeof(arr[0])];
    int len = sizeof(arr) / sizeof(arr[0]);
    double mostexp=arr[0];
    double leastexp=arr[0];
    //Apply a 10% discount on all items above ₹1000 and update prices.
    for(int i=0;i<len;i++){
        if(arr[i]>1000){
            uparr[i]=arr[i]-arr[i]*0.10;
        }
        else{
            uparr[i]=arr[i];
        }
        //Find the most and least expensive item.
        if(mostexp<arr[i]){
            mostexp=arr[i];
        }
        if(leastexp>arr[i]){
            leastexp=arr[i];
        }
        
    }

    for(int i=0;i<len;i++){
        cout<<uparr[i]<<",";
    }
    cout<<endl<<"the most expensive : "<<mostexp<<endl<<"the least Expensive : "<<leastexp<<endl;
    //Calculate total bill before and after discount.
    double sum=0;
    for(int i=0;i<len;i++){
        sum+=uparr[i];
    }
    cout<<"total bill is : "<<sum<<endl;
    //Remove an item by setting its price to 0, then display updated cart.
    cout<<"eneter the item to buy"<<endl;
    int rem;
    cin>>rem;
    for(int i=0;i<len;i++){
        if(rem==i){
        uparr[i]=0;
        cout<< "the item is removed from the card"<<endl;
        }
    }

    //Count items that are eligible for GST (price > ₹500).
    for(int i=0;i<len;i++){
        if(arr[i]>500){
            cout<<"the product is eligible for the  GST : "<<i<<endl;
        }
    }

    return 0;
}