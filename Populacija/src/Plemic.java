/*
Maj Klavžar, Programiranje 1
  PLEMIC
------------------------------
Java skripta ki ustvari plemica ki dedkuje po Osebi
------------------------------
*/


//Deklariramo javni razred
public class Plemic extends Oseba {
    private float bogastvo;

    public Plemic(float z){
    //poklicemo konstruktor nadrazreda
        super();
        
    //Inicializiramo se ostale lastnosti
        bogastvo = z;

        System.out.println("ima "+z+" bogastva");
    }

        //Javna void metoda, ki plemicu doda bogastvo
    //Vhodni parametri: z - zivali
    //Opis: kmetovo stevilo zivali zmanjsa za % davkov
    //Izhodni parametri: vrednost zivali
    public float ovrednotenje(int z){
        //recimo, da je vsaka zival fredna 10.5
        float vrednost = z * 10.5f;
        System.out.println("Te zivali so vredne "+vrednost);
        return vrednost;
    }

    //Javna void metoda, ki plemicu doda bogastvo
    //Vhodni parametri: b - bogastvo
    //Opis: kmetovo stevilo zivali zmanjsa za % davkov
    public void dobiBogastvo(float b){
        bogastvo += b;
        System.out.println(getIme() + " je dobil "+b+" denarja in ga ima sedaj "+bogastvo);
    }
}
