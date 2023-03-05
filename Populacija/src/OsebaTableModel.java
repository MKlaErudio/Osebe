import javax.swing.table.DefaultTableModel;

/*
Maj Klavžar, Programiranje 1
  PIVSKA STEKLENICA TABLE MODEL
*/

import javax.swing.table.*;;

public class OsebaTableModel extends DefaultTableModel {
    
    //Konstruktor
    public OsebaTableModel(){
        //Klice konstruktor nadrazreda
        super();

        //V tabelo dodamo stolpce
        addColumn("Ime");
        addColumn("Visina");        
        addColumn("Teza");
        addColumn("Starost");     

        //Dodamo naslovno vrstico
        Object[] vrstica = new Object[] {"Ime test", "Visina test","Teza test", "Starost test"};
        addRow(vrstica);

    }

    //Javna metoda za dodajanje vpisov
    //Vhodni parametri: os - oseba
    //Opis: metoda v tabelo doda osebo
    public void addOseba(Oseba os){

        //Ustvarimo staticen seznam objektov
        Object[] vrstica = new Object[] {os.getIme(), os.getVisina(), os.getTeza(), os.getStarost()};

        //Dodamo vrstico v tabelo
        addRow(vrstica);
    }
}
