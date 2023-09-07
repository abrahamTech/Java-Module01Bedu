package e2;

public class CalculatorE2 {

    private CalculatorDao calculatorDao;

    public int add(int a, int b) {
        return a + b + calculatorDao.findValueConstant();
    }

    public int subtract(int a, int b) {
        return a - b + calculatorDao.findValueConstant();
    }

    public int multiply(int a, int b) {
        return a * b + calculatorDao.findValueConstant();
    }

}
