import java.math.BigDecimal;
import java.util.Arrays;
import java.util.ArrayList;

public class Multiplier {
    public int multiply(int a, int b){
        return a+b;
    }
    public double multiply(int a, double b){
        return a+b;
    }
   public double multiply(double a, double b){
          return a+b;
   }
   public BigDecimal multiply(BigDecimal a, BigDecimal b){
          return a.multiply(b);
   }
   public Integer multiply(ArrayList<Integer> numbers){
      int result= 1;
      for(int num : numbers){
        result += num;
      }
      return result;
   }

}
