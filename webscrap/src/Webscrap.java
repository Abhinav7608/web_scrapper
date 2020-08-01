
import java.io.IOException;
 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 
public class Webscrap {
 
  public static void main(String[] args) {
    try {
      // fetch the document over HTTP
      Document doc = Jsoup.connect("https://www.imdb.com/list/ls021327086/").get();
      
      // get the page title
      String title = doc.title();
      System.out.println("title: " + title);
      
      //heading---------
      Elements head1=doc.select("h1");
        System.out.println("\n*****heading*****");
        for(Element head :head1)
      {
        System.out.println("\n"+head.text());
      }
      
      //paragraphs-------------------
      Elements para1=doc.select("p");
      System.out.println("\n*****paragraph*****");
      for(Element para :para1)
      {
        System.out.println("\n"+para.text());
      }
      
      //link------------------
      Elements links = doc.select("a[href]");
      for (Element link : links) {
        // get the value from the href attribute
        System.out.println("\nlink: " + link.attr("href"));
        System.out.println("text: " + link.text());
      }
      //img------------
      Elements pic1=doc.select("img[src]");
        System.out.println("*****img*****");
      for(Element pic : pic1)
      {
          System.out.println("\n"+pic.attr("src"));
      }
      //button------------
      Elements bt1=doc.select("button");
        System.out.println("*****button*****");
      for(Element bt : bt1)
      {
          System.out.println("\n"+bt.text());
      }
      Element id = doc.getElementById("list-overview-summary");
        System.out.println("/n"+id.text());
      
    } catch (IOException e) {
    e.printStackTrace();
    }
  }
}