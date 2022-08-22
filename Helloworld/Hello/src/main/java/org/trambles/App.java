package org.trambles;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Bonjour le monde!" );

        try
        {
            Document doc = Jsoup.connect("https://www.perdu.com/").get();
            Elements h1 = doc.select("h1"); // a with href
            System.out.println( "J'ai trouvé un site web!" );
        }
        catch (IOException e)
        {
            System.err.println("Cela n'a pas marché... Pas trouvé de site.");
            e.printStackTrace();
        }
        /*log(doc.title());
        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
            log("%s\n\t%s",
                    headline.attr("title"), headline.absUrl("href"));*/

    }
}
