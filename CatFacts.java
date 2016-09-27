
package catfacts;
import static java.awt.SystemColor.text;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mbarker
 */
public class CatFacts {

 
    public static void main(String[] args) {
     int emailFrequency = 0;
     String emailRecipient = "";
     String from = "mr.whiskers@catfacts.com";
     String fact = "";
     String subject ="";
     ArrayList<String>emailSubject = new ArrayList<>();
     emailSubject.add("IN COMMING CAT FACT");
     emailSubject.add("HEY CAT LOVER");        
     emailSubject.add("BECAUSE I KNOW YOU LOVE CATS:");
     emailSubject.add("MEOWTASTIC!!!!!");
     emailSubject.add("WELL HELLO THERE");
     ArrayList<String> catGreeting = new ArrayList<>();
     catGreeting.add("IN COMMING CAT FACT");
     catGreeting.add("HEY CAT LOVER");        
     catGreeting.add("BECAUSE I KNOW YOU LOVE CATS:");
     catGreeting.add("MEOWTASTIC!!!!!");
     catGreeting.add("WELL HELLO THERE");
     ArrayList<String> catFact = new ArrayList<>();
     catFact.add("Unlike dogs, cats do not have a sweet tooth. Scientists believe this is due to a mutation in a key taste receptor.");
     catFact.add("There are more than 500 million domestic cats in the world, with approximately 40 recognized breeds.");        
     catFact.add("Approximately 24 cat skins can make a coat");
     catFact.add("During the time of the Spanish Inquisition, Pope Innocent VIII condemned cats as evil and thousands of cats were burned. Unfortunately, the widespread killing of cats led to an explosion of the rat population, which exacerbated the effects of the Black Death.");
     catFact.add("The first cat in space was a French cat named Felicette (a.k.a. “Astrocat”) In 1963, France blasted the cat into outer space. Electrodes implanted in her brains sent neurological signals back to Earth. She survived the trip.");
     ArrayList<String> catGoodbye = new ArrayList<>();
     catGoodbye.add("Bye");
     catGoodbye.add("Cya");
     catGoodbye.add("Goodbye");
     catGoodbye.add("Meow You Later");
     catGoodbye.add("Goodbye");

     int randomSubject = (int )(Math.random() * 5);
     int randomGreeting = (int )(Math.random() * 5); 
     int randomFact = (int )(Math.random() * 5); 
     int randomGoodbye = (int )(Math.random() * 5); 
     
   /*  System.out.println
        ("Greeting Number: " +randomGreeting + " " +
         "Fact Number " + randomFact + " " + 
         "Goodbye Number " + randomGoodbye);
     
   */
   
   subject = emailSubject.get(randomSubject);
   fact = catGreeting.get(randomGreeting) + " " + catFact.get(randomFact) + " " + catGoodbye.get(randomGoodbye);
   
   
   System.out.println ("FROM: " + from);
   System.out.println ("EMAIL SUBJECT LINE: " + subject);
   System.out.println ("\n");
   System.out.println ("EMAIL CONTENTS: " + fact);
    }
    
}
