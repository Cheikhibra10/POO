package implement;

public class ICalculImple2  implements ICalcul{

    @Override
    public int add(int... x) throws Exception {
        if (x.length != 3){
            throw new Exception("Veillez passer exactement trois entier ");
        }

        return x[0] + x[1] +x[2];
    }

    @Override
    public int sub(int... x) throws Exception {
        if (x.length != 2){
            throw new Exception("Veillez passer exactement trois entier ");
        }

        return x[0] - x[1];
    }

}
