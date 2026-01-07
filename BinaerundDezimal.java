import java.util.Scanner;

public class BinaerundDezimal {
    public static void main(String[] args) {

        boolean weiter = true;
        Scanner scan = new Scanner(System.in);
        while (weiter) {

            System.out.println("Binär zu Dezimal (1), Dezimal zu Binär (2), Programm beenden (3)");
            int value = scan.nextInt();
            scan.nextLine();
            if (value == 1) {

                System.out.print("Bitte geben Sie eine Binärzahl ein: ");
                String bin = scan.nextLine();                // ganze Zeile lesen

                int wert = 0;
                for (int i = 0; i < bin.length(); i++) {
                    char ch = bin.charAt(i);
                    if (ch != '0' && ch != '1') {
                        System.out.println("Fehler: Nur 0 und 1 erlaubt.");
                        return;
                    }
                    wert = wert * 2 + (ch - '0');
                }
                System.out.println("Dezimal: " + wert);


            }


            if (value == 2) {

                while (true) {
                    String binaer = "";
                    System.out.println("Hallo benutzer bitte geben sie eine Zahl ein:");
                    //begrüßung und aufgabe
                    int zahl = 0;
                    //eingabe der zahl
                    int eingabe = scan.nextInt();

                    System.out.println("Sie haben die Zahl " + eingabe + " eingegeben!");
                    //ausgabe der eingegebenen zahl
                    if (eingabe < 0) {
                        System.out.println("Bitte keine negativen zahlen");

                    } else {

                        while (eingabe != 0) {
                            int ergebnis = eingabe % 2;


                            eingabe = eingabe / 2;
                            binaer = ergebnis + binaer;
                            System.out.println("Rest: " + ergebnis);

                            zahl = zahl + 1;
                            if (zahl == 4) {
                                binaer = " " + binaer;
                                zahl = 0;

                            }
                        }

                        System.out.println(binaer);
                    }

                    System.out.println("Zurück zum Menü? (1=Ja, 2=Weitere Zahl)");
                    int back = scan.nextInt();
                    scan.nextLine();
                    if (back == 1) {
                        break;
                    }
                    if (back == 2) {
                    }

                }
            }
                    if (value == 3) {
                        System.out.println("Auf Wiedersehen!");
                        break;

                    }


                }
            }
        }











