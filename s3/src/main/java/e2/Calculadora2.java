package e2;

public class Calculadora2 {
    CalculadoraDao calculadoraDao;
    public int suma(int a, int b) {
        return a + b + calculadoraDao.findValorConstante();
    }

    public int resta(int a, int b) {
        return a - b + calculadoraDao.findValorConstante();
    }

    public int multiplica(int a, int b) {
        return a * b  + calculadoraDao.findValorConstante();
    }


}
