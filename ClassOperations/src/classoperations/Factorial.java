package classoperations;

public class Factorial {
    private int value;
    private int result;
    
    public void setValue(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
       
    public void calculate(){
        int result = 1;
        for (int i=1; i<=value; i++) {
            result = i * result;
        }
        this.result = result;
    }
    
    public void printScreen(){        
        System.out.println(getValue() + "! = " + result);
    }

}
