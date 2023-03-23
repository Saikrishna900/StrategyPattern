package Strategy;

public class Subtraction implements CalculationStrategy{
    @Override
    public int performCalculation(int a, int b) {
        return a-b;
    }
}
