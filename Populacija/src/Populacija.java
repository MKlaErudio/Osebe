/*
Maj Klavžar, Programiranje 1
  Hello World
------------------------------
Java skripta, ki omogoca uporabo graficnega umesnika
------------------------------
 --IZHODNI PODATKI--
Okno graficnega umesnika
------------------------------
*/

//Uvozimo knjiznico za delo z GUI
import javax.swing.*;
//Uvozimo paket za delo z dogotki
import java.awt.event.*;


//Deklariramo javni razred
public class Populacija extends JFrame implements ActionListener{

    //Deklariramo zasebne lastnosti
    private JPanel povrsina;
    private JButton dodajJButton;
    private JTextField imePolje, visinaPolje, tezaPolje, starostPolje;
    private JTable tabela;
    private OsebaTableModel modelTabele;


    //Deklariramo javno staticno metodo main, ki se zazene ob zagonu programa
    //Vhodni parametri: vhodni parametri iz konzole
    //Opis: Ustvarimo novo okno
     public static void main(String[] args){
        Populacija p = new Populacija("Populacija z osebami");
     }

    //Definiramo konstruktor
    //Vhodni parametri: n - naslov okna
    //Opis: Vrne objekt tipa miza
     public Populacija(String n){

        // Klicemo konstruktor nadrazreda
        super(n);

        //Inicializiramo lastnosti
        povrsina = new JPanel();
        dodajJButton = new JButton("Dodaj osebo");
        imePolje = new JTextField(32);
        visinaPolje = new JTextField(8);
        tezaPolje = new JTextField(8);
        starostPolje = new JTextField(8);
        modelTabele = new OsebaTableModel();
        tabela = new JTable(modelTabele);


        //Povrsino dodamo na mizo
        add(povrsina);

        //Na gumb dodamo actionEvent
        dodajJButton.addActionListener(this);

        //Dodamo gumb in vpisno polje na povrsino
        povrsina.add(new JLabel("Ime:"));
        povrsina.add(imePolje);
        povrsina.add(new JLabel("Visina:"));
        povrsina.add(visinaPolje);
        povrsina.add(new JLabel("Teza:"));
        povrsina.add(tezaPolje);
        povrsina.add(new JLabel("Starost:"));
        povrsina.add(starostPolje);
        povrsina.add(dodajJButton);
        povrsina.add(tabela);


        //Pokazemo okno
        setVisible(true);

        //Nastavimo velikost okna
        setSize(500, 250);

        //Nastavimo obnasanje krizca (x) - da konca aplikacijo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("Ustvarjam objekt Populacija");

     }
    //Metoda, ki jo predpisuje vmesnik Action listener
    //Vhodni parametri: e - Action event 
    //Opis: Doda osebo na seznam
     public void actionPerformed(ActionEvent e){
    
        //Dodamo objekt v seznam
        try{
         Oseba osTmp = new Oseba();
         osTmp.oznaci(imePolje.getText(), Integer.parseInt(visinaPolje.getText()), Float.parseFloat(tezaPolje.getText()), Integer.parseInt(starostPolje.getText()), "Neutralno");
         modelTabele.addOseba(osTmp);
        }catch(Exception ex){System.out.println(ex);}
    }
}
