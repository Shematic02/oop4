package com.company;
/**
 * @author Землякова Е.А.
 * Вариант 9   Таблица №1 = 1,2,8     Таблица №2 = 6
 * Прибор может характизоваться:
 * 1)Названием
 * 2)Габаритами: длина,высота,ширина
 * 8)Измерением (название, верхний и нижний предел,погрешность)
 * а также:
 * 6)Диапазоном температур: tMax, tMin
 * */
public class Main {
    public static void main(String[] args){
    Tool Tool1=new Tool("Инструмент1",50,40,1,"Ампер",1,3,0.1);
    Tool Tool2=new Tool("Инструмент2",40,1500,4,"Вольт", 2,4,0.2);
    ToolSub ToolSub1=new ToolSub("Инструмент3",20,2000,2,"Ватт",4,12,0.3,25,-25);
    ToolSub ToolSub2=new ToolSub("Инструмент4",16,500,10,"ВВВВ",6,14,0.5,10,-50);

        //Вывод до изменения
        System.out.println("До изменения: \n" + "Заказ на: " + Tool1.getToolName() + "\nДлина: "
                + Tool1.getLeight() + "\nШирина: " + Tool1.getWidth() + "\nВысота: " + Tool1.getHight()
                + "\nНазвание измеряемой величины: " + Tool1.getNameOfVel()+ "\nНижний лимит: " + Tool1.getLowLimit()
        +"\nВерхний лимит: " + Tool1.getHight()+"\nПогрешность: " + Tool1.getFault());

        System.out.println("\n----------------------------------------------\n");

        System.out.println("До изменения: \n" + "Заказ на: " + Tool2.getToolName() + "\nДлина: "
                + Tool2.getLeight() + "\nШирина: " + Tool2.getWidth() + "\nВысота: " + Tool2.getHight()
                + "\nНазвание измеряемой величины: " + Tool2.getNameOfVel()+ "\nНижний димит: " + Tool2.getLowLimit()
                +"\nВерхний лимит: " + Tool2.getHight()+"\nПогрешность: " + Tool2.getFault());

        System.out.println("\n----------------------------------------------\n");

        System.out.println("До изменения: \n" + "Заказ на: " + Tool1.getToolName() + "\nДлина: "
                + Tool1.getLeight() + "\nШирина: " + Tool1.getWidth() + "\nВысота: " + Tool1.getHight()
                + "\nНазвание измеряемой величины: " + Tool1.getNameOfVel()+ "\nНижний лимит: " + Tool1.getLowLimit()
                +"\nВерхний лимит: " + Tool1.getHight()+"\nПогрешность: " + Tool1.getFault()
        +"\nМинимальная температура: "+ ToolSub1.getTMin()+"\nМаксимальная температура: "+ ToolSub1.getTMax());

        System.out.println("\n----------------------------------------------\n");

        System.out.println("До изменения: \n" + "Заказ на: " + Tool2.getToolName() + "\nДлина: "
                + Tool2.getLeight() + "\nШирина: " + Tool2.getWidth() + "\nВысота: " + Tool2.getHight()
                + "\nНазвание измеряемой величины: " + Tool2.getNameOfVel()+ "\nНижний лимит: " + Tool2.getLowLimit()
                +"\nВерхний лимит: " + Tool2.getHight()+"\nПогрешность: " + Tool2.getFault()
                +"\nМинимальная температура: "+ ToolSub2.getTMin()+"\nМаксимальная температура: "+ ToolSub2.getTMax());

        Tool1.setToolName("Мультиметр");
        Tool2.setHight(2);
        ToolSub1.setTMax(1000);
        ToolSub2.setTMin(-2000);

        System.out.println("\n----------------------------------------------\n");
        System.out.println("\nПосле изменения:\n");
        System.out.println("\n----------------------------------------------\n");

        //Вывод после изменения
        System.out.println("После изменения: \n" + "Заказ на: " + Tool1.getToolName() + "\nДлина: "
                + Tool1.getLeight() + "\nШирина: " + Tool1.getWidth() + "\nВысота: " + Tool1.getHight()
                + "\nНазвание измеряемой величины: " + Tool1.getNameOfVel()+ "\nНижний лимит: " + Tool1.getLowLimit()
                +"\nВерхний лимит: " + Tool1.getHight()+"\nПогрешность: " + Tool1.getFault());

        System.out.println("\n----------------------------------------------\n");

        System.out.println("После изменения: \n" + "Заказ на: " + Tool2.getToolName() + "\nДлина: "
                + Tool2.getLeight() + "\nШирина: " + Tool2.getWidth() + "\nВысота: " + Tool2.getHight()
                + "\nНазвание измеряемой величины: " + Tool2.getNameOfVel()+ "\nНижний лимит: " + Tool2.getLowLimit()
                +"\nВерхний лимит: " + Tool2.getHight()+"\nПогрешность: " + Tool2.getFault());

        System.out.println("\n----------------------------------------------\n");

        System.out.println("После изменения: \n" + "Заказ на: " + Tool1.getToolName() + "\nДлина: "
                + Tool1.getLeight() + "\nШирина: " + Tool1.getWidth() + "\nВысота: " + Tool1.getHight()
                + "\nНазвание измеряемой величины: " + Tool1.getNameOfVel()+ "\nНижний лимит: " + Tool1.getLowLimit()
                +"\nВерхний лимит: " + Tool1.getHight()+"\nПогрешность: " + Tool1.getFault()
                +"\nМинимальная температура: "+ ToolSub1.getTMin()+"\nМаксимальная температура: "+ ToolSub1.getTMax());

        System.out.println("\n----------------------------------------------\n");

        System.out.println("После изменения: \n" + "Заказ на: " + Tool2.getToolName() + "\nДлина: "
                + Tool2.getLeight() + "\nШирина: " + Tool2.getWidth() + "\nВысота: " + Tool2.getHight()
                + "\nНазвание измеряемой величины: " + Tool2.getNameOfVel()+ "\nНижний лимит: " + Tool2.getLowLimit()
                +"\nВерхний лимит: " + Tool2.getHight()+"\nПогрешность: " + Tool2.getFault()
                +"\nМинимальная температура: "+ ToolSub2.getTMin()+"\nМаксимальная температура: "+ ToolSub2.getTMax());
    }
}

