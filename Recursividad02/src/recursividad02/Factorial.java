package recursividad02;
public class Factorial {
    public long calcularFactorial(long num){
       if((num==0)||(num==1)){
           return 1;
       }else{
           return num*calcularFactorial(num-1);
       }
    }    
}
