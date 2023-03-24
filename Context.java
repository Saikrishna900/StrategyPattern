package Strategy;

public class Context {
    private CalculationStrategy sta;
    Context(CalculationStrategy sta)
    {
        this.sta = sta;
    }
    public int  doCal(int a,int b){
        return sta.performCalculation(a,b);
    }
}
