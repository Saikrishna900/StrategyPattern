package Strategy;

public class Multiplication implements CalculationStrategy{
    @Override
    public int performCalculation(int a, int b) {
        return a*b;
    }
}
