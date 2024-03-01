package implement;

public class ICalcuIImple implements ICalcul {

    @Override
    public int add(int... x) throws Exception {
        if (x.length == 0){
            throw new Exception("Veillez saisir au moins un entier: ");
        }
        int somme = 0;
        for (int i = 0; i < x.length; i++) {
            somme += x[i];
        }
        return somme;
    }
}
