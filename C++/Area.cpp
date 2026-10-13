#include <iostream>

using namespace std;
int main(){
  
   cout<<"---------------------------------------\n";
   cout<<"choose the function you want to do\n";
   cout<<"1. Area of Rectangle \n";
   cout<<"2. Area of Square\n";
   cout<<"3. Area of Circle\n";

   cout<<"enter the the choice :\n";
   int choice;
   cin>>choice;
   switch(choice){
      case 1:{
         int length,width;
         cout<<"enter the length and width\n";
         cin>>length;
         cin>>width;
         cout<<length*width<<endl;
         break;
      }
         
      case 2:{
         int side;
         cout<<"enter the value \n";
         cin>>side;
         cout<<side*side<<endl;
         break;
      }
      case 3:{
         float pi=3.14; 
         int radius;
         cout<<"enter the radius of circle\n";
         cin>>radius;
         cout<<pi*radius*radius<<endl;
         break;
   }
      default :
         cout<<"Enter a Valid choice";
       
   }
   

   return 0;
}
