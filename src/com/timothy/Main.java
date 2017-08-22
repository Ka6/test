package com.timothy;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Привет, сколько километров намотал?");
        int KMsum = Integer.parseInt(reader.readLine());
        System.out.println("Сколько раз до Детского дома и обратно прокатился?");
        int ddN = Integer.parseInt(reader.readLine());
        int KMost = KMsum - ddN * 30; /* Расчет остаточного километража, после курсирования Д.дом - Новоуральск*/
        System.out.println("Остаточный ккилометраж " + KMost + " км.");
        double racx = KMsum * 0.0861 ; /* Расчет расхода бензина*/
        System.out.println("При этом ты прокатал " + racx + " литров.");
        System.out.println("А сколько литров у тебя было в баке с начала смены?");
        double ostBegin = Double.parseDouble(reader.readLine());
        System.out.println("А ты сегодня заправлялся?");
        String s1 = reader.readLine();
        String s = "y";
            if (s.equals(s1)) {System.out.println("И сколько же ты залил?");
                        double zapr = Double.parseDouble(reader.readLine());
                        System.out.println("У тебя в баке должно остаться " + ((ostBegin + zapr) - racx));}
            else System.out.println("У тебя в баке должно остаться " + (ostBegin - racx));
        System.out.println("Напиши сколько пробег на предидущую смену");
        int probeg = Integer.parseInt(reader.readLine());
        int finalProbeg = probeg + KMsum;
        System.out.println("Пробег пиши " + finalProbeg);



    }
}
