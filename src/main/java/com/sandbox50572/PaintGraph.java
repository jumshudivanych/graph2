package com.sandbox50572;

import javax.swing.*;
import java.awt.*;

public class PaintGraph extends JPanel {

    private int xNull;
    private int yNull;
    private int ax; //150 сек
    private int bx; //300 сек
    private int cx; //450 сек
    private int dx; //600 сек time
    private int ex; //750 сек
    private int fx; //900 сек
    private int gx; //1050
    private int hx; //1200 2time
    private int ix; //1350
    private int jx; //1500
    private int kx; //1650
    private int lx; //1800 3time
    private int mx; //1950
   private int nx; //2100
    private int ox; //2250
    private int px;//2400 end
    private int xTab;//шаг табуляции
    private int count;//текущий счет
    private int time;//текущее время

    //Конструктор
    public PaintGraph()
    {
        //начало координат
        xNull = 100;
        yNull = 600;
        xTab = 25;
        //Временные метки по оси X
        ax = xNull + xTab;
        bx = ax + xTab;
        cx = bx + xTab;
        dx = cx + xTab;
        ex = dx + xTab;
        fx = ex + xTab;
        gx = fx + xTab;
        hx = gx + xTab;
        ix = hx + xTab;
        jx = ix + xTab;
        kx = jx + xTab;
        lx = kx + xTab;
        mx = lx + xTab;
        nx = mx + xTab;
        ox = nx + xTab;
        px = ox + xTab;
        count = 0;
        time = 0;
       /*
        ny = 10;// цена деления  по шкалам
        ky = (float)0.5; // коэф шкалы по у
        kx = (float)0.5; // коэф шкалы по x
        oyn = 100; // начальный отступ по y
        oxn = 100 ; //начальный отступ по х
        ly = 500; // длина оси у
        lx = 400; // длина оси х
        // по умолчанию в начале на экран выводится график y=x
        sw = 1; // свич для переключения графика функции
        hx = (float)0.011;//шаг табуляции
        */
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        //TODO Тут проба
        //g.setColor(Color.red);
        //g.drawLine(600, 400, 600, 0);
        //g.setColor(Color.green);
        g.setColor(Color.BLACK);
        g.drawRect(100, 100, 400, 500);//прямоугольник
        //вертикали
        g.drawLine(200, 100, 200, 600);
        g.drawLine(300, 100, 300, 600);
        g.drawLine(400, 100, 400, 600);
        //горизонтали
        g.drawLine(100, 200, 500, 200);
        g.drawLine(100, 300, 500, 300);
        g.drawLine(100, 400, 500, 400);
        g.drawLine(100, 500, 500, 500);

        // Надпись
        g.drawString("T", 520, 600);
        g.drawString( "50", 520, 500);
        g.drawString("75", 520, 450);
        g.drawString("100", 520, 400);
        g.drawString("125", 520, 350);
        g.drawString("150", 520, 300);
        g.drawString("175", 520, 250);
        g.drawString("200", 520, 200);
        g.drawString("225", 520, 150);
        g.drawString("250", 520, 100);


        //Деления
        g.drawLine(125, 600, 125, 595);
        g.drawLine(150, 600, 150, 590);
        g.drawLine(175, 600, 175, 595);
        g.drawLine(225, 600, 225, 595);
        g.drawLine(250, 600, 250, 590);
        g.drawLine(275, 600, 275, 595);
        g.drawLine(325, 600, 325, 595);
        g.drawLine(350, 600, 350, 590);
        g.drawLine(375, 600, 375, 595);
        g.drawLine(425, 600, 425, 595);
        g.drawLine(450, 600, 450, 590);
        g.drawLine(475, 600, 475, 595);

        g.drawLine(495, 575, 500, 575);
        g.drawLine(490, 550, 500, 550);
        g.drawLine(495, 525, 500, 525);
        g.drawLine(495, 475, 500, 475);
        g.drawLine(490, 450, 500, 450);
        g.drawLine(495, 425, 500, 425);
        g.drawLine(495, 375, 500, 375);
        g.drawLine(490, 350, 500, 350);
        g.drawLine(495, 325, 500, 325);
        g.drawLine(495, 275, 500, 275);
        g.drawLine(490, 250, 500, 250);
        g.drawLine(495, 225, 500, 225);
        g.drawLine(495, 175, 500, 175);
        g.drawLine(490, 150, 500, 150);
        g.drawLine(495, 125, 500, 125);

        myFuncLine(g);
        /*
        //Разбиваем каждую ось на две части для удобства переноса центра координат
        // Ось Y
        g.drawLine( ( int ) ( lx * kx + oxn ) , oyn ,
                ( int ) ( lx * kx+ oxn ) , ly + oyn );
        // Стрелки
        g.drawLine( ( int ) ( lx * kx + oxn) , oyn ,
                ( int ) ( lx * kx + oxn ) - 3 , oyn + 10 );
        g.drawLine( ( int ) ( lx * kx + oxn) , oyn ,
                ( int ) ( lx * kx + oxn) + 3 , oyn + 10 );
        // Надпись
        g.drawString( "Y" , ( int ) ( lx * kx + oxn) - 10 , oyn + 10 );
        g.drawString( "0" , ( int ) ( lx * kx + oxn ) - 10 , ( int) ( ly * ky+ oyn) + 10 );
        //Деления
        int l1 = ( int ) (ly*ky);
        l2 = ly - l1;
        int k1 = ( int ) l1 / ny ;
        int k2 = ( int ) l2 / ny ;
        for ( int i = 1; i < k1 + 1 ; i++)
        {
            g.drawLine( ( int )(lx * kx - 2 + oxn) , l1 - ny+ oyn ,
                    ( int ) ( lx * kx + 2+ oxn ) , l1 - ny+ oyn );
            l1 = l1 - ny ;
        }
        l1 = ly - l2;
        for ( int i = 1; i < k2 + 1 ; i++)
        {
            g.drawLine( ( int )(lx * kx - 2 + oxn) , l1 + ny+ oyn ,
                    ( int )(lx * kx + 2+ oxn ) , l1 + ny+ oyn );
            l1 = l1 + ny ;
        }
        // Ось Х
        g.drawLine( oxn , ( int ) ( ly * ky + oyn) , lx + oxn,  ( int ) ( ly * ky + oyn)  );
        g.drawLine( lx+ oxn , ( int ) ( ly * ky + oyn ) , lx+ oxn - 10 ,
                ( int ) ( ly * ky + oyn) - 3 );
        g.drawLine( lx + oxn, ( int ) ( ly * ky + oyn) , lx+ oxn - 10 ,
                ( int ) ( ly * ky+ oyn ) + 3 );
        // Надпись
        g.drawString( "Х" , lx+ oyn -10 , ( int ) ( ly * ky+ oyn ) - 10 );
        // Деления
        l1 = ( int ) ( lx * kx );
        l2 = lx - l1;
        k1 = ( int ) l1 / ny ;
        k2 = ( int ) l2 / ny ;
        for ( int i = 1; i <  k1 + 1 ; i++)
        {
            g.drawLine( l1 - ny + oxn ,( int ) ( ly * ky - 2+ oyn) ,
                    l1 - ny + oxn , ( int ) ( ly * ky + 2 + oyn )  );
            l1 = l1 - ny ;
        }
        l1 = lx - l2;
        double xl = l1/ny;
        double xl1 = l2/ny;
        for ( int i = 1; i < k2 + 1 ; i++)
        {
            g.drawLine( l1 + ny+ oxn ,( int )(ly* ky - 2+ oyn) ,
                    l1 + ny + oxn , ( int )(ly * ky + 2+ oyn )  );
            l1 = l1 + ny ;
        }
        // Выбор метода для рисования функции
        switch (sw)
        {
            case 1 :
                funcLine(g);
                break;

            case 2 :
                funcPar(g);
                break;

            case 3 :
                funcGip(g);
                break;
        }
        */
    }


