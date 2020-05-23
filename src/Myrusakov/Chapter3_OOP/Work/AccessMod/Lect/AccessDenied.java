package Myrusakov.Chapter3_OOP.AccessMod.Lect;

import Myrusakov.Chapter3_OOP.FourthLesson.Lect.Firm;

public class AccessDenied {
    public String java1; // доступ к объекту из всего проекта. избегаем использование
    protected String city; // свойство доступно внутри пакета и во всех классах наследниках. Используем для дочерних классов
    private int age; // свойство дотупно только внутри этого класса. Свойства получаем с помощью public get методов
    public static void main(String[] args) {
        String java; // модификатор доступа по умолчанию. дает доступ к объектам внутри класса и всего пакета, в котором находится класса
        Firm f = new Firm("NewFirm", "Pave;", 23);
        System.out.println(f.nameFirm);
        TestPrivate tp = new TestPrivate("11", "22", "33", "44");
        System.out.println(tp.valueDef);
    }
}
