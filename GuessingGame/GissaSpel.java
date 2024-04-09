
import java.util.Random;
import java.util.Scanner;

public class GissaSpel {
    public void startGame() {
        
    // Skapa en Scanner för att läsa inmatning från användaren
        Scanner scanner = new Scanner(System.in);
    // Skapa en Random för att generera slumpmässiga nummer
        Random random = new Random();
    // En boolean variabel som styr om spelet ska fortsätta eller avslutas
        boolean playAgain = true;

        
    // Så länge playAgain är "true" kommer spelet köra tills spelaren väljer att avsluta.
        while (playAgain) {
    // Den genererar ett slumpmässigt nummer mellan 1 och 100. nextInt(100) genererar ett nummer mellan 0-99 och när man lägger till + 1 så säkerställer man att numret hamnar inom intervallet 1 till 100       
            int randomNumber = random.nextInt(100) + 1;
    // Håller koll på antalet gissningar som spelaren har gjort      
            int numberOfTries = 0;
    // En variabel som används för att kontrollera om spelaren har gissat rätt  
            boolean guessedCorrectly = false;

            System.out.println("Gissa på ett nummer mellan 1 och 100.");
    // En inre loop som fotsätter tills spelaren gissar rätt nummer        
        while (!guessedCorrectly) {
    // Uppmanar spelaren att göra en gissning och visar numret på den aktuella gissningen.        
            System.out.print("Gissning " + (numberOfTries + 1) + ": ");
    // Kontrollerar om spelaren har angett ett heltal som sin gissning.        
        if (scanner.hasNextInt()) {
    // Om man matar in ett heltal så läser den in spelarens gissning och ökar räknaren för "numberOfTries".      
            int userGuess = scanner.nextInt();
                    scanner.nextLine(); 
                    numberOfTries++;
    // Den här delen kontrollerar om spelarens gissning är inom det giltiga intervallet (1 till 100). 
        if (userGuess < 1 || userGuess > 100) {
             System.out.println("Numret måste vara mellan 1 och 100.");
    }   else if (userGuess < randomNumber) {
             System.out.println("Numret är högre.");
    }   else if (userGuess > randomNumber) {
             System.out.println("Numret är lägre.");
    }   else {
    // Om spelarens gissning matchar random nummer så informeras spelaren om att hen vunnit. guessedCorrectly sätts till "true" och den inre loopen avslutas, hen får även veta hur många försökt som krävdes
             System.out.println("Rätt! Du gissade rätt på " + numberOfTries + " försök.");
                        guessedCorrectly = true;
    }
    }   else {
    // Om hen inte matar in ett tal utan försöker skriva med bokstäver så skriv det här ut.  
             System.out.println("Du kan bara skriva med siffror. Försök igen!");
                    scanner.nextLine(); 
                }
            }

    // Efter spelaren har gissat rätt så visar spelet den här menyn, som låter hen välja att spela vidare eller avsluta. Om hen väljer att svluta så sätts playAgain till false vilket leder till att huvudloopen avslutas och spelet är slut.
    // När detta sker så visas meddelandet "Tack för att du spelade!"
             System.out.println("Meny:");
             System.out.println("1. Spela igen");
             System.out.println("2. Exit");
        
    // Denna rad deklarerar en heltalsvariabel, den lagrar spelarens val från menyn, den representerar den åtgärd som spelaren vill utföra sen.
             int choice;
    // koden går sedan in i en do - while - loop för att säkerställa att spelarens inmatning är giltig         
            do {
             System.out.print("Mata in ditt val: ");
    // Den inre 'while' - loopen Kontrollerar så att spelaren matar in ett heltal och inte skriver talet me bokstäver.
                while (!scanner.hasNextInt()) {
             System.out.print("Felaktigt val. Mata in ett nummer: ");
                    scanner.next();
                }
                choice = scanner.nextInt();
    // Kontrollerar att spelarens val ligger i rätt intervall, alltså mellan 1 och 2, om det är fel, alltså större än 2 eller mindre än 1 så fortsätter loopen att uppmana spelaren att ge ett giltigt tal.
            } while (choice < 1 || choice > 2);
            
    // Kontrollerar om "choice" är lika med 2, vilket innebär att spelaren valt att avluta
            if (choice == 2) {
                playAgain = false;
            }
        
        }

        System.out.println("Tack för att du spelade!");
        scanner.close();
    }


    }

