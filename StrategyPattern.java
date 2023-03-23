package Strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        CalculationStrategy cs = new Addition();
        System.out.println(cs.performCalculation(2,5));

    }
}
