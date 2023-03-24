package Strategy;

public class StrategyPattern {
    public static void main(String[] args) {
//        CalculationStrategy cs = new Addition();
//        System.out.println(cs.performCalculation(2,5));
    Context c = new Context(new Addition());
        System.out.println(c.doCal(4,5));

        c = new Context(new Subtraction());
        System.out.println(c.doCal(2,3));

        c = new Context(new Multiplication());
        System.out.println(c.doCal(4,6));
    }
}
