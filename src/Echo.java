/**
 * Created by Lauri on 19.10.2016.
 */

import java.util.Scanner;

public class Echo {
    public static void main(String[] args){
        String line;
        Scanner in = new Scanner(System.in);


        System.out.print("Kirjuta midagi:");
        line = in.nextLine();
        System.out.println("Sa kirjutasid: " + line);

        System.out.print("Kirjuta midagi muud: ");
        line = in.nextLine();
        System.out.println("Sa kirjutasid: " + line);

        int inch;
        double cm;
        double cmPerInch = 2.54;
        final double CM_PER_INCH = 2.54;

        System.out.print("How many inches? ");
        inch = in.nextInt();
        cm = inch * cmPerInch;

        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");

        int esimenearv;
        int teinearv;
        int summa;

        System.out.print("Kirjuta üks arv: ");
        esimenearv = in.nextInt();
        System.out.print("Kirjuta teine arv: ");
        teinearv = in.nextInt();
        summa = esimenearv + teinearv;
        System.out.print("Arvude summa on: " + summa);







    }

}
