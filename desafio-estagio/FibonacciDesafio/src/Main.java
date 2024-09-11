import java.util.ArrayList;
import java.util.List;

public class Main {

   static String fibonacciVerifica(int number){
       if (number == 0 || number == 1) {
           return "O número existe na sequência";
       }

       int num  = 0;
       int num2 = 1;
       int num3;
       while(true){
           num3 = num + num2;
           num = num2;
           num2 = num3;

           if(num3 == number){
               return "O número existe na sequencia";
           }else if(num3 > number){
               return "O numero não existe na sequencia";
           }
       }

   }

    public static void main(String[] args)  {
        String numeroEstaNaSequencia = fibonacciVerifica(23);
        System.out.println(numeroEstaNaSequencia);
    }
}