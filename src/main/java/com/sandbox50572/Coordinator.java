package com.sandbox50572;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Coordinator extends JFrame implements Runnable {

    PaintGraph pg; // класс вывода графика функции
    ButPan bp; // класс управляющих масштабом кнопок

    public Coordinator() {

        super("Построение графика функции");
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); // установка менеджера размещения
        pg = new PaintGraph(); // инициализация класса построения графика функции
        pg.setSize(600, 450); // задание размеров
        c.add(pg, BorderLayout.CENTER); // задание размещения
        //bp = new ButPan(pg); // инициализация класса кнопок масштаба
        //c.add(bp,BorderLayout.WEST);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // задание параметров
        // главного окна при закрытии
        setVisible(true);

    }

    @Override
    public void run() {

        //TODO тут организовать получение времени и счета с сайта
        while (true) {
            // ограничить временем игры
            //пока заглушка случайный счет
            Random random = new Random(25);
            int i = random.nextInt(40);



            pg.setCount(i);

            //pg.myFuncLine();

            //Задержка на 30 сек
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
