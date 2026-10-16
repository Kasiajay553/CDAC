#include <iostream>
using namespace std;
void sort(int prices[],int len)
{
   
    for (int i = 0; i < len; i++)
    {
        for (int j = i+1; j < len; j++)
        {
            if (prices[i] > prices[j])
            {

                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
    }
    for(int i=0;i<len;i++){
        cout<<prices[i]<<" , ";
    }
    cout<<endl<<"the cheapest price : "<<prices[0]<<endl;
     cout<<"the costliest price : "<<prices[len-1]<<endl;

}
int main()
{
    // An array containing the prices of 15 different mobile phones
    int prices[15] = {299, 899, 149, 1199, 450, 799, 199, 1399, 649, 350, 999, 249, 549, 1299, 499};
    int len = sizeof(prices) / sizeof(prices[0]);

    sort(prices,len);

    return 0;
}
