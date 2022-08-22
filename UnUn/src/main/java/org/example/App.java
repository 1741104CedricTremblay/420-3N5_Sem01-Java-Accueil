package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    static void sequence(String source, int longueur) {
        for(int i = 0; i < longueur; i++) {
            System.out.println(source);
            source = unUn(source);
        }
    }

    static String unUn(String source)
    {
        String nouveauString = "";

        try {
            char dernierCharactere = ' ';

            for(int i = 0; i < source.length(); i++) { // Charactère courant

                if(source.charAt(i) == dernierCharactere){ // On regarde si c'est le même charactère que la précédente.
                    continue;
                }
                else { dernierCharactere = source.charAt(i); }

                int iterations = 0; // Nombre d'itération pour le caractère courant.

                for(int index2 = i; index2 < source.length(); index2++) {
                    if(source.charAt(i) == source.charAt(index2)) {
                        iterations++;
                    }
                    else{
                        break;
                    }
                }

                String valeurIteration = String.valueOf(iterations);
                nouveauString += valeurIteration + source.charAt(i);
            }
        }
        catch (NullPointerException e){
            System.err.println("Il n'y a pas de string source.");
            e.printStackTrace();
        }

        return nouveauString;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println(unUn("111213"));

        System.out.println();

        sequence("1", 6);
    }
}
