package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String toPrint = "*";

        for(int i = 0; i < 5; i++)
        {
            System.out.println(toPrint);
            toPrint += "*";
        }

        System.out.println("\n" + "J'ai été capable d'imprimer un triangle avec le caractère '*' avec java... Incroyable.");
    }
}
