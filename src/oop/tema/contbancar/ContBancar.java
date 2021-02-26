package oop.tema.contbancar;

/**
 * Să se construiască  clasa  ContBancar,  folosită pentru a modela un cont bancar, ce are ca variabilă
 * de instanţă privată, variabila suma, (suma de bani din cont).
 * Ca metode:
 * 1.adauga(),  ce  are  ca  parametru  un  număr  real  x,  valoarea  ce  se  adaugă în cont;
 * 2.extrage(), ce are ca parametru un număr real x, valoarea ce se extrage  din  cont,  şi  care  scoate  ca  rezultat
 * true,  dacă  se  poate  face  extragerea (suma >= x), şi false în caz contrar;
 * 3. getSuma(), ce returnează valoarea variabilei private suma;
 * 4.afisare(), ce afişează valoarea sumei de bani din cont.
 * Pe  baza  clasei  ContBancar  se  va  dezvolta  prin  derivare  (moştenire) clasa  ContBancarExtins,  în  care  se
 * va  adăuga  o  nouă  variabilă  de  instanţă: rata dobânzii  anuale şi o nouă metodă: adaugaDobandaLunara(),  ce  adaugă
 * în  cont  dobânda  calculată  după trecerea unei luni. În clasa ContBancarExtins se va redefini şi metoda afisare(),
 * astfel  încât  să  se  afişeze şi  rata  dobânzii.  De  asemenea,  în  această nouă clasă se va defini constructorul,
 * prin care se iniţializează suma de bani din cont şi rata dobânzii.
 * Suplimentar: Să se scrie şi o clasă de test pentru clasa ContBancarExtins.
 */
public class ContBancar  {
    public float balance;
    public void addMoney(float z){
    this.balance+=z;
    }
    public boolean withdrawMoney(float z){
        return this.balance >=z;
    }

    public float getBalance() {
        return balance;
    }
}
