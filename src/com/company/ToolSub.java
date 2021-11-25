package com.company;

//Этот класс дополняет класс Tool и переобределяет функции интерфейса InterfaceToolSub
public class ToolSub extends Tool implements InterfaceToolSub{
    int tMax;               //Максимальная температура(6)
    int tMin;               //Минимальная температура(6)

    public ToolSub(String toolName, int leight, int width, int hight, String nameOfVel, int lowLimit, int hightLimit, double fault
    ,int tMax,int tMin) {
        super(toolName, leight, width, hight, nameOfVel, lowLimit, hightLimit, fault);
        this.tMax=tMax;
        this.tMin=tMin;
    }


    @Override
    public int getTMax() { return this.tMax; }

    @Override
    public int getTMin() { return this.tMin; }

    @Override
    public void setTMax(int tMax) { this.tMax=tMax; }

    @Override
    public void setTMin(int tMin) { this.tMin=tMin; }
}
