package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("---- Opdracht - 1 ----");

        // 1. Nathan houdt van fietsen. Het is belangrijk dat je bij inspanningen zoals fietsen, genoeg drinkt.
        // Hij drinkt 0.5 en liter water per uur met fietsen.
        // Schrijf een programma dat berekend hoeveel liter Nathan drinkt tijdens zijn fietsrit.
        // Rond de liters die hij heeft gedronken af naar de kleinste waarde.

        double hours = 3.0;
        double water = 0.5;

        double waterTotal = hours * water;

        double waterTotalRounded = Math.floor(waterTotal);

        if (waterTotalRounded == 1.0) {
            System.out.println("Nathan heeft " + String.format("%.0f", waterTotalRounded) + " liter water gedronken tijdens " + String.format("%.2f", hours) + " uur " + "fietsrit!");
        } else {
            System.out.println("Nathan heeft " + String.format("%.0f", waterTotalRounded) + " liters water gedronken tijdens " + String.format("%.2f", hours) + " uur " + "fietsrit!");
        }

        System.out.println("---- Opdracht - 2 -----");

        // 2. Deze opdracht gaan we gebruik maken van de volgende dingen: Random class en een switch statement.
        // We gaan vissen! Ik wil dat je een random getal gebruikt (bound 5) om te weten welke vis we hebben
        // gevangen of dat het juist vuilnis is. Tot slot print je uit wat we hebben gevangen.

        Random random = new Random();

        int randomNumber = random.nextInt(5);

        switch (randomNumber) {
            case 0 -> System.out.println("Proficiat, je hebt een zalm gevangen!");
            case 1 -> System.out.println("Proficiat, je hebt een tonijn gevangen!");
            case 2 -> System.out.println("Proficiat, je hebt een haai gevangen!");
            case 3 -> System.out.println("Je hebt een sardien gevangen! :(");
            case 4 -> System.out.println("Geen geluk, je hebt vuilnis gevangen! :(");
        }

        System.out.println("---- Opdracht - 3 ----");

        // 3. Converteer een nummer naar een woord. Wanneer je een input krijgt van een nummer tussen de 0 en 9 wordt
        // dit omgezet naar een woord. Bijvoorbeeld: input -> 1 output -> "One"
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef een nummer tussen 0 en 9 in!");
        int input = scanner.nextInt();
        String word = "";

        switch (input) {
            case 0 -> word = "Zero";
            case 1 -> word = "One";
            case 2 -> word = "Two";
            case 3 -> word = "Three";
            case 4 -> word = "Four";
            case 5 -> word = "Five";
            case 6 -> word = "Six";
            case 7 -> word = "Seven";
            case 8 -> word = "Eight";
            case 9 -> word = "Nine";
            default -> System.out.println("Ongeldige nummer!");
        }
        System.out.println((input > 9 || input < 0) ? "" : input + " -> " + word);

        System.out.println("---- Opdracht - 4 ----");

        // 4. We gaan 1 week kamperen en in totaal mogen we maar 5 dagen vissen.
        // Nu gaan we een overzicht maken (Zie voorbeeld hieronder) dat iedereen weet wanneer we gaan vissen.
        // Schrijf een app om deze print-out te krijgen. Je gebruikt bij deze opdracht een loop, if en keyword continue!!!

        int day = 0;
        String activity = "Camping and fishing.";

        while (day <= 6) {
            day++;
            if (day <= 5) {
                System.out.println("Day " + day + ": " + activity);
                continue;
            }
            activity = "Camping.";
            System.out.println("Day " + day + ": " + activity);
        }


        System.out.println("---- Opdracht - 5 ----");

        // 5. Rent a car. We gaan een auto huren voor onze vakantie.
        // De manager van de autoverhuur zaak legt uit hoe het met de kosten en acties zit.
        //   * Per dag kost een auto € 40.
        //   * Als je de auto meer dan 7 dagen huurt krijg je € 50,- korting op het totaal bedrag.
        //   * Als je de auto 3 of meer dagen huurt krijg je een korting van € 20,- op de totaal prijs.
        // Schrijf een applicatie om het totaal bedrag uit te rekenen voor de verschillende opties.

        int rentalDays = 10;
        int rentalCost = 40;
        int totalCost = rentalDays * rentalCost;

        if (rentalDays > 7) {
            totalCost -= 50;
            System.out.println("Totale verhuur kosten: " + totalCost + "€");
        } else if (rentalDays >= 3) {
            totalCost -= 20;
            System.out.println("Totale verhuur kosten: " + totalCost + "€");
        } else {
            System.out.println("Totale verhuur kosten: " + totalCost + "€");
        }

        System.out.println("---- Opdracht - 6 ----");

        // 6. Verander de waarde van de deze variabel (Zie hieronder) in een absolute waarden met een ternary operator.

        int x = -5;
        int y = (x < 0) ? x = 5 : x;
        System.out.println("x = " + y);

        System.out.println("---- BONUS - Rock Paper Scissors ----");

        // Bonus - Dit is het bekende spel Rock Paper Scissors.
        // Laat in een print-out zien of de speler of de computer heeft gewonnen.
        // Als het gelijk is word dit aangegeven met draw!.
        // Tip: We werken gewoon met een string input. Output zie je hieronder.
        // Bonus: Zorg voor een validatie dat wanneer niet een juiste invoer word gedaan.
        // De juiste invoermogelijkheden zijn rock, paper en scissors.

        System.out.println("Typ een van de 3 onderstaande mogelijkheden");
        System.out.println("""
                - Schaar
                - Steen
                - Papier""" + "\n");
        System.out.println("Typ 'stop' om to stoppen met spelen" + "\n");

        String playerInput = "";
        String winner = "";
        int playerWins = 0;
        int computerWins = 0;

        while (!(playerInput.equals("stop"))) {
            playerInput = scanner.nextLine().toLowerCase();

            int computer = random.nextInt(3);
            String cpu = "";

            switch (computer) {
                case 0 -> cpu = "schaar";
                case 1 -> cpu = "steen";
                case 2 -> cpu = "papier";
            }

            if (playerInput.equals("")) {
                System.out.println("Veel succes!" + "\n");
            } else if (playerInput.equals("schaar") && cpu.equals("steen")) {
                winner = "cpu";
            } else if (playerInput.equals("steen") && cpu.equals("schaar")) {
                winner = "player";
            } else if (playerInput.equals("papier") && cpu.equals("schaar")) {
                winner = "cpu";
            } else if (playerInput.equals("steen") && cpu.equals("papier")) {
                winner = "cpu";
            } else if (playerInput.equals("papier") && cpu.equals("steen")) {
                winner = "player";
            } else if (playerInput.equals("schaar") && cpu.equals("papier")) {
                winner = "player";
            } else if (playerInput.equals(cpu) ) {
                winner = "draw";
            } else if (playerInput.equals("stop")) {
                break;
            } else {
                winner = "";
                System.out.println("Ongeldige keuze! U kan alleen kiezen tussen 'schaar', 'steen' of 'papier'.");
            }

            switch (winner) {
                case "player" -> {
                    playerWins++;
                    System.out.println("speler -> " + playerInput + "\n" + "cpu -> " + cpu + "\n" + "Proficiat, u heeft deze ronde gewonnen!");
                } case "cpu" -> {
                    computerWins++;
                    System.out.println("speler -> " + playerInput + "\n" + "cpu -> " + cpu +  "\n" + "Helaas, u heeft deze ronde verloren! :(");
                } case "draw" -> System.out.println("speler -> " + playerInput + "\n" + "cpu -> " + cpu + "\n" + "Gelijkspel, niemand heeft de ronde gewonnen!");

            }
        }
        System.out.println("speler: " + playerWins + " win(s)" + "\n" + "CPU: " + computerWins + " win(s)" + "\n");

        if (playerWins > computerWins) {
            System.out.println("Gefeliciteerd!" + "\n" + "U heeft het spel gewonnen!");
        } else if (playerWins == computerWins) {
            System.out.println("Gelijkspel!" + "\n" + "Niemand is gewonnen!");
        } else {
            System.out.println("U heeft het spel verloren! :(" + "\n" + "Volgende keer beter!");
        }
    }
}