    // группа методов рисующих графики функций
    // Метод рисующий линию

    public void myFuncLine(Graphics g) {

        //установка цвета
        g.setColor(Color.green);
        //graphics.setColor(Color.red);

        //текущий счет и определение кооринаты Y
        int newCount = yNull - count;

        g.drawLine(xNull, yNull, ax, newCount);

    }


    /*
    void funcLine(Graphics g)
    {
        xln = ( lx - l2 ) ;
        xk = 0 ;
        yg = 0;
        while(   ( xk + hx )  * ny < xln  &&  ( xk + hx )* ny < ly - ly * ky )
        {
            yg =  xk  ;
            g.drawLine( ( int ) ( xln - xk * ny+ oxn ) ,
                    ( int ) ( ly * ky + yg * ny + oyn),
                    ( int ) ( xln -  ( xk + hx ) * ny + oxn ),
                    ( int ) ( ly * ky + ( xk + hx )  * ny )+ oyn) ;
            xk = xk + hx ;
        }
        xk = 0 ;
        yg = 0;
        while(   ( xk + hx )  * ny < l2 &&  ( xk + hx )  * ny < ly * ky )
        {
            yg =  xk  ;
            g.drawLine( ( int ) ( xln + xk * ny+ oxn ) ,
                    ( int ) ( ly * ky - yg * ny+ oyn ),
                    ( int ) ( xln +  ( xk + hx ) * ny+ oxn ),
                    ( int ) ( ly * ky - ( xk + hx )  * ny  )+ oyn) ;
            xk = xk + hx ;
        }
    }

    // Метод рисующий параболу
    void funcPar(Graphics g)
    {
        xln = ( lx - l2 ) ;
        xk = 0 ;
        yg = 0;
        int kp = 0;
        while( ( xk + hx ) * ny < xln && Math.pow ( xk + hx , 2 ) * ny < ly * ky )
        {
            g.drawLine( ( int ) ( xln - xk * ny + oxn ) ,
                    ( int ) ( ly * ky - yg * ny  + oyn),
                    ( int ) ( xln -  ( xk + hx ) * ny + oxn ),
                    ( int ) ( ly * ky - Math.pow ( xk + hx , 2 ) * ny+ oyn) );
            xk = xk + hx ;
            yg = (float)Math.pow ( xk , 2 ) ;
            kp++;
        }
        xk = 0 ;
        yg = 0;
        while(  ( xk + hx ) * ny < l2 && Math.pow ( xk + hx , 2 )* ny < ly * ky )
        {
            yg = (float)Math.pow ( xk , 2 ) ;
            g.drawLine( ( int ) ( xln + xk * ny + oxn) ,
                    ( int ) ( ly * ky - yg * ny + oyn),
                    ( int ) ( xln +  ( xk + hx ) * ny+ oxn ),
                    ( int ) ( ly * ky - Math.pow ( xk + hx , 2 )  * ny  )+ oyn) ;
            xk = xk + hx;
        }
    }
    // Метод рисующий гиперболу
    void funcGip(Graphics g)
    {
        xk = 0 ;
        yg = 0;
        xln = ( lx - l2 ) ;
        while(   ( xk + hx ) * ny < xln && Math.pow ( xk + hx , 3 )* ny < ly - ly * ky )
        {
            yg = (float)Math.pow ( xk , 3 ) ;
            g.drawLine( ( int ) ( xln - xk * ny+ oxn ) ,
                    ( int ) ( ly * ky + yg * ny + oyn),
                    ( int ) ( xln -  ( xk + hx ) * ny+ oxn ),
                    ( int ) ( ly * ky + Math.pow ( xk + hx , 3 )  * ny  )+ oyn) ;
            xk = xk + hx ;
        }
        xk = 0 ;
        yg = 0;
        while(  ( xk + hx ) * ny < l2 && Math.pow ( xk + hx , 3 )* ny < ly * ky )
        {
            yg = (float)Math.pow ( xk , 3 ) ;
            g.drawLine( ( int ) ( xln + xk * ny + oxn) ,
                    ( int ) ( ly * ky - yg * ny + oyn),
                    ( int ) ( xln +  ( xk + hx ) * ny+ oxn ),
                    ( int ) ( ly * ky - Math.pow ( xk + hx , 3 )  * ny  )+ oyn) ;
            xk = xk + hx;
        }
    }
*/
    //TODO Добавить обновление текущего времени и счета с сайта
    // группа getXXX(), setXXX() - методов
    public void setCount(int count) {
        this.count = count;
    }
    public int getCount() {
        return count;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public int getTime() {
        return time;
    }
}
