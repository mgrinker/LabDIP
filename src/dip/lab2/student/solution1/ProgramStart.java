/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;
import java.text.DecimalFormat;


/**
 *
 * @author Michael
 */
public class ProgramStart {
    public static void main(String[] args) {
        
              
        // Create decimal format object
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        // Get a food service tip 
        CalculatorType foodTip = 
                new FoodServiceTipCalculator
                 (FoodServiceTipCalculator.ServiceQuality.GOOD, 25.25);
        
         TipCalculator newTip = new TipCalculator(foodTip);
         newTip.getTip();
         
         System.out.println("Your food service tip is $"
                 + dollar.format(foodTip.getTip()));
         
         // Get a baggage service tip
         CalculatorType bagTip = new BaggageServiceTipCalculator
                 (BaggageServiceTipCalculator.ServiceQuality.FAIR,5);
         
         TipCalculator newBagTip = new TipCalculator(bagTip);

         newBagTip.getTip();
         
         System.out.println("Your baggage tip is $"
                 + dollar.format(bagTip.getTip()));
         
    }
}
