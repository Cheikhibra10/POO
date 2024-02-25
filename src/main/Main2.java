package main;

import implement.ICalcuIImple;
import implement.ICalcul;
import implement.ICalculImple2;
public class Main2 {
    public static void main(String[] args)  {
        ICalcul cl = new ICalcuIImple();
        ICalcul cl2 = new ICalculImple2();

        try {
            System.out.println(cl2.add(4,5,1));
            System.out.println(cl2.sub(20,10));
            System.out.println("-----------");
            System.out.println(cl.add(13));
            System.out.println(cl.sub(20,10));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
