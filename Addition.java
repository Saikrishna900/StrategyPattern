package Strategy;

public class Addition implements CalculationStrategy{
    @Override
    public int performCalculation(int a, int b) {
        return a+b;
    }
}
