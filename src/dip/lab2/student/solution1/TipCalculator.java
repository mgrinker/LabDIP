
package dip.lab2.student.solution1;

/**
 *
 * @author Michael
 */
public class TipCalculator {
    private CalculatorType tip;

    public TipCalculator(CalculatorType tip) {
        this.tip = tip;
    }
    
    public void getTip() {
        tip.getTip();
    }
    
}
