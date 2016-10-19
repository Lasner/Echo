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

    }

}
