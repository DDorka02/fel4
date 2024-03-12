package feladat4;

import java.util.Random;

public class Eldontes {
    static Random rnd = new Random();
    static final String SEP = System.lineSeparator();
    private static boolean prim;

    public static void main(String[] args) {
        eldontesFeladatok();   
    }

    private static void eldontesFeladatok() {
        int[] szamok = feltolt(7);
        konzolraIr(tombbolString(szamok) + SEP);
        vanBennePrim(szamok);
    }
    
    private static int[] feltolt(int db) {
        int [] tomb = new int [db];
        for (int i = 0; i < tomb.length; i++) {
            int n = rnd.nextInt(db);   
        }
        return new int [db];
    }
    
    private static int[] vanBennePrim(int[] szamok) {
        boolean prim = false;
        int n=9;
        while (!prim){
            int i = 2;
            while(i<Math.sqrt(n) && i != 0){
                i++;
        }
        prim= i > Math.sqrt(n);
        }
        return szamok;
    }

    private static String tombbolString(int[] szamok) {
        return "";
        
    }

    private static void konzolraIr(String string) {
        if (prim==false){
            System.out.print("Ez a szám prim");
        }
        else{
        System.out.print("nem prím");}
    }

    
    
}
