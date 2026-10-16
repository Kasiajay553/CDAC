#include <iostream>
using namespace std;

void totalvotes(int votes[],int n){
    int total=0;
    for(int i=0;i<n;i++){
        total+=votes[i];
    }
    cout<<"The total votes polled is : "<<total<<endl;
}

void diffvotes(int votes[],int n){
    int maxvote=votes[0];
    int runnervote=votes[0];

    for(int i=0;i<n;i++){
        if(maxvote<votes[i]){
            runnervote = maxvote;
            maxvote=votes[i];
        }
        else if(votes[i]>runnervote && runnervote<maxvote){
            runnervote=votes[i];
        }
    }
    cout<<"the difference betwwen the  winner and runner in votes : "<<maxvote-runnervote<<endl;
}

int main()
{
    int votes[] = {3420, 5130, 1250, 4890, 940};
    int n = sizeof(votes) / sizeof(votes[0]);

    totalvotes(votes,n);

    diffvotes(votes,n);

    return 0;
}