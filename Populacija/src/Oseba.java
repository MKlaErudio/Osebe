/*
Maj Klavžar, Programiranje 1
  OSEBA (15b)
------------------------------
Java skripta ki ustvari Oseba razred
------------------------------
 --VHODNI PODATKI--

------------------------------
 --IZHODNI PODATKI--

------------------------------
*/

public class Oseba {
//Deklariramo lastnosti razreda Oseba
  private String ime;
  private int visina; // v cm
  private float teza; // v kg
  private int starost;
  private String razpolozenje; // Jezno, Neutralno, Veselo, Žalostno
  private boolean zivi;

//Definiramo konstruktor, ki ustvari nov objekt tipa Oseba
  public Oseba(){
    //Inicializiramo lastnosti objekta, nastavimo jih na nekaj genericnega
    ime = "";
    visina = 150;
    teza = 60;
    starost = 18;
    razpolozenje = "Neutralno";
    zivi = true;
  }

  //Definiramo javno boolean metodo za oznacenje osebe
  //Vhodni parametri: v - visina, t - teza, s - starost, r - razpolozenje
  //Opis: Osebi oznaci ime, starost, razpolozenje, tezo in visino, ce je ziva
  //Izhodni parametri: true-> ce je oseba ziva, false-> oseba ni vec ziva
  public void oznaci(String name, int v, float t, int s, String r) throws Exception{
    if(zivi){

      ime = name;
      visina = v;
      teza = t;
      starost = s;
      razpolozenje = r;

      System.out.println(ime + " je sedaj star(a) " + starost + "let, visok(a) je "+visina+" cm in tezk(a) "+teza+" kg");
    }
    else{
      throw new Exception("Oseba je ze umrla");
    }
  }

  public String getIme(){
    return ime;
  }
  public int getVisina(){
    return visina;
  }
  public float getTeza(){
    return teza;
  }
  public int getStarost(){
    return starost;
  }


  //Javna boolean metoda za usmrtitev osebe
  //Opis: Ce je oseba ziva, bo umrla
  //Izhodni parametri: nic ali exception, ce je oseba ze mrtva
  public void ubij() throws Exception{
    if(zivi){
      zivi = false;
      System.out.println("R.I.P " + ime);
    }
    else{
      //vrne exception, da je oseba ze mrtva
      throw new Exception(ime+" je ze umrl(a)");
    }
  }


  //Javna void metoda za razjezevanje osebe
  //Opis: Osebino razpolozenje spremeni na jezno
  public void razjezi(){
    razpolozenje = "Jezno";
  }


  //Javna float metoda za izracun ITT
  //Opis: Po kormuli doloci njen ITT
  //Izhodni parametri: float za osebino ITT
  public float izracunITT(){
    //visino spremenimo v m za pravilni izracun
    float v = (visina/100f);
    float outITT = (teza/(v*v));
    return outITT;
  }


  //Javna void metoda za staranje
  //Opis: Osebino starost poveca za 1
  public void postaraj(){
    starost++;
    System.out.println(ime + " je sedaj leto starejsi/starejsa");
  }


  //Javna void metoda, ki osebo pozdravi
  //Opis: Oseba na pozdrav odgovori glede na svoje razpolozenje
  //Izhodni parametri: nic ali exception, da je bilo razpopozenje osebe narobe nastavljeno
  public void pozdravi() throws Exception{    
    switch(razpolozenje){
      case "Jezno": 
        System.out.println("Ne pogovarjaj se z mano");
        break;
      case "Neutralno": 
        System.out.println("Dober dan");
        break;
      case "Veselo": 
        System.out.println("Lep pozdrav :D");
        break;
      case "Žalostno": 
        System.out.println("Dan....");
        break;
      default:
        throw new Exception(ime+" nima pravilno dolocene razpolozenosti");
    }
  }


}