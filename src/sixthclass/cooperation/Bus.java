package sixthclass.cooperation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber)
    {
        this.busNumber = busNumber;


    }

    public void take(int money)
    {
        this.money += money;
        passengerCount++;
    }

    public void showInfo()
    {
        System.out.println("버스"+busNumber+"번 승객"+passengerCount+"명이고 수입"+money);
    }
}
