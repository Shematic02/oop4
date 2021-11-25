package com.company;

public class Tool implements InterfaceTool {
    String toolName;
    int leight;
    int width;
    int hight;
    String nameOfVel;
    int lowLimit;
    int hightLimit;
    double fault;

    public Tool(String toolName,int leight,int width,int hight,String nameOfVel,int lowLimit,int hightLimit,double fault) {
        this.toolName=toolName;
        this.leight=leight;
        this.width=width;
        this.hight=hight;
        this.nameOfVel=nameOfVel;
        this.lowLimit=lowLimit;
        this.hightLimit=hightLimit;
        this.fault=fault;
    }


    @Override
    public String getToolName() {
        return toolName;
    }

    @Override
    public int getLeight() {
        return leight;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHight() {
        return hight;
    }

    @Override
    public String getNameOfVel() {
        return nameOfVel;
    }

    @Override
    public int getLowLimit() {
        return lowLimit;
    }

    @Override
    public int getHightLimit() {
        return hightLimit;
    }

    @Override
    public double getFault() {
        return fault;
    }

    //Переопределение Сеттеров интерфейса InterfaceTool
    @Override
    public void setToolName(String toolName) { this.toolName=toolName; }

    @Override
    public void setLeight(int leight) {
    this.leight=leight;
    }

    @Override
    public void setWidth(int width) {
    this.width=width;
    }

    @Override
    public void setHight(int hight) {
    this.hight=hight;
    }

    @Override
    public void setNameOfVel(String nameOfVel) {
    this.nameOfVel=nameOfVel;
    }

    @Override
    public void setLowLimit(int lowLimit) {
    this.lowLimit=lowLimit;
    }

    @Override
    public void setFault(int fault) {
    this.fault=fault;
    }

}
