/*
Maj Klavžar, Programiranje 1
  KMET
------------------------------
Java skripta ki ustvari kmeta ki dedkuje po Osebi
------------------------------
*/


//Deklariramo javni razred
public class Kmet extends Oseba implements Orodje {
    private int stZivali;
    private String orodje;

    public Kmet(int z){
    //poklicemo konstruktor nadrazreda
        super();
        
    //Inicializiramo se ostale lastnosti
        stZivali = z;
        orodje = "Lopata, Vile, Kramp";

        System.out.println("ima "+z+" zivali");
    }

    //Javna void metoda, ki kmetu odvzame davke
    //Vhodni parametri: d - % davkov
    //Opis: kmetovo stevilo zivali zmanjsa za % davkov
    public int placajDavek(float d) throws Exception{
        int davek = 0;
        if(stZivali > 0){
            davek = (int)(stZivali*d*100f);
            //pri izracunu lahko dobimo decimalno vreznost, zato jo pretvorimo v int
            stZivali -= davek;
            System.out.println(getIme() + " je placal "+davek+" svojih zivali kot davek");

        }
        else{
            throw new Exception("Kmet nima vec zivali");
        }
        return davek;
    }

    public String getOrodje(){
        return orodje;
    }
}