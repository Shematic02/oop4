package com.company;

public interface InterfaceTool {
    //Геттеры
    String getToolName();
    int getLeight();
    int getWidth();
    int getHight();
    String getNameOfVel();
    int getLowLimit();
    int getHightLimit();
    double getFault();

    //Сеттеры
    void setToolName(String toolName);
    void setLeight(int leight);
    void setWidth(int width);
    void setHight(int hight);
    void setNameOfVel(String nameOfVel);
    void setLowLimit(int lowLimit);
    void setFault(int fault);
}
