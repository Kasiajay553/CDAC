#include <iostream>
using namespace std;

int main()
{

    int arr[] = {
        1, 1, 1, 1, 0, 1, 0, 1, 1, 0, // Seats 1-10
        1, 1, 1, 1, 1, 0, 1, 1, 0, 1, // Seats 11-20
        1, 1, 0, 1, 1, 1, 1, 1, 1, 1, // Seats 21-30
        0, 1, 1, 1, 0, 1, 1, 1, 1, 0, // Seats 31-40
        1, 1, 1, 1, 1, 1, 1, 1, 0, 1  // Seats 41-50
    };

    int booked = 0;
    int available = 0;
    int len = sizeof(arr) / sizeof(arr[0]);
    for (int i = 0; i < len; i++)
    {
        // Count total booked and available seats.
        if (arr[i] == 1)
        {
            booked++;
        }
        else
        {
            available++;
        }
    }
    cout << "the number seats  booked is :" << booked << endl;
    cout << "the number seats available is : " << available << endl;
    // Display all available seat numbers.
    for (int i = 0; i < len; i++)
    {
        if (arr[i] == 0)
        {
            cout << "the available seat is : " << i << endl;
        }
    }
    // Book the 􀏐irst available seat and update the array.
    for (int i = 0; i < len; i++)
    {
        if (arr[i] == 0)
        {
            arr[i] = 1;
            cout << "the first  seat is booked  the seats number is : " << i << endl;
            break;
        }
    }

    // Check if a speci􀏐ic seat number is available or not.
    cout << "enter the seats to check "<<endl;
    int check;
    int found=0;
    cin >> check;
    for (int i = 0; i < len; i++)
    {
        if (arr[i] == check && check == 0)
        {
            cout << "the is available" << endl;
            found=1;
            break;
        }
       
    }
    if(found==0){
        cout<<"the seats is not availabe"<<endl;
    }
    // Find the last available seat in the flight.
    for (int i = len - 1; i >= 0; i--)
    {
        if (arr[i] == 0)
        {
            arr[i] = 1;
            cout << "the last  seat is avaible and the seats number is : " << i << endl;
            break;
        }
    }
}