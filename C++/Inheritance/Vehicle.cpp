#include <iostream>
using namespace std;

class Vehicle
{
protected:
    string vehicleNo, brand;

public:
    void getVehicle()
    {
        cout << "Enter Vehicle Number: ";
        cin >> vehicleNo;

        cout << "Enter Brand: ";
        cin >> brand;
    }
};

class Car : public Vehicle
{
protected:
    string model, fuel;

public:
    void getCar()
    {
        getVehicle();

        cout << "Enter Model Name: ";
        cin >> model;

        cout << "Enter Fuel Type: ";
        cin >> fuel;
    }
};

class ElectricCar : public Car
{
    float battery, chargingTime;

public:
    void getDetails()
    {
        getCar();

        cout << "Enter Battery Capacity: ";
        cin >> battery;

        cout << "Enter Charging Time: ";
        cin >> chargingTime;
    }

    void display()
    {
        cout << "\nVehicle Details";
        cout << "\nVehicle Number: " << vehicleNo;
        cout << "\nBrand: " << brand;
        cout << "\nModel Name: " << model;
        cout << "\nFuel Type: " << fuel;
        cout << "\nBattery Capacity: " << battery;
        cout << "\nCharging Time: " << chargingTime;
    }
};

int main()
{
    ElectricCar e;

    e.getDetails();
    e.display();

    return 0;
}
