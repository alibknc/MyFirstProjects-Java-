package classoperations;

public class Operations {
    public double value_1;
   
    public Operations(double value_1){
        this.value_1 = value_1;
    }
    
    public double add(double value_2){
        double result = value_1 + value_2;
        return result;
    }
    
    public double subtract(double value_2){ 
        double result = value_1 - value_2;
        return result;
    }
    
    public double multiply(double value_2){ 
        double result = value_1 * value_2;
        return result;
    }
    
    public double division(double value_2){ 
        double result = value_1 / value_2;
        return result;
    }
    
    public boolean isBigger(double value_2){
        boolean result;
        if(value_2>value_1){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    
    public boolean isLess(double value_2){ 
        boolean result;
        if(value_2<value_1){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    
    public boolean isEqual(double  deger_2){ 
        boolean result;
        if(deger_2==value_1){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
