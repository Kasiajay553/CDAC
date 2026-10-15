#include <iostream>
using namespace std;

int main()
{
    int arr[] = {
        8500, 12400, 4500, 9200, 15000, 7100, 3200,
        11200, 6800, 5400, 13500, 2100, 8900, 9400,
        16800, 4300, 7600, 10500, 5000, 6200, 14000,
        1800, 9100, 11000, 6300, 5700, 12900, 8800,
        3900, 15500};

    int maxele = arr[0];
    int minele = arr[0];
    int bestsalesMon = 0;
    int worstsalesmon = 0;
    int sum = 0;
    int count = 0;
    int found = 0;
    int len = sizeof(arr) / sizeof(arr[0]);
    for (int i = 0; i < len; i++)
    {
        // Find the best selling day and worst selling day.
        if (maxele < arr[i])
        {
            maxele = arr[i];
            bestsalesMon = i;
        }
        if (minele > arr[i])
        {
            minele = arr[i];
            worstsalesmon = i;
        }
        // Calculate total monthly revenue.
        sum += arr[i];

        // Find days where sales exceeded ₹10,000.
        if (arr[i] > 10000)
        {
            count++;
        }
    }

    cout << "THE best sale amount is : " << maxele << " the month is : " << bestsalesMon << endl;
    cout << "THE worst sale amount is : " << minele << " the month is : " << worstsalesmon << endl;
    cout << "the total revenue is : " << sum << endl;
    cout << "the number of days the  daily  sales is greater than 10000 " << count << endl;

    // Implement a search to check if a speci􀏐ic sale amount exists in the data.
    cout << "Enetr the amount to search" << endl;
    int amount;
    cin >> amount;
    for (int i = 0; i < len; i++)
    {
        
        if (arr[i] == amount)
        {
            found = 1;
            break;
        }
        else
        {
            found = 0;
        }
    }
    if (found == 1)
    {
        cout << "the serached  sale is found" << endl;
    }
    else
    {
        cout << "the serached  sale is  NOT found" << endl;
    }

    return 0;
}
