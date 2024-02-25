package implement;

public interface ICalcul {
    int add (int ... x) throws Exception;
    default int  sub (int ... x) throws Exception {
        if (x.length == 0){
            throw new Exception("nombre d'argument invalide");
        }
        return  x [0] - x[1];
    }
}
